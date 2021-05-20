package Test02;

import java.util.Scanner;

/*
 * 날짜 : 2021/05/20
 * 이름 : 김동현
 * 내용 : Java 연습문제_2_6번
 */
public class Ex_06 {

	public static void intro() {
		System.out.println("**************** Start *******************");
		System.out.println("두개의 정수 입력");

	}
	public static int input(String name) {
		System.out.println("변수 "+ name + " 값 입력 : ");
		
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		return input;
	}
	public static void result(int val) {
		System.out.println("덧셈 결과 : " + val);
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
