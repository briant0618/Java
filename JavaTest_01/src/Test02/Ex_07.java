package Test02;
/*
 * ��¥ : 2021/05/20
 * �̸� : �赿��
 * ���� : Java ��������_2_7��
 */
public class Ex_07 {

	public static void main(String[] args) {
		System.out.println("1�� 5�� �ִ����� : " + gcd(1, 5));
		System.out.println("1�� 5�� �ִ����� : " + gcd(3, 6));
		System.out.println("1�� 5�� �ִ����� : " + gcd(12, 18));
		System.out.println("1�� 5�� �ִ����� : " + gcd(60, 24));

	}
	public static int gcd(int a, int b) {
		int temp = 0;
		
		if(a > b) {
			temp = a;
		}else {
			temp = b;
		}
		while(true) {
			if(a % temp == 0 && b % temp == 0 ) {
				break;
			}
			temp --;
		}
		return temp;
	}

}