package sub4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import sub1.Apple;

import java.util.List;


/*
 * ��¥ : 2021/05/26
 * �̸� : �赿��
 * ���� : collection Map
 */
public class CollectionMapTest {
	
	public static void main(String[] args) {
		// Map ����
		Map<Integer, String> map1 = new HashMap<>();
		map1.put(101, "������");
		map1.put(102, "������");
		map1.put(103, "�庸��");
		map1.put(104, "������");
		map1.put(105, "�̼���");
		
		System.out.println("map1�� ������ ���� : " + map1.size());
		
		// Map data ���
		System.out.println("map1�� 101�� ������ : " + map1.get(101));
		System.out.println("map1�� 102�� ������ : " + map1.get(102));
		System.out.println("map1�� 105�� ������ : " + map1.get(105));
		
		
		// Map ���� �ǽ��ϱ�.
		List<Map<Integer, Apple>> list = new ArrayList<>();
		
		Map<Integer, Apple> m1 = new HashMap<>();
		m1.put(101, new Apple("�ѱ�",2000));
		m1.put(102, new Apple("�̱�",3000));
		m1.put(103, new Apple("����",4000));
		
		Map<Integer, Apple> m2 = new HashMap<>();
		m2.put(201, new Apple("ȣ��",2000));
		m2.put(202, new Apple("������ī",3000));
		m2.put(203, new Apple("��������",4000));
		
		Map<Integer, Apple> m3 = new HashMap<>();
		m3.put(301, new Apple("�±�",2000));
		m3.put(302, new Apple("�븸",3000));
		m3.put(303, new Apple("ȫ��",4000));
		
		list.add(m1);
		list.add(m2);
		list.add(m3);
		
		
		Map<Integer, Apple> map = list.get(0);
		Apple apple = map.get(101);
		apple.toString();
		
		m2.get(201).toString();
		m3.get(302).toString();
		
		//list.get(1).get(201).toString(); �� ����.
		
		
	}
}
