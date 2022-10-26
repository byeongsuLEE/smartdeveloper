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
		// 서버에서는 쿠키를 삭제하는 방법이 없지만
		// 편법으로 쿠기를 삭제하는 방법
	
		Cookie cookie = new Cookie("id","");
		cookie.setMaxAge(0);
		response.addCookie(cookie);
		
		%>
</body>
</html>