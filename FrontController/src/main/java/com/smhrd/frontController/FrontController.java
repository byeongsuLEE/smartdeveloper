package com.smhrd.frontController;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.smhrd.controller.Controller;
import com.smhrd.controller.GoJoinCon;
import com.smhrd.controller.GoLoginCon;
import com.smhrd.controller.GoMainCon;
import com.smhrd.controller.GoMypageCon;
import com.smhrd.controller.GoSelectCon;
import com.smhrd.controller.JoinCon;
import com.smhrd.controller.LoginCon;
import com.smhrd.controller.UpdateCon;
import com.smhrd.model.MemberDAO;
import com.smhrd.model.MemberVO;

/**
 * Servlet implementation class FrontController
 */
@WebServlet("*.do") // .do �� ���� ��� ��û�� �� Front Controller�� �������� .com ��� �ڱⰡ ���ϴ� ���İ���
public class FrontController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	// hash ���� �θ� Ŭ���� = map
	private Map<String,Controller> mappings; 
	@Override
	public void init() throws ServletException {
		// init : servlet�� �����ɶ� ����Ǵ� �޼ҵ�(�� 1����)
		//���� frontcontroller�� �������� ��������
		//HandlerMapping�̶�� class ����
		//fontcontroller �� ������ �ٿ��ֱ� ���ؼ� ����Ű� �������� ���� ��ų�ǰ��� �����Ѱ� 
		HandlerMapping handler = new HandlerMapping();
		mappings = handler.getMappings();
	}	
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		//1 . � ��û�� �������� urlmapping�� �߶󳻱�
		// http://localhost:8081 ������ 
		// /MemberSystem/join.do
		String uri =  request.getRequestURI();
		// join.do �� ������������ �ڵ�
		// cpath =  /MemberSystem
		String cpath = request.getContextPath();
		// �츮�� �־��ִ� �ε��� ��ȣ���� �����ؼ� �ڿ� �ִ� ���ڸ� ��������
		//join.do
		String command = uri.substring(cpath.length()); 
		System.out.println("��û mapping : " + command);
		String view= null;
		request.setCharacterEncoding("EUC-KR");
		
		
		// 2 ��û �����ؼ� , ������ ��� �����Ű��
		Controller con = mappings.get(command);
		
	//	if ( command.equals("/goMain.do")) {
	//		con = new GoMainCon();

	//	}
	//	else if(command.equals("/goLogin.do")) {
	//		con = new GoLoginCon();

	//	}
	//	else if(command.equals("/goJoin.do")) {
	//		con = new GoJoinCon();
//
	//	}else if(command.equals("/goMypage.do")) {
	//		con = new GoMypageCon();
//
	//	}else if(command.equals("/goSelect.do")) {
	//		con = new GoSelectCon();
			

		//}else if (command.equals("/join.do")) {


		//	con = new JoinCon();
			
		
		
		//}else if(command.equals("/Login.do")) {
		//	con = new LoginCon();
	////		
	//	}else if(command.equals("/update.do")) {
		//	con = new UpdateCon();
		//	

		
		//if �� �� =======================
		
		if ( con!=null)
		{
			view = con.execute(request,response);
		}
	
		//�������̵�
		if(view !=null)
		{
			if(view.contains("redirect:/")) {
				//redirect:/goMain.do
				//.split(":/") --> [ "redirect", " goMain.do"]
				response.sendRedirect(view.split(":/")[1]);
				
				
			}else {
				RequestDispatcher rd = request.getRequestDispatcher(ViewResolver.makeView(view)); // �丮����
				rd.forward(request, response);
				
			}
		}
		
		

		
		
	}
	
}
