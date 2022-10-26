<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>

<h1> 내장객체 Response</h1>
<%
	//reponse.sendRedirect("이동할 주소")
	//redirect 방식으로 페이지 이동하는 방법
	//redirect 는 302라는 명령을 client로 응답해줌
	//			 ~(네이버)로 다시 요청해라
	// 			clinet는 302를 명령을 받으면 naver로 	request함 
	//			네이버에서는 client 로 응답 해줌
	//         
	
	response.sendRedirect("http://www.naver.com/");
	

%>
</body>
</html>