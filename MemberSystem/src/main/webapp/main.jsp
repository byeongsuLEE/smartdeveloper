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
     <h2>����������</h2>
     <div class="panel panel-default">
       <div class="panel-heading">
       
       <%
       
     	MemberVo vo = (MemberVo)session.getAttribute("vo");
		if(vo!=null)
		{
			out.print("<span>"+vo.getNick()+"�� ȯ���մϴ�!</span>");
		}
		else{
			out.print("<span>���Ͻô� ����� �������ּ���</span>");
		}
       %>
       	
       	
       
       </div>
       
       <div class="panel-body">
       		<a href="join.jsp"><button class ="btn btn-info">ȸ������</button></a>
       		<a href="login.jsp"><button class ="btn btn-info">�α���</button></a>
       		<a href="SelectService"><button class ="btn btn-info">ȸ����Ϻ���</button></a>
         	
         <%
         MemberVo vo2 =null;
         vo2 =(MemberVo)session.getAttribute("vo");
         	  if(vo!=null)
         	  {%>
         		 <a href="mypage.jsp"><button class ="btn btn-info">����������</button></a>
         	<%  }
         %>	
         	
      </div>
       <div class="panel-footer">����� : ��︮ ����ó : 010-4611-5278</div>
     </div>
   </div>
   
</body>
</html>