
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
				System.out.println("연결 성공");
			} else {
				System.out.println("연결 실패");
			}

			String sql = "UPDATE MEMBER SET pw='9120' where id = 'Mercury'";

			PreparedStatement psmt = conn.prepareStatement(sql);

			// CRUD
			// C : Create R : Read U : Update D : Delete
			// executeUpdate : Insert, Delete, Update
			// executeQuery : Select(조회)

			int cnt = psmt.executeUpdate();

			if (cnt > 0) {
				System.out.println("update 성공");
			} else {
				System.out.println("update 실패");
			}
			if (psmt != null) {
				psmt.close();
			}
			if (conn != null) {
				conn.close();
			}

		} catch (ClassNotFoundException e) { // 실행시 오류가 발생하면 catch문 오류를 잡을 수 있다.
			System.out.println("드라이버 오류");
			// ojdbc6.jar 파일 추가 X
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) { // DB 정보 확인
			System.out.println("sql 오류");
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
