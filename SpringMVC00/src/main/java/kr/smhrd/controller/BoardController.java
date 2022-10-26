package kr.smhrd.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.smhrd.entity.Board;
import kr.smhrd.repository.BoardMapper;


// 포조 인지 알 수 있는 방법은? 
// 알바생인지 목걸이를 차면 되는 것 처럼 표시를 해줘야된다
// @ = 전처리 (필요없는거 없애는거) 어노테이션
// 이 어노테이션을 깔아 줘야된다 @Controller
@Controller
public class BoardController {  //pojo
	//메서드
	// Spring은 pojo 컨트롤을 한개만 만든다.
	//리스트 요청(list.do)을 처리하는 메소드(DI=dependent injection)
	//BoardMapper mapper = new SqlSessionFactoryBean();
	// sqlsesion은 만들어졌고 board mapper과 연결시켜야 된다 .
	// 그방법은 @Autowired이다.
	@Autowired
	private BoardMapper mapper;
	@RequestMapping("/list.do")
	//public String list(HttpRequset request)
	public String list(Model model) {
		/*
		 * //데이터베이스에서 게시판 리스트를 가져오기!! //부모 타입으로 받으면 확장성을 넓힐 수 있다. //board라는 데이터타입
		 * List<Board> list = new ArrayList<Board>();
		 * 
		 * Board b = new Board(); b.setIdx(1L); b.setTitle("스프링게시판");
		 * b.setWriter("관리자"); b.setDate(new Date()); b.setCount(0L); list.add(b);
		 * list.add(b); list.add(b); //객체 바인딩(HttpServletRequest, HttpSession)
		 * //request.setAttribute("list",list); model.addAttribute("list",list);
		 * //forward 해서 보내는건 안해준다 자동적으로함
		 * 
		 * //데이터베이스 에서 게시판
		 */	
		List<Board> list = mapper.getList();
		
		
		model.addAttribute("list",list);
		
		//전체

		
		
		return "board/list";  //redirect, forward(JSP)		
	}
	//@RequestMapping("/register.do")
	
}
