package kr.smhrd.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import kr.smhrd.entity.Board;
import kr.smhrd.repository.BoardMapper;

@RestController //응답을 json data format 
public class JsonController {
	
	@Autowired
	BoardMapper boardMapper;
	/*
	  @GetMapping
	  @PutMapping
	  @DeleteMapping
	  @PostMapping
	 */
	//RequestMapping은 get,post 방식 둘다 받을수있다.

	//수정할때 url이 2개인데  방식에 따라 나눠서 한개의 url로 만들 수 있다. 
	//@RequestMapping("/jsonList.do")
	//ajax에서 넘겨줄데이터가있어 post방식으로 보냈기때문에 method
	@RequestMapping(value="/jsonList.do",method=RequestMethod.POST)
	public List<Board> getJsonList(String keyword){
		List<Board> list = boardMapper.getJsonList(keyword);
		return list;
	}
}
