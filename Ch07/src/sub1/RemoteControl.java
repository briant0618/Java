package sub1;

public interface RemoteControl {
	// interface 에는 추상 method만 선언해야함.
	// interface는 상속 받는다 대신 구현한다라고 정의함니다.
	public void powerOn();
	public void powerOff();
	
	public void chUp();
	public void chDown();
	
	
}
