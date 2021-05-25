package sub1;

public class StockAccount extends Account{
	// 상속에는 의무가 따른다 = Account의 member를 여기서도 초기화 해줘야 한다.
	
	private String stock;
	private int amount;
	private int price;
	
	
	public StockAccount(String bank, String id, String name, int money, String stock, int amount, int price) {
		super(bank, id, name, money);
		this.stock = stock;
		this.amount = amount;
		this.price = price;
	}
	
	// 부모 class가 캡슐화 되어있어서 외부에서 참조가 불가능함..
	// 그래서 부모 class의 private를 protected 바꿔야 자식만 참조 가능함.
	public void sell(int amount,int price) {
		int total = amount * price;
		money += total;
	}
	public void buy(int amount,int price) {
		int total = amount * price;
		money -= total;
	}
	public void show() {
		System.out.println("=========================");
		System.out.println("은행명 : " + bank);
		System.out.println("계좌번호 : " + id );
		System.out.println("입금주 : " + name);
		System.out.println("현재잔액 : " + money);
		System.out.println("주식종목 : " + stock);
		System.out.println("주식수량 : " + amount);
		System.out.println("주식가격 : " + price);
		System.out.println("=========================");
	}
	
}
