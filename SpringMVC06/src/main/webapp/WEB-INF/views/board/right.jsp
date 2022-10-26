<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%> 
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!--  제이쿼리 라이브러리가 연결되어야 한다. -->
<script src="https://code.jquery.com/jquery-3.6.1.min.js"></script>
<script src="https://code.jquery.com/ui/1.13.2/jquery-ui.js"></script> <!-- completeatuo 쓰기위한 라이브러리 -->
<<script type="text/javascript">
	$(document).ready(function(){
		$("button").on("click",function(e){
			// input의 데이터를 가져와서 keyword로 저장
			var keyword = $("#keyword").val();
			//url 서버에 접속해서 데이터를 가져와야한다.
			//이때 client인 자바 html인 jsp에서는 바로 다른 도메인으로 갈수가없다.
			// 우리 컨트롤로한테 요청하는법 어떻게할까요?  -Ajax통신 -JSON
					
			$.ajax({
				url : "jsonList.do",
				//url : "http://127.0.0.1:8081/sp06/jsonList.do"
				type : "post",      //get post put delete
				dataType : "json", // 서버(control)에서 처리후 전달되는 데이터의 타입 
				data : {"keyword":keyword},            //요청시 넘겨줄 데이터
				success : jsonHtml,  //데이터를받을떄 쓰는 함수(콜백 함수)  function(data) data에 값(json)을 받는다.
				//success : function(data){alert(data);} 이었지만 길어지기때문에 아래 function jsonHtml(data){ }정의
				error : function(){alert("error")}
			});  
			$(document).ajaxStart(function(){
				//$(".loading-progress").show();
				$(".loading-progress").css("display","block");
			
			});
			$(document).ajaxStop(function(){
				$(".loading-progress").hide();
			});
				
			
			
			
		});
		
		//input 박스에 타이핑시 발생하는 이벤트
		$("#keyword").autocomplete({
			source : function(){ 
				var keyword = $("#keyword").val();
				//url 서버에 접속해서 데이터를 가져와야한다.
				//이때 client인 자바 html인 jsp에서는 바로 다른 도메인으로 갈수가없다.
				// 우리 컨트롤로한테 요청하는법 어떻게할까요?  -Ajax통신 -JSON
						
				$.ajax({
					url : "jsonList.do",
					//url : "http://127.0.0.1:8081/sp06/jsonList.do"
					type : "post",      //get post put delete
					dataType : "json", // 서버(control)에서 처리후 전달되는 데이터의 타입 
					data : {"keyword":keyword},            //요청시 넘겨줄 데이터
					success : jsonHtml,  //데이터를받을떄 쓰는 함수(콜백 함수)  function(data) data에 값(json)을 받는다.
					//success : function(data){alert(data);} 이었지만 길어지기때문에 아래 function jsonHtml(data){ }정의
					error : function(){alert("error")}
				});  
				$(document).ajaxStart(function(){
					//$(".loading-progress").show();
					$(".loading-progress").css("display","block");
				
				});
				$(document).ajaxStop(function(){
					$(".loading-progress").hide();
				});
			},
			minLength : 1           // 최소 글자수가 
		});
			

	
		
	});
	
	function jsonHtml(data){
		var bList="<table class='table table-hover'>";
		bList+="<thead>";
		bList+="<tr>";
		bList+="<th>제목</th>";
		bList+="<th>작성자</th>";
		bList+="</tr>";
		bList+="</thead>";
		bList+="<tbody>";
		//jQuery의 반복문함수
		// data에서 하나의 json을 꺼내서 function (index ,obj )안에 준다 
		$.each(data,function(index,obj){
			bList+="<tr>";
			bList+="<td>"+obj.title+"</td>";
			bList+="<td>"+obj.writer+"</td>";
			bList+="</tr>";	
		});

		
		bList+="</tbody>";
		bList+="</table>";
		$("#jsonList").html(bList);
	}
	
	
	
</script>          
<div class="card" style="min-height: 500px;max-height: 1000px;">
    <div class="card-body">
        <h4 class="card-title">BOOK SEARCH</h4>
        <div class="input-group mb-3">
        <input type="text" class="form-control" id="keyword" placeholder="Search">
        <div class="input-group-append">
             <button class="btn btn-secondary" type="submit">Go</button>
        </div>
       </div>
              <div class="loading-progress" style="display: none;">
        <div class="spinner-border text-secondary" role="status">
          <span class="sr-only">Loading...</span>
        </div>
      </div>
      <!-- 여기에 데이터를 출력하세요 -->
      <div id="jsonList">
      	여기에 데이터를 출력하세요
      </div>
    </div>
</div>