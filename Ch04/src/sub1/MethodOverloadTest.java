package sub1;
/*
 * 날짜 : 2021/05/20
 * 이름 : 김동현
 * 내용 : Method의 Overloading
 */
public class MethodOverloadTest {

	public static void main(String[] args) {
		int r1 = add(1);
		int r2 = add(2,3);
        String r3 = add("고길동");
        
        System.out.println("r1 : " + r1);
        System.out.println("r2 : " + r2);
        System.out.println("r3 : " + r3);
	}// Main End
	
	//Overload Method = 함수의 이름이 같으면 매개변수로 구분시키는 법.
	public static int add(int num) {
		return num++;
	}
	public static int add(int x, int y) {
		return x+y;
	}
	public static String add(String str) {
		return str+"님 반갑읍늬돠.";
	}

}
