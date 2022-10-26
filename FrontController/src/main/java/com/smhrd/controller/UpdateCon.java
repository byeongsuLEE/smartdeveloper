package com.smhrd.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.smhrd.model.MemberDAO;
import com.smhrd.model.MemberVO;

public class UpdateCon implements Controller {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		
		// 1. 데이터 받아오기
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		String nick = request.getParameter("nick");
		String addr = request.getParameter("addr");
		
		// 데이터 묶어주기
		MemberVO info = new MemberVO(id, pw, nick, addr); 
		
		// 2. DAO의 update( info )메서드 실행
		MemberDAO dao = new MemberDAO();
		int cnt = dao.update(info);
		
		
		// 3. 성공/실패 구분
		if(cnt > 0) {
			System.out.println("정보 수정 성공");
			// session에 저장된 info 수정
			HttpSession session = request.getSession();
			session.setAttribute("info", info);
			
		}else {
			System.out.println("정보 수정 실패");
		}
		
		// 4. mypage.jsp로 돌아가기
		 return  "redirect:/goMypage.do";
		
	}

}
