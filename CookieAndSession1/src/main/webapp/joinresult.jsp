<%@page import="com.MemberVo"%>

<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<%
	//join Servlet에서 session에 저장한
	// id , pw ,nick,addr을 web페이지로 출력하시오
	MemberVo a = (MemberVo)session.getAttribute("vo");
	
	
	out.print(a.getId());
	out.print("<br>");

	out.print(a.getPw());
	out.print("<br>");

	out.print(a.getNick());
	out.print("<br>");

	out.print(a.getAddr());
	
	
	%>

</body>
</html>