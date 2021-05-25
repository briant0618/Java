package sub1;

public class RemoteLG implements RemoteControl {
	// 상속받는게 아니라 extends 대신 implements 사용.
	@Override
	public void powerOn() {
		System.out.println("LG - powerOn");
		
	}

	@Override
	public void powerOff() {
		System.out.println("LG - powerOff");
		
	}

	@Override
	public void chUp() {
		System.out.println("LG - chUp");
		
	}

	@Override
	public void chDown() {
		System.out.println("LG - chDown");
		
	}
	
}
