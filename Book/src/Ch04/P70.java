package Ch04;
/*
 * 날짜 : 2021/05/17
 * 이름 : 김동현
 * 내용 : 문자열 연산
 */
public class P70 {

	public static void main(String[] args) {
		String name = "홍길동";
		System.out.println("안녕하세요" + name + "입니다.");
		
		int height = 180;
		System.out.println("저의 키는 " + height + "cm 입니다");
		
		String weight = 75.5 + ""; // 75.5만 적으면 error 뜹니다.
		System.out.println("제 몸무게는 " + weight + " Kg입니다.");
		
		int ageInt = 30; // 숫자
		String ageStr = "30";  // 문자열
		
	}

}
