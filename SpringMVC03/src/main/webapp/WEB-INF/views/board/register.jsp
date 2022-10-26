<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
 
<div class="container">
  <h2>Spring MVC01</h2>
  <div class="card">
    <div class="card-header">BOARD</div>
    <div class="card-body">
		<form action="insert.do" method="post">
		  <div class="form-group">
		    <label for="title">제목:</label>
		    <input type="text" class="form-control" placeholder="Enter title" name="title">
		  </div>
		  <div class="form-group">
		    <label for="content">내용:</label>
		    <textarea rows="7" class="form-control" name="content"></textarea> 
		  </div>
		  <div class="form-group">
		    <label for="writer">작성자:</label>
		    <input type="text" class="form-control" placeholder="Enter writer" name="writer">
		  </div>
		  <button type="submit" class="btn btn-sm btn-primary">등록</button>
		  <button type="reset" class="btn btn-sm btn-warning">취소</button>
		  <button type="button" class="btn btn-sm btn-success">목록</button>
		</form>
    </div> 
    <div class="card-footer">AI.BigData 취업역량강화_박매일</div>
  </div>
</div>

</body>
</html>
    