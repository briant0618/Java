package sub1;

import java.util.Scanner;

/*
 * ��¥ : 2021/05/18
 * �̸� : �赿��
 * ���� : ���ǹ� switch 
 */
public class SwitchTest {
	// switch(����) {
	//	case ��1:
	//		break
	//	case ��1:
	//		break
	//	case ��1:
	//		break
	//	default;
	//		break
	//	}

	public static void main(String[] args) {
		String animal = "eagle";
		
		switch(animal) {
			case "lion":
				System.out.println("animal�� lion�Ӵϴ�.");
				break;
			case "eagle":
				System.out.println("animal�� eagle�Ӵϴ�.");
				break;
			case "tiger":
				System.out.println("animal�� tiger�Ӵϴ�.");
				break;
			default:
				System.out.println("animal�� lion,eagle,tiger�� �ƴԴϴ�.");
				break;
		}
		// Example
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է� : ");
		
		int score = sc.nextInt();
		System.out.println("�Է� ���� : " + score);
		
		switch(score/10) {
			case 10:
				// 100���� �� 10������ �������� ��� case 10�� ������Դϴ�.
			case 9:         // case�� �� �����ڴ� �� �� ����.. 
				            //[java�� 96 ������ 10�ϸ� 9.6�� �ƴ� ���� 9�� ��]
				System.out.println("������ A �Դϴ�.");
				break;
			case 8:
				System.out.println("������ B �Դϴ�.");
				break;
			case 7:
				System.out.println("������ C �Դϴ�.");
				break;
			case 6:
				System.out.println("������ D �Դϴ�.");
				break;
			default :
				System.out.println("������ F �Դϴ�.");
				break;	
				
		}

	}

}
