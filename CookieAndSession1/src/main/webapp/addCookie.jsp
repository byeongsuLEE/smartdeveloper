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
		//Cookie & session - clinet�� ������ ���������� �����ϱ� ���� ���
		// cookie ������ �����͸� clinet�� browser�� �����ϴ¹��
		// cookie �����帧
		// 1 . ��Ű�� ���ְ� ���´�
		// 2. ��Ű�ȿ� ����� �޼���(���޶Ǵ� �����ϰ���� ����)�� �ۼ��Ѵ�
		// 3. client���� ���� ����(����)�ϸ� ����
		// Cookie("Ű" ,"�����Ҹ޼���")
		Cookie cookie = new Cookie("id","pbk");
		response.addCookie(cookie);
		
		// ��Ű���̼��� (1��)
		cookie.setMaxAge(60*60*24*365);
		
		//��Ű�� Ư¡
		// 1. ��Ű�� Text ������ �ڷḸ ������ �� �ִ�.
		// 2. ��Ű�� ���̸� ���� ������ �� ������ ���̸� �������ϸ� ������ ����� ��Ű�� ����ȴ�.
		// 3. ��Ű�� ���������� ������ �Ұ����ϸ� �� �����δ� 20�� ,,
		// 	  ��Ű �ϳ��� �� 4kb���� ������ �����ϴ�
		
		
		
	%>
</body>
</html>