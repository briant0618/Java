package sub3;

public class InterfaceTest03 {
	public static void main(String[] args) {
		// Interface = ��ü�� ���յ� ��ȭ�����ܴϴ�. 
		
		//��ü ����
		Bulb bulb = new Bulb();
		Socket socket = new Cable(bulb); // ��� switch���� �� �޾ƸԾ ������ ����
		
		socket.switchOn();
		socket.switchOff();
	}
}
