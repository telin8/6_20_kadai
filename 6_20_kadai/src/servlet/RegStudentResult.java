package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.RegStudentDAO;

/**
 * Servlet implementation class SearchServlet
 */
@WebServlet("/RegStudentResult")
public class RegStudentResult extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegStudentResult() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


		String studentID = request.getParameter("studentid");
		String studentName = request.getParameter("studentname");
		String studentAGE = request.getParameter("studentage");
		String studentGender = request.getParameter("studentgender");
		int studentId = Integer.parseInt(studentID);
		int studentAge = Integer.parseInt(studentAGE);

		RegStudentDAO.Registration(studentId,studentName,studentAge,studentGender);
		String view = "/WEB-INF/view/regstudentresult.jsp";
		RequestDispatcher dispatcher = request.getRequestDispatcher(view);
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
