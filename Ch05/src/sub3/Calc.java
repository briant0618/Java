package sub3;

public class Calc {
	
	private static Calc instance = new Calc();
    
	public static Calc getInstance() {
		return instance;
	} // private ������ get�� �־ method area���� ����� �Դ´�.
	
	
	
	private Calc() { } // ��ü���� �Ұ�.
	
	public int plus(int x, int y){
		return x + y;
	}
	public int minus(int x, int y){
		return x - y;
	}
	public int multi(int x, int y){
		return x * y;
	}
	public int div(int x, int y){
		return x / y;
	}
}
