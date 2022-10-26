package kr.smhrd.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.smhrd.entity.Board;
import kr.smhrd.repository.BoardMapper;

@Controller
public class BoardController { // POJO
	//메서드
	@Autowired
	private BoardMapper mapper;
	// 리스트를 요청(list.do)을 처리하는 메서드
	//@RequestMapping -> handlerMapping 동작한다. 

	
	@RequestMapping("/list.do")
	public String list(Model model) {
		List<Board> list =mapper.getList();
		
		model.addAttribute("list", list); // list --> ArrayList를 가르킨다.
		// 데이터베이스에서 게시판 리스트를 가져오기 
		return "board/list"; // redirect, forward(JSP)
		
	}
	@RequestMapping("/register.do")
	public String register() {
		return "board/register";//register.jsp
		
	}
	@RequestMapping("/insert.do") // title,content, writer
	public String insert(Board vo) { // vo를 알아서 해줌 파라미터 수집
		
		mapper.register(vo);// 등록
		return "redirect:/list.do";
	}

	@RequestMapping("/get.do")
	
	//public String get(@RequestParam("idx") int cnt)  { //아이디이름을 다르게 할 수 있따. 알리아스 개념
	//public String get(int id) { //아이디이름을 다르게 하면오류뜬다.
	public String get(int idx,Model model) { //프레임워크가 string 타입을 int로 자동으로 해준다.
		Board vo = mapper.get(idx);
		model.addAttribute("vo",vo);
		//조회수 누적
		mapper.countUpdate(idx); 
		
		return "board/get";
	}
	@RequestMapping("/remove.do")
	public String remove(int idx)
	{
		//id 값을 어떻게 넘겼나? form에 히든때문에 넘어갔다
		//remove.do 버튼을 누를때 실행되는 컨트롤러
		mapper.remove(idx);
		
		
		return "redirect:/list.do";
	}
	// 보내는방식에 따라서 다르게 받을수있따. GetMapping 
	@GetMapping("/updateForm.do")
	public String updateForm(int idx,Model model) {
		//model은 가지고온 것을 게시물에 뿌려줘야기때문이다.
		//내가 수정해야할 idx 에해당하는 게시물을 가져와 써먹는다.
		Board vo = mapper.get(idx);
		model.addAttribute("vo",vo);
		
		return "board/update";
	}
	@PostMapping("/update.do")
	public String update(Board vo) {
		mapper.update(vo);
		return "redirect:/list.do";
		
	}
}
