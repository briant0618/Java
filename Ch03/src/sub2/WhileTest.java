package sub2;
/*
 * ��¥ : 2021/05/18
 * �̸� : �赿��
 * ���� : �ݺ��� while
 */
public class WhileTest {

	public static void main(String[] args) {
		// 1~10���� ��
		int k = 0;
		int sum = 0;
		
		while(k <= 10) {
			sum += k;
			k++;
		}
		System.out.println("1���� 10������ �� : " + sum);
		
		// do~while
		int eSum = 0;
		int i = 1;
		
		do{
			if(i % 2 ==0 ) {
				eSum += i;
			}
			i++;
		}while(i <= 10);
		System.out.println("1���� 10������ ¦���� �� : " + eSum);	
			
			
		//while���� while���� scope�� �ؿ� �־��µ� do�� ���� �ø� �� ������ do ���� �ݺ��� 1���̻� ��������.
			
		// break
		int num = 1;
		
		while(true) {
			num ++;
			if(num % 5 ==0 && num % 7 == 0) {
				break;
			}
		}
		System.out.println("5�� 7�� �ּҰ���� : " + num);
		
		//continue
		int total = 0;
		for(int j = 1; j <= 10; j ++ ) {
			if(j %2 ==1) {
				continue;
			}
			total += j;
		}
		System.out.println("1���� 10������ ¦�� �� " + total);
		
		
	}

}