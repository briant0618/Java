package sub1;
/*
 * ��¥ : 2021/05/25
 * �̸� : �赿��
 * ���� : ����ó�� ������
 */
public class ExceptionsTest {
	public static void main(String[] args) {
		// �迭 index ���� ����
		int arr[] = new int[3]; // ������ ����
		
		for(int i = 0; i <= 3; i++) {
			try {
				arr[i] = i + 1; // index 3�� �� ���� ��� error..
			}catch(Exception e){
				e.printStackTrace();
			}
		}
		for(int num : arr) {
			System.out.println("num : " + num);
		}
		
		// NullPointer ���� 
		try {
		Tiger tiger = null; // �������� ����. 
		
		tiger.move(); // .�� ���������� = null���̶� ���� �Ұ���..
		tiger.hunt();
		
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		// Casting ����
		try {
		Animal a1 = new Eagle();
		Animal a2 = new Shark();
		
		Eagle eagle = (Eagle) a1;
		Shark shark = (Shark) a1; // a1 = eagle�̶� casting�� ������.
		}catch(ClassCastException e) {
			e.printStackTrace();
		}
		
		System.out.println("���α׷� ����...");
	}
}
