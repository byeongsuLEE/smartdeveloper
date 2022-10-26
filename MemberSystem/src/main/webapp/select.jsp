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
	// selectService에서 request에서 저장한 회원정보를 가져와봅시다
	ArrayList<MemberVo> voList = (ArrayList<MemberVo>) request.getAttribute("list");
	// sendRedirect 때문에 voList가 오류가 뜬다.
	// main 회원 목록을 클릭하면 서버에서 selectService가 요청으로 받고  
	//select service 에서 request에 데이터를 저장하고  sendRedirect를 만나면
	// main으로 응답으로 select.sjp로 다시 요청을 하라는 응답을 보낸다
	// 따라서
	%>

	<div class="container">
		<h2>회원가입 홈페이지</h2>
		<div class="panel panel-default">
			<div class="panel-heading">회원정보보기</div>
			<!--  
       모든 회원 정보를 테이블 형식으로 제공하는 .jsp
       -사전에 회원목록을 통해서 가져온다음에 여기로 와야 어떤 일을 할 수 있다.
       
       
       
       
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
			<div class="panel-footer">담당자 : 이수 연락처 : 010-4444-4444</div>
		</div>
	</div>

</body>
</html>