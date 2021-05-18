package Ch05;

/*
 * 날짜 : 2021/05/18
 * 이름 : 김동현
 * 내용 : 반복문 Continue
 */
public class P102 {

	public static void main(String[] args) {
		for(int i = 0; i < 15; i++) {
			if(i == 10) {
				continue;
			}
			System.out.println(i);
		}

		
	}

}
