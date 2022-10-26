package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Ex06table
 */
@WebServlet("/Ex06")
public class Ex06table extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
		int a= Integer.parseInt(request.getParameter("data"));
		
		PrintWriter out= response.getWriter();
		
		out.print("<html>");
		out.print("<body>");
		
		out.print("<table border='1'>");
		out.print("<tr>");
		for (int i =1 ; i<=a;i++)
		{
			out.print("<td>"+i+"</td>");
		}
		out.print("</tr>");
		
		
	
		out.print("</table>");

		out.print("</body>");
		out.print("</html>");
		
	}

}
