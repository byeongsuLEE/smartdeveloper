<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<%--
	���� : JSP���� �ʵ峪 �޼��带 ����� ���� ����ϴ� ��
	 		���� �ȿ��� �ۼ��� ������ ���� ��������(�ʵ�)�� �ȴ�
	 		��ũ��Ʈ�ȿ��� ������� ������ ���������� �ȴ�.
	 --%>
	 <%!
	 	String myName="�ں���";
	 	public int plus(int num1 , int num2){
	 		return num1+num2;
	 	}
	 %>
	 <% 
	 	String yourName ="�̼�ȯ";

	 	
	 	%>
	 
	 <%= myName %>
	 <br>
	 <%=yourName %>
	 
	 10+30 = <%=plus(10,30) %>
</body>
</html>