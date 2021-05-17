package sub2;
/*
 * 날짜 : 2021/05/17
 * 이름 : 김동현
 * 내용 : Java와 자료형
 */
public class DataTypeTest {

	public static void main(String[] args) {
		// 정수형
		int num1 = 127; // int는 21억 이상 저장x = 4byte[4제곱]
		short num2 = 1273; // short는 32767 이상 저장 x = 2byte[제곱]
		byte  num3 = 127; // byte 는 127이상 저장x = 2진법의 계산에 따라서
		long num4 = 1277L; // long은 접미사 L을 붙여주자. = 8byte 
		System.out.println("num1 : "+num1);
		System.out.println("num2 : "+num2);
		System.out.println("num3 : "+num3);
		System.out.println("num4 : "+num4);
		
		// 실수형
		float var1 = 1.123456789f; // 접미사 f 붙여주자 / 소수점 7자리까지 저장
        double var2 = 1.1234567890123456789; // 소수점 16자리까지 저장
        System.out.println("var1 : "+var1);
        System.out.println("var2 : "+var2);
        
		// 논리형
        boolean value1 = true;
        boolean value2 = false;
        System.out.println("value1 : "+value1);
        System.out.println("value2 : "+value2);
        
		// 문자형
        char ch1 = 'A';
        char ch2 = '가';
        System.out.println("ch1 : "+ch1);
        System.out.println("ch2 : "+ch2);
        
		// 문자열
        String str1 = "Apple";
        String str2 = "바보";
        System.out.println("str1 : "+str1);
        System.out.println("str2 : "+str2);
	}
	
}
	