package sub2;
/*
 * 날짜 : 2021/05/25
 * 이름 : 김동현
 * 내용 : 예외 던지기.
 */
public class ThrowsTest {
	public static void main(String[] args) {
		Calc cal = Calc.getInstance(); // private라서 외부생성자 호출이 불가능. → 싱글톤[getinstance] ㄱㄱ
		
		int r1 = 0, r2 = 0, r3 = 0;
		
		try {
			r1 = cal.div(1, 2); // 예외가 발생할 가능성이 있기 때문에 try/catch씁니다.
			r2 = cal.div(1, 0);
			r3 = cal.div(1, -1);		
		} catch (Exception e) {
			e.printStackTrace();
		} 
		
		System.out.println("r1 : " + r1 );
		System.out.println("r2 : " + r2 );
		System.out.println("r3 : " + r3 );
		
		
		System.out.println("프로그램을 종료합니다.");
		
	
	}
}
