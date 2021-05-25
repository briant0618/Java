package sub2;
/*
 * 날짜 : 2021/05/24
 * 이름 : 김동현
 * 내용 : Override 
 * override method 
 - 부모class method를 자식 class에서 다시 정의하는 method[재정의 method]
 - 자식 class에서 부모 class의 method를 덮어씌운다.
 */



public class OverrideTest {
	public static void main(String[] args) {
		
		CCC c = new CCC();
		c.method1();
		c.method2();
		c.method2(100);
		c.method3();
		c.method3(200);	
		
		// final
		final int NUM = 1; //[final 변수 = 상수. → final 설정 후 뒤의 변수는 연산 불가능.]
		// num += 1;
		
		
	}
}
