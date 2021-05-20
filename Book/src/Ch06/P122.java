package Ch06;
/*
 * 날짜 : 2021/05/18
 * 이름 : 김동현
 * 내용 : 다차원 배열 2
 */
public class P122 {

	public static void main(String[] args) {
		int[][][] arrInt = new int[3][3][3];
		
		int value = 0;
		
		for(int i = 0; i <= 2; i++) {
			for(int j = 0; j <= 2; j++) {
				for(int k = 0; k <= 2; k++) {
					arrInt[i][j][k] = value++;
				}
			}
		}

	}

}
