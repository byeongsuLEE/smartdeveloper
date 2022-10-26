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

		// DB���� ��ü ȸ�� ��� ��������
		MemberDAO dao = new MemberDAO();
		ArrayList<MemberVO> list = dao.select();		
		
		// ȸ�� ��� �����͸� ������ select.jsp
		System.out.println( list );
		
		// ��� ����??
		// Scope : ������ ������� / ������or�������� ��ȿ���� ����
		// page : �ϳ��� JSP�������� ����
		// request : �ѹ��� ��û-���� ���� ����
		// session : �ϳ��� ������ ������ ����
		// application : �ϳ��� �� ���ø����̼� ������ ����
		// ��ü���ε� : �����͸� �����ص״ٰ�, ������ �̵��Ŀ� ������ ����ϴ� ���
		request.setAttribute( "list" , list );
		
		// ������ �̵�
		// forward ������� �̵�
		String view = "WEB-INF/views/select.jsp";
		// .getRequestDispatcher( "� �������� �̵�����" );
		RequestDispatcher rd = request.getRequestDispatcher(view);
		rd.forward(request, response);
	
	}

}
