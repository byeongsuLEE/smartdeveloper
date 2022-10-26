<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
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
   $(document).ready(function(){
	  $("button").click(function(){
		  location.href="register.do";
	  });
   });
  </script>

</head>
<body>

  <div class="card">
    <div class="card-header">
		    <div class="jumbotron jumbotron-fluid">
		  <div class="container">
		    <h1>Bootstrap Tutorial</h1>
		    <p>Bootstrap is the most popular HTML, CSS...</p>
		  </div>
		</div>
    </div>
    <div class="card-body">
    <!-- 한줄이 되는데 2 대 7 대 3의 비율의 div를 만들것이다 -->

    	<div class="row">
    		<div class="col-lg-2">
    			<!--  jsp:include page =" left,jsp"  = left.jsp 결과를 불러온다. 따라서 왼쪽카드가 뜬다. -->
				<jsp:include page="left.jsp"/>
    		</div>
    		
    		<div class="col-lg-7">
    		<!--  게시판 리스트 -->
    			<div class ="card" style ="min-height:500px ; max-heihgt:1000px;">
    				<div class = "card-body">
    					<h4 class="card-title">Board</h4>
    					<!--  게시판 리스트 보기 화면 구현 -->
    					<table class="table table-bordered table-hover">
						<thead>
							<th>번호</th>
							<th>제목</th>
							<th>작성자</th>
							<th>작성일</th>
							<th>조회수</th>
						</thead>
		
						<tbody>
								<!--  컨트롤러에서 attribute("list")한게 items에 오게된다. -->
								<c:forEach var="vo" items="${list}">
								<tr>
									<td>${vo.idx}</td>
									<td><a href="get.do?idx=${vo.idx}">${vo.title}</a></td> <!-- 상세보기 넣기/이 게시물을 가지고오다라고해서 get 씀 -->
									<td>${vo.writer}</td>
									<td><fmt:formatDate value="${vo.indate}" pattern="yyyy-MM-dd"/> </td>
									<td>${vo.count}</td>
									
								<tr>
								</c:forEach>
		
		
						</tbody>
		
					</table>
					<c:if test="${!empty m}">
						<button class ="btn btn-sm btn-default">글쓰기</button>
					</c:if>
    				</div>
    		
    			</div>
    		</div>
    		<div class="col-lg-3">
    		
    		<jsp:include page="right.jsp"></jsp:include>
    		
    		</div>
    	</div>
    
    
    </div> 
    <div class="card-footer">AI.BigData 취업역량강화</div>
  </div>
</div>

</body>
</html>
    