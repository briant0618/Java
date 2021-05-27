package sub2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/*
 * 날짜 : 2021/05/27
 * 이름 : 김동현
 * 내용 : Java DB Insert
 */
public class InsertTest {
	
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
			String sql = "INSERT INTO `USER1` VALUES('J101','김유신','010-1211-1010',27);";
			
			stmt.executeUpdate(sql);
			
			//5단계 - SQL 결과 set 처리 (SELECT문만)
			//6단계 - DataBase 종료
			conn.close();
	
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("Program Exit...");
		
		
	}
}
