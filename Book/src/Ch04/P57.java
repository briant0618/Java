package Ch04;
/*
 * ��¥ : 2021/05/17
 * �̸� : �赿��
 * ���� : ���� ������
 */
public class P57 {

	public static void main(String[] args) {
		int a = 10;
		int b = 10;
        
		++a;
		b++;
		System.out.println(a);
		System.out.println(b);
		
		//����1
		int c = 10;
		int d = ++c;
		System.out.println("�������� ��� : " + d);
		int e = 10;
		int f = e++;
		System.out.println("�������� ��� : " + f);	
		
		//����2
		int g = 10;
		g++;
		System.out.println("g++ : " + g );
		
		int h = 10;
		h += 1;
		System.out.println("h += 1 : " + h);
		
		int i = 10;
		i = i + 1;
		System.out.println("i = i+1 : " + i);
		
	}

}
