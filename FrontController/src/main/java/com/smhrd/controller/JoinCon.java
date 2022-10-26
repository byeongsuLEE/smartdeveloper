package com.smhrd.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.smhrd.model.MemberDAO;

public class JoinCon implements Controller {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		

		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		String nick = request.getParameter("nick");
		String addr = request.getParameter("addr");
		
		MemberDAO dao = new MemberDAO();
		int cnt = dao.join(id, pw, nick, addr);
		
		
		if(cnt > 0) {
			System.out.println("ȸ������ ����!");
		}else {
			System.out.println("ȸ������ ����...");
		}
		//�츮������ ���
		//redirect ��û�������� redirect:�� ������
		return "redirect:/goMain.do";
		
	
	}

}
