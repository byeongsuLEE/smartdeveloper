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
			//session: clinet�� ������ ������ session ������ �����ϴ°�
			// - session�� �������� �ϳ��� �߱��� �Ǹ� clinet�� ���ǿ�����
			// �����ϱ� ���� ������(�ߺ�x) Ű�� ��Ű�� �߱��Ͽ� �����Ѵ�.
			
			// session�� �� �����ϱ� setAttribue(String,Object)
			//jsp������ session ��ü�� ���尴ü�� �������Ѵ�.
			session.setAttribute("name","�ڹڹ�");
	
			//session �� �� �����ϱ� 
			//removeAtrribute(String)
			//session.removeAttribute("name");
			
			//session ��ȿ�Ⱓ ���� .setMaxInactiveInterval(int)
			//session.setMaxInactiveInterval(3);
			
			//session �� ��������
			//"�ڹڹ�" �� object�� ���ɽ��õȴ�.
			//�Ʒ� ������� object ���̶� �ٿ�ĳ���������~
			String name = (String)session.getAttribute("name");
			out.print(name);
			
	%>
</body>
</html>