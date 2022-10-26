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
@WebServlet("*.do") // .do 가 붙은 모든 요청을 이 Front Controller가 받을꺼다 .com 등등 자기가 원하는 형식가능
public class FrontController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	// hash 맵의 부모 클래스 = map
	private Map<String,Controller> mappings; 
	@Override
	public void init() throws ServletException {
		// init : servlet이 생성될때 실행되는 메소드(딱 1번만)
		//절대 frontcontroller를 수정하지 않을려고
		//HandlerMapping이라는 class 만듦
		//fontcontroller 의 업무를 줄여주기 위해서 만든거고 누구한테 일을 시킬건가를 정의한거 
		HandlerMapping handler = new HandlerMapping();
		mappings = handler.getMappings();
	}	
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		//1 . 어떤 요청이 들어오는지 urlmapping만 잘라내기
		// http://localhost:8081 생략됨 
		// /MemberSystem/join.do
		String uri =  request.getRequestURI();
		// join.do 만 가져오기위한 코드
		// cpath =  /MemberSystem
		String cpath = request.getContextPath();
		// 우리가 넣어주는 인덱스 번호부터 시작해서 뒤에 있는 글자만 가져오기
		//join.do
		String command = uri.substring(cpath.length()); 
		System.out.println("요청 mapping : " + command);
		String view= null;
		request.setCharacterEncoding("EUC-KR");
		
		
		// 2 요청 구분해서 , 각각의 기능 실행시키기
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

		
		//if 문 끝 =======================
		
		if ( con!=null)
		{
			view = con.execute(request,response);
		}
	
		//페이지이동
		if(view !=null)
		{
			if(view.contains("redirect:/")) {
				//redirect:/goMain.do
				//.split(":/") --> [ "redirect", " goMain.do"]
				response.sendRedirect(view.split(":/")[1]);
				
				
			}else {
				RequestDispatcher rd = request.getRequestDispatcher(ViewResolver.makeView(view)); // 뷰리졸버
				rd.forward(request, response);
				
			}
		}
		
		

		
		
	}
	
}
