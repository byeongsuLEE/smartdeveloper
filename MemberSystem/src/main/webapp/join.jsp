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
</head>
<body>
   <form action="joinService" method="post">
   <div class="container">
     <h2>회원가입 홈페이지</h2>
     <div class="panel panel-default">
       <div class="panel-heading">회원가입</div>
       
       <div class="panel-body">
         <table class="table table-hover table-sm table-borderless table-dark">
            <tr>
               <td>아이디</td>
               <td><input name="id" class="form-control" type="text"></td>
            </tr>
            <tr>
               <td>비밀번호</td>
               <td><input name="pw" class="form-control" type="password"></td>
            </tr>
            <tr>
               <td>닉네임</td>
               <td><input name="nick" class="form-control" type="text"></td>
            </tr>
            <tr>
               <td>주소</td>
               <td><input name="addr" class="form-control" type="text"></td>
            </tr>
            <tr>
               <td colspan="2">
                  <button class="btn btn-sm btn-info" type="submit">회원가입</button>
                  <button class="btn btn-sm btn-warning" type="reset">취소</button>
               </td>
            </tr>
         </table>
      </div>
       <div class="panel-footer">담당자 : 박병관 연락처 : 010-4611-5278</div>
     </div>
   </div>
   </form>
</body>
</html>