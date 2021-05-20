package sub1;
/*
 * 날짜 : 2021/05/20
 * 이름 : 김동현
 * 내용 : Method의 Type [ 4개 Type ]
 */
public class MethodTypeTest {

	public static void main(String[] args) {
		double r1 = type1(1.0);
		double r2 = type1(1.2);
		double r3 = type1(1.3);
		System.out.println("r1 : " + r1);
		System.out.println("r2 : " + r2);
		System.out.println("r3 : " + r3);
		
		type2(true); // return x 라서 앞의 대입값 필요읎음.
		type2(false);
		
		boolean result = type3();
		System.out.println("type3()의 return 값 " + result);
		
		type4();

	}// Main End
	
	// Type 1 : 매개변수 o, return o
	public static double type1(double x){
		
		double y = x + 3.14;
		return y;
	}
	// Type 2 : 매개변수 o, return x
	public static void type2(boolean status){
		if(status) {
			System.out.println("참 입니다.");
		}else {
			System.out.println("거짓 입니다.");
		}
	}
	// Type 3 : 매개변수 x, return o
	public static boolean type3(){
		int num1 = 1, num2 = 2;
		if(num1 > num2) {
			return true;
		}else {
			return false; 
		}
		 
	}
	// Type 4 : 매개변수 x, return x
	public static void type4(){
		System.out.println("type4() 결과 : " + type1(0.1));
	}


}
