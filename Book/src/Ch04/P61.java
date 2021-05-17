package Ch04;
/*
 * 날짜 : 2021/05/17
 * 이름 : 김동현
 * 내용 : 논리 연산자.
 */
public class P61 {

	public static void main(String[] args) {
		int a = 10;
		int b = 5;
		
		System.out.println( a > b && a == 10);
		System.out.println( a > b && a == b);
		System.out.println( a > b || a == b);
		System.out.println( a < b || a == b);
		System.out.println( a > b ^ a == 10);
		System.out.println( !(a > b) );
		System.out.println( !(a < b) );

	}

}
