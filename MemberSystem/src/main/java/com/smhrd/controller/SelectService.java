package com.smhrd.controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.catalina.ha.backend.Sender;

import com.smhrd.model.MemberDAO;
import com.smhrd.model.MemberVo;


@WebServlet("/SelectService")
public class SelectService extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		// 이 파일은 회원 목록을 가져오기 위한 Servlet
		
		MemberDAO dao =new  MemberDAO();
		ArrayList<MemberVo> voList = dao.select();
		request.setAttribute("list", voList);

		// 페이지 이동
		// 1. sendRedirect -> requst영역을 사용할떄 문제발생
		// 해결방법
		// 2 forward 방식으로 이동
		//
		String view = "select.jsp";
		RequestDispatcher rd = request.getRequestDispatcher(view);
		rd.forward(request, response);

//				RequestDispatcher rd1 = requst.getRequestDispatcher(view)
//	 			rd.forward(request,response);	
		
	
	}

}
