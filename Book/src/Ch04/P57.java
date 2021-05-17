package Ch04;
/*
 * 날짜 : 2021/05/17
 * 이름 : 김동현
 * 내용 : 증감 연산자
 */
public class P57 {

	public static void main(String[] args) {
		int a = 10;
		int b = 10;
        
		++a;
		b++;
		System.out.println(a);
		System.out.println(b);
		
		//예제1
		int c = 10;
		int d = ++c;
		System.out.println("전위연산 결과 : " + d);
		int e = 10;
		int f = e++;
		System.out.println("후위연산 결과 : " + f);	
		
		//예제2
		int g = 10;
		g++;
		System.out.println("g++ : " + g );
		
		int h = 10;
		h += 1;
		System.out.println("h += 1 : " + h);
		
		int i = 10;
		i = i + 1;
		System.out.println("i = i+1 : " + i);
		
	}

}
