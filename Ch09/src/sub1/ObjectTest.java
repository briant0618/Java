package sub1;
/*
 * 날짜 : 2021/05/25
 * 이름 : 김동현
 * 내용 : java 내장 class(기본 API)
 */
public class ObjectTest{
	public static void main(String[] args) {
		
		Object app = new Apple("대한민국", 2000);
		Object ban = new Banana("필리핀", 5000);
		
		app.toString();
		ban.toString();
	}

}
