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
  <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.7.2/font/bootstrap-icons.css">
  <script src="https://cdn.jsdelivr.net/npm/jquery@3.6.0/dist/jquery.slim.min.js"></script>
  <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/js/bootstrap.bundle.min.js"></script>
  <script type="text/javascript">
   $(document).ready(function(){
	   //1번 방법
	   //#id로 register로 가기
	   //$("#register").funciton ()
	   //2번
	   //$("button[id="register"]")
	  
	   // 버튼중 data-oper값이 
	  $("button[data-oper='register']").click(function(){
		  location.href="register.do";
	  });
   });
   function delPopup(){
	   //alert("삭제된 게시물입니다.");
	   //jquery 에서 모달을 띄우기
	   //id= " myModal"
	  $("#myModal").show();
	  
   }


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
									<td>
									<c:if test="${vo.blevel>0}">
										<c:forEach begin="1" end ="${vo.blevel}">
											<span style="padding-left:10px"></span>
										</c:forEach>
										<i class="bi bi-arrow-return-right"></i>
										[RE]
									</c:if>
									<!-- vo.delete 는 삭제버튼이 누르면 1이되는데 vo.bdelete =0 일때 제목이 뜨는거 -->
									<c:if test="${vo.bdelete!=1}">
										<a href="get.do?idx=${vo.idx}">${vo.title}</a>
									</c:if>
									<!-- 삭제되었습니다 제목 띄우기-->
									<c:if test="${vo.bdelete==1}">
									
									
									<a href="javascript:delPopup()">삭제된 게시물입니다.</a><!-- 상세보기 넣기/이 게시물을 가지고오다라고해서 get 씀 -->
									</c:if>
									</td> 
									<td>${vo.writer}</td>
									<td><fmt:formatDate value="${vo.indate}" pattern="yyyy-MM-dd"/> </td>
									<td>${vo.count}</td>
									
								<tr>
								</c:forEach>
		
		
						</tbody>
		
					</table>
					<c:if test="${!empty m}">
						<button data-oper="register" class ="btn btn-sm btn-default">글쓰기</button>
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
 <!-- The Modal 팝업창 꾸미는 것 -->
  <div class="modal" id="myModal">
    <div class="modal-dialog">
      <div class="modal-content">
      
        <!-- Modal Header -->
        <div class="modal-header">
          <h4 class="modal-title">Message</h4>
          <button data-oper="close" type="button" class="close" data-dismiss="modal">&times;</button>
        </div>
        
        <!-- Modal body -->
        <div class="modal-body">
          삭제된 게시물입니다.
        </div>
        
        <!-- Modal footer -->
        <div class="modal-footer">
          <button type="button" class="btn btn-danger" data-dismiss="modal">Close</button>
        </div>
        
      </div>
    </div>
  </div>
  
</div>

</body>
</html>
    