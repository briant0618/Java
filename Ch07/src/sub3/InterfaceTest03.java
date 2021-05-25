package sub3;

public class InterfaceTest03 {
	public static void main(String[] args) {
		// Interface = 객체간 결합도 완화시켜줌니다. 
		
		//객체 생성
		Bulb bulb = new Bulb();
		Socket socket = new Cable(bulb); // 얘는 switch에서 다 받아먹어서 다형성 가능
		
		socket.switchOn();
		socket.switchOff();
	}
}
