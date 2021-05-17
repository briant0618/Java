package sub1;
/*
 * 날짜 : 2021/05/17
 * 이름 : 김동현
 * 내용 : Java 변수
 */
public class VariableTest {
	public static void main(String[] args) {
      
		int num1; // java나 c언어는 type int[변수] 선언이 필요함 
		num1 = 1; // 변수 대입(변수에 값을 최초 대입 할 때는 초기화가 필요하다.)
		
		int num2 = 2; // 변수 선언 + 변수 대입[초기화] 동시에 함
		
		int num3 = num1 + num2;
		
		System.out.println("num3 = " + num3);
				

	}

}
