package Ch05;

/*
 * ��¥ : 2021/05/18
 * �̸� : �赿��
 * ���� : do~while��
 */
public class P94 {

	public static void main(String[] args) {
		int sum = 0;
		int i = 1;
		
		do {
			sum += i;
			i++;
		}while(i <= 100);
		System.out.println("�� : " + sum);

	}

}
