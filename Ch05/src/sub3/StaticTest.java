package sub3;
/*
 * 날짜 : 2021/05/24
 * 이름 : 김동현
 * 내용 : 정적 변수[class 변수] / 정적 method[class method]
 */
public class StaticTest {
	public static void main(String[] args) {
		Increment inc1 = new Increment();
		Increment inc2 = new Increment();
		Increment inc3 = new Increment();
		
		/*
		 - 정적 변수는 하나의 인스턴스로 관리되어 참조된다.
		 - 정적 변수는 이미 고정할당영역[Method Area]에 생성되어있기 때문에 객체생성 없이 바로 참조 할수 있다.
		 */
		
		inc1.num2 += 3;
		
		
	}
}
