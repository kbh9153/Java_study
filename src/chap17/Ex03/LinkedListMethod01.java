package chap17.Ex03;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/*
 * LinkedList vs ArrayList
 */

public class LinkedListMethod01 {

	public static void main(String[] args) {
		List<Integer> linkedList1 = new LinkedList<Integer>();
		
		// 1. add(E element) : ������ index ���Ŀ� �� �߰��ϱ�
		linkedList1.add(3);
		linkedList1.add(6);
		linkedList1.add(9);
		
		System.out.println(linkedList1);		// �����
		System.out.println(linkedList1.size());		// ���� ����
		
		System.out.println("---------------");
		
		// 2. add(int index, E element)
		linkedList1.add(1, 6);		// index ��ȣ 1���� 6�� �߰��ϰ� ���� ������ ���� index�� �з���
		System.out.println(linkedList1);
		
		System.out.println("---------------");

		// 3. addAll : �� �ٸ� list�� ��ü�� �����ؼ� �߰�
		List<Integer> linkedList2 = new LinkedList<Integer>();
		linkedList2.add(1);
		linkedList2.add(2);
		
		linkedList2.addAll(linkedList1);		// linkedList1�� ����� ���� �����ؼ� linkedList2�� �߰�
		
		System.out.println(linkedList2);		// ���� �ִ� ���� �������� ������ linkedList1 ���� �߰�
		
		System.out.println("---------------");
		
		// 4. addAll(int index, �� �ٸ� ��ü)
		List<Integer> linkedList3 = new LinkedList<Integer>();
		linkedList3.add(1);
		linkedList3.add(2);
		
		linkedList3.addAll(1, linkedList3);		// �ڽ��� ���� �ٸ� ��ü�� �߰�(������ ���� index ������ ������ ��ü�� ������ ���������� �߰�) 
		System.out.println(linkedList3);
		
		System.out.println("---------------");
		
		// 5. set(int Index, E element) : Ư�� �� ��ȣ�� ���� ����
		linkedList3.set(1, 5);
		linkedList3.set(3, 6);
		// linkedList3.set(4, 7);		// ���� �߻�, IndexOutOfBoundsException
		
		System.out.println(linkedList3);
		
		System.out.println("---------------");
		
		// 6. remove(int index) : Ư�� ���ȣ�� ���� ����
		linkedList3.remove(1);		// ���ȣ 1�� �濡 �ִ� ���� ����
		System.out.println(linkedList3);
		
		System.out.println("---------------");
		
		// 7. remove(Object o) : ���� ����
		linkedList3.remove(new Integer(6));		// ������ ������ �� ����. Integer�� ǥ�õ� ���� ����ǥ�ð� �ƴ϶� ���� �� ������ �����ǰų� ����� �� ������ �˸�
		System.out.println(linkedList3);
		
		System.out.println("---------------");
		
		// 8. clear() : ��� ����
		linkedList3.clear();
		System.out.println(linkedList3);
		
		System.out.println("---------------");
		
		// 9. isEmpty() : ���� ��� ������ True, ������� ������ False
		System.out.println(linkedList3.isEmpty());
		
		System.out.println("---------------");
		
		// 10. size() : ���� ����, ���� ����
		System.out.println(linkedList3.size());
		linkedList3.add(1);
		linkedList3.add(2);
		linkedList3.add(3);
		System.out.println(linkedList3);
		System.out.println(linkedList3.size());
		
		System.out.println("---------------");
		
		// 11. get(int index) : �� ��ȣ�� ���� ���
		System.out.println(linkedList3.get(0));
		System.out.println(linkedList3.get(1));
		System.out.println(linkedList3.get(2));
		
		System.out.println(linkedList3);		// List�� �� ��ü�� ����ϸ� ��ü�� ���� ���
		
		System.out.println("---------------");
		
		// 12. toArray() : List -> Array. List�� �迭�� ��ȯ
		Object[] object = linkedList3.toArray();		// �⺻������ toArray() method�� Object Ÿ������ return�� �� => �ٿ� ĳ������ �ʿ�
		System.out.println(Arrays.toString(object));		// �迭�� ��ȯ�� ����. �迭�� ���� Arrays.toString() ���
		
		System.out.println("---------------");
		
		// 13-1 toArray(T[] t) => t[] : Integer�� �ٷ� ĳ����
		Integer[] integer1 = linkedList3.toArray(new Integer[0]);	
		// (new Integer[0] => [0] : ���� ũ��. * 0 -> ���� ���� ����(���� 3)���� ���� ũ�⸦ �۰� �����ϸ� ���� ���� ����(���� 3)��ŭ ���
		System.out.println(Arrays.toString(integer1));
		
		// 13-2 toArray(T[] t) => t[] : Integer�� �ٷ� ĳ����
		Integer[] integer2 = linkedList3.toArray(new Integer[5]);
		System.out.println(Arrays.toString(integer2));
		
	}

}
