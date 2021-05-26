package sub3;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/*
 * 날짜 : 2021/05/26
 * 이름 : 김동현
 * 내용 : collection 집합
 */
public class CollectionSetTest {
 
	public static void main(String[] args) {
		// set 생성
		Set<Integer> set = new HashSet<>();
		
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(4);
		set.add(3);
		set.add(5);
		System.out.println(set); // set은 중복허용 불가.
		
		// 원소 갯수
		System.out.println("set 원소 갯수 : " + set.size());
		
		/* 원소 출력 -> python은 list로 만들어서 출력했지만 java는 반복자[iterator] 씁니다.
		iterator = 손넣어서 무작위로 다 꺼내는 행위같은 경우이다.
		*/
		Iterator<Integer> iter = set.iterator(); 
		
		while(iter.hasNext()) { // hasNext = 갖고있는게 없으면 끝내버림
			System.out.print(iter.next()+",");
		}
		
	}

}
