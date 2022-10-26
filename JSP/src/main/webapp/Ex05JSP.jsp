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
		내장객체 : JSP안에서 객체를 생성하지 않아도 사용가능한 객체
				JSP가 SERVLET로 변환될때 자동으로 생성됨
	 --%>
	 <%
		//out : servlet 에서 PrintWriter 와 비슷한 객체
		String name = "안녕";
	 	out.print("안녕");
	 
	 
	 
	 %>
	 
	 <%=name  %>
	
</body>
</html>