package sub1;
/*
 * ��¥ : 2021/05/24
 * �̸� : �赿��
 * ���� : Java Class ��ü Ȱ��
 */
public class ClassTest {
	public static void main(String[] args) {
		//��ü ���� [ ��� : ��ü���� �� �������� = ��ü [member �ʱ�ȭ] ]
		Account kb = new Account("��������","123-1213-1234","������",10000);
		Account wr = new Account("�츮����","121-1010-1021","������",30000);
		
		
		//member �ʱ�ȭ [ ĸ��ȭ�Ǹ� �ʱ�ȭ�� ���� �߱⶧���� ��ü �����Ҷ� ���� ��ü �ڿ��� �ʱ�ȭ ���Ѿ��Ѵ�.]
		
		//kb.bank = "��������";
		//kb.id = "123-1213-1234";
		//kb.name = "������";
		//kb.money = 10000;
		
		//wr.bank = "�츮����";
		//wr.id = "121-1010-1021";
		//wr.name = "������";
		//wr.money = 30000;  �� ĸ��ȭ ���� �ʱ�ȭ ��
		
		// ��ü Ȱ�� 
		kb.deposit(40000);
		kb.withdraw(5000);
		kb.show();
		
		wr.deposit(30000);
		wr.withdraw(7000);
		wr.show();
		
	}

}
