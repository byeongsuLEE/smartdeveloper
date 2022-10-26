<%@page import="com.smhrd.model.MemberVo"%>
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
   
   <div class="container">
     <h2>메인페이지</h2>
     <div class="panel panel-default">
       <div class="panel-heading">
       
       <%
       
     	MemberVo vo = (MemberVo)session.getAttribute("vo");
		if(vo!=null)
		{
			out.print("<span>"+vo.getNick()+"님 환영합니다!</span>");
		}
		else{
			out.print("<span>원하시는 목록을 선택해주세요</span>");
		}
       %>
       	
       	
       
       </div>
       
       <div class="panel-body">
       		<a href="join.jsp"><button class ="btn btn-info">회원가입</button></a>
       		<a href="login.jsp"><button class ="btn btn-info">로그인</button></a>
       		<a href="SelectService"><button class ="btn btn-info">회원목록보기</button></a>
         	
         <%
         MemberVo vo2 =null;
         vo2 =(MemberVo)session.getAttribute("vo");
         	  if(vo!=null)
         	  {%>
         		 <a href="mypage.jsp"><button class ="btn btn-info">마이페이지</button></a>
         	<%  }
         %>	
         	
      </div>
       <div class="panel-footer">담당자 : 뱅곤리 연락처 : 010-4611-5278</div>
     </div>
   </div>
   
</body>
</html>