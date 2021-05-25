package sub4;

import sub3.Animal;
import sub3.Eagle;
import sub3.Shark;
import sub3.Tiger;

/* 날짜 : 2021/05/24
* 이름 : 김동현
* 내용 : Java Casting
*/
public class CastingTest extends Animal{
	public static void main(String[] args) {
		// Casting [ 형변환 ]
		int num1 = 1;
		double num2 = num1;
		int num3 = (int)num2;
		
		System.out.println("num1 : " + num1);
		System.out.println("num2 : " + num2);
		System.out.println("num3 : " + num3);
		
		// 객체에 대한 캐스팅
		
		// 업캐스팅
		Animal a1 = new Tiger();
		Animal a2 = new Eagle();
		Animal a3 = new Shark();
		
		// 다운캐스팅
		Tiger tiger = (Tiger)a1;
		Eagle eagle = (Eagle)a2;
		Shark shark = (Shark)a3;
		
		// instanceof = 데이터의 실제 타입을 조사.
		if(a1 instanceof Tiger) {
			System.out.println("a1은 Tiger 입니다.");
		}else if(a1 instanceof Eagle) {
			System.out.println("a1은 Eagle 입니다.");
		}else if(a1 instanceof Shark) {
			System.out.println("a1은 Shark 입니다.");
		}	
		
	}
}
