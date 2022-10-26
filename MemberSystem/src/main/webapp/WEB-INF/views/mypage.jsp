<%@page import="com.smhrd.model.MemberVO"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>
<body>
	<%
		// 세션에서 사용자 정보 가져오기
		MemberVO info = (MemberVO)session.getAttribute("info");
	
	%>

	<form action="UpdateService" method="post">
	<div class="container">
	  <h2>마이페이지 홈페이지</h2>
	  <div class="panel panel-default">
	    <div class="panel-heading">마이페이지</div>
	    
	    <div class="panel-body">
			<table class="table table-hover table-sm table-borderless table-dark">
				<tr>
					<td>아이디</td>
					<td><input value="<%=info.getId() %>"
					readonly
					 name="id" class="form-control" type="text"></td>
				</tr>
				<tr>
					<td>비밀번호</td>
					<td><input value="<%=info.getPw() %>" name="pw" class="form-control" type="password"></td>
				</tr>
				<tr>
					<td>닉네임</td>
					<td><input value="<%=info.getNick() %>" name="nick" class="form-control" type="text"></td>
				</tr>
				<tr>
					<td>주소</td>
					<td><input value="<%=info.getAddr() %>" name="addr" class="form-control" type="text"></td>
				</tr>
				<tr>
					<td colspan="2">
						<button class="btn btn-sm btn-info" type="submit">수정하기</button>
						<button class="btn btn-sm btn-warning" type="reset">취소</button>
					</td>
				</tr>
			</table>
		</div>
	    <div class="panel-footer">담당자 : 리병수 연락처 : 010-4444-4444</div>
	  </div>
	</div>
	</form>
</body>
</html>
