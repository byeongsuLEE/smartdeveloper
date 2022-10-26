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
				System.out.println("연결 성공");
			} else {
				System.out.println("연결 실패");
			}

			// SQL문 실행
			String sql = "DELETE FROM MEMBER where id = 'Mercury'";

			// SQL문 전송
			psmt = conn.prepareStatement(sql);
			int cnt = psmt.executeUpdate();

			if (cnt > 0) {
				System.out.println("delete 성공");
			} else {
				System.out.println("delete 실패");
			}

			if (conn != null) {
				System.out.println("DB 연결성공");
			} else {
				System.out.println("DB 연결실패");
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