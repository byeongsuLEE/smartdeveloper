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

@Controller
public class BoardController{  // POJO  new BoardController()
   // 메서드
   // 리스트요청(list.do)을 처리하는 메서드(DI)
   @Autowired
   private BoardMapper mapper; 
   // @RequestMapping->HandlerMapping 동작한다.	
   @RequestMapping("/list.do")  
   public String list(Model model) {	   
	   List<Board> list=mapper.getList();
	   model.addAttribute("list", list);	   
	   return "board/list"; // redirect, forward(JSP)
   }
   @RequestMapping("/register.do")
   public String register() {
	   return "board/register"; // register.jsp
   }
   @RequestMapping("/insert.do") // title, content, writer
   public String insert(Board vo) { // 파라메터수집(VO)
	   //request.setCharacterEncoding("utf-8");
	   mapper.register(vo); //등록
	   return "redirect:/list.do";
   }
}
