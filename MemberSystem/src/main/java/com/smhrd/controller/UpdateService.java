package com.smhrd.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.smhrd.model.MemberDAO;
import com.smhrd.model.MemberVO;

@WebServlet("/UpdateService")
public class UpdateService extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("EUC-KR");
		
		// 1. ������ �޾ƿ���
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		String nick = request.getParameter("nick");
		String addr = request.getParameter("addr");
		
		// ������ �����ֱ�
		MemberVO info = new MemberVO(id, pw, nick, addr); 
		
		// 2. DAO�� update( info )�޼��� ����
		MemberDAO dao = new MemberDAO();
		int cnt = dao.update(info);
		
		
		// 3. ����/���� ����
		if(cnt > 0) {
			System.out.println("���� ���� ����");
			// session�� ����� info ����
			HttpSession session = request.getSession();
			session.setAttribute("info", info);
			
		}else {
			System.out.println("���� ���� ����");
		}
		
		// 4. mypage.jsp�� ���ư���
		String view = "GoMypageService";
		response.sendRedirect(view);
	
	
	}

}
