import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Ex01_insert {

	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");

			// TODO Auto-generated method stub

			// 1 . JDBC Driver 동적로딩
			// 동적로딩 : 프로그램 실행시 그 즉시 타입이 결정되는 것

			// 자바의 오류 2가지
			// 1. 문법적인 오류(문법적오류)
			// 2. 런타임 오류 (문법적오류 x -> 실행하면 그 즉시 오류)

			// 동적로딩을 위해서 메소드를 불러오기
			// 예외처리를 하기 위한 문법 --> 일단 해봐

			// 2 Database 연결
			// DB에 접근하기 위해서 변수를 사용해서 db의 url., id,pw를 정리하고 사용.

			// 오라클에있는 thin 드라이브러를 사용할꺼다 .
			// 127 0 0.1 서버의 주소 = local host
			// 1521 : 포트번호
			// xe = DB의 별칭
			String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
			String id = "hr";
			String pw = "hr";
			// java , db왔다갔다 하면서 데이터를 저장, 전송 ----> connection 객체생성
			// 여권처럼 db 접근 가능한지 정보들을 검사
			// id,pw맞다면 ok ,안맞다면 failed.

			Connection conn = DriverManager.getConnection(url, id, pw);

			if (conn != null) {
				System.out.println("연결 성공");
			} else {
				System.out.println("연결 실패");
			}

			// 3 sql문 전송.
			String sql = "INSERT INTO MEMBER values('Mercury','0219','김용현',20)";
			PreparedStatement psmt = conn.prepareStatement(sql);
			// sql문 전달 해주는 역할
			// 자바 ,db왔다갔다하는객체 --->conn.

			// sql문 실행
			int cnt = psmt.executeUpdate();
			if (cnt > 0) {
				System.out.println("insert가 성공");
			} else {
				System.out.println("insert가 실패");
			}

			// 4종료
			// 종료 순서 :가장 마지막에 열여주었던 객체부터 역순으로부터 닫아주기.
			if (psmt != null) {
				psmt.close();
			}
			if (conn != null) {
				conn.close();
			}
		}

		catch (ClassNotFoundException e1) {// 실행시 오류가 발생하면 catch문으로 잡을수있다.
			// TODO Auto-generated catch block
			System.out.println("드라이브 오류");
			e1.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("sql오류");
			e.printStackTrace();
		}

	}
}