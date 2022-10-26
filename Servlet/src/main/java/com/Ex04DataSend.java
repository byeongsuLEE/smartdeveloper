package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Ex04DataSend
 */
@WebServlet("/Ex04")
public class Ex04DataSend extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// Form �±� ������ �޾ƿ���
		// input �±��� data �ϳ� : �Ķ����
		// data���� request�ȿ� ����ִ�.
		// request.getParameter("input�ױ��� name") : �Ķ���� �����̶���Ѵ�.
		request.setCharacterEncoding("EUC-KR");
		String data = request.getParameter("data");
		System.out.println(data);
		
		//������ �ۼ��ϱ� ������ ���ڵ� ������ �ʿ��ϴ�.
		// ���ڵ� �Ӹ� �ƴ϶� �������ִ� ������ � �������� ���� ����
		//   ; ���󳪴���
		// " �������� : Charset= ���ڵ� ���"
		// text/html : html�������� �ۼ��ȹ���
		
		
		response.setContentType("text/html; charset=EUC-KR");
		PrintWriter out = response.getWriter();
		out.print("<h1>"+data+"</h1>");
		
	}

}
