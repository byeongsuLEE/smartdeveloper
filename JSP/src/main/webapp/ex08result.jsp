
<%@page import="java.util.Random"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<h1>랜덤 당첨 작성</h1>
	<form action='ex08write.jsp'>
	주제 : <input type='text' name='theme'><br>
	<%
	
		int num = Integer.parseInt(request.getParameter("num"));
	
		for(int i =1;i<=num;i++)
		{
			out.print("아이템"+i+": <input type='text' name = 'text" +i+"'><br>");
		}
		Random rand = new Random();
		out.print("랜덤배열 : " + rand.nextInt(3));
	%>
	<input type='submit' value='시작'>
	</form>
	
</body>
</html>

