package sub1;
/*
 * ��¥ : 2021/05/18
 * �̸� : �赿��
 * ���� : ���ǹ� if
 */
import java.util.Scanner;  // Scanner ��� �ڵ� ��ȯ!

public class IfTest {
	
	public static void main(String[] args) {
		//  if 
		int num1 = 1;
		int num2 = 2;
		if( num1 < num2 ) {
			System.out.println("num1�� num2 ���� �۴�.");
		}
		
		if(num1 > 0) {
			if(num2 > 1 ) {
				System.out.println("num1�� 0���� ũ�� num2�� 1���� ũ��.");
			}
		}
		// ���� ��ø if���� and �������� ���ȭ �԰���.
		if(num1 > 0 && num2 > 1) {
			System.out.println("num1�� 0���� ũ�� num2�� 1���� ũ��.");
		}
		
		//  if ~ else
		int var1 = 1;
		int var2 = 2;
		
		if(var1 > var2) {
			// ������ true�϶�
			System.out.println("var1�� var2���� ũ��.");
		}else{
			// ������ false�϶�
			System.out.println("var1�� var2���� �۴�.");
		}
		
		
		//  if ~ else if ~ else
        int n1 = 1, n2 = 2, n3 = 3 , n4 = 4;
        
        if(n1 > n2) {
        	System.out.println("n1�� n2���� �۴�.");
        }else if (n2 > n3) {
        	System.out.println("n2�� n3���� �۴�.");
        }else if(n3 > n4) {
        	System.out.println("n3�� n4���� �۴�.");
        }else {
        	System.out.println("n4�� ���� ũ��.");
        }
        
        // Example
        
        Scanner sc = new Scanner(System.in); // scanner ��ü ����.
        System.out.print("���� �Է� : "); // ln = �ٹٲ޵Ǽ� cursor�� ������ �̵��ؼ� ln ���Z��..
        
        int score = sc.nextInt();
        
        if(score <= 100 && score >= 90) {
        	System.out.println("������ A �Դϴ�.");
        }else if(score < 90 && score >= 80) {
        	System.out.println("������ B �Դϴ�.");
        }else if(score < 80 && score >= 70) {
        	System.out.println("������ C �Դϴ�.");
        }else if(score < 70 && score >= 60) {
        	System.out.println("������ D �Դϴ�.");
        }else{
        	System.out.println("������ F �Դϴ�.");
        }
       
        
	}

}
