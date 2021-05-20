package Ch06;
/*
 * 날짜 : 2021/05/18
 * 이름 : 김동현
 * 내용 : 배열 사용 2
 */
public class P113 {
	public static void main(String[] args) {
		
	
	int[] num = new int[100];
	
		for(int i = 0; i < num.length; i++) {
			num[i] = i + 1;
		}
		for(int i = 0; i < num.length; i++) {
			System.out.println(num[i]);
		}
		
	}
}
