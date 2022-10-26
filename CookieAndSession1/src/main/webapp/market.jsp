<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
 <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
 <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
 <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
<style>
	table{
		width:100%;
		text-align : center;
	}
	img{
		width:150px;
		height:150px;
	}
	input[type="checkbox"]{
		width :20px;
		height : 20px;
	}
</style>
</head>
<body>

		<form action="MarketAddItem" method ="post">
		<div class="container">
	        <h2>C반 마켓 홈페이지 </h2>
	    	<div class="panel panel-default">
	    <div class="panel-heading">원하시는 상품을 골라주시길 바랍니다 
	    	<button type="submit" class="btn btn-sm btn-info">담기</button>
	    	<button type="reset" class="btn btn-sm btn-info">취소</button>
	    
	    </div>
	    
	    <div class="panel panel-default" style ="position:fixed; right:0px; top:200px; height:300px; text-align : center;"></div>
	    	<h3>내가 고른 상품</h3>
	    	
	    	<%
	    		//cookie 안에 있는 내가 고른 상품 값을 여기에 출력하시오
	    		Cookie[] cookies = request.getCookies();
	    		if(cookies != null){
	    		
	    		for(int i = 0; i< cookies.length;i++)
	    		{
	    			if(!cookies[i].getName().equals("JSESSIONID"))
	    				out.print(cookies[i].getName()+"쿠키 값은 :"+cookies[i].getValue()+"<br>");
	    			
	    		}
	    		}
	    		
	    		%>
	    <div class="panel-body">
	    <table>
	    	<tr>
	    		
	    		<td><label for = "img1"><img class ="img-circle" src="img/img1.jfif"></label></td>
	    		<td><label for = "img2"><img class ="img-circle" src="img/img2.jfif"></label></td>
	    		<td><label for = "img3"><img class ="img-circle" src="img/img3.jfif"></label></td>
	    		<td><label for = "img4"><img class ="img-circle" src="img/img4.jfif"></label></td>
	    	</tr>
	    	<tr>
	    		<td><input value ="치킨" name="goods" id="img1" type="checkbox"></td>
	    		<td><input value="닭꼬치" name="goods" id="img2" type="checkbox"></td>
	    		<td><input value="햄버거" name="goods" id="img3"type="checkbox"></td>
	    		<td><input value="족발" name="goods" id="img4"type="checkbox"></td>
	    	</tr>
	    	<tr>
	    		<td>치킨 </td>
	    		<td>닭꼬치 </td>
	    		<td>햄버거</td>
	    		<td>족발</td>
	    		
	    	
	    	</tr>

	    	<tr>
	    		<td><label for = "img5"><img class ="img-circle" src="img/img5.jfif"></label></td>
	    		<td><label for = "img6"><img class ="img-circle" src="img/img6.jfif"></label></td>
	    		<td><label for = "img7"><img class ="img-circle" src="img/img7.jfif"></label></td>
	    		<td><label for = "img8"><img class ="img-circle" src="img/img8.jfif"></label></td>
	    	
	    	</tr>
	    	<tr>
	    		<td><input value="탕수육" name="goods" id="img5" type ="checkbox"></td>
	    		<td><input value="삼겹살" name="goods" id="img6" type ="checkbox"></td>
	    		<td><input value="닭강정" name="goods" id="img7" type ="checkbox"></td>
	    		<td><input value="닭갈비" name="goods" id="img8" type ="checkbox"></td>
	    
	    	</tr>
	    
	    	<tr>
	    		<td>탕수육</td>
	    		<td>삼겹살</td>
	    		<td>닭강정</td>
	    		<td>닭갈비</td>
	    	</tr>	
	    	
	    </table>
	    
	    
	    
	    </div>
	    <div class="panel-footer">담당자: 이병수 연락처: 010-4044-1333</div>
	  </div>
	</div>

	</form>
</body>
</html>