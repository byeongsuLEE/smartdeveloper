package com.smhrd.controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.smhrd.model.MemberDAO;
import com.smhrd.model.MemberVO;

@WebServlet("/SelectService")
public class SelectService extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		// DB에서 전체 회원 목록 가져오기
		MemberDAO dao = new MemberDAO();
		ArrayList<MemberVO> list = dao.select();		
		
		// 회원 목록 데이터를 가지고 select.jsp
		System.out.println( list );
		
		// 어디에 저장??
		// Scope : 서버의 저장공간 / 어디까지or언제까지 유효한지 범위
		// page : 하나의 JSP내에서만 유지
		// request : 한번의 요청-응답 동안 유지
		// session : 하나의 브라우저 내에서 유지
		// application : 하나의 웹 어플리케이션 내에서 유지
		// 객체바인딩 : 데이터를 저장해뒀다가, 페이지 이동후에 꺼내서 사용하는 방식
		request.setAttribute( "list" , list );
		
		// 페이지 이동
		// forward 방식으로 이동
		String view = "WEB-INF/views/select.jsp";
		// .getRequestDispatcher( "어떤 페이지로 이동할지" );
		RequestDispatcher rd = request.getRequestDispatcher(view);
		rd.forward(request, response);
	
	}

}
