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
	선언문 : JSP에서 필드나 메서드를 만들기 위해 사용하는 것
	 		선언문 안에서 작성된 변수는 전부 지역변수(필드)가 된다
	 		스크립트안에서 만들어진 변수는 지역변수가 된다.
	 --%>
	 <%!
	 	String myName="박병관";
	 	public int plus(int num1 , int num2){
	 		return num1+num2;
	 	}
	 %>
	 <% 
	 	String yourName ="이수환";

	 	
	 	%>
	 
	 <%= myName %>
	 <br>
	 <%=yourName %>
	 
	 10+30 = <%=plus(10,30) %>
</body>
</html>