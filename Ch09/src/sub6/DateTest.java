package sub6;

import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * 날짜 : 2021/05/26
 * 이름 : 김동현
 * 내용 : 날짜/시간 구하기.
 */
public class DateTest {
	public static void main(String[] args) {
		Date date = new Date();
		System.out.println("date : " + date);
		
		// date 서식지정
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String now = sdf.format(date);
		System.out.println("날짜 : " + now);
	}
}
