package Ch04;
/*
 * 날짜 : 2021/05/17
 * 이름 : 김동현
 * 내용 : 논리 연산자2
 */
public class P63 {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 5; 
		
		System.out.println( a == b & test());
		System.out.println( a == b && test());
		
	}
	public static boolean test() {
		System.out.println("test()Method 실행됨");
		return true;
	}

}
