package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Ex05plus
 */
@WebServlet("/Ex05")
public class Ex05plus extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// ����� �������°� �翬�ϴ� ex05 html���� �����͸� �ޱ� �����̴�.
		
		
		int x = Integer.parseInt(request.getParameter("data1"));
		int y = Integer.parseInt(request.getParameter("data2"));
		int result = x+y;
		
		PrintWriter out = response.getWriter();
		out.print("<h1>"+x+"+"+y +"="+result+"</h1>");

		
	}


}
