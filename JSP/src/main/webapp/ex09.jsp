<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>

<h1> ���尴ü Response</h1>
<%
	//reponse.sendRedirect("�̵��� �ּ�")
	//redirect ������� ������ �̵��ϴ� ���
	//redirect �� 302��� ����� client�� ��������
	//			 ~(���̹�)�� �ٽ� ��û�ض�
	// 			clinet�� 302�� ����� ������ naver�� 	request�� 
	//			���̹������� client �� ���� ����
	//         
	
	response.sendRedirect("http://www.naver.com/");
	

%>
</body>
</html>