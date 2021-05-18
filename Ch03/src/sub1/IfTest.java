package sub1;
/*
 * 날짜 : 2021/05/18
 * 이름 : 김동현
 * 내용 : 조건문 if
 */
import java.util.Scanner;  // Scanner 모듈 자동 소환!

public class IfTest {
	
	public static void main(String[] args) {
		//  if 
		int num1 = 1;
		int num2 = 2;
		if( num1 < num2 ) {
			System.out.println("num1은 num2 보다 작다.");
		}
		
		if(num1 > 0) {
			if(num2 > 1 ) {
				System.out.println("num1은 0보다 크고 num2는 1보다 크다.");
			}
		}
		// 위의 중첩 if문은 and 구문으로 축소화 쌉가능.
		if(num1 > 0 && num2 > 1) {
			System.out.println("num1은 0보다 크고 num2는 1보다 크다.");
		}
		
		//  if ~ else
		int var1 = 1;
		int var2 = 2;
		
		if(var1 > var2) {
			// 조건이 true일때
			System.out.println("var1이 var2보다 크다.");
		}else{
			// 조건이 false일때
			System.out.println("var1이 var2보다 작다.");
		}
		
		
		//  if ~ else if ~ else
        int n1 = 1, n2 = 2, n3 = 3 , n4 = 4;
        
        if(n1 > n2) {
        	System.out.println("n1가 n2보다 작다.");
        }else if (n2 > n3) {
        	System.out.println("n2가 n3보다 작다.");
        }else if(n3 > n4) {
        	System.out.println("n3가 n4보다 작다.");
        }else {
        	System.out.println("n4가 가장 크다.");
        }
        
        // Example
        
        Scanner sc = new Scanner(System.in); // scanner 객체 생성.
        System.out.print("점수 입력 : "); // ln = 줄바꿈되서 cursor가 밑으로 이동해서 ln 빼줫음..
        
        int score = sc.nextInt();
        
        if(score <= 100 && score >= 90) {
        	System.out.println("학점은 A 입니다.");
        }else if(score < 90 && score >= 80) {
        	System.out.println("학점은 B 입니다.");
        }else if(score < 80 && score >= 70) {
        	System.out.println("학점은 C 입니다.");
        }else if(score < 70 && score >= 60) {
        	System.out.println("학점은 D 입니다.");
        }else{
        	System.out.println("학점은 F 입니다.");
        }
       
        
	}

}
