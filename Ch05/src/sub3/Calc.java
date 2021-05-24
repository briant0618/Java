package sub3;

public class Calc {
	
	private static Calc instance = new Calc();
    
	public static Calc getInstance() {
		return instance;
	} // private 때문에 get값 넣어서 method area에서 만들어 먹는다.
	
	
	
	private Calc() { } // 객체생성 불가.
	
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
