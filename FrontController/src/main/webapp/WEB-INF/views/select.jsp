<%@page import="com.smhrd.model.MemberVO"%>
<%@page import="java.util.ArrayList"%>
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
	ArrayList<MemberVO> list = (ArrayList<MemberVO>)request.getAttribute("list");
	out.print(list.size());
%>
	<form action="JoinService" method="post">
	<div class="container">
	  <h2>회원정보보기 홈페이지</h2>
	  <div class="panel panel-default">
	    <div class="panel-heading">회원정보보기</div>
	    
	    <div class="panel-body">
	    
	    	<table class="table table-bordered table-hover">
	    		<tr>
	    			<td>ID</td>
	    			<td>NICK</td>
	    			<td>ADDR</td>
	    		</tr>
	    		
	    		<!-- 
	    		for each문
	    		for (i : list)
	    		-->
	    		<%for( MemberVO info : list ){ %>
	    		<tr>
	    			<td><%=info.getId() %></td>
	    			<td><%=info.getNick() %></td>
	    			<td><%=info.getAddr() %></td>
	    		</tr>
	    		<%} %>
	    		
	    		
	    	</table>
	    
	    
	    
	    
		</div>
		
	    <div class="panel-footer">담당자 : 리병수 연락처 : 010-4444-4444</div>
	  </div>
	</div>
	</form>
</body>
</html>
