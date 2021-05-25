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
	public int div(int x, int y) throws Exception { // throw 여러번 던짐 => throws씀니다.
		
		if(y == 0) {
			Exception e1 = new Exception("y는 0이 되어서는 안됩니다."); // 예외 객체.
			throw e1; // e를 Method를 호출한곳으로 throw한담.
		}else if(y < 0) {
			Exception e2 = new Exception("y는 음수가 되어서는 안됩니다.");
			throw e2;
		}
		
		return x / y;
	}
}
