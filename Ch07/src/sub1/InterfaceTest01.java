package sub1;
/*
 * ��¥ : 2021/05/25
 * �̸� : �赿��
 * ���� : class�� Interface..
 */
public class InterfaceTest01 {
	public static void main(String[] args) {
		// interface = class ������ ǥ�� ���̵� ��Ȱ!
		
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
