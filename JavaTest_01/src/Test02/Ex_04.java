package Test02;
/*
 * 날짜 : 2021/05/20
 * 이름 : 김동현
 * 내용 : Java 연습문제_2_4번
 */
public class Ex_04 {

	public static void main(String[] args) {
		int arr[] = {4, 2, 1, 5, 3};
		for(int i = 0; i < 4; i++ ) {
			for(int j = i; j < 5; j++) {
				
				if(arr[i] > arr[j]) {
					int temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}
			
		}
		
		for(int i = 0; i < 5; i++) {
			System.out.print(arr[i]+", ");
		}
		
	}

}
