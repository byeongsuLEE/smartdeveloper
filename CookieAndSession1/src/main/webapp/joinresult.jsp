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
	//join Servlet���� session�� ������
	// id , pw ,nick,addr�� web�������� ����Ͻÿ�
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