package sub2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/*
 * ��¥ : 2021/05/27
 * �̸� : �赿��
 * ���� : Java DB Insert
 */
public class InsertTest {
	
	public static void main(String[] args) {
		// DB ���� �Է�
		String host = "jdbc:mysql://192.168.10.114:3306/siopmy";
		String user = "siopmy";
		String pass = "1234";
		
		try {
			//1�ܰ� - JDBC Driver load
			Class.forName("com.mysql.jdbc.Driver");
			
			//2�ܰ� - DataBase ����
			Connection conn = DriverManager.getConnection(host, user, pass);
			
			//3�ܰ� - SQL ���ఴü ����
			Statement stmt = conn.createStatement();
			
			//4�ܰ� - SQL ����
			String sql = "INSERT INTO `USER1` VALUES('J101','������','010-1211-1010',27);";
			
			stmt.executeUpdate(sql);
			
			//5�ܰ� - SQL ��� set ó�� (SELECT����)
			//6�ܰ� - DataBase ����
			conn.close();
	
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("Program Exit...");
		
		
	}
}