package com.smhrd.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class GoMainService
 */
@WebServlet("/GoMainService")
public class GoMainService extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// ���⼭�� �ܼ� �������� �̵�
		// main.jsp�� �̵� �� ,forward ������� �̵�
		// url�� webapp �����̴�
		// url = http://localhost:8081/MemberSystem/GoMainService 
		// ����� �������� ��û���ؾ��� main���� �� �� �ֽ��ϴ�.
		String view = "WEB-INF/views/main.jsp";
		RequestDispatcher rd = request.getRequestDispatcher(view);
		rd.forward(request, response);
		
		
		
	
	}

}
