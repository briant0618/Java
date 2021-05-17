package Ch04;
/*
 * 날짜 : 2021/05/17
 * 이름 : 김동현
 * 내용 : 비트 연산자.
 */
public class P66 {

	public static void main(String[] args) {
		System.out.println("2" + Integer.toBinaryString(2)); // 10진수 2를 2진수로 변환
		System.out.println("3" + Integer.toBinaryString(3)); // 10진수 3을 2진수로 변환
		
		System.out.println("2&3 : " + (2&3));
		System.out.println("2^3 : " + (2^3));
		System.out.println("2|3 : " + (2|3));
		System.out.println("~3 : " + ~3);
		
		System.out.println(Integer.toBinaryString(~3).length());
	}

}
