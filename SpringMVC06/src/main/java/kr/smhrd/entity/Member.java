package kr.smhrd.entity;

import lombok.Data;

@Data
public class Member {
	private String memId;
	private String memPwd;
	private String memName;
	
	// setter, getter 대신 Lombok api가 자동으로 만들어줄 수 있다.
	// Lombok api 를 사용해보자
}
