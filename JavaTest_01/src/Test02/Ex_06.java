package Test02;

import java.util.Scanner;

/*
 * ��¥ : 2021/05/20
 * �̸� : �赿��
 * ���� : Java ��������_2_6��
 */
public class Ex_06 {

	public static void intro() {
		System.out.println("**************** Start *******************");
		System.out.println("�ΰ��� ���� �Է�");

	}
	public static int input(String name) {
		System.out.println("���� "+ name + " �� �Է� : ");
		
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		return input;
	}
	public static void result(int val) {
		System.out.println("���� ��� : " + val);
		System.out.println("****************** End ******************* ");
	}
	public static int add(int x, int y) {
		return x + y;
	}
	
	public static void main(String[] args) {
		intro();
		
		int a = input("a");
		int b = input("b");
		
		int output = add(a,b);
		result(output);
	}

	
	

}
