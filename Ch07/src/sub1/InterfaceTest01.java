package sub1;
/*
 * 날짜 : 2021/05/25
 * 이름 : 김동현
 * 내용 : class의 Interface..
 */
public class InterfaceTest01 {
	public static void main(String[] args) {
		// interface = class 설계의 표준 가이드 역활!
		
		RemoteControl lg = new RemoteLG();
		RemoteControl samsung = new RemoteSamsung();
		
		lg.powerOn();
		lg.powerOff();
		lg.chUp();
		
		samsung.powerOn();
		samsung.powerOff();
		samsung.chDown();
	}
}
