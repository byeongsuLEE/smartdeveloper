<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!--  코어라이브러리를 접두사 c를 붙여서 쓸수 있다. -->
<!DOCTYPE html>
<html lang="en">
<head>
<title>Bootstrap Example</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css">
<script
	src="https://cdn.jsdelivr.net/npm/jquery@3.6.0/dist/jquery.slim.min.js"></script>
<script
	src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/js/bootstrap.bundle.min.js"></script>
<script type="text/javascript">
	$(document).ready(function() {
		//버튼이 클릭이 되었을때 실행
		$("button").click(function() {
			location.href = "register.do";
		});
	});
</script>
</head>
<div class="jumbotron jumbotron-fluid">
  <div class="container">
    <h1>Bootstrap Tutorial</h1>
    <p>Bootstrap is the most popular HTML, CSS...</p>
  </div>
</div>


<body>
	<div class="container">
		<h2>Spring MVC01</h2>
		<div class="card">
			<div class="card-header">BOARD</div>
			<div class="card-body">Content</div>
			<div>
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
			<button class ="btn btn-sm btn-primary">글쓰기</button>
		</div>
		<div class="card-footer">AI.BigData 취업역량강화</div>
	</div>
</div>

</body>
</html>
