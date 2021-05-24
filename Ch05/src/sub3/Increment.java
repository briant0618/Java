package sub3;
/*
 * ��¥ : 2021/05/24
 * �̸� : �赿��
 * ���� : ���� ����[class ����] / ���� method[class method]
 */
public class Increment {
	
	public int num1;
	public static int num2;
	
	
	public Increment(int num1 , int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}
	
	public Increment() {
		num1 ++;
		num2 ++;
		
		System.out.println("num1 : " + num1);
		System.out.println("num2 : " + num2);
	}
	
	
	public static void add() { // class Inc�� ���
		// num1++; // ����method (Static) ������ none static���� ���� �Ұ���.[������..]
		Increment.num2++;
		Increment.add();
		
		
		// �̱��� ��ü [ p.185 ������ ] 
		Calc c = Calc.getInstance();
		
		int r1 = c.plus(1,2);
		int r2 = c.minus(1,2);
		int r3 = c.multi(1,2);
		int r4 = c.div(4,2);
		
		System.out.println("r1 : " + r1);
		System.out.println("r2 : " + r2);
		System.out.println("r3 : " + r3);
		System.out.println("r4 : " + r4);
		
		
		
	}
	
	
	
  
}
