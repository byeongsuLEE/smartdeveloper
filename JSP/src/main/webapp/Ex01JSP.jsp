<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<h1>java Server Page</h1>
	
	<%--  
		스크립트릿: java 코드를 사용하기 위한 영역
		<% %>
		
		표현식 : java코드 실행결과나 , 변수를 HTML 코드 사이에 출력시키기 위해 사용
		<%= %>
		
		
	 --%>
	 <%
	 	int num1= 20;
	 	int num2= 10;
	 	int sum = num1+num2;
	 	
	 
	 
	 %>
	 
	 <h1> <%=sum %></h1>
</body>
</html>