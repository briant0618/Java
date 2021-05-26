package sub2;

import java.util.ArrayList;
import java.util.List;

import sub1.Apple;

/*
 * 날짜 : 2021/05/26
 * 이름 : 김동현
 * 내용 : CollectionList [ 자료구조 ]
 */
public class CollectionListTest {
	public static void main(String[] args) {
		
		//List 생성
		ArrayList<Integer> list1 = new ArrayList<>();
		
		//List data 저장
		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(4);
		list1.add(5);
		list1.remove(2); //index 번호 지우는거임..
		list1.add(1, 3); //index 1번자리에 3을 넣어라
		for(int num : list1) {
			System.out.print(num + ",");
		}
		System.out.println("\n");
		
	    ArrayList<String> list2 = new ArrayList<>();
		list2.add("김유신"); 
		list2.add("김춘추"); 
		list2.add("강감찬"); 
		list2.add("장보고"); 
		list2.add("이순신"); 
		for(String person : list2) {
			System.out.print(person + ",");
		}
		System.out.println("\n");
		
		
	
		Apple a1 = new Apple("대한민국",2000);
		Apple a2 = new Apple("미국",3000);
		Apple a3 = new Apple("영국",4000);
		
		
		List<Apple> list3 = new ArrayList<>();
		list3.add(a1);
		list3.add(a2);
		list3.add(a3);
		
		Apple apple = list3.get(0);
		apple.toString();
		list3.get(1).toString();
		list3.get(2).toString();
		

		
		
	}
}
