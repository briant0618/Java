package sub2;

import sub1.Apple;

/*
 * ��¥ : 2021/05/25
 * �̸� : �赿��
 * ���� : ������ ��ü ���� Class.
 */
public class ClassTest {
	public static void main(String[] args){
		
		//���� ��ü
		/*Apple.a1 = new Apple("���ѹα�",3000);
		Object a1;
		a1.toString();
		*/
		
		
		//���� ��ü
		try {
			Class cls = Class.forName("sub1.Apple");
			Apple a2 = (Apple)cls.newInstance();
			
		} catch (Exception e) {
			e.printStackTrace();
		} // forname�� static throw��.
		
		
	}
}
