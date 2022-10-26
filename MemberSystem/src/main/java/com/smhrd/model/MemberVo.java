package com.smhrd.model;

public class MemberVo {

	private String id;
	private String pw;
	private String nick;
	private String add;
	public MemberVo(String id, String pw, String nick, String add) {
		super();
		this.id = id;
		this.pw = pw;
		this.nick = nick;
		this.add = add;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getNick() {
		return nick;
	}
	public void setNick(String nick) {
		this.nick = nick;
	}
	public String getAdd() {
		return add;
	}
	public void setAdd(String add) {
		this.add = add;
	}
	
	
}
