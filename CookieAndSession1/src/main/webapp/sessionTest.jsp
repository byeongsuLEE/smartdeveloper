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
			//session: clinet의 정보를 서버의 session 영역에 저장하는것
			// - session은 브라우저당 하나씩 발급이 되며 clinet당 세션영역을
			// 구분하기 위해 고유의(중복x) 키를 쿠키로 발급하여 관리한다.
			
			// session에 값 저장하기 setAttribue(String,Object)
			//jsp에서는 session 객체가 내장객체로 존재하한다.
			session.setAttribute("name","박박박");
	
			//session 에 값 삭제하기 
			//removeAtrribute(String)
			//session.removeAttribute("name");
			
			//session 유효기간 설정 .setMaxInactiveInterval(int)
			//session.setMaxInactiveInterval(3);
			
			//session 값 가져오기
			//"박박박" 은 object로 업케스팅된다.
			//아래 결과값은 object 값이라 다운캐스팅해줘요~
			String name = (String)session.getAttribute("name");
			out.print(name);
			
	%>
</body>
</html>