package kr.smhrd.entity;
//게시판(object)
// 번호 , 제목 , 내용, 작성자,작성일,조회수

import java.util.Date;

public class Board {
	// 나중에 바꾸면 안되서 큰것만 쓴다.
	private Long idx;
	private String title;
	private String content;
	private String writer;
	private Date indate;   // Data->String  날짜만 보여줄려면 string 계산을할꺼면 date를 쓴다
	private Long count;
	
	

	public Long getIdx() {
		return idx;
	}
	public void setIdx(Long idx) {
		this.idx = idx;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public Date getDate() {
		return indate;
	}
	public void setDate(Date date) {
		this.indate = date;
	}
	public Long getCount() {
		return count;
	}
	public void setCount(Long count) {
		this.count = count;
	}
	@Override
	public String toString() {
		return "Board [idx=" + idx + ", title=" + title + ", content=" + content + ", writer=" + writer
				+ ", date=" + indate + ", count=" + count + "]";
	}
	
	
	

}
