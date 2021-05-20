package Ch06;
/*
 * 날짜 : 2021/05/18
 * 이름 : 김동현
 * 내용 : 배열 사용 3
 */
public class P114 {

	public static void main(String[] args) {
		int [] lotto = new int[6];
		
		int idx = 0;
		while(true) {
			int num = (int)(Math.random() * 45) + 1;
			
			boolean insert = true;
			for(int i = 0; i <= idx; i++) {
				if (lotto[i] == num) {
					insert = false;
					break;
				}
			}
			if (insert == true) {
				lotto[idx] = num;
				idx ++;
			}
			if (idx == 6) break;
			
		}
		for(int i = 0; i <lotto.length; i++) {
			System.out.println(lotto[i]);
		}

	}

}
