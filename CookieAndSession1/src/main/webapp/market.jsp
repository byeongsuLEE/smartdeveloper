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
	        <h2>C�� ���� Ȩ������ </h2>
	    	<div class="panel panel-default">
	    <div class="panel-heading">���Ͻô� ��ǰ�� ����ֽñ� �ٶ��ϴ� 
	    	<button type="submit" class="btn btn-sm btn-info">���</button>
	    	<button type="reset" class="btn btn-sm btn-info">���</button>
	    
	    </div>
	    
	    <div class="panel panel-default" style ="position:fixed; right:0px; top:200px; height:300px; text-align : center;"></div>
	    	<h3>���� �� ��ǰ</h3>
	    	
	    	<%
	    		//cookie �ȿ� �ִ� ���� �� ��ǰ ���� ���⿡ ����Ͻÿ�
	    		Cookie[] cookies = request.getCookies();
	    		if(cookies != null){
	    		
	    		for(int i = 0; i< cookies.length;i++)
	    		{
	    			if(!cookies[i].getName().equals("JSESSIONID"))
	    				out.print(cookies[i].getName()+"��Ű ���� :"+cookies[i].getValue()+"<br>");
	    			
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
	    		<td><input value ="ġŲ" name="goods" id="img1" type="checkbox"></td>
	    		<td><input value="�߲�ġ" name="goods" id="img2" type="checkbox"></td>
	    		<td><input value="�ܹ���" name="goods" id="img3"type="checkbox"></td>
	    		<td><input value="����" name="goods" id="img4"type="checkbox"></td>
	    	</tr>
	    	<tr>
	    		<td>ġŲ </td>
	    		<td>�߲�ġ </td>
	    		<td>�ܹ���</td>
	    		<td>����</td>
	    		
	    	
	    	</tr>

	    	<tr>
	    		<td><label for = "img5"><img class ="img-circle" src="img/img5.jfif"></label></td>
	    		<td><label for = "img6"><img class ="img-circle" src="img/img6.jfif"></label></td>
	    		<td><label for = "img7"><img class ="img-circle" src="img/img7.jfif"></label></td>
	    		<td><label for = "img8"><img class ="img-circle" src="img/img8.jfif"></label></td>
	    	
	    	</tr>
	    	<tr>
	    		<td><input value="������" name="goods" id="img5" type ="checkbox"></td>
	    		<td><input value="����" name="goods" id="img6" type ="checkbox"></td>
	    		<td><input value="�߰���" name="goods" id="img7" type ="checkbox"></td>
	    		<td><input value="�߰���" name="goods" id="img8" type ="checkbox"></td>
	    
	    	</tr>
	    
	    	<tr>
	    		<td>������</td>
	    		<td>����</td>
	    		<td>�߰���</td>
	    		<td>�߰���</td>
	    	</tr>	
	    	
	    </table>
	    
	    
	    
	    </div>
	    <div class="panel-footer">�����: �̺��� ����ó: 010-4044-1333</div>
	  </div>
	</div>

	</form>
</body>
</html>