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
		//Cookie & session - clinet의 정보를 지속적으로 유지하기 위한 방법
		// cookie 저장할 데이터를 clinet의 browser에 저장하는방법
		// cookie 저장흐름
		// 1 . 쿠키를 맛있게 굽는다
		// 2. 쿠키안에 사랑의 메세지(전달또는 저장하고싶은 내용)를 작성한다
		// 3. client에게 몰래 전달(전송)하면 성공
		// Cookie("키" ,"전달할메세지")
		Cookie cookie = new Cookie("id","pbk");
		response.addCookie(cookie);
		
		// 쿠키나이설정 (1초)
		cookie.setMaxAge(60*60*24*365);
		
		//쿠키의 특징
		// 1. 쿠키는 Text 형태의 자료만 저장할 수 있다.
		// 2. 쿠키의 나이를 따로 설정할 수 있으니 나이를 설정안하면 브라우저 종료시 쿠키는 만료된다.
		// 3. 쿠키는 무한정으로 생성이 불가능하며 한 도메인당 20개 ,,
		// 	  쿠키 하나당 총 4kb까지 생성이 가능하다
		
		
		
	%>
</body>
</html>