<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<h1>java Server Page</h1>
	
	<%--  
		��ũ��Ʈ��: java �ڵ带 ����ϱ� ���� ����
		<% %>
		
		ǥ���� : java�ڵ� �������� , ������ HTML �ڵ� ���̿� ��½�Ű�� ���� ���
		<%= %>
		
		
	 --%>
	 <%
	 	int num1= 20;
	 	int num2= 10;
	 	int sum = num1+num2;
	 	
	 
	 
	 %>
	 
	 <h1> <%=sum %></h1>
</body>
</html>