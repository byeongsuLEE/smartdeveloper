import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Ex03_delete {

	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement psmt = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");

			String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";

			String id = "hr";
			String pw = "hr";

			conn = DriverManager.getConnection(url, id, pw);

			if (conn != null) {
				System.out.println("���� ����");
			} else {
				System.out.println("���� ����");
			}

			// SQL�� ����
			String sql = "DELETE FROM MEMBER where id = 'Mercury'";

			// SQL�� ����
			psmt = conn.prepareStatement(sql);
			int cnt = psmt.executeUpdate();

			if (cnt > 0) {
				System.out.println("delete ����");
			} else {
				System.out.println("delete ����");
			}

			if (conn != null) {
				System.out.println("DB ���Ἲ��");
			} else {
				System.out.println("DB �������");
			}

		} catch (ClassNotFoundException e) { // ����� ������ �߻��ϸ� catch�� ������ ���� �� �ִ�.
			System.out.println("����̹� ����");
			// ojdbc6.jar ���� �߰� X
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) { // DB ���� Ȯ��
			System.out.println("sql ����");
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {

			try {
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