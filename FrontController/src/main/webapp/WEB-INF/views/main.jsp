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
		MemberVO info = (MemberVO)session.getAttribute("info"); 
		System.out.println(info);	
	%>
	

	<div class="container">
	  <h2>메인페이지</h2>
	  <div class="panel panel-default">
	    <div class="panel-heading">
	    	<% if(info == null){ %>
	    		<span>원하시는 목록을 선택해주세요</span>
	    	<% }else{ %>
	    		<span><%= info.getNick() %>님 환영합니다!</span>
	    	<% } %>
	    </div>
	    
	    <div class="panel-body">
			<a href="goJoin.do"><button class="btn btn-info">회원가입</button></a>
			<a href="goLogin.do"><button class="btn btn-success">로그인</button></a>
			<a href="goSelect.do"><button class="btn btn-warning">회원목록보기</button></a>
			<%if( info != null ){ %>
			<a href="goMyPage.do"><button class="btn">마이페이지</button></a>
			<%} %>
		</div>
	    <div class="panel-footer">담당자 : 리병수 연락처 : 010-4444-4444</div>
	  </div>
	</div>
</body>
</html>
