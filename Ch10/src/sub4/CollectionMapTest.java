package sub4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import sub1.Apple;

import java.util.List;


/*
 * 날짜 : 2021/05/26
 * 이름 : 김동현
 * 내용 : collection Map
 */
public class CollectionMapTest {
	
	public static void main(String[] args) {
		// Map 생성
		Map<Integer, String> map1 = new HashMap<>();
		map1.put(101, "김유신");
		map1.put(102, "김춘추");
		map1.put(103, "장보고");
		map1.put(104, "강감찬");
		map1.put(105, "이순신");
		
		System.out.println("map1의 데이터 갯수 : " + map1.size());
		
		// Map data 출력
		System.out.println("map1의 101번 데이터 : " + map1.get(101));
		System.out.println("map1의 102번 데이터 : " + map1.get(102));
		System.out.println("map1의 105번 데이터 : " + map1.get(105));
		
		
		// Map 응용 실습하기.
		List<Map<Integer, Apple>> list = new ArrayList<>();
		
		Map<Integer, Apple> m1 = new HashMap<>();
		m1.put(101, new Apple("한국",2000));
		m1.put(102, new Apple("미국",3000));
		m1.put(103, new Apple("영국",4000));
		
		Map<Integer, Apple> m2 = new HashMap<>();
		m2.put(201, new Apple("호주",2000));
		m2.put(202, new Apple("스리랑카",3000));
		m2.put(203, new Apple("뉴질랜드",4000));
		
		Map<Integer, Apple> m3 = new HashMap<>();
		m3.put(301, new Apple("태국",2000));
		m3.put(302, new Apple("대만",3000));
		m3.put(303, new Apple("홍콩",4000));
		
		list.add(m1);
		list.add(m2);
		list.add(m3);
		
		
		Map<Integer, Apple> map = list.get(0);
		Apple apple = map.get(101);
		apple.toString();
		
		m2.get(201).toString();
		m3.get(302).toString();
		
		//list.get(1).get(201).toString(); 도 가능.
		
		
	}
}
