package chap17.Ex06_HashSet;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* 
 * Set<E> : interface. ���ȣ(index)�� ����. set���� �ߺ��� ���� ���� �� ����
 * 	- HashSet : �ߺ��� ���� ���� �� ����. ���� ������ ������� �������� ����
 * 	- LinkedHashSet : �ߺ��� ���� ���� �� ����. ��½� ������� ��� 
 * 	- TreeSet : ����� �� ���� ������ �Ǿ ����(ascending ���� : ���� ���� ���� / descendint ���� : ���� ���� ����)
 * 		=> ex) �������� : 0 ~> 9, A ~> Z, �� ~> �� / �������� : 9 ~> 0, Z ~> A, �� ~> ��
 */

public class HashSetMethod {

	public static void main(String[] args) {
		Set<String> hSet1 = new HashSet<String>();		// Set�� Interface �̹Ƿ� Ÿ�����θ� ����
		
		// 1. add(E element) : Set�� ���� �߰�
		hSet1.add("��");
		hSet1.add("��");
		hSet1.add("��");
		
		System.out.println(hSet1);
		System.out.println(hSet1.toString());		// toString method�� �����ǵǾ� ����
		
		// 2. addAll(�ٸ� set ��ü) : �ڽ��� Set�� �ٸ� Set�� ����� ���� �߰� => �ߺ��� ���� ������
		Set<String> hSet2 = new HashSet();
		hSet2.add("��");
		hSet2.add("��");
		hSet2.addAll(hSet1);
		
		System.out.println(hSet2);
		
		// 3. remove(Object o) : Ư�� ������ ���� => List�� ��� index(��) ��ȣ�� ����
		hSet2.remove("��");
		System.out.println(hSet2);
		
		// 4. clear() : ��� ����
		hSet2.clear();
		System.out.println(hSet2);
		
		// 5. isEmpty() : ��������� true, ������������� false
		System.out.println(hSet2.isEmpty());
		
		// 6. contains(Object o) : ���� Set�� �����ϸ� true, �������� ������ false
		Set<String> hSet3 = new HashSet<String>();
		hSet3.add("��");
		hSet3.add("��");
		hSet3.add("��");
		
		System.out.println(hSet3);
		System.out.println(hSet3.contains("��"));
		
		// 7. size() : Set�� ���Ե� ���� ����
		System.out.println(hSet3.size());
		
		System.out.println("-----<< iterator()�� ����� ��� >>-----");
		
		/*
		 * 8. iterator() : Set�� index�� ������ ����. for ���� ���ȣ�� ���� ����ϱ� ������ ���Ұ�. enhanced for ���� ��� ����
		 * 	- ��ȸ��. Set���� ������ ��ȸ�ϸ鼭 ���
		 * 	1. hasNext() : Set�� ���� �����ϸ� true, �������� ������ false
		 * 	2. next() : ���� ���� ����ϰ� ���� ������ �̵�
		 */
		Iterator<String> iterator = hSet3.iterator();
		// ���� : class<E> ������ü = Set��ü.iterator(): 
		while(iterator.hasNext()) {
			System.out.print(iterator.next() + " ");
		}
		System.out.println();
		
		System.out.println("-----<< enhanced for ���� ����� ��� >>-----");
		
		for (String k : hSet3) {
			System.out.print(k + " ");
		}
		System.out.println();
		
		// 9. toArray() : Set���� ������ �迭�� ����. Object Ÿ������ return, �ٿ� ĳ������ �ʿ���
		Object[] objArray = hSet3.toArray();
		System.out.println(Arrays.toString(objArray));
		for (int i = 0; i < objArray.length; i++) {
			System.out.print(objArray[i] + " ");
		}
		System.out.println();
		
		System.out.println("-----------------------------");
		
		for (Object k : objArray) {		// �ٿ� ĳ������ �ʿ���
			System.out.print(k + " ");
		}
		System.out.println();
		
		// 10. toArray(T[] t)		// �ٷ� �ٿ�ĳ������ �� �� ��� ����
		String[] strArray1 = hSet3.toArray(new String[0]);		// 0 : ���� ũ�⸦ ���� => ���� ũ�Ⱑ ���������� ���� ��� �����Ϸ��� ���� ũ�⸸ŭ ����
		
		System.out.println(Arrays.toString(strArray1));
		
		// 11. ���� Set�� ������ ���� ũ�⸦ ũ�� ���� ���� Null�� �� �� ����
		String[] strArray2 = hSet3.toArray(new String[5]);
		System.out.println(Arrays.toString(strArray2));
		
		
		// 12. iterator ���, Enhanced for ���� ����ؼ� ��� 
		Set<Integer> intSet1 = new HashSet();
		intSet1.add(30);
		intSet1.add(50);
		intSet1.add(100);
		intSet1.add(10);
		
		Iterator<Integer> iterator2 = intSet1.iterator();
		while(iterator2.hasNext()) {
			System.out.print(iterator2.next() + " ");
		}

		System.out.println();
		
		for (Integer k : intSet1) {
			System.out.print(k + " ");
		}
	
	}

}
