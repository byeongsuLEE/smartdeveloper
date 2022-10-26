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
    			<jsp:include page="left.jsp"></jsp:include>
    			</div>
    		<div class="col-lg-7">
    		<!--  게시판 리스트 -->
    			
    		
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
    