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
	// ȸ������ �޼���
	// DAO : SQL���� ���� ,���� ����� ����

	// ���� �޼��忡�� �������� ����ϰ� �ִ� �������� fileld�� ������
	Connection conn = null;
	PreparedStatement psmt = null;
	ResultSet rs = null;
	int cnt = 0;
	MemberVo vo = null;
	ArrayList<MemberVo> voList = null;

	// ���������� ���ǰ� �ִ� �ڵ���� ���޼���ȭ
	// connection ����
	public void getConn() {
		try {

			Class.forName("oracle.jdbc.driver.OracleDriver"); // ����Ŭ��� ��Ÿ�߻��� ����ó�� �߰�

			// 2.Ŀ���� ����
			// -java Ŭ���� ���ϰ� db���� ����
			String db_url = "jdbc:oracle:thin:@localhost:1521:xe";
			String db_id = "hr";
			String db_pw = "hr";

			conn = DriverManager.getConnection(db_url, db_id, db_pw);
			if (conn != null) {
				System.out.println("connection ����!");
			} else {
				System.out.println("connection ����!");
			}

		} catch (Exception e) {
			// exeption e �� �ֻ��� ����
			// classnotfound �̷��� �������ϰ�����

			e.printStackTrace();
		}
	}

	// jdbc ����
	public int join(String id, String pw, String nick, String addr) {
		// jdbc ���� 4�ܰ�
		// 1.����̹� �ε�(�����ε�)
		// - ��� dbms�� �����Ұ��� ���
		try {
			getConn();
			// 3. sql�� �ۼ� �� ����
			// - ����� sql�� �ۼ� �׸��� sql �� ����
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
	// �α���
	public MemberVo login(String login_id, String login_pw) {

		try {
			getConn();

			// 3. sql�� �ۼ� �� ����
			// - ����� sql�� �ۼ� �׸��� sql �� ����
			String sql = "select * from member where id= ? and pw = ? ";
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, login_id);
			psmt.setString(2, login_pw);
			rs = psmt.executeQuery();
			// �α��� ���н� Ŀ����ĭ ������������.
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

			// 4. �������
			// -db�� ���õ� ��ü�� ������ ����
			// finally�� ������ ����Ǵ°�
			close();
		}
		return vo;
	}

	// =============
	// �������
	public void close() {
		// 4. �������
		// -db�� ���õ� ��ü�� ������ ����
		// finally�� ������ ����Ǵ°�
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

	// ȸ�� ���
	public ArrayList<MemberVo> select() {
		// ȸ������� select.jsp�� ������

		voList = new ArrayList<MemberVo>();
		try {
			getConn();

			// 3 sql �� �־ ������ ��������
			// sql�� ������ ���¸� �غ��ϼ���
			// sql �� ? ������ psmt.setString(id) �ؾߵ˴ϴ�.

			String sql = "select * from member";
			psmt = conn.prepareStatement(sql);

			// 4 ����
			rs = psmt.executeQuery();

			// rs�� �ڹٿ��� ����ϱ� ����⶧����
			// rs�� �ڹٿ��� ����ϱ� ���� �������Ѻ��� = ��ü�θ�����

			while (rs.next()) {
				String id = rs.getString(1);
				String pw = rs.getString(2);
				String nick = rs.getString(3);
				String addr = rs.getString(4);
				vo = new MemberVo(id, pw, nick, addr);
				voList.add(vo);

			}

			// ������ ���� 4����
			// scope : ������ ���� ���� / ������ or �������� ��ȿ���� ����
			// 1. application : �ϳ��� �� ���ø����μ� ������ ����/������Ʈ��/ ��� ����ڿ��� �������� ������
			// 2. session : �ϳ��� ��ο��� ������ ����
			// 3. request : �ѹ��� ��û-���� ���ƿ��� ���� ����
			// 4. page : �ϳ��� jsp �������� ����

			// ���� �츮�� ������ ���۸� ���ֱ� ������ ���������ʰ� �����⸸�ϴ�
			// request ���
			// ��ü���ε� : request ������ �����͸� �����ؼ� , ������ �̵��Ŀ� ������ ����ϴ� ���
			
			


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
