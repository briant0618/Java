package sub2;
/*
 * 날짜 : 2021/05/18
 * 이름 : 김동현
 * 내용 : 반복문 while
 */
public class WhileTest {

	public static void main(String[] args) {
		// 1~10까지 합
		int k = 0;
		int sum = 0;
		
		while(k <= 10) {
			sum += k;
			k++;
		}
		System.out.println("1부터 10까지의 합 : " + sum);
		
		// do~while
		int eSum = 0;
		int i = 1;
		
		do{
			if(i % 2 ==0 ) {
				eSum += i;
			}
			i++;
		}while(i <= 10);
		System.out.println("1부터 10까지의 짝수의 합 : " + eSum);	
			
			
		//while문은 while문의 scope가 밑에 있엇는데 do는 위로 올림 ▶ 무조건 do 뒤의 반복문 1번이상 실행하자.
			
		// break
		int num = 1;
		
		while(true) {
			num ++;
			if(num % 5 ==0 && num % 7 == 0) {
				break;
			}
		}
		System.out.println("5와 7의 최소공배수 : " + num);
		
		//continue
		int total = 0;
		for(int j = 1; j <= 10; j ++ ) {
			if(j %2 ==1) {
				continue;
			}
			total += j;
		}
		System.out.println("1부터 10까지의 짝수 합 " + total);
		
		
	}

}
