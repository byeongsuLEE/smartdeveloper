package com;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class join
 */
@WebServlet("/join")
public class join extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// �Է��� ȸ�������� �ֿܼ� ����ϼ���
		
		request.setCharacterEncoding("EUC-KR");
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		String nickname = request.getParameter("nick");
		String address = request.getParameter("addr");
		
		System.out.println("ȸ������ : "+id);
		System.out.println("��й�ȣ : "+pw);
		System.out.println("�г��� : "+nickname);
		System.out.println("�ּ� : "+address);
		
		MemberVo vo = new MemberVo(id,pw,nickname,address);
		
		//������ ������ش�. ������ �������� ������ �������
		HttpSession session = request.getSession();
		session.setAttribute("vo", vo);
		
		//session.setAttribute("id", id);
		//session.setAttribute("pw",pw);
		//session.setAttribute("nick",nickname);
		//session.setAttribute("addr",address);
		
		response.sendRedirect("joinresult.jsp");
		
		
		
	}

}
