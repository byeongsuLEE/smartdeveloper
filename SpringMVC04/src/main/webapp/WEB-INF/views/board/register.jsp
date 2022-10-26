<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="en">
<head>
	<title>Bootstrap Example</title>
	<meta charset="EUC-KR">
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
		//제이쿼리 문법은 document를 선택하고 레디상태가 되어야 쓸수있다.
		//ready안에 함수가 있어야된다.
		$(document).ready(function(){
			//버튼누른거에따라 행동을 다르게한다.
			//버튼이 클릭이되면 무슨함수가 실행된다 
			// fuction에 e는 이벤트를말한다.
			// e에는 a버튼눌렀을때 a버튼의 정보가 들어간다.
			//버튼을 구분하기위해서 
			$("button").on("click",function(e){
				//눌린버튼 = $(this)
				//data() = data-oper
				var oper = $(this).data("oper");
				
				if(oper=="reg"){
					var frm =$("#frm");  // $ = 선택자 , # = 아이디를 말한다.
					frm.submit();
					//등록이라 form을 선택해서 submit 해주면됩니다.
					//form 을 전송하는코드
					//폼을 찾아가야 합니다. 젤 쉬운건 id를 만들면된다.
					
					
				}else if(oper=="reset"){
					//폼초기화
					frm[0].reset();
				
				}else if(oper=="list"){
					// location.href = url를 바꿔라
					location.href="list.do";
					
				}
				
			});
			
		});
		
	
	
	</script>

</head>
<body>

	<div class="container">
		<h2>Spring MVC02</h2>
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
		    		<div class ="card" style ="min-height:500px ; max-heihgt:1000px;">
		    		<!--  게시판 리스트 -->
		    			<div class="card-body">
				<form id="frm" action="insert.do" method="post">
					<input type="hidden" name ="memId" value ="${m.memId}"/>
					<div class="form-group">
						<label for="email">제목:</label> <input type="text"
							class="form-control" placeholder="Enter title" name= "title">
					</div>
					<div class ="form-group">
						<label for="content">내용:</label>
						<textarea rows ="7" class ="form-control" name="content"></textarea>
					</div>
					<div class="form-group">
						<label for="writer">작성자:</label> <input type="text"
							class="form-control" value="${m.memName}" readonly="readonly" name="writer">
					</div>
					<!--  아이디를 부여할때 data를 붙일수있음 
							date-id
							js에서는 data-id를 접근할수있는 함수인 data("id")가 있어서 id 버튼을 찾아갈수있다.
						
					
					 -->
					<button type="button" data-oper="reg" class="btn btn-sm btn-primary">등록</button>
					<button type="button" data-oper="reset" class="btn btn-sm btn-warning">취소</button>
					<button type="button" data-oper="list" class="btn btn-sm btn-success">목록</button>
				</form>

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