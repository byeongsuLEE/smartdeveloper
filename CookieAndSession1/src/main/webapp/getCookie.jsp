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
		Cookie cookie1 = new Cookie("name1","박병관");
		Cookie cookie2 = new Cookie("name2","이수환");
		Cookie cookie3 = new Cookie("name3","안현진");
		
		response.addCookie(cookie1);
		response.addCookie(cookie2);
		response.addCookie(cookie3);
		//client 가 가지고 있는 cookie 꺼내기
		Cookie[] cookies = request.getCookies();
		
		for(int i = 0 ; i<cookies.length ; i++)
		{
			out.print("쿠키이름 : ");
			out.print(cookies[i].getName());  //쿠키객체 
			out.print(" &nbsp; 쿠기값 :");  // &nbsp : 띄어쓰기 주는거
			out.print(cookies[i].getValue());
			out.print("<br>");
			
		}
	%>
	
	

</body>
</html>