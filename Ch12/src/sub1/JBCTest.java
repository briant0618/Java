package sub1;

import java.sql.Connection;
import java.sql.DriverManager;

/*
 * 날짜 : 2021/05/27
 * 이름 : 김동현
 * 내용 : Java DB Program
 */
public class JBCTest {
	public static void main(String[] args) {
		// DB 정보 입력
		String host = "jdbc:mysql://192.168.10.114:3306/siopmy";
		String user = "siopmy";
		String pass = "1234";
		
		try {
			// 1단계 - JDBC 드라이브 로드
			Class.forName("com.mysql.jdbc.Driver");
			
			// 2단계 - DB 접속하기
			Connection conn = DriverManager.getConnection(host, user, pass);

			if(conn != null) {
				System.out.println("DataBase 접속 성공");
			}else {
				System.out.println("DataBase 접속 실패");
			}
			// 3단계 - SQL 실행 객체 생성
			
			// 4단계 - SQL 실행
			// 5단계 - SQL 결과 set 처리 ( Select일 경우에)
			// 6단계 - DB 접속 종료
		} catch (Exception e) {
				
		}

		
		
		System.out.println("Program Exit...");
	}
}
