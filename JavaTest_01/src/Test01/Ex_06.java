package Test01;

import java.util.Scanner;

/*
 * 날짜 : 2021/05/20
 * 이름 : 김동현
 * 내용 : Java 연습문제 6번
 */
public class Ex_06 {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.print("점수 입력 : ");
		 int score = sc.nextInt();
		 
		 System.out.println("입력한 점수는 " + score + "입니다.");
		 
		 switch (score/10) {
		 case 10:
		 case 9:
			 System.out.println("등급은 A 입니다.");
			 break;
		 case 8:
			 System.out.println("등급은 B 입니다.");
			 break;
		 case 7:
			 System.out.println("등급은 C 입니다.");
			 break;
		 case 6:
			 System.out.println("등급은 D 입니다.");
			 break;
		 default:
			 System.out.println("등급은 F 입니다.");
			 break;
				 
		 }

	}

}
