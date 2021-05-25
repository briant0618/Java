package sub1;
/*
 * 날짜 : 2021/05/24
 * 이름 : 김동현
 * 내용 : Java Class
 */
public class Account {
	// 객체의 속성 and 접근 권한 설정 
	protected String bank; // class의 member변수는 무조건 private 선언 =>캡슐화하여 보안 설정하여 취약코드 예방함!
	protected String id;  // 외부에서 참조 못하므로 참조 위해서는 생성자가 필요함.
	protected String name;
	protected int money;
	
	// 생성자 1
	public Account(String bank, String id, String name, int money) {
		this.bank = bank;
		this.id = id;
		this.name = name;
		this.money = money;
	}
	
	
	// 객체의 기능 [ member method]
	public void deposit(int money) {
		this.money += money;
	}

	public void withdraw(int money) {
		this.money -= money;
	}
	
	public void show() {
		System.out.println("==========================");
		System.out.println("은행명 : " + this.bank);
		System.out.println("계좌번호 : " + id);
		System.out.println("입금주 : " + name);
		System.out.println("현재 잔액 : " + money);
		System.out.println("==========================");
	}
	
}
