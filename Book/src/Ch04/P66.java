package Ch04;
/*
 * ��¥ : 2021/05/17
 * �̸� : �赿��
 * ���� : ��Ʈ ������.
 */
public class P66 {

	public static void main(String[] args) {
		System.out.println("2" + Integer.toBinaryString(2)); // 10���� 2�� 2������ ��ȯ
		System.out.println("3" + Integer.toBinaryString(3)); // 10���� 3�� 2������ ��ȯ
		
		System.out.println("2&3 : " + (2&3));
		System.out.println("2^3 : " + (2^3));
		System.out.println("2|3 : " + (2|3));
		System.out.println("~3 : " + ~3);
		
		System.out.println(Integer.toBinaryString(~3).length());
	}

}
