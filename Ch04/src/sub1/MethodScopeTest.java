package sub1;
/*
 * ��¥ : 2021/05/20
 * �̸� : �赿��
 * ���� : Method Scope
 */
public class MethodScopeTest {
	//�������� - Method �ܺο��� ������ ���� [ = Member���� ] 
	static int result = 0; // �տ� static �ٿ��� ���������� main�� ������ų�� �ִ�.
	
	public static void main(String[] args) {
		// �������� - Method ���ο��� ������ ���� But Method�� ����Ǹ� Memory���� ������.
		int start = 1;
		int end = 10;
		
		result = sum(start,end); 
		
		System.out.println("result : " + result );

	}// Main End
	public static int sum(int s, int e) { // �Ű������� ����������.
		int sum = 0;
		for(int k = s; k <= e; k++) {
			sum += k;
		}
		return sum;
	}

}
