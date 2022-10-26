package com.smhrd.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class MemberDAO {
	// DAO : SQL���� ����, �������� ����

	// ���� �޼��忡�� �������� ����ϰ� �ִ� �������� field�� ����
	Connection conn = null;
	PreparedStatement psmt = null;
	ResultSet rs = null;
	int cnt = 0;
	MemberVO info = null;

	// ���������� ���ǰ��ִ� �ڵ���� �޼���ȭ
	// connection ����
	public void getConn() {

		try {

			// 1.����̹� �ε� (�����ε�)
			// - ��� DBMS�� ������� ���
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// 2.Ŀ�ؼ� ����
			// - JavaŬ���� ���ϰ� DB���� ����
			String db_url = "jdbc:oracle:thin:@localhost:1521:xe";
			String db_id = "hr";
			String db_pw = "hr";

			conn = DriverManager.getConnection(db_url, db_id, db_pw);

			if (conn != null) {
				System.out.println("Connection ����!");
			} else {
				System.out.println("Connection ����...");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	// =======

	// ���� ����
	public void close() {
		// 4.�������
		// - DB�� ���õ� ��ü�� ������ ����
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

	// ȸ������ �޼���
	public int join(String id, String pw, String nick, String addr) {
		// JDBC ���� 4�ܰ�

		try {

			getConn();

			// 3.SQL�� �ۼ� �� ����
			// - ����� SQL�� �ۼ� �׸��� SQL�� ����
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

	// �α��� �޼���
	public MemberVO login(String login_id, String login_pw) {
		// JDBC ���� 4�ܰ�

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

	// ȸ�����
	public ArrayList<MemberVO> select() {
		ArrayList<MemberVO> list = new ArrayList<MemberVO>();

		try {
			getConn();

			// 3. SQL���� -> �����غ� ��ġ��
			String sql = "select * from member";
			psmt = conn.prepareStatement(sql);

			// 4. ����
			rs = psmt.executeQuery();

			// 5. ResultSet ����
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
	
	// �Խñ� �����ϱ�
	public int update( MemberVO info ) {
		
		try {
			getConn();
			
			String sql = "update member set pw = ?, nick = ?, addr = ? where id = ?";
			psmt = conn.prepareStatement(sql);
			
			psmt.setString(1, info.getPw() );
			psmt.setString(2, info.getNick() );
			psmt.setString(3, info.getAddr() );
			psmt.setString(4, info.getId() );
			
			// Query --> rs ( ǥ ) 
			// Update --> int ( � �����Ǿ����� )
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
