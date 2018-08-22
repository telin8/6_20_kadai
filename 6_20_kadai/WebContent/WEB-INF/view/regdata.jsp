<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE HTML>
<html>
<head>
<LINK REL="stylesheet" href="/6_20_kadai/CSS/Common.css" type="text/css"/>
<meta charset="UTF-8">
<title>登録画面</title>
</head>
<header>
<p id="title">資格取得状況管理システム</p>
</header>
<body>
<form action="RegDataResult" method="get"id="item">
<p>新規登録</p>
<p>資格ＩＤ：<input type="text" name="sikakuid" ></p>
<p>資格名：<input type="text" name="sikakuname"></p>
<p>資格レベル：<input type="text" name="sikakulevel"></p>
<p>受験日：<input type="text" name="examdate"></p>
<p>合否：<input type="text" name="sof"></p>
<input type="submit" name="Insert" value="新規登録"><br>
</form>
<footer>
<a href="/6_20kadai/MainMenu" >メインメニューへ</a>
</footer>
</body>
</html>