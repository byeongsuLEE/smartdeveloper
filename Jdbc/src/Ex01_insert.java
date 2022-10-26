import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Ex01_insert {

	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");

			// TODO Auto-generated method stub

			// 1 . JDBC Driver �����ε�
			// �����ε� : ���α׷� ����� �� ��� Ÿ���� �����Ǵ� ��

			// �ڹ��� ���� 2����
			// 1. �������� ����(����������)
			// 2. ��Ÿ�� ���� (���������� x -> �����ϸ� �� ��� ����)

			// �����ε��� ���ؼ� �޼ҵ带 �ҷ�����
			// ����ó���� �ϱ� ���� ���� --> �ϴ� �غ�

			// 2 Database ����
			// DB�� �����ϱ� ���ؼ� ������ ����ؼ� db�� url., id,pw�� �����ϰ� ���.

			// ����Ŭ���ִ� thin ����̺귯�� ����Ҳ��� .
			// 127 0 0.1 ������ �ּ� = local host
			// 1521 : ��Ʈ��ȣ
			// xe = DB�� ��Ī
			String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
			String id = "hr";
			String pw = "hr";
			// java , db�Դٰ��� �ϸ鼭 �����͸� ����, ���� ----> connection ��ü����
			// ����ó�� db ���� �������� �������� �˻�
			// id,pw�´ٸ� ok ,�ȸ´ٸ� failed.

			Connection conn = DriverManager.getConnection(url, id, pw);

			if (conn != null) {
				System.out.println("���� ����");
			} else {
				System.out.println("���� ����");
			}

			// 3 sql�� ����.
			String sql = "INSERT INTO MEMBER values('Mercury','0219','�����',20)";
			PreparedStatement psmt = conn.prepareStatement(sql);
			// sql�� ���� ���ִ� ����
			// �ڹ� ,db�Դٰ����ϴ°�ü --->conn.

			// sql�� ����
			int cnt = psmt.executeUpdate();
			if (cnt > 0) {
				System.out.println("insert�� ����");
			} else {
				System.out.println("insert�� ����");
			}

			// 4����
			// ���� ���� :���� �������� �����־��� ��ü���� �������κ��� �ݾ��ֱ�.
			if (psmt != null) {
				psmt.close();
			}
			if (conn != null) {
				conn.close();
			}
		}

		catch (ClassNotFoundException e1) {// ����� ������ �߻��ϸ� catch������ �������ִ�.
			// TODO Auto-generated catch block
			System.out.println("����̺� ����");
			e1.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("sql����");
			e.printStackTrace();
		}

	}
}