<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<% string[] flist ={"사과","바나나","포도","귤","오랜지"};
//객체 바인딩
request.setAttribute("flist", flist)%>
<%
	String[] data
%>

<!--
표현식 대신 쓰는거 -EL 이다

${식}
식에 들어가는가는종류
1. var
2. attribute(속성이름) 
	model.addAttribute("list",list); // 객체바인딩할때 "list"가 속성이름임
	jsp는 request.getAttribute("list"); 로 읽어드림  // 뷰에서 읽어드림
	request.getAttribute("list")   = $[list]로 쓸수있다.
   --> 

<c:forEach items="${flist}"></c:forEach>
</body>
</html>