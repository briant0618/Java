package sub5;
/*
 * 날짜 : 2021/05/26
 * 이름 : 김동현
 * 내용 : Math Class
 */
public class MathTest {
	public static void main(String[] args) {
		//Math m = new Math();  = 궂이 객체생성 안해도대용 ~
		
		System.out.println("PI값 : " + Math.PI);
		System.out.println("절대값 : " + Math.abs(-5));
		System.out.println("절대값 : " + Math.abs(-3.14));
		System.out.println("제곱근 : " + Math.sqrt(9));
		System.out.println("올림값 : " + Math.ceil(1.2));
		System.out.println("내림값 : " + Math.floor(1.8));
		System.out.println("반올림 : " + Math.round(1.8));
		
		//random
		double num1 = Math.random(); // 0 ~ 1사이의 실수
			System.out.println("num1 : " + num1);
		double num2 = num1 * 10; // 0 ~ 10사이의 실수
			System.out.println("num2 : " + num2);
		double num3 = Math.ceil(num2); // 1 ~ 10사이의 정수
			System.out.println("num3 : " + num3);
			
		double num4 = Math.ceil(Math.random() * 45);
			System.out.println("1 ~ 45 사이의 임의의 정수 : " + num4);

	}
}
