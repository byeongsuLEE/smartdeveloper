package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Ex07mul
 */
@WebServlet("/Ex07")
public class Ex07mul extends HttpServlet {
	
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		int a= Integer.parseInt(request.getParameter("data"));
		
		PrintWriter out= response.getWriter();
		
		out.print("<html>");
		out.print("<body>");
		
		out.print("<table border='1'>");
		
		for (int i =1 ; i<=9;i++)
		{
			out.print("<tr>"+"<td>"+a+"*"+i+"="+a*i+"</td>"+"</tr>");
		}
		
		
	
		out.print("</table>");

		out.print("</body>");
		out.print("</html>");
		
	}
	
}
