
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<h1>오늘의 점심 메뉴는? </h1>
	<% int a=((int)(Math.random())*10%3+1); %>

	<%
	 	String result =request.getParameter("text"+a);
		out.print("<h1>"+result+"</h1>");
	%>
</body>
</html>