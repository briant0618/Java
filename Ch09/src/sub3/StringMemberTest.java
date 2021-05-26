package sub3;
/*
 * ��¥ : 2021/05/26
 * �̸� : �赿��
 * ���� : String Member + str ��ü�� ���.
 */
public class StringMemberTest {
	public static void main(String[] args) {
		String str = "Hello World";
		
		// length - ���� ����
		System.out.println("length : " + str.length());
		
		// charAt - ���ڿ����� Ư������ ����
		System.out.println("str 1��° ���� : " + str.charAt(0));
		System.out.println("str 7��° ���� : " + str.charAt(6));
		
		// substring - ���ڿ� �ڸ���
		System.out.println("str���� 0 ~ 5���� ���ڿ� : " + str.substring(0, 5));
		System.out.println("str���� 6 ~ ���������� ���ڿ� : " + str.substring(6));
		
		
		// indexOf, lastIndexOf - ���ڿ����� Ư������ index ����.
		System.out.println("str���� �տ������� ���� e�� index : " + str.indexOf("e"));
		System.out.println("str���� �ڿ������� ���� e�� index : " + str.lastIndexOf("o"));
		
		// replace - ���ڿ� ��ü
		System.out.println("str ���ڿ����� 'World'�� 'Busan'���� ��ü : " + str.replace("World","Busan"));
		System.out.println("str ���ڿ����� 'Hello'�� 'Welcome'���� ��ü : " + str.replace("Hello","Welcome"));
		
		
		// valueOf - �⺻ Ÿ��[int/double ��Ÿ���..] ������ ���ڿ��� ��ȯ
		int var1 = 1;
		double var2 = 2.13;
		boolean var3 = true;
		
		String s1 = String.valueOf(var1);
		String s2 = String.valueOf(var2);
		String s3 = String.valueOf(var3);
		String s4 = ""+var3; // value of ���� �� ���� ���̴� ���.
		
		System.out.println("s1 : " + s1);
		System.out.println("s2 : " + s2);
		System.out.println("s3 : " + s3);
		System.out.println("s4 : " + s4);
		
		
	}
}
