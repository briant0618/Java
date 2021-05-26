package sub1;
/*
 * ��¥ : 2021/05/26
 * �̸� : �赿��
 * ���� : Generic Class
 */
public class GenericTest {
	public static void main(String[] args) {
		
		Apple apple = new Apple("���ѹα�",2000);
		Banana banana = new Banana("�ʸ���",5000);
		
		FruitBox<Apple> box1 = new FruitBox<>();
		box1.setFruit(apple); 
		/* Apple�� ������ banana�� �ȵǼ� FruitBox�� ȣȯ���� ������.
 		   Generic ������ ���� ȣȯ�� �÷��� */
		
		FruitBox<Banana> box2 = new FruitBox<>();
		box2.setFruit(banana);
		
		box1.getFruit().toString();
		box2.getFruit().toString();
		
	}
}
