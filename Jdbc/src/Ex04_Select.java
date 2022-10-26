import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Ex04_Select {
	public static void main(String[] args) {

		// �ʿ��� ��ü�� ����
		Connection conn = null;
		PreparedStatement psmt = null;
		ResultSet rs = null;

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");

			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String db_id = "hr";
			String db_pw = "hr";
			conn = DriverManager.getConnection(url, db_id, db_pw);
			// SQL�� ����
			String sql = "SELECT * FROM MEMBER";
			psmt = conn.prepareStatement(sql);

			// Select���� ��쿡�� Insert,Update,Delete�� �ٸ���
			// ��ȸ�� ����� ������� �ϱ� ������ ���ο� ��� ����.
			// ResultSet - Cursor
			// rs -> Ŀ�� ��ü.
			rs = psmt.executeQuery();
			System.out.println("ID\t PW\t NAME\t AGE\t");
		
			while (rs.next()) {
				String id = rs.getString(1);
				String pw = rs.getString(2);
				String name = rs.getString(3);
				int age = rs.getInt(4);
				System.out.printf("%s\t%s\t%s\t%d%n", id, pw, name, age);
				 // Ŀ���� ��ĭ ������ ���� // Type : Boolean
				// %s : ���ڿ�
				// %d : ����
				// %f : �Ǽ�
				// %tH : ��¥/�ð�

			}

		} catch (ClassNotFoundException e) {
			System.out.println("�ε� ����");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("DB ���� ����");
			e.printStackTrace();
		} finally {
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
	}

}
