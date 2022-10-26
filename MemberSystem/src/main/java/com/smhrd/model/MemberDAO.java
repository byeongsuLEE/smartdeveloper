package com.smhrd.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServlet;

public class MemberDAO {
	// 회원가입 메서드
	// DAO : SQL문을 실행 ,실행 결과를 리턴

	// 여러 메서드에서 공통으로 사용하고 있는 변수들을 fileld로 배쭈자
	Connection conn = null;
	PreparedStatement psmt = null;
	ResultSet rs = null;
	int cnt = 0;
	MemberVo vo = null;
	ArrayList<MemberVo> voList = null;

	// 공통적으로 사용되고 있는 코드들으 ㄹ메서드화
	// connection 생성
	public void getConn() {
		try {

			Class.forName("oracle.jdbc.driver.OracleDriver"); // 오라클경로 오타발생시 예외처리 추가

			// 2.커낵션 연걸
			// -java 클래스 파일과 db와의 연결
			String db_url = "jdbc:oracle:thin:@localhost:1521:xe";
			String db_id = "hr";
			String db_pw = "hr";

			conn = DriverManager.getConnection(db_url, db_id, db_pw);
			if (conn != null) {
				System.out.println("connection 성공!");
			} else {
				System.out.println("connection 실패!");
			}

		} catch (Exception e) {
			// exeption e 는 최상위 제외
			// classnotfound 이런거 다포함하고있음

			e.printStackTrace();
		}
	}

	// jdbc 조인
	public int join(String id, String pw, String nick, String addr) {
		// jdbc 순서 4단계
		// 1.드라이버 로딩(동적로딩)
		// - 어떠한 dbms를 선택할건지 명시
		try {
			getConn();
			// 3. sql문 작성 및 실행
			// - 사용할 sql문 작성 그리고 sql 문 실행
			String sql = "insert into member values(?,?,?,?)";
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, id);
			psmt.setString(2, pw);
			psmt.setString(3, nick);
			psmt.setString(4, addr);
			cnt = psmt.executeUpdate();
			System.out.println(cnt);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {

			close();

		}
		return cnt;
	}

	// ===
	// 로그인
	public MemberVo login(String login_id, String login_pw) {

		try {
			getConn();

			// 3. sql문 작성 및 실행
			// - 사용할 sql문 작성 그리고 sql 문 실행
			String sql = "select * from member where id= ? and pw = ? ";
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, login_id);
			psmt.setString(2, login_pw);
			rs = psmt.executeQuery();
			// 로그인 실패시 커서한칸 내려갈수없다.
			if (rs.next()) {

				String id = rs.getString(1);
				String pw = rs.getString(2);
				String nick = rs.getString(3);
				String addr = rs.getString(4);
				System.out.println(id + "/" + pw + "/" + nick + "/" + addr);
				vo = new MemberVo(id, pw, nick, addr);

			}

		} catch (Exception e) {
			//
			e.printStackTrace();
		} finally {

			// 4. 연결끊기
			// -db와 관련된 객체들 연결을 끊기
			// finally는 무조건 실행되는것
			close();
		}
		return vo;
	}

	// =============
	// 연결끊기
	public void close() {
		// 4. 연결끊기
		// -db와 관련된 객체들 연결을 끊기
		// finally는 무조건 실행되는것
		try {
			if (rs != null) {
				rs.close();
			}

			if (psmt != null) {
				psmt.close();
			}
			if (conn != null) {
				conn.close();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// =======

	// 회원 목록
	public ArrayList<MemberVo> select() {
		// 회원목록을 select.jsp로 보내기

		voList = new ArrayList<MemberVo>();
		try {
			getConn();

			// 3 sql 문 넣어서 데이터 가져오기
			// sql를 실행할 상태를 준비하세요
			// sql 에 ? 있으면 psmt.setString(id) 해야됩니다.

			String sql = "select * from member";
			psmt = conn.prepareStatement(sql);

			// 4 실행
			rs = psmt.executeQuery();

			// rs는 자바에서 사용하기 힘들기때문에
			// rs를 자바에서 사용하기 쉽게 가공시켜보자 = 객체로만들자

			while (rs.next()) {
				String id = rs.getString(1);
				String pw = rs.getString(2);
				String nick = rs.getString(3);
				String addr = rs.getString(4);
				vo = new MemberVo(id, pw, nick, addr);
				voList.add(vo);

			}

			// 스코프 종류 4가지
			// scope : 서버의 저장 공간 / 어디까지 or 언제까지 유효한지 범위
			// 1. application : 하나의 웹 어플리케인션 내에서 유지/프로젝트내/ 모든 사용자에게 공통적을 사용공간
			// 2. session : 하나의 브로우저 내에서 유저
			// 3. request : 한번의 요청-응답 돌아오는 동안 유지
			// 4. page : 하나의 jsp 내에서만 유지

			// 따라서 우리는 데이터 전송만 해주기 때문에 저장하지않고 보내기만하는
			// request 사용
			// 객체바인딩 : request 영역에 데이터를 저장해서 , 페이지 이동후에 꺼내서 사용하는 방식
			
			


		} 
		 catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			close();

		}
		return voList;

	}
}
