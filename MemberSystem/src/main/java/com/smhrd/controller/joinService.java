package com.smhrd.controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.smhrd.model.MemberDAO;

/**
 * Servlet implementation class joinService
 */
@WebServlet("/joinService")
public class joinService extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	request.setCharacterEncoding("EUC-KR");
	String id =request.getParameter("id");
	String pw = request.getParameter("pw");
	String nick = request.getParameter("nick");
	String addr = request.getParameter("addr");
	
	// �� �ڷḦ JDBC��  �����Ұ��̴�.
	//�̸� ���̺��� �����ߵȴ�.
	MemberDAO dao = new MemberDAO();
	int cnt = dao.join(id, pw, nick, addr);
	
	if (cnt>0) {
		System.out.println("ȸ������ ����!");
	}else {
		System.out.println("ȸ������ ����..");
		
	}

	response.sendRedirect("main.jsp");
	
	
	
	}

}
