package sub6;

import java.util.Calendar;

/*
 * 날짜 : 2021/05/26
 * 이름 : 김동현
 * 내용 : 날짜/시간 구하기
 */
public class CalendarTest {
	public static void main(String[] args) {
		
		// Java의 대표적 싱글톤 객체이다.
		Calendar cal = Calendar.getInstance();
		
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH)+1; // 1월부터 시작이기때문에 +1 해주자.
		int date = cal.get(Calendar.DATE);
		
		int hour = cal.get(Calendar.HOUR);
		int min = cal.get(Calendar.MINUTE);
		int sec = cal.get(Calendar.SECOND);
		
		System.out.printf("%d-%d-%d \n", year,month,date);
		System.out.printf("%d-%d-%d \n", hour,min,sec);
	}
}
