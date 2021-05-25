package sub1;
/*
 * 날짜 : 2021/05/25
 * 이름 : 김동현
 * 내용 : 예외처리 유형들
 */
public class ExceptionsTest {
	public static void main(String[] args) {
		// 배열 index 참조 에러
		int arr[] = new int[3]; // 공간만 생성
		
		for(int i = 0; i <= 3; i++) {
			try {
				arr[i] = i + 1; // index 3이 들어갈 공간 없어서 error..
			}catch(Exception e){
				e.printStackTrace();
			}
		}
		for(int num : arr) {
			System.out.println("num : " + num);
		}
		
		// NullPointer 에러 
		try {
		Tiger tiger = null; // 참조변수 선언. 
		
		tiger.move(); // .인 참조연산자 = null값이라서 실행 불가능..
		tiger.hunt();
		
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		// Casting 에러
		try {
		Animal a1 = new Eagle();
		Animal a2 = new Shark();
		
		Eagle eagle = (Eagle) a1;
		Shark shark = (Shark) a1; // a1 = eagle이라서 casting이 에러됨.
		}catch(ClassCastException e) {
			e.printStackTrace();
		}
		
		System.out.println("프로그램 종료...");
	}
}
