package sub1;

public class Banana {
	private String country;
	private int price;
	
	
	public Banana() {
		this.country = "�ʸ���";
		this.price = 5000;
	}
	
	public Banana(String country, int price) {
		this.country = country;
		this.price = price;
	}
	
	public void show() {
		System.out.println("��� ������ : " + country);
		System.out.println("��� ���� : " + price);
	}	
	
	@Override
	public String toString() {
		return super.toString(); 
	}
}
