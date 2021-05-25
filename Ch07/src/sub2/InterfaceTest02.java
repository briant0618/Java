package sub2;

public class InterfaceTest02 {
	public static void main(String[] args) {
		// interface  = 다중 상속 효과.
		
		SmartTv stv = new SmartTv();
		
		
		// 상속 + 구현이 되었기 때문에 Upcasting이 불가능해서 그대로 SmartTv를 쓴다.
		stv.powerOn();
		stv.powerOff();
		stv.internet();
		stv.internet();
		
	}
}
