package sub1;
/*
 * ��¥ : 2021/05/24
 * �̸� : �赿��
 * ���� : Java Class
 */
public class Account {
	// ��ü�� �Ӽ� and ���� ���� ���� 
	private String bank; // class�� member������ ������ private ���� =>ĸ��ȭ�Ͽ� ���� �����Ͽ� ����ڵ� ������!
	private String id;  // �ܺο��� ���� ���ϹǷ� ���� ���ؼ��� �����ڰ� �ʿ���.
	private String name;
	private int money;
	
	// ������ 1
	public Account(String bank, String id, String name, int money) {
		this.bank = bank;
		this.id = id;
		this.name = name;
		this.money = money;
	}
	
	
	// ��ü�� ��� [ member method]
	public void deposit(int money) {
		this.money += money;
	}

	public void withdraw(int money) {
		this.money -= money;
	}
	
	public void show() {
		System.out.println("==========================");
		System.out.println("����� : " + this.bank);
		System.out.println("���¹�ȣ : " + id);
		System.out.println("�Ա��� : " + name);
		System.out.println("���� �ܾ� : " + money);
		System.out.println("==========================");
	}
	
}
