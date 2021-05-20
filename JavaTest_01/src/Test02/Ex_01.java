package Test02;
/*
 * 날짜 : 2021/05/20
 * 이름 : 김동현
 * 내용 : Java 연습문제_2_1번
 */
public class Ex_01 {

	public static void main(String[] args) {
		char str[] = {'I',' ','L','O','V','E',' ','Y','O','U'};
		int row, col;
		
		for(row = 1; row < 10; row++) {
			for(col = 0; col <= row; col++) {
				System.out.print(str[col]);
			}
			System.out.print("\n");
		}

	}

}
