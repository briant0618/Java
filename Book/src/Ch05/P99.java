package Ch05;

/*
 * 날짜 : 2021/05/18
 * 이름 : 김동현
 * 내용 : 반복문 break
 */
public class P99 {

	public static void main(String[] args) {
		for(int i = 0; i < 10; i++) {
			if(i == 5) {
				break;
			}
			System.out.println(i);
		}
		
		for(int j = 0; j < 5; j++) {
			for(int k = 0; k < 5; k++) {
				if( k == 3) {
					break;
				}
				System.out.println("j = " + j + ", k = " + k);
			}
		}
		
		target:for(int m = 0; m < 5; m++) {
			for(int n = 0; n < 5; n++) {
				if(n == 3) {
					break target;
				}
				System.out.println("m = " + m + ", n = " + n);
			}
		}
		
		

	}

}
