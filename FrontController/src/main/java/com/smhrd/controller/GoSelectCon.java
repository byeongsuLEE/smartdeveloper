package com.smhrd.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.smhrd.model.MemberDAO;
import com.smhrd.model.MemberVO;

public class GoSelectCon implements Controller {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// DB에서 전체 회원 목록 가져오기
		MemberDAO dao = new MemberDAO();
		ArrayList<MemberVO> list = dao.select();	
		
		System.out.println( list );
		
		request.setAttribute( "list" , list );
		
		return  "select";
		
	}

}
