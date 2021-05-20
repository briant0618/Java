package Test02;
/*
 * 날짜 : 2021/05/20
 * 이름 : 김동현
 * 내용 : Java 연습문제_2_2번
 */
public class Ex_02 {

	public static void main(String[] args) {
		int arr[] = {17, 92, 18, 33, 58, 7, 26, 42};
		int maxNum = arr[0];
		for(int i = 0; i < 8; i++) {
			if(maxNum < arr[i]) {
				maxNum = arr[i];
			}
		}
		System.out.println("배열 arr에서 가장 큰 수 : " + maxNum);
		
		

	}

}
