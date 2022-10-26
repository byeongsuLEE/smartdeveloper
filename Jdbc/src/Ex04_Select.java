import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Ex04_Select {
	public static void main(String[] args) {

		// 필요한 객체를 선언
		Connection conn = null;
		PreparedStatement psmt = null;
		ResultSet rs = null;

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");

			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String db_id = "hr";
			String db_pw = "hr";
			conn = DriverManager.getConnection(url, db_id, db_pw);
			// SQL문 실행
			String sql = "SELECT * FROM MEMBER";
			psmt = conn.prepareStatement(sql);

			// Select문일 경우에는 Insert,Update,Delete문 다르게
			// 조회한 결과를 보여줘야 하기 때문에 새로운 통로 열기.
			// ResultSet - Cursor
			// rs -> 커서 객체.
			rs = psmt.executeQuery();
			System.out.println("ID\t PW\t NAME\t AGE\t");
		
			while (rs.next()) {
				String id = rs.getString(1);
				String pw = rs.getString(2);
				String name = rs.getString(3);
				int age = rs.getInt(4);
				System.out.printf("%s\t%s\t%s\t%d%n", id, pw, name, age);
				 // 커서를 한칸 내리는 역할 // Type : Boolean
				// %s : 문자열
				// %d : 정수
				// %f : 실수
				// %tH : 날짜/시간

			}

		} catch (ClassNotFoundException e) {
			System.out.println("로딩 실패");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("DB 연결 실패");
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
