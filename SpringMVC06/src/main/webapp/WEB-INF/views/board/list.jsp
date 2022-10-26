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
  <link rel="stylesheet" href="resources/css/style.css">
  <script src="https://cdn.jsdelivr.net/npm/jquery@3.6.0/dist/jquery.slim.min.js"></script>
  <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/js/bootstrap.bundle.min.js"></script>
  <script type="text/javascript" src="//dapi.kakao.com/v2/maps/sdk.js?appkey=348accd543dc20853dd7b0311ba6cc8f"></script>
  <script type="text/javascript">
   $(document).ready(function(){
	   //주소 검색 버튼이 클릭 되었을때 실행
	   $("#addr").on("click",function(e){
		   var address=$("#address").val();
		   $.ajax({
				//url : "jsonList.do",
				url : "https://dapi.kakao.com/v2/local/search/address.json",
				//url : "http://127.0.0.1:8081/sp06/jsonList.do"
				headers : {"Authorization": "KakaoAK bde4f878328e6ba2243681ece59720fd"},
				type : "get",      //get post put delete
				dataType : "json", // 서버(control)에서 처리후 전달되는 데이터의 타입 
				data : {"query": address},            //요청시 넘겨줄 데이터
				success : mapHtml,  //데이터를받을떄 쓰는 함수(콜백 함수)  function(data) data에 값(json)을 받는다.
				//success : function(data){alert(data);} 이었지만 길어지기때문에 아래 function jsonHtml(data){ }정의
				error : function(){alert("error")}
			});  
		   
		   
	   });
	   
	   
	   
	   
	   
	   //1번 방법
	   //#id로 register로 가기
	   //$("#register").funciton ()
	   //2번
	   //$("button[id="register"]")
	  
	   // 버튼중 data-oper값이 
	  $("button[data-oper='register']").click(function(){
		  location.href="register.do";
	  });
	   //페이지번호 클릭(a tag)시 list.do로 이동하는 부분(page,type,keyword 정보도 같이 전송)
	   var pageForm = $("#pageForm");
	   $(".pagination a").on("click", function(e){
		   // a태그의 고유의 기능을 제거
		   e.preventDefault();
		   var page=$(this).attr("href");
		   //input hidden의 page 에 값을 저장
		   $("#page").val(page);
		   pageForm.submit();

	   });
	   //상세보기 a tag 클릭시 get.do 이동(idx,page,type,keyword)
	   $(".move").on("click",function(e){
		   e.preventDefault();
		   var idx = $(this).attr("href");  // 현재 눌린 a태그의 href 속성의 값을 가져와라
		   // form에 input타입 추가
		   var tag ="<input type='hidden' name='idx' value='"+idx+"'>";
		   pageForm.append(tag);
		   pageForm.attr("action","get.do");
		   pageForm.attr("method","get");
		   pageForm.submit();
	   });
	   
   });
   function delPopup(){
	   //alert("삭제된 게시물입니다.");
	   //jquery 에서 모달을 띄우기
	   //id= " myModal"
	  $("#myModal").show();
	  
   }
	function mapHtml(data){
		//여기에서 지도를 띄우기
		var x = data.documents[0].x; //경도
		var y = data.documents[0].y; // 위도
		var mapContainer = document.getElementById('map'), // 지도를 표시할 div 
	    mapOption = { 
	        center: new kakao.maps.LatLng(y, x), // 지도의 중심좌표
	        level: 3 // 지도의 확대 레벨
	    };
	   var map = new kakao.maps.Map(mapContainer, mapOption);
	// 마커가 표시될 위치입니다 
	   var markerPosition  = new kakao.maps.LatLng(y,x); 

	   // 마커를 생성합니다
	   var marker = new kakao.maps.Marker({
	       position: markerPosition
	   });

	   // 마커가 지도 위에 표시되도록 설정합니다
	   marker.setMap(map);

	   // 아래 코드는 지도 위의 마커를 제거하는 코드입니다
	   // marker.setMap(null);    
	   
	   // 마커를 클릭했을 때 마커 위에 표시할 인포윈도우를 생성합니다
		var iwContent = '<div style="padding:5px;">${m.memName}</div>', // 인포윈도우에 표출될 내용으로 HTML 문자열이나 document element가 가능합니다
		    iwRemoveable = true; // removeable 속성을 ture 로 설정하면 인포윈도우를 닫을 수 있는 x버튼이 표시됩니다
		
		// 인포윈도우를 생성합니다
		var infowindow = new kakao.maps.InfoWindow({
		    content : iwContent,
		    removable : iwRemoveable
		});
		
		// 마커에 클릭이벤트를 등록합니다
		if(${!empty m})
		{
			
			kakao.maps.event.addListener(marker, 'click', function() {
			      // 마커 위에 인포윈도우를 표시합니다
			      infowindow.open(map, marker);  
			});
			
			
		}

		
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
										<a class ="move" href="${vo.idx}"><c:out value ="${vo.title}"/></a>
									
									
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
					<!--  검색 메뉴 -->
					<!-- form-inline은 가로로 한줄을 나타낸다. -->
					<div class="pagination justify-content-center">
					<form class="form-inline" action="list.do" method ="post">
						<!-- 검색 타입 지정-->
						<div class="form-group">
							<select name="type" class="form-control">
								<option value="writer" ${pageMaker.cri.type=='writer'?'selected': ''} >이름</option>
								<option value="title" ${pageMaker.cri.type=='title'?'selected': ''}>제목</option>
								<option value="content" ${pageMaker.cri.type=='content'?'selected': ''}>내용</option>
								
							</select>
						
						</div>
						<!-- 검색 키워드 지정 -->
						<div class="form-group">
							<input type="text" class="form-control" name="keyword" value="${pageMaker.cri.keyword}"/>
						</div>
						<button type="submit" class="btn btn-sm btn-success">Search</button>					
					</form>
					</div>
					<!--  페이징 버튼 만들기 3가지 버튼 -->
					<!--  이전 버튼 -->
					<ul class="pagination justify-content-center">
						<c:if test="${pageMaker.prev}">
							<li class="page-item"><a class="page-link" href="=${pageMaker.startPage-1}">Previous</a></li>
						</c:if>
					
					    <!-- 1. 페이지 List  이걸 맨처음에 한다.-->
					<!-- 1. 부트스트렙(Pagination)에 있는거 가져옵시다. [1],[2],[endPage]-->
					    <c:forEach var ="pageNum" begin ="${pageMaker.startPage}" end ="${pageMaker.endPage}">
					    	<li class="page-item ${pageMaker.cri.page==pageNum ? 'active':''}"><a class="page-link" href="${pageNum}">${pageNum}</a></li>
					    	
					    </c:forEach>
					    
					    <!--  다음  -->
					    <c:if test="${pageMaker.next}">
					    <li class="page-item"><a class="page-link" href="${pageMaker.endPage+1}">Next</a></li>
					    </c:if>
					  </ul>
					
			
					
					<!--  페이징 end -->
					<!--  Form을 하나 만들어서 히든으로 검색 키워드 타입을 보내자 -->
					<form id="pageForm" action="list.do" mthod ="post">
						
						<!-- 상세보기하고 검색을 볼때  -->
						<input type="hidden" id="page" name="page" value="${pageMaker.cri.page}"/>
						<input type="hidden" name="type" value="${pageMaker.cri.type}"/>
						<input type="hidden" name="keyword" value="${pageMaker.cri.keyword}"/>
		
					</form>
    				</div>
    		
    			</div>
    		</div>
    		<div class="col-lg-3">
    		
    		<jsp:include page="book.jsp"></jsp:include>
    		
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
    