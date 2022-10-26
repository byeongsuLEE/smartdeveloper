<%@page import="com.smhrd.model.MemberVo"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>
<body>
	<%
	// selectService���� request���� ������ ȸ�������� �����ͺ��ô�
	ArrayList<MemberVo> voList = (ArrayList<MemberVo>) request.getAttribute("list");
	// sendRedirect ������ voList�� ������ ���.
	// main ȸ�� ����� Ŭ���ϸ� �������� selectService�� ��û���� �ް�  
	//select service ���� request�� �����͸� �����ϰ�  sendRedirect�� ������
	// main���� �������� select.sjp�� �ٽ� ��û�� �϶�� ������ ������
	// ����
	%>

	<div class="container">
		<h2>ȸ������ Ȩ������</h2>
		<div class="panel panel-default">
			<div class="panel-heading">ȸ����������</div>
			<!--  
       ��� ȸ�� ������ ���̺� �������� �����ϴ� .jsp
       -������ ȸ������� ���ؼ� �����´����� ����� �;� � ���� �� �� �ִ�.
       
       
       
       
       -->

			<div class="panel-body">

				<table class="table table-bordered table-hover">
					<tr>
						<td>id</td>
						<td>nick</td>
						<td>add</td>
					</tr>
					<%
					for (MemberVo info : voList) {
					%>
					<tr>
						<td><%=info.getId()%></td>
						<td><%=info.getNick()%></td>
						<td><%=info.getAdd()%></td>
					</tr>
					<%
					}
					%>
				</table>

			</div>
			<div class="panel-footer">����� : �̼� ����ó : 010-4444-4444</div>
		</div>
	</div>

</body>
</html>