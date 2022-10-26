
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Ex02_update {

	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");

			String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";

			String id = "hr";
			String pw = "hr";

			Connection conn = DriverManager.getConnection(url, id, pw);

			if (conn != null) {
				System.out.println("���� ����");
			} else {
				System.out.println("���� ����");
			}

			String sql = "UPDATE MEMBER SET pw='9120' where id = 'Mercury'";

			PreparedStatement psmt = conn.prepareStatement(sql);

			// CRUD
			// C : Create R : Read U : Update D : Delete
			// executeUpdate : Insert, Delete, Update
			// executeQuery : Select(��ȸ)

			int cnt = psmt.executeUpdate();

			if (cnt > 0) {
				System.out.println("update ����");
			} else {
				System.out.println("update ����");
			}
			if (psmt != null) {
				psmt.close();
			}
			if (conn != null) {
				conn.close();
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
		}

	}

}
