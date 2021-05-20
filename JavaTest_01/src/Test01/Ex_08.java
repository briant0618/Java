package Test01;



/*
 * 날짜 : 2021/05/20
 * 이름 : 김동현
 * 내용 : Java 연습문제 8번
 */
public class Ex_08 {

	public static void main(String[] args) {
		int n = 5; 
		for(int i = 0;  i < n; i++) {
			for(int j = n-1; j > i; j--) {
				System.out.print(" ");
			}
			for(int k = 0; k < 2 * i + 1; k++) {
				System.out.print("*");
				}
	
			System.out.print("\n");
		}
		

	}

}
