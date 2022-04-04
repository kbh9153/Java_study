package chap17.Ex07;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/*
 * LinkedHashSet : ���� ������ �� ���� �� ��ġ ������ �� ���� �� ��ġ ������ ������ ����
 * 	- HashSet�� ������ : ��� method�� ������. �ߺ��� ���� �������� ����. index(�� ��ȣ)���� ������ ����
 * 		=> index ��ȣ�� ���� ������ �⺻ for������ ��� �Ұ���. iterator �Ǵ� Enhanced for���� ����Ͽ� ����ؾ���
 * 	- HashSet�� ������ : HashSet�� �Է� ������ ��µ��� ����. LinkedHashSet�� �Է� ������ ��µ�
 */

public class LinkedHashSetMethod {

	public static void main(String[] args) {
		Set<String> linkedSet1 = new LinkedHashSet<String>();		// Set�� Interface �̹Ƿ� Ÿ�����θ� ����
			// Set�� Generic Ÿ�Ժ����� wrapper class�� ����� ���, equals(), hashCode() method�� ������ 
		
		// 1. add(E element) : Set�� ���� �߰�
		linkedSet1.add("��");
		linkedSet1.add("��");
		linkedSet1.add("��");
		
		System.out.println(linkedSet1);		// [��, ��, ��] => �Է°� ����� ������
		System.out.println(linkedSet1.toString());		// toString method�� �����ǵǾ� ����
		
		System.out.println("------------------------------");
		
		// 2. addAll(�ٸ� set ��ü) : �ڽ��� Set�� �ٸ� Set�� ����� ���� �߰� => �ߺ��� ���� ������
		Set<String> linkedSet2 = new LinkedHashSet();
		linkedSet2.add("��");
		linkedSet2.add("��");
		linkedSet2.addAll(linkedSet1);
		
		System.out.println(linkedSet2);
		
		// 3. remove(Object o) : Ư�� ������ ���� => List�� ��� index(��) ��ȣ�� ����
		linkedSet2.remove("��");
		System.out.println(linkedSet2);
		
		// 4. clear() : ��� ����
		linkedSet2.clear();
		System.out.println(linkedSet2);
		
		// 5. isEmpty() : ��������� true, ������������� false
		System.out.println(linkedSet2.isEmpty());
		
		// 6. contains(Object o) : ���� Set�� �����ϸ� true, �������� ������ false
		Set<String> linkedSet3 = new LinkedHashSet<String>();
		linkedSet3.add("��");
		linkedSet3.add("��");
		linkedSet3.add("��");
		
		System.out.println(linkedSet3);
		System.out.println(linkedSet3.contains("��"));
		
		// 7. size() : Set�� ���Ե� ���� ����
		System.out.println(linkedSet3.size());
		
		System.out.println("-----<< iterator()�� ����� ��� >>-----");
		
		/*
		 * 8. iterator() : Set�� index�� ������ ����. for ���� ���ȣ�� ���� ����ϱ� ������ ���Ұ�. enhanced for ���� ��� ����
		 * 	- ��ȸ��. Set���� ������ ��ȸ�ϸ鼭 ���
		 * 	1. hasNext() : Set�� ���� �����ϸ� true, �������� ������ false
		 * 	2. next() : ���� ���� ����ϰ� ���� ������ �̵�
		 */
		Iterator<String> iterator = linkedSet3.iterator();
		// ���� : class<E> ������ü = Set��ü.iterator(): 
		while(iterator.hasNext()) {
			System.out.print(iterator.next() + " ");
		}
		System.out.println();
		
		System.out.println("-----<< enhanced for ���� ����� ��� >>-----");
		
		for (String k : linkedSet3) {
			System.out.print(k + " ");
		}
		System.out.println();
		
		// 9. toArray() : Set���� ������ �迭�� ����. Object Ÿ������ return, �ٿ� ĳ������ �ʿ���
		Object[] objArray = linkedSet3.toArray();
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
		String[] strArray1 = linkedSet3.toArray(new String[0]);		// 0 : ���� ũ�⸦ ���� => ���� ũ�Ⱑ ���������� ���� ��� �����Ϸ��� ���� ũ�⸸ŭ ����
		
		System.out.println(Arrays.toString(strArray1));
		
		// 11. ���� Set�� ������ ���� ũ�⸦ ũ�� ���� ���� Null�� �� �� ����
		String[] strArray2 = linkedSet3.toArray(new String[5]);
		System.out.println(Arrays.toString(strArray2));
		
		
		// 12. iterator ���, Enhanced for ���� ����ؼ� ��� 
		Set<Integer> intSet1 = new LinkedHashSet();
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
