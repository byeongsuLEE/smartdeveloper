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
		
		// �� ������ ȸ�� ����� �������� ���� Servlet
		
		MemberDAO dao =new  MemberDAO();
		ArrayList<MemberVo> voList = dao.select();
		request.setAttribute("list", voList);

		// ������ �̵�
		// 1. sendRedirect -> requst������ ����ҋ� �����߻�
		// �ذ���
		// 2 forward ������� �̵�
		//
		String view = "select.jsp";
		RequestDispatcher rd = request.getRequestDispatcher(view);
		rd.forward(request, response);

//				RequestDispatcher rd1 = requst.getRequestDispatcher(view)
//	 			rd.forward(request,response);	
		
	
	}

}
