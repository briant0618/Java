package sub2;

public class BBB extends AAA{
	
	@Override
	// tip] final ���� CCC�� method�� override ����..
	public void method1() {
		System.out.println("BBB - Method1...");
	}
	//Overload
	public void method2(int a) {
		System.out.println("BBB - Method2...");
	}
	//Overload
	public void method3() {
		System.out.println("BBB - Method3...");
	}
}
