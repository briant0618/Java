package sub3;
/*
 * ��¥ : 2021/05/24
 * �̸� : �赿��
 * ���� : ���� ����[class ����] / ���� method[class method]
 */
public class StaticTest {
	public static void main(String[] args) {
		Increment inc1 = new Increment();
		Increment inc2 = new Increment();
		Increment inc3 = new Increment();
		
		/*
		 - ���� ������ �ϳ��� �ν��Ͻ��� �����Ǿ� �����ȴ�.
		 - ���� ������ �̹� �����Ҵ翵��[Method Area]�� �����Ǿ��ֱ� ������ ��ü���� ���� �ٷ� ���� �Ҽ� �ִ�.
		 */
		
		inc1.num2 += 3;
		
		
	}
}
