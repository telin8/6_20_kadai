<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE HTML>
<html>
<head>
<LINK REL="stylesheet" href="/6_20kadai/CSS/Common.css" type="text/css"/>
<meta charset="UTF-8">
<title>登録画面</title>
</head>
<header>
<p id="title">資格取得状況管理システム</p>
</header>
<body>
<form action="RegStudentResult" method="get"id="item">
<p>新規登録</p>
<p>学籍番号：<input type="text" name="studentid" ></p>
<p>名前：<input type="text" name="studentname"></p>
<p>年齢：<input type="text" name="studentage"></p>
<p>性別：<input type="text" name="studentgender"></p>
<input type="submit" onclick="location.href='/6_20kadai/RegStudentResult'" name="Insert" value="新規登録"><br>
</form>
<footer>
<a href="/6_20kadai/MainMenu" >メインメニューへ</a>
</footer>
</body>
</html>