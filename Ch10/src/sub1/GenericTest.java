package sub1;
/*
 * 날짜 : 2021/05/26
 * 이름 : 김동현
 * 내용 : Generic Class
 */
public class GenericTest {
	public static void main(String[] args) {
		
		Apple apple = new Apple("대한민국",2000);
		Banana banana = new Banana("필리핀",5000);
		
		FruitBox<Apple> box1 = new FruitBox<>();
		box1.setFruit(apple); 
		/* Apple은 되지만 banana가 안되서 FruitBox는 호환성이 떨어짐.
 		   Generic 선언을 통해 호환성 올려줌 */
		
		FruitBox<Banana> box2 = new FruitBox<>();
		box2.setFruit(banana);
		
		box1.getFruit().toString();
		box2.getFruit().toString();
		
	}
}
