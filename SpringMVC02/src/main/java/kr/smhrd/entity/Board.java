package kr.smhrd.entity;

import java.util.Date;

import lombok.Data;

// 게시판(object) -> 번호 제목 네용 작성자 작성일 조회수
@Data
public class Board {
	private Long idx;
	// 회원 id 
	private String memId;
	private String title;
	private String content;
	private String writer;
	private Date indate; // Date -> String 날짜로 보여주기용도만 사용할경우 String편함
	private Long count;



}
