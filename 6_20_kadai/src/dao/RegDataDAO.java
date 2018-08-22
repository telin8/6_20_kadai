package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import dto.SikakuDTO;

public class RegDataDAO {

	public static SikakuDTO RegistrationData(int sikakuId, String sikakuName, int sikakuLevel, String examDate, String Sof){

		SikakuDTO result = null;

		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try{
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/sikaku?useSSL=false",
					"root",
					"pkp12345");

			String sql = "insert into sikaku values(?, ?, ?, ?, ?);";

			pstmt = con.prepareStatement(sql);

			pstmt.setInt(1, sikakuId);
			pstmt.setString(2, sikakuName);
			pstmt.setInt(3, sikakuLevel);
			pstmt.setString(4, examDate);
			pstmt.setString(5, Sof);

			pstmt.executeUpdate();

		} catch (SQLException e){
			System.out.println("DBアクセスに失敗しました。");
			e.printStackTrace();
		} catch (Exception e){
			System.out.println("数字を指定してください。");
		} finally {
			try {
				if( rs != null){
					rs.close();
				}
			} catch(SQLException e){
				System.out.println("DB切断時にエラーが発生しました。");
				e.printStackTrace();
			}
			try {
				if( pstmt != null){
					pstmt.close();
				}
			} catch(SQLException e){
				System.out.println("DB切断時にエラーが発生しました。");
				e.printStackTrace();
			}

			try {
				if( con != null){
					con.close();
				}
			} catch (SQLException e){
				System.out.println("DB切断時にエラーが発生しました。");
				e.printStackTrace();
			}
		}
		return result;
	}

}
