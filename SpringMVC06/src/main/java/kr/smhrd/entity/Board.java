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
	//딥변형 게시판에 추가 하는 컬럼(4개)
	private int bgroup; // 부모글처음썼던글)과 답글을 묶는 역할 (0그룹,1그룹,2그룹 이런식으로 만들꺼다)
	private int bseq;   // 답글의 순서(오름차순)
	private int blevel; // 답글의 레벨(들여쓰기) 원글 bleve = 0 답글을 달떄 bleve =1 로 되는거 
	private int bdelete; //삭제여부(true,false)
	
	
}
