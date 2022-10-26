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
	 jsp에서는 가져올때 똑같이 request 되는데
	 키 = 값의 형식으로 보내지고
	 내장 객체로 되어있다.
	
	 --%>
	<%
	
	request.setCharacterEncoding("EUC-KR");
	String name = request.getParameter("name");
	String gender = request.getParameter("gender");
	String hobby[] = request.getParameterValues("hobby");






%>
	
	
	입력한 이름 : <%=name %> <br>
	선택한 성별 : <%=gender %><br>
	선택한 취미 : <%=Arrays.toString(hobby) %><br>

</body>
</html>