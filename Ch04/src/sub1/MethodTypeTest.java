package sub1;
/*
 * ��¥ : 2021/05/20
 * �̸� : �赿��
 * ���� : Method�� Type [ 4�� Type ]
 */
public class MethodTypeTest {

	public static void main(String[] args) {
		double r1 = type1(1.0);
		double r2 = type1(1.2);
		double r3 = type1(1.3);
		System.out.println("r1 : " + r1);
		System.out.println("r2 : " + r2);
		System.out.println("r3 : " + r3);
		
		type2(true); // return x �� ���� ���԰� �ʿ����.
		type2(false);
		
		boolean result = type3();
		System.out.println("type3()�� return �� " + result);
		
		type4();

	}// Main End
	
	// Type 1 : �Ű����� o, return o
	public static double type1(double x){
		
		double y = x + 3.14;
		return y;
	}
	// Type 2 : �Ű����� o, return x
	public static void type2(boolean status){
		if(status) {
			System.out.println("�� �Դϴ�.");
		}else {
			System.out.println("���� �Դϴ�.");
		}
	}
	// Type 3 : �Ű����� x, return o
	public static boolean type3(){
		int num1 = 1, num2 = 2;
		if(num1 > num2) {
			return true;
		}else {
			return false; 
		}
		 
	}
	// Type 4 : �Ű����� x, return x
	public static void type4(){
		System.out.println("type4() ��� : " + type1(0.1));
	}


}
