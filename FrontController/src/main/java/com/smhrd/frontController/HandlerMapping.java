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
	// urlmapping <--> pojo ¦���� ������ ���� �ڷᱸ�� hashmap ����
	// key : value ���·� ������ ����
	// key�� ���� ������ value�� ����
	// {"name": "������",.,,\
	
	private HashMap<String,Controller> mappings;


	// �� �����ڰ� ����ɶ� data�� ����� �� �ֵ��� ������ ��
	public HandlerMapping() {
		//HashMap�� �����ͳֱ�
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
