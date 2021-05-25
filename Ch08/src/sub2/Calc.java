package sub2;

public class Calc  {
	private static Calc instance = new Calc();
	
	public static Calc getInstance() {
		return instance;
	}
	
	private Calc() {}
	
	public int plus(int x, int y) {
		return x + y;
	}
	public int minus(int x, int y) {
		return x - y;
	}
	public int multi(int x, int y) {
		return x * y;
	}
	public int div(int x, int y) throws Exception { // throw ������ ���� => throws���ϴ�.
		
		if(y == 0) {
			Exception e1 = new Exception("y�� 0�� �Ǿ�� �ȵ˴ϴ�."); // ���� ��ü.
			throw e1; // e�� Method�� ȣ���Ѱ����� throw�Ѵ�.
		}else if(y < 0) {
			Exception e2 = new Exception("y�� ������ �Ǿ�� �ȵ˴ϴ�.");
			throw e2;
		}
		
		return x / y;
	}
}