package com.smhrd.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.smhrd.model.MemberDAO;
import com.smhrd.model.MemberVO;

public class DeleteCon implements Controller {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
		
		
		// 1. ������ ����
		HttpSession session = request.getSession();
		MemberVO info = (MemberVO)session.getAttribute("info");
		String id = info.getId();
		//2. ȸ�� ���� ��� ����
		
		//delete from member where id = ?
		MemberDAO dao = new MemberDAO();
		int cnt = dao.delete(id);
		if(cnt>0)
		{
			System.out.println("ȸ��Ż�� ����");
			session.removeAttribute("info");
			
		}
		else{
			System.out.println("ȸ��Ż�� ����");
		}
		
		
		
		return "redirect:/goMain.do";
	}

}
