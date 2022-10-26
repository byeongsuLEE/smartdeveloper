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
	  $("button").on("click",function(e){
		  var a = $(this).data("oper");
		  var frm = $("#frm");
		  if(a=="update"){
			  frm.attr("action","updateForm.do") // 업데이트화면으로가기,controller로 요청이감
			  

			  
		  }else if(a=="remove"){
			  //form에 안보이게 값을 넓기는것
			  frm.attr("action","remove.do");
			  //frm.submit();
			  
		  }else if(a=="list"){
			  //지금은 로케이션으로할필요가없다.
			  //form 의 액션에 접근해서 list.do를 해줘서 폼을 전달
			  frm.attr("action","list.do");
			  //frm.submit();
		  }
		  frm.submit();
			  
			  
		  
		  
		  
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
					<jsp:include page="left.jsp"></jsp:include>
				</div>
				<div class="col-lg-7">
					<!--  게시판 리스트 -->
	<div class ="card" style ="min-height:500px ; max-heihgt:1000px;">
	  <div class="card">
	    <div class="card-header">상세보기</div>
	    <div class="card-body">
	    	<form id="frm">
	    		<!-- 폼이 전달될때 값을 넘길려고 쓴다. -->
	    		<input type = "hidden" name="idx" value ="${vo.idx}"/>
						<div class="form-group">
							<label for="email">제목:</label> 
							<input type="text" value= "${vo.title}" readonly="readonly" class="form-control" placeholder="Enter title" name= "title">
						</div>
						<div class ="form-group">
							<label for="content">내용:</label>
							<textarea rows ="7" class ="form-control"  readonly="readonly" name="content">${vo.content}</textarea>
						</div>
						<div class="form-group">
							<label for="writer">작성자:</label> <input type="text" value= "${vo.writer}"
								 readonly="readonly" class="form-control" placeholder="Enter wirter" name="writer">
						</div>
						<!--  아이디를 부여할때 data를 붙일수있음 
								date-id
								js에서는 data-id를 접근할수있는 함수인 data("id")가 있어서 id 버튼을 찾아갈수있다.
							
						
						 -->
						
						
						
						<button type="button" data-oper="update" class="btn btn-sm btn-primary" ${m.memId eq vo.memId? '': "disabled='disabled'"}>수정</button>
						<button type="button" data-oper="remove" class="btn btn-sm btn-warning" ${m.memId eq vo.memId? '': "disabled='disabled'"} >삭제</button>
						
						<button type="button" data-oper="list" class="btn btn-sm btn-success">목록</button>
					</form>
	    </div> 
	   
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
    