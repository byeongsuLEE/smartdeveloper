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
		// 입력한 회원정보를 콘솔에 출력하세요
		
		request.setCharacterEncoding("EUC-KR");
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		String nickname = request.getParameter("nick");
		String address = request.getParameter("addr");
		
		System.out.println("회원정보 : "+id);
		System.out.println("비밀번호 : "+pw);
		System.out.println("닉네임 : "+nickname);
		System.out.println("주소 : "+address);
		
		MemberVo vo = new MemberVo(id,pw,nickname,address);
		
		//세션을 만들어준다. 있으면 가져오고 없으면 만들어줌
		HttpSession session = request.getSession();
		session.setAttribute("vo", vo);
		
		//session.setAttribute("id", id);
		//session.setAttribute("pw",pw);
		//session.setAttribute("nick",nickname);
		//session.setAttribute("addr",address);
		
		response.sendRedirect("joinresult.jsp");
		
		
		
	}

}
