package sub2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/*
 * 날짜 : 2021/05/27
 * 이름 : 김동현
 * 내용 : Java DB Select
 */
public class SelectTest {
	public static void main(String[] args) {
		// DB 정보 입력
		String host = "jdbc:mysql://192.168.10.114:3306/siopmy";
		String user = "siopmy";
		String pass = "1234";
		
		try {
			
			//1단계 - JDBC Driver load
			Class.forName("com.mysql.jdbc.Driver");
			
			//2단계 - DataBase 접속
			Connection conn = DriverManager.getConnection(host, user, pass);
			
			//3단계 - SQL 실행객체 생성
			Statement stmt = conn.createStatement();
			
			//4단계 - SQL 실행
			String sql = "SELECT * FROM `USER1`;";
			ResultSet rs = stmt.executeQuery(sql); 
			/* Select문일 경우 update가 아닌 executeQuery로 바꿔써야함.
			 * 왜냐면 select문은 return해서 result를 받아와야 하기 때문이다.*/
			
			
			//5단계 - SQL 결과 set 처리
			while(rs.next()) { // select문을 next()해서 밑의 data 조회하고 넘어가는데 끝은 next()가 불가능
				String uid = rs.getString(1); // Java는 1부터 시작
				String name = rs.getString(2);
				String hp = rs.getString(3);
				int age = rs.getInt(4);
				
				System.out.println("===============");
				System.out.println("아이디 : " + uid);
				System.out.println("이름 : " + name);
				System.out.println("휴대폰 : " + hp);
				System.out.println("===============");
			}
			
			//6단계 - DataBase 종료
			conn.close();
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		
		System.out.println("Program Exit");
	}
}
