package Ch04;
/*
 * 날짜 : 2021/05/17
 * 이름 : 김동현
 * 내용 : 비교 연산자
 */
public class P59 {

	public static void main(String[] args) {
		int a = 10;
		int b = 5;
		
		System.out.println( a > b);
		System.out.println( a >= b);
		System.out.println( a < b);
		System.out.println( a <= b);
		System.out.println( a == b);
		System.out.println( a != b);
		
		boolean c = a == b;
		System.out.println("c = " + c);
		boolean d = c == false;
		System.out.println("d = " + d);

	}

}
