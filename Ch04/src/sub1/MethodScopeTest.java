package sub1;
/*
 * 날짜 : 2021/05/20
 * 이름 : 김동현
 * 내용 : Method Scope
 */
public class MethodScopeTest {
	//전역변수 - Method 외부에서 선언한 변수 [ = Member변수 ] 
	static int result = 0; // 앞에 static 붙여야 전역변수가 main에 참조시킬수 있다.
	
	public static void main(String[] args) {
		// 지역변수 - Method 내부에서 선언한 변수 But Method가 종료되면 Memory에서 해제됨.
		int start = 1;
		int end = 10;
		
		result = sum(start,end); 
		
		System.out.println("result : " + result );

	}// Main End
	public static int sum(int s, int e) { // 매개변수도 지역변수다.
		int sum = 0;
		for(int k = s; k <= e; k++) {
			sum += k;
		}
		return sum;
	}

}
