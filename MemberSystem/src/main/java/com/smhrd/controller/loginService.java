package com.smhrd.controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.smhrd.model.MemberDAO;
import com.smhrd.model.MemberVo;

/**
 * Servlet implementation class loginService
 */
@WebServlet("/loginService")
public class loginService extends HttpServlet {
	private static final long serialVersionUID = 1L;
      
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String login_id = request.getParameter("id");
		String login_pw= request.getParameter("pw");
		
		MemberDAO dao = new MemberDAO();
		MemberVo info = dao.login(login_id,login_pw);
		if(info!=null)
		{
			//������������
			System.out.println("�α��ο� �����߽��ϴ�.");
			//������ ������ش�. ������ �������� ������ �������
			HttpSession session = request.getSession();
			session.setAttribute("vo", info);
			
			//session.setAttribute("id", id);
			//session.setAttribute("pw",pw);
			//session.setAttribute("nick",nickname);
			//session.setAttribute("addr",address);
			
			response.sendRedirect("main.jsp");						
			
		}
		else {
			System.out.println("�α��ο� �����߽��ϴ�.");
		}
		
	}
	

}
