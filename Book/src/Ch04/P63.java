package Ch04;
/*
 * ��¥ : 2021/05/17
 * �̸� : �赿��
 * ���� : �� ������2
 */
public class P63 {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 5; 
		
		System.out.println( a == b & test());
		System.out.println( a == b && test());
		
	}
	public static boolean test() {
		System.out.println("test()Method �����");
		return true;
	}

}
