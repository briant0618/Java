package Ch04;
/*
 * 날짜 : 2021/05/17
 * 이름 : 김동현
 * 내용 : 연산자의 우선순위
 */
public class P72 {

	public static void main(String[] args) {
		
		int a = 5;
		int b = 3;
		int c = 4;
		
		System.out.println(a + b * c);
		
		System.out.println((a + b) * c); // ()를 넣어서 ()안의 연산의 우선순위를 높여줍니다.

	}

}
