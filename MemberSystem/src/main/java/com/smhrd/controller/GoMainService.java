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
		// 여기서는 단순 페이지만 이동
		// main.jsp로 이동 단 ,forward 방식으로 이동
		// url은 webapp 기준이다
		// url = http://localhost:8081/MemberSystem/GoMainService 
		// 고메인 서비스한테 요청을해야지 main으로 갈 수 있습니다.
		String view = "WEB-INF/views/main.jsp";
		RequestDispatcher rd = request.getRequestDispatcher(view);
		rd.forward(request, response);
		
		
		
	
	}

}
