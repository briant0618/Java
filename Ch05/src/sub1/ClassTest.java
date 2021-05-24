package sub1;
/*
 * 날짜 : 2021/05/24
 * 이름 : 김동현
 * 내용 : Java Class 객체 활용
 */
public class ClassTest {
	public static void main(String[] args) {
		//객체 생성 [ 결론 : 객체생성 → 참조변수 = 객체 [member 초기화] ]
		Account kb = new Account("국민은행","123-1213-1234","김유신",10000);
		Account wr = new Account("우리은행","121-1010-1021","김춘추",30000);
		
		
		//member 초기화 [ 캡슐화되면 초기화에 오류 뜨기때문에 객체 생성할때 따로 객체 뒤에서 초기화 시켜야한다.]
		
		//kb.bank = "국민은행";
		//kb.id = "123-1213-1234";
		//kb.name = "김유신";
		//kb.money = 10000;
		
		//wr.bank = "우리은행";
		//wr.id = "121-1010-1021";
		//wr.name = "김춘추";
		//wr.money = 30000;  』 캡슐화 이전 초기화 끝
		
		// 객체 활용 
		kb.deposit(40000);
		kb.withdraw(5000);
		kb.show();
		
		wr.deposit(30000);
		wr.withdraw(7000);
		wr.show();
		
	}

}
