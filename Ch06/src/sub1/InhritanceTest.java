package sub1;
/*
 * ��¥ : 2021/05/18
 * �̸� : �赿��
 * ���� : Java Class Inherit
 */
public class InhritanceTest {
	public static void main(String[] args) {
		
		StockAccount kb = new StockAccount("KB����",
										   "121-101-2010",
										   "ȫ�浿",
										   1000000,
										   "�Ｚ����",
										   10,80000);
		kb.sell(5,79000);
		kb.buy(10, 81000);
		kb.show();
	}
}
