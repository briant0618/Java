package sub2;

import java.util.ArrayList;
import java.util.List;

import sub1.Apple;

/*
 * ��¥ : 2021/05/26
 * �̸� : �赿��
 * ���� : CollectionList [ �ڷᱸ�� ]
 */
public class CollectionListTest {
	public static void main(String[] args) {
		
		//List ����
		ArrayList<Integer> list1 = new ArrayList<>();
		
		//List data ����
		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(4);
		list1.add(5);
		list1.remove(2); //index ��ȣ ����°���..
		list1.add(1, 3); //index 1���ڸ��� 3�� �־��
		for(int num : list1) {
			System.out.print(num + ",");
		}
		System.out.println("\n");
		
	    ArrayList<String> list2 = new ArrayList<>();
		list2.add("������"); 
		list2.add("������"); 
		list2.add("������"); 
		list2.add("�庸��"); 
		list2.add("�̼���"); 
		for(String person : list2) {
			System.out.print(person + ",");
		}
		System.out.println("\n");
		
		
	
		Apple a1 = new Apple("���ѹα�",2000);
		Apple a2 = new Apple("�̱�",3000);
		Apple a3 = new Apple("����",4000);
		
		
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
