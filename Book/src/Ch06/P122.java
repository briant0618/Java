package Ch06;
/*
 * ��¥ : 2021/05/18
 * �̸� : �赿��
 * ���� : ������ �迭 2
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
