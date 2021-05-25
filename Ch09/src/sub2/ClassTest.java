package sub2;

import sub1.Apple;

/*
 * 날짜 : 2021/05/25
 * 이름 : 김동현
 * 내용 : 동적인 객체 생성 Class.
 */
public class ClassTest {
	public static void main(String[] args){
		
		//정적 객체
		/*Apple.a1 = new Apple("대한민국",3000);
		Object a1;
		a1.toString();
		*/
		
		
		//동적 객체
		try {
			Class cls = Class.forName("sub1.Apple");
			Apple a2 = (Apple)cls.newInstance();
			
		} catch (Exception e) {
			e.printStackTrace();
		} // forname은 static throw다.
		
		
	}
}
