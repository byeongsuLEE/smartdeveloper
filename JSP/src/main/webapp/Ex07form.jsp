<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<% 
		request.setCharacterEncoding("EUC-KR");
		int floor =Integer.parseInt(request.getParameter("floor"));
		int room =Integer.parseInt(request.getParameter("room"));
		
		out.print("<h1>"+floor+"층</h1>");
		out.print("<h1>"+room+"방</h1>");
		out.print("<table border='1'>");
		for(int i = 0;i<floor;i++)
		{
			
			out.print("<tr>");
			for(int j = 0; j<room;j++)
			{
				out.print("<td>"+j+"</td>");
			}
			out.print("</tr>");
		}
		out.print("<table>");
	
	
	%>
	

</body>
</html>