package Ch05;
/*
 * 날짜 : 2021/05/18
 * 이름 : 김동현
 * 내용 : else if
 */
public class P82 {

	public static void main(String[] args) {
		int score = 80;
		String grade = "";
		
		System.out.println("학점 부여 시작");
		if(score >= 95) {
			 grade = "A+";
		}else if(score >= 90) {
			 grade = "A";
		}else if(score >= 85) {
			 grade = "B+";
		}else if(score >= 80) {
			 grade = "B";
		}else if(score >= 70) {
			 grade = "C";
		}else if(score >= 60) {
			 grade = "D";
		}else{
			grade = "F";
		}
		System.out.println("학점은 "+ grade +"입니다.");

	}

}
