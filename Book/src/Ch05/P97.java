package Ch05;

/*
 * 날짜 : 2021/05/18
 * 이름 : 김동현
 * 내용 : 중첩 for문
 */
public class P97 {

	public static void main(String[] args) {
		for(int i = 2; i < 10; i++) {
			for(int j = 1; j < 10; j++ ) {
				System.out.println("j = "+ j + " ,i = " + i);
			}
		}
		for(int k = 2; k < 10; k++) {
			System.out.println("["+ k +"단]");
			for(int l = 1; l < 10; l++) {
				System.out.println( k + " * " + l + " = " + k * l );
			}
		}
		
		
		
		
		
		
		
		

	}

}
