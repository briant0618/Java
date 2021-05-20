package sub1;
/*
 * 날짜 : 2021/05/20
 * 이름 : 김동현
 * 내용 : Method = 함수.
 * Java에서는 Method를 함수라 지칭한다.
 */
public class MethodTest {
	
	// Main Method : Java Project StartPoint
	public static void main(String[] args) {
	// Method 호출
		int y1 = f(1);
		int y2 = f(2);
		int y3 = f(3);
		System.out.println("y1 : " + y1);
		System.out.println("y2 : " + y2);
		System.out.println("y3 : " + y3);
		
	// sum Method 호출
		System.out.println("1부터 10까지 합 : " + sum(1,10));
		System.out.println("1부터 100까지 합 : " + sum(1,100));
		System.out.println("1부터 1000까지 합 : " + sum(1,1000));
		
	}
	// Main Method End
	
	// Method 정의 : 일련의 CodeLogic을 module화 한것.
	public static int f(int x) {
		int y = 2 * x + 3;
		return y;
		// java에서는 Method 정의 할때 void 대신 return의 type인 int로 맞춰서 선언해줘야합니다.
	}
	public static int sum(int start, int end) {
		int sum = 0;
		
		for(int k = start; k <= end; k ++) {
			sum += k;
		}
		return sum;
	}

}
