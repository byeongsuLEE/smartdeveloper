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
		Cookie cookie1 = new Cookie("name1","�ں���");
		Cookie cookie2 = new Cookie("name2","�̼�ȯ");
		Cookie cookie3 = new Cookie("name3","������");
		
		response.addCookie(cookie1);
		response.addCookie(cookie2);
		response.addCookie(cookie3);
		//client �� ������ �ִ� cookie ������
		Cookie[] cookies = request.getCookies();
		
		for(int i = 0 ; i<cookies.length ; i++)
		{
			out.print("��Ű�̸� : ");
			out.print(cookies[i].getName());  //��Ű��ü 
			out.print(" &nbsp; ��Ⱚ :");  // &nbsp : ���� �ִ°�
			out.print(cookies[i].getValue());
			out.print("<br>");
			
		}
	%>
	
	

</body>
</html>