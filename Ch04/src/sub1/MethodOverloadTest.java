package sub1;
/*
 * ��¥ : 2021/05/20
 * �̸� : �赿��
 * ���� : Method�� Overloading
 */
public class MethodOverloadTest {

	public static void main(String[] args) {
		int r1 = add(1);
		int r2 = add(2,3);
        String r3 = add("��浿");
        
        System.out.println("r1 : " + r1);
        System.out.println("r2 : " + r2);
        System.out.println("r3 : " + r3);
	}// Main End
	
	//Overload Method = �Լ��� �̸��� ������ �Ű������� ���н�Ű�� ��.
	public static int add(int num) {
		return num++;
	}
	public static int add(int x, int y) {
		return x+y;
	}
	public static String add(String str) {
		return str+"�� �ݰ����̵�.";
	}

}
