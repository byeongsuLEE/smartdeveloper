<%@page import="kr.smhrd.entity.Board"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
     List<Board> list=(List<Board>)request.getAttribute("list");
%>    
<!DOCTYPE html>
<html lang="en">
<head>
  <title>Bootstrap Example</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css">
  <script src="https://cdn.jsdelivr.net/npm/jquery@3.6.0/dist/jquery.slim.min.js"></script>
  <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/js/bootstrap.bundle.min.js"></script>
  <script type="text/javascript">
  // jQuery시작점
    $(document).ready(function(){
    	// 버튼이 클릭이 되었을때 실행
    	$("button").click(function(){ 
    		location.href="register.do";
    	});
    });   
  </script>
</head>
<body>
 
<div class="container">
  <h2>Spring MVC01</h2>
  <div class="card">
    <div class="card-header">BOARD</div>
    <div class="card-body">
      <table class="table table-bordered table-hover">
        <thead>
           <th>번호</th>
           <th>제목</th>
           <th>작성자</th>
           <th>작성일</th>
           <th>조회수</th>
        </thead>
        <tbody>
          <% for(Board vo : list){  %>
          <tr>
            <td><%=vo.getIdx()%></td>
            <td><%=vo.getTitle()%></td>
            <td><%=vo.getWriter()%></td>
            <td><%=vo.getIndate()%></td>
            <td><%=vo.getCount()%></td>
          </tr>
          <% } %>
        </tbody>
      </table>  
      <button class="btn btn-sm btn-primary">글쓰기</button>    
    </div> 
    <div class="card-footer">AI.BigData 취업역량강화_박매일</div>
  </div>
</div>

</body>
</html>
    