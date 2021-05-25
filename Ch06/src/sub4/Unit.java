package sub4;

// 추상 class = 1개 이상 추상 Method 갖는 class
// 객체 생성이 불가능
// 정의는 자식이 해야하고 상속을 위한 class이다.
public abstract class Unit {
	public void move() {
		System.out.println("Unit move..");
	}
	// 추상 Method -> Attack을 구체화 하기 전까지는 정의 할수가 없음.. -> 자식이 정의해야.. = 정의를 위한 class임..
	public abstract void attack(); 

}
