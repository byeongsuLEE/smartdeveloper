package kr.smhrd.controller;



import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.smhrd.entity.Member;
import kr.smhrd.repository.BoardMapper;
@Controller
public class LoginController {

	@Autowired
	private BoardMapper mapper;
	@RequestMapping("/Login.do")
	public String Login(Member member,HttpSession session) {  // memId, memPw를 구해 옵시다
		//왜 세션으로하나? 모델로 하면안돼요?
		//model 로 하면 요청한사람한테만 회원정보를 볼 수 있다
		//session 으로해야 다른사람들도 회원정보를  볼수있다.
		
		Member m = mapper.Login(member);
		if (m!=null) {
			session.setAttribute("m", m);
		}
		return "redirect:/list.do";
		
	}
	@RequestMapping("/logout.do")
	public String logout(HttpSession session) //현재 만들어져있는 세션을 가지고오기
	{
		session.invalidate();
		return "redirect:/list.do";
		
	}

}
