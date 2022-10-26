<%@page import="java.util.ArrayList"%>
<%@page import="kr.smhrd.entity.Board"%>
<%@page import="java.util.Date"%>
<%@page import="java.util.List"%>
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
<%
	List<Board> list = new ArrayList<Board>();
	Board vo = new Board();
	vo.setIdx(1L);
	vo.setTitle("스프링 게시판");
	vo.setWriter("연습");
	vo.setIndate(new Date());
	vo.setCount(0L);
	list.add(vo);
	list.add(vo);
	list.add(vo);
	
	request.setAttribute("list",list);
	
%>
<!--
표현식 대신 쓰는거 -EL 이다
//${식}
식에 들어가는가는종류
1. var
2. attribute(속성이름) 
	model.addAttribute("list",list); // 객체바인딩할때 "list"가 속성이름임
	jsp는 request.getAttribute("list"); 로 읽어드림  // 뷰에서 읽어드림
	request.getAttribute("list")   = $[list]로 쓸수있다.
	
	<c:forEach var="vo" items="${lisd}">
					/${vo.idx}
					/${vo.title}
					/${vo.writer}
					/${vo.indate}
					/${vo.count}
					
   --> 


<c:forEach var="vo" items="${list}">
	${vo.idx},${vo.title},${vo.writer},${vo.indate},${vo.count }<br/>

</c:forEach>
		
</body>
</html>