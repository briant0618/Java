package Test02;
/*
 * ��¥ : 2021/05/20
 * �̸� : �赿��
 * ���� : Java ��������_2_4��
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
