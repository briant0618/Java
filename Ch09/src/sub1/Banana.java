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
	
	@Override
	public String toString() {
		System.out.println("바나나 원산지 : "+country);
		System.out.println("바나나 가격 : "+price);
		return super.toString();
	}
}

