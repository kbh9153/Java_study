package chap17.Ex01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * List�� method : 13�� ������ method
 * 	1. ArrayList
 * 	2. Vector
 * 	3. LinkedList
 */

public class ArrayListMethod01 {

	public static void main(String[] args) {
		List<Integer> aList1 = new ArrayList<Integer>();
		
		// 1. add(E element) : ������ index ���Ŀ� �� �߰��ϱ�
		aList1.add(3);
		aList1.add(6);
		aList1.add(9);
		
		System.out.println(aList1);		// �����
		System.out.println(aList1.size());		// ���� ����
		
		System.out.println("---------------");
		
		// 2. add(int index, E element)
		aList1.add(1, 6);		// index ��ȣ 1���� 6�� �߰��ϰ� ���� ������ ���� index�� �з���
		System.out.println(aList1);
		
		System.out.println("---------------");

		// 3. addAll : �� �ٸ� list�� ��ü�� �����ؼ� �߰�
		List<Integer> aList2 = new ArrayList<Integer>();
		aList2.add(1);
		aList2.add(2);
		
		aList2.addAll(aList1);		// aList1�� ����� ���� �����ؼ� aList2�� �߰�
		
		System.out.println(aList2);		// ���� �ִ� ���� �������� ������ aList1 ���� �߰�
		
		System.out.println("---------------");
		
		// 4. addAll(int index, �� �ٸ� ��ü)
		List<Integer> aList3 = new ArrayList<Integer>();
		aList3.add(1);
		aList3.add(2);
		
		aList3.addAll(1, aList3);		// �ڽ��� ���� �ٸ� ��ü�� �߰�(������ ���� index ������ ������ ��ü�� ������ ���������� �߰�) 
		System.out.println(aList3);
		
		System.out.println("---------------");
		
		// 5. set(int Index, E element) : Ư�� �� ��ȣ�� ���� ����
		aList3.set(1, 5);
		aList3.set(3, 6);
		// aList3.set(4, 7);		// ���� �߻�, IndexOutOfBoundsException
		
		System.out.println(aList3);
		
		System.out.println("---------------");
		
		// 6. remove(int index) : Ư�� ���ȣ�� ���� ����
		aList3.remove(1);		// ���ȣ 1�� �濡 �ִ� ���� ����
		System.out.println(aList3);
		
		System.out.println("---------------");
		
		// 7. remove(Object o) : ���� ����
		aList3.remove(new Integer(6));		// ������ ������ �� ����. Integer�� ǥ�õ� ���� ����ǥ�ð� �ƴ϶� ���� �� ������ �����ǰų� ����� �� ������ �˸�
		System.out.println(aList3);
		
		System.out.println("---------------");
		
		// 8. clear() : ��� ����
		aList3.clear();
		System.out.println(aList3);
		
		System.out.println("---------------");
		
		// 9. isEmpty() : ���� ��� ������ True, ������� ������ False
		System.out.println(aList3.isEmpty());
		
		System.out.println("---------------");
		
		// 10. size() : ���� ����, ���� ����
		System.out.println(aList3.size());
		aList3.add(1);
		aList3.add(2);
		aList3.add(3);
		System.out.println(aList3);
		System.out.println(aList3.size());
		
		System.out.println("---------------");
		
		// 11. get(int index) : �� ��ȣ�� ���� ���
		System.out.println(aList3.get(0));
		System.out.println(aList3.get(1));
		System.out.println(aList3.get(2));
		
		System.out.println(aList3);		// List�� �� ��ü�� ����ϸ� ��ü�� ���� ���
		
		System.out.println("---------------");
		
		// 12. toArray() : List -> Array. List�� �迭�� ��ȯ
		Object[] object = aList3.toArray();		// �⺻������ toArray() method�� Object Ÿ������ return�� �� => �ٿ� ĳ������ �ʿ�
		System.out.println(Arrays.toString(object));		// �迭�� ��ȯ�� ����. �迭�� ���� Arrays.toString() ���
		
		System.out.println("---------------");
		
		// 13-1 toArray(T[] t) => t[] : Integer�� �ٷ� ĳ����
		Integer[] integer1 = aList3.toArray(new Integer[0]);	
		// (new Integerp[0] => [0] : ���� ũ��. * 0 -> ���� ���� ����(���� 3)���� ���� ũ�⸦ �۰� �����ϸ� ���� ���� ����(���� 3)��ŭ ���
		System.out.println(Arrays.toString(integer1));
		
		// 13-2 toArray(T[] t) => t[] : Integer�� �ٷ� ĳ����
		Integer[] integer2 = aList3.toArray(new Integer[5]);
		System.out.println(Arrays.toString(integer2));
		
	}

}
