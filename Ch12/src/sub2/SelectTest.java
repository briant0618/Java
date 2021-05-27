package sub2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/*
 * ��¥ : 2021/05/27
 * �̸� : �赿��
 * ���� : Java DB Select
 */
public class SelectTest {
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
			String sql = "SELECT * FROM `USER1`;";
			ResultSet rs = stmt.executeQuery(sql); 
			/* Select���� ��� update�� �ƴ� executeQuery�� �ٲ�����.
			 * �ֳĸ� select���� return�ؼ� result�� �޾ƿ;� �ϱ� �����̴�.*/
			
			
			//5�ܰ� - SQL ��� set ó��
			while(rs.next()) { // select���� next()�ؼ� ���� data ��ȸ�ϰ� �Ѿ�µ� ���� next()�� �Ұ���
				String uid = rs.getString(1); // Java�� 1���� ����
				String name = rs.getString(2);
				String hp = rs.getString(3);
				int age = rs.getInt(4);
				
				System.out.println("===============");
				System.out.println("���̵� : " + uid);
				System.out.println("�̸� : " + name);
				System.out.println("�޴��� : " + hp);
				System.out.println("===============");
			}
			
			//6�ܰ� - DataBase ����
			conn.close();
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		
		System.out.println("Program Exit");
	}
}
