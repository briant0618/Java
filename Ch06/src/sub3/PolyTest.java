package sub3;
/*
 * 날짜 : 2021/05/24
 * 이름 : 김동현
 * 내용 : Class 내의 다형성
 * 다형성 [ polymorhism ]
 - 상속관계 있는 부모클래스의 구체적 기능을 자식클래스에서 다시 재정의하는 기능
 - 부모 클래스 타입으로 객체를 선언하는것
 - 다형성 성질을 이횽해서 프로그래밍 코드의 유연성을 높임
 */
public class PolyTest {
	public static void main(String[] args) {
		// 다형성을 활용한 객체 생성.
		Animal tiger = new Tiger(); // Tiger tiger 대신 부모를 넣음으로서 다형성을 생성함.
		Animal eagle = new Eagle();
		Animal shark = new Shark();
		
		tiger.move();
		eagle.move();
		shark.move();
		
		tiger.hunt();
		eagle.hunt();
		shark.hunt();
		
		// 다형성을 활용한 객체 배열
		Tiger obj1 = new Tiger();
		Eagle obj2 = new Eagle();
		Shark obj3 = new Shark();
		
		Animal object[] = {obj1,obj2,obj3};
		for(Animal obj: object) {
			obj.move();
			obj.hunt();
		}
	}
	
	
}
