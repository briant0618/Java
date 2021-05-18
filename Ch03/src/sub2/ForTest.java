package sub2;

public class ForTest {

	public static void main(String[] args) {
		// for
		for(int i =1; i<=3; i++) {
			System.out.printf("%d.Hello Java! \n",i); // 서식문자를 활용한 출력.
		}
		// 1~10까지 합
		int sum = 0;
		for(int k = 1; k <= 10; k++) {
			sum += k;
		}
			System.out.println("1~10까지의 합은 " + sum);

		// 1~10까지 짝수의 합
		int eSum = 0;
		for(int k=1; k <=10; k++) {
			if(k % 2 == 0) {
				eSum +=k;
			}
		}
		   System.out.println("1~10까지의 짝수의 합은 " + eSum);
		// 중첩 for
		for(int a = 1; a <=3; a++) {
			System.out.println("a : " + a);
			for(int b = 1; b <= 5; b++) {
				System.out.println("b : " + b);
			}
		}
		// 구구단
		for(int x = 2; x <= 9; x ++) {
			System.out.println(x + "단" );
			for(int y = 1; y <= 9; y++) {
				int z = x * y;
				System.out.printf("%d x %d = %d\n", x,y,z);
			}
		}
		// 별삼각형 I
		for(int start = 1; start <=10; start ++) {
			for(int end = 1; end <= start; end ++) {
				System.out.print("☆");
			}
			System.out.print("\n");
		}
		// *별삼각형 II
		for(int a=1; a<=5; a++) {
			for(int b=1; b<=5-a; b++) {
				System.out.print("☆");
			}
			for(int c=1; c<=a; c++) {
				System.out.print("★");
			}
			System.out.print("\n");
		}
	}

}
