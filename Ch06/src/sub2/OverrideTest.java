package sub2;
/*
 * ��¥ : 2021/05/24
 * �̸� : �赿��
 * ���� : Override 
 * override method 
 - �θ�class method�� �ڽ� class���� �ٽ� �����ϴ� method[������ method]
 - �ڽ� class���� �θ� class�� method�� ������.
 */



public class OverrideTest {
	public static void main(String[] args) {
		
		CCC c = new CCC();
		c.method1();
		c.method2();
		c.method2(100);
		c.method3();
		c.method3(200);	
		
		// final
		final int NUM = 1; //[final ���� = ���. �� final ���� �� ���� ������ ���� �Ұ���.]
		// num += 1;
		
		
	}
}
