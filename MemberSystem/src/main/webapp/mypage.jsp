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
<%
	MemberVo vo=null;

	vo =(MemberVo)session.getAttribute("vo");
	if(vo==null)
	{
		response.sendRedirect("main.jsp");
	}
	
%>

   <form action="#" method="post">
   <div class="container">
     <h2>ȸ������ Ȩ������</h2>
     <div class="panel panel-default">
       <div class="panel-heading">����������</div>
       
       <div class="panel-body">
         <table class="table table-hover table-sm table-borderless table-dark">
            <tr>
               <td>���̵�</td>
               <td><input value=<%=vo.getId() %> readonly name="id" class="form-control" type="text"></td>
            </tr>
            <tr>
               <td>��й�ȣ</td>
               <td><input  value=<%=vo.getPw() %> name="pw" class="form-control" type="password"></td>
            </tr>
            <tr>
               <td>�г���</td>
               <td><input  value=<%=vo.getNick() %> name="nick" class="form-control" type="text"></td>
            </tr>
            <tr>
               <td>�ּ�</td>
               <td><input  value=<%=vo.getAdd() %>name="addr" class="form-control" type="text"></td>
            </tr>
            <tr>
               <td colspan="2">
                  <button class="btn btn-sm btn-info" type="submit">ȸ������</button>
                  <button class="btn btn-sm btn-warning" type="reset">���</button>
               </td>
            </tr>
         </table>
      </div>
       <div class="panel-footer">����� : �ں��� ����ó : 010-4611-5278</div>
     </div>
   </div>
   </form>
</body>
</html>