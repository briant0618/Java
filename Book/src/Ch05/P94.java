package Ch05;

/*
 * 날짜 : 2021/05/18
 * 이름 : 김동현
 * 내용 : do~while문
 */
public class P94 {

	public static void main(String[] args) {
		int sum = 0;
		int i = 1;
		
		do {
			sum += i;
			i++;
		}while(i <= 100);
		System.out.println("합 : " + sum);

	}

}
