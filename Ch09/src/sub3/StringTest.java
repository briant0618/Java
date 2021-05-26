package sub3;
/*
 * 날짜 : 2021/05/26
 * 이름 : 김동현
 * 내용 : String class
 */
public class StringTest {
	public static void main(String[] args) {
		
		String str = "Hello";
		char[] arr = {'H','e','l','l','o'};
	
		// 문자열 객체
		String str1 = new String("Hello"); //fm대로 하면 이런식이지만 안쓴다.
		String str2 = new String("Hello"); //fm대로 하면 이런식이지만 안쓴다.
		String str3 = "Hello"; 
		String str4 = "Hello"; 
		
		// 문자열 비교
		if(str1 == str2) {
			System.out.println("서로 참조값이 같다");
		}else {
			System.out.println("서로 참조값이 다르다.");
		}
		
		if(str3 == str4) {
			System.out.println("서로 참조값이 같다");
		}else {
			System.out.println("서로 참조값이 다르다.");
		}
	
		if(str1.equals(str4)) {
			System.out.println("서로 문자열값이 같다");
		}else {
			System.out.println("서로 문자열값이 다르다.");
		}
	}
}
