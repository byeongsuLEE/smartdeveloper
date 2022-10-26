package com.smhrd.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class MemberDAO {
	// DAO : SQL문을 실행, 실행결과를 리턴

	// 여러 메서드에서 공통으로 사용하고 있는 변수들을 field로 빼자
	Connection conn = null;
	PreparedStatement psmt = null;
	ResultSet rs = null;
	int cnt = 0;
	MemberVO info = null;

	// 공통적으로 사용되고있는 코드들을 메서드화
	// connection 생성
	public void getConn() {

		try {

			// 1.드라이버 로딩 (동적로딩)
			// - 어떠한 DBMS를 사용할지 명시
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// 2.커넥션 연결
			// - Java클래스 파일과 DB와의 연결
			String db_url = "jdbc:oracle:thin:@localhost:1521:xe";
			String db_id = "hr";
			String db_pw = "hr";

			conn = DriverManager.getConnection(db_url, db_id, db_pw);

			if (conn != null) {
				System.out.println("Connection 성공!");
			} else {
				System.out.println("Connection 실패...");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	// =======

	// 연결 끊기
	public void close() {
		// 4.연결끊기
		// - DB와 관련된 객체들 연결을 끊기
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
	// ===========

	// 회원가입 메서드
	public int join(String id, String pw, String nick, String addr) {
		// JDBC 순서 4단계

		try {

			getConn();

			// 3.SQL문 작성 및 실행
			// - 사용할 SQL문 작성 그리고 SQL문 실행
			String sql = "insert into member values(?,?,?,?)";
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, id);
			psmt.setString(2, pw);
			psmt.setString(3, nick);
			psmt.setString(4, addr);

			cnt = psmt.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			close();
		}
		return cnt;
	}
	// ==============

	// 로그인 메서드
	public MemberVO login(String login_id, String login_pw) {
		// JDBC 순서 4단계

		try {
			getConn();

			String sql = "select * from member where id = ? and pw = ?";
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, login_id);
			psmt.setString(2, login_pw);

			rs = psmt.executeQuery();

			if (rs.next()) {
				String id = rs.getString(1);
				String pw = rs.getString(2);
				String nick = rs.getString(3);
				String addr = rs.getString(4);

				info = new MemberVO(id, pw, nick, addr);
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			close();
		}
		return info;
	}
	// =============

	// 회원목록
	public ArrayList<MemberVO> select() {
		ArrayList<MemberVO> list = new ArrayList<MemberVO>();

		try {
			getConn();

			// 3. SQL문비 -> 실행준비 마치기
			String sql = "select * from member";
			psmt = conn.prepareStatement(sql);

			// 4. 실행
			rs = psmt.executeQuery();

			// 5. ResultSet 가공
			while (rs.next()) {

				String id = rs.getString(1);
				String pw = rs.getString(2);
				String nick = rs.getString(3);
				String addr = rs.getString(4);

				MemberVO info = new MemberVO(id, pw, nick, addr);

				list.add(info);

			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close();
		}
		return list;

	}
	// =============
	
	// 게시글 수정하기
	public int update( MemberVO info ) {
		
		try {
			getConn();
			
			String sql = "update member set pw = ?, nick = ?, addr = ? where id = ?";
			psmt = conn.prepareStatement(sql);
			
			psmt.setString(1, info.getPw() );
			psmt.setString(2, info.getNick() );
			psmt.setString(3, info.getAddr() );
			psmt.setString(4, info.getId() );
			
			// Query --> rs ( 표 ) 
			// Update --> int ( 몇개 수정되었는지 )
			cnt = psmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			close();
		}
		return cnt;
	}
	//===============

}
