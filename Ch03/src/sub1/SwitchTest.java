package sub1;

import java.util.Scanner;

/*
 * 날짜 : 2021/05/18
 * 이름 : 김동현
 * 내용 : 조건문 switch 
 */
public class SwitchTest {
	// switch(변수) {
	//	case 값1:
	//		break
	//	case 값1:
	//		break
	//	case 값1:
	//		break
	//	default;
	//		break
	//	}

	public static void main(String[] args) {
		String animal = "eagle";
		
		switch(animal) {
			case "lion":
				System.out.println("animal은 lion임니다.");
				break;
			case "eagle":
				System.out.println("animal은 eagle임니다.");
				break;
			case "tiger":
				System.out.println("animal은 tiger임니다.");
				break;
			default:
				System.out.println("animal은 lion,eagle,tiger가 아님니다.");
				break;
		}
		// Example
		Scanner sc = new Scanner(System.in);
		System.out.print("점수 입력 : ");
		
		int score = sc.nextInt();
		System.out.println("입력 점수 : " + score);
		
		switch(score/10) {
			case 10:
				// 100점은 딱 10나누면 나머지가 없어서 case 10을 써줘야함니다.
			case 9:         // case는 비교 연산자는 쓸 수 없다.. 
				            //[java는 96 나누기 10하면 9.6이 아닌 정수 9가 뜸]
				System.out.println("학점은 A 입니담.");
				break;
			case 8:
				System.out.println("학점은 B 입니담.");
				break;
			case 7:
				System.out.println("학점은 C 입니담.");
				break;
			case 6:
				System.out.println("학점은 D 입니담.");
				break;
			default :
				System.out.println("학점은 F 입니담.");
				break;	
				
		}

	}

}
