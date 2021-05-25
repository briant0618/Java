package sub1;
/*
 * 날짜 : 2021/05/25
 * 이름 : 김동현
 * 내용 : 예외처리 방법
 */
public class ExceptionTest {
	public static void main(String[] args) {
		
		int num1 = 1;
		int num2 = 0;
		int r1 = 0, r2 = 0, r3 = 0, r4 = 0;
		try {
		r1 = num1 + num2;
		r2 = num1 - num2;
		r3 = num1 * num2;
			// 예외발생 코드로직 작성..
		r4 = num1 / num2;
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("r1 : " + r1 );
		System.out.println("r2 : " + r2 );
		System.out.println("r3 : " + r3 );
		System.out.println("r4 : " + r4 );
		
		System.out.println("프로그램 종료..." );
	}
}
