<%@page import="java.util.Arrays"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<%--
	 jsp������ �����ö� �Ȱ��� request �Ǵµ�
	 Ű = ���� �������� ��������
	 ���� ��ü�� �Ǿ��ִ�.
	
	 --%>
	<%
	
	request.setCharacterEncoding("EUC-KR");
	String name = request.getParameter("name");
	String gender = request.getParameter("gender");
	String hobby[] = request.getParameterValues("hobby");






%>
	
	
	�Է��� �̸� : <%=name %> <br>
	������ ���� : <%=gender %><br>
	������ ��� : <%=Arrays.toString(hobby) %><br>

</body>
</html>