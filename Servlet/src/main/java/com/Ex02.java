package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Ex02
 */
@WebServlet("/Ex02")
public class Ex02 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		//�������α׷��� �˰��� �����Ѵ�. 
		
		// ��û�ϴ� client �� ip�ּ� Ȯ��
		// ip�� ��������� �� �� �ִ�.
		// request�� Ŭ���̾�Ʈ������ ����ִ�.
		String ip = request.getRemoteAddr();
		System.out.println("������ ��� ip : "+ ip);
		
		//response. setCharacterEncoding()
		// html ������ �����ҋ� ���� ���ڵ��� �����ϴ� �޼ҵ�
		response.setCharacterEncoding("EUC-KR");
		
		// PrintWriter : servlet�� html ������ �����ҋ� 
		// html ���� �ȿ��ٰ� �±� �� ���ڸ� �ۼ��� �� �ִ� ��ü
		// ��ü�� ����ϱ� ���� ��ü�������ߵǴµ�
		// ���信 ���䰴ü

		PrintWriter out = response.getWriter();
		
		out.print("<html>");
		out.print("<body>");
		if(ip.equals("121.147.0.243"))
		{
			out.print("<h1> �������� Ȩ������ </h1>");
			//servet�� html ������ webapp�� ������
			//���� �̹��� ��ġ�� webapp �̶� ���Եȴ�.
			out.print("<img src='img4.jpg'>");
		}
		else if (ip.equals("211.228.61.212"))
		{
			out.print("<h1> ����� Ȩ������ </h1>");
			//servet�� html ������ webapp�� ������
			//���� �̹��� ��ġ�� webapp �̶� ���Եȴ�.
			out.print("<img src='img4.jpg'>");
		}
		
		else if (ip.equals("59.0.129.84"))
		{
			out.print("<h1> ������ �ܹ���ġŲ���� ���ּ���  </h1>");
			//servet�� html ������ webapp�� ������
			//���� �̹��� ��ġ�� webapp �̶� ���Եȴ�.
			out.print("<img src='img4.jpg'>");
		}
		

		out.print("</body>");
		out.print("</html>");
	}

}
