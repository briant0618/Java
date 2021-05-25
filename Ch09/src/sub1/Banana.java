package sub1;

public class Banana {
	private String country;
	private int price;
	
	
	public Banana() {
		this.country = "필리핀";
		this.price = 5000;
	}
	
	public Banana(String country, int price) {
		this.country = country;
		this.price = price;
	}
	
	public void show() {
		System.out.println("사과 원산지 : " + country);
		System.out.println("사과 가격 : " + price);
	}	
	
	@Override
	public String toString() {
		return super.toString(); 
	}
}
