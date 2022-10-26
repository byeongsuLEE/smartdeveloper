package kr.smhrd.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import kr.smhrd.entity.Board;
import kr.smhrd.entity.Criteria;
import kr.smhrd.entity.PageMaker;
import kr.smhrd.repository.BoardMapper;

@Controller
public class BoardController { // POJO
	//메서드
	@Autowired
	private BoardMapper mapper;
	// 리스트를 요청(list.do)을 처리하는 메서드
	//@RequestMapping -> handlerMapping 동작한다. 

	
	@RequestMapping("/list.do")
	public String list(Model model,Criteria cri) {
		// 데이터베이스에서 게시판 리스트를 가져오기 
		List<Board> list =mapper.getList(cri);// 해당 페이지의 perPageNum 만큼의 리스트
		model.addAttribute("list", list); // list --> ArrayList를 가르킨다.
		//페이징 처리에 필요한 객체를 생성 
		//1 2 3 4 5 6 7 8 9 10 페이지를 만들기위해서는 endpage, totalCount 등 PageMaker에 대한 객체생성
		PageMaker pageMaker= new PageMaker();
		//전체 게시물의 수를 구하기

		pageMaker.setCri(cri);   // 현재페이지를 넣어주자.
		pageMaker.setTotalCount(mapper.totalCount());
		
		model.addAttribute("pageMaker",pageMaker);
		
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
	public String get(int idx,Model model,@ModelAttribute("cri") Criteria cri) { //프레임워크가 string 타입을 int로 자동으로 해준다.
		Board vo = mapper.get(idx);
		model.addAttribute("vo",vo);
		//list.do에서 가져온 현제페이지를 객체바인딩해서 board/get에서 쓸수있다.
		//model.addAttribute("cri",cri);
		
		//조회수 누적
		mapper.countUpdate(idx); 
		
		return "board/get";
	}
	@RequestMapping("/remove.do")
	public String remove(int idx,Criteria cri, RedirectAttributes rttr)
	{
		//id 값을 어떻게 넘겼나? form에 히든때문에 넘어갔다
		//remove.do 버튼을 누를때 실행되는 컨트롤러
		mapper.remove(idx);
		 
		rttr.addAttribute("page",cri.getPage());
		
		
		//return "redirect:/list.do?page="+cri.getPage();
		return "redirect:/list.do";
	}
	// 보내는방식에 따라서 다르게 받을수있따. GetMapping 
	@GetMapping("/updateForm.do")
	public String updateForm(int idx,Model model,@ModelAttribute("cri") Criteria cri) {
		//model은 가지고온 것을 게시물에 뿌려줘야기때문이다.
		//내가 수정해야할 idx 에해당하는 게시물을 가져와 써먹는다.
		Board vo = mapper.get(idx);
		model.addAttribute("vo",vo);
		
		return "board/update";
	}
	@PostMapping("/update.do")
	public String update(Board vo,Criteria cri , RedirectAttributes rttr) {
		mapper.update(vo);
		rttr.addAttribute("page",cri.getPage());
		return "redirect:/list.do";
		
	}
	@RequestMapping("/replyForm.do")
	public String replyForm(int idx,Model model,@ModelAttribute("cri") Criteria cri) {  //? idx=3
		//idx에 해당하는 글을 읽어서 답글 화면에 보여주기 
		Board vo = mapper.get(idx);
		model.addAttribute("vo",vo);
		//답글이 다 달리면 list .do로 가야됨
		return "board/reply";
		
	}
	@RequestMapping("/reply.do")
	public String reply(Board vo, Criteria cri , RedirectAttributes rttr) {// vo-> idx 는 부모의 아이디라고 생각하자 
		//1 . 부모의 정보를 가져오기
		// vo 는 답글 , parent는 부모
		Board parent = mapper.get(vo.getIdx().intValue());
		//2 . 부모의 bgroup 의 값을 답글의 bgroup을 저장
		vo.setBgroup(parent.getBgroup());
		//3 . 부모의 bseq에 +1을 해서 답글의 bseq에저장
		vo.setBseq(parent.getBseq()+1);
		//4 . 부모의 blevel +1 을해서 답글의 blevel에 저장
		vo.setBlevel(parent.getBlevel()+1);
		//5 같은 bgroup 에있는 답글중에서 부모의 bseq보다 큰 bseq를 모두 1 씪증가
		mapper.replySeqUpdate(parent);
		//6 답글저장(vo)
		mapper.replyInsert(vo);
		rttr.addAttribute("page",cri.getPage());
		return "redirect:/list.do";
		
	}
}
