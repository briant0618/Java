package sub1;

import java.sql.Connection;
import java.sql.DriverManager;

/*
 * ��¥ : 2021/05/27
 * �̸� : �赿��
 * ���� : Java DB Program
 */
public class JBCTest {
	public static void main(String[] args) {
		// DB ���� �Է�
		String host = "jdbc:mysql://192.168.10.114:3306/siopmy";
		String user = "siopmy";
		String pass = "1234";
		
		try {
			// 1�ܰ� - JDBC ����̺� �ε�
			Class.forName("com.mysql.jdbc.Driver");
			
			// 2�ܰ� - DB �����ϱ�
			Connection conn = DriverManager.getConnection(host, user, pass);

			if(conn != null) {
				System.out.println("DataBase ���� ����");
			}else {
				System.out.println("DataBase ���� ����");
			}
			// 3�ܰ� - SQL ���� ��ü ����
			
			// 4�ܰ� - SQL ����
			// 5�ܰ� - SQL ��� set ó�� ( Select�� ��쿡)
			// 6�ܰ� - DB ���� ����
		} catch (Exception e) {
				
		}

		
		
		System.out.println("Program Exit...");
	}
}
