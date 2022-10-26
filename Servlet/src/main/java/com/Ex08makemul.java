package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Ex08makemul
 */
@WebServlet("/Ex08")
public class Ex08makemul extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// �Ķ���� ���� : ������ �Ķ����(������ ������)�� �����ͼ� ������ ��� ����

		int x = Integer.parseInt(request.getParameter("data1"));
		int y = Integer.parseInt(request.getParameter("data2"));
		String color = request.getParameter("color");
		
		System.out.println(color);
		
		//�޾ƿ� �����͸� ������� ���� �ۼ� 
		PrintWriter out= response.getWriter();
		
		out.print("<html>");
		out.print("<style>");
		out.print("table{background-color: " + color+" }");
		out.print("</style>");
		out.print("<body>");
		out.print("<table border='1'>");
		for (int i =x ; i<=y;i++)
		{
			out.print("<tr>");
			for (int j =1 ; j<=9;j++)
			{
				out.print("<td>"+i+"*"+j+"="+i*j+"</td>");
			}
			out.print("</tr>");
		}

		
		
	
		out.print("</table>");
		out.print("</body>");
		out.print("</html>");
		
	}

}
