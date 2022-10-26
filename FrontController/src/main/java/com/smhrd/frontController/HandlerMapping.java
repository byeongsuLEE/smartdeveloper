package com.smhrd.frontController;

import java.util.HashMap;

import com.smhrd.controller.Controller;
import com.smhrd.controller.DeleteCon;
import com.smhrd.controller.GoJoinCon;
import com.smhrd.controller.GoLoginCon;
import com.smhrd.controller.GoMainCon;
import com.smhrd.controller.GoMypageCon;
import com.smhrd.controller.GoSelectCon;
import com.smhrd.controller.JoinCon;
import com.smhrd.controller.LoginCon;
import com.smhrd.controller.UpdateCon;

public class HandlerMapping {
	// urlmapping <--> pojo 짝지어 가지고 있을 자료구조 hashmap 생성
	// key : value 형태로 데이터 저장
	// key를 집어 넣으면 value는 형태
	// {"name": "안현진",.,,\
	
	private HashMap<String,Controller> mappings;


	// 이 생성자가 실행될때 data가 저장될 수 있도록 생성자 생
	public HandlerMapping() {
		//HashMap에 데이터넣기
		//.put(kye,value);
		mappings=new HashMap<String,Controller>();
		mappings.put("/goMain.do",new GoMainCon() );
		mappings.put("/goLogin.do", new GoLoginCon());
		mappings.put("/goJoin.do", new GoJoinCon());
		mappings.put("/goMyPage.do",new GoMypageCon());
		mappings.put("/goSelect.do",new GoSelectCon());
		mappings.put("/join.do",new JoinCon());
		mappings.put("/login.do",new LoginCon() );
		mappings.put("/update.do", new UpdateCon());
		mappings.put("/delete.do",new DeleteCon());
	}
	
	public HashMap<String, Controller>getMappings() {
		return mappings;
	}
}
