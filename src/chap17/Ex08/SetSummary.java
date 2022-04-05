package chap17.Ex08;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

/*
 * Set : �ߺ����� �ʴ� ���� ���� (equals(), hashCode() method�� ������), Wrapper class�� ��� ������
 * 	1. HashSet : ��µǴ� ���� �����ϰ� ���
 * 	2. LinkedHashSet : �ԷµǴ� ��� ���
 * 	3. TreeSet : �Է°��� ������ ���������� ����. ������������ ���ĵǾ� ���
 */

public class SetSummary {

	public static void main(String[] args) {
		// 1. HashSet
		Set<String> hashSet = new HashSet<String>();
		hashSet.add("��");
		hashSet.add("��");
		hashSet.add("��");
		hashSet.add("��");
		
		System.out.println(hashSet);
		
		// 2. LinkedHashSet
		Set<String> linkedHashSet = new LinkedHashSet<String>();
		linkedHashSet.add("��");
		linkedHashSet.add("��");
		linkedHashSet.add("��");
		linkedHashSet.add("��");

		System.out.println(linkedHashSet);
		
		// 3. TreeSet => �����ϱ� ���ؼ� Comparable<E>, Comparator<E>
		TreeSet<String> treeSet = new TreeSet<String>();
		treeSet.add("��");
		treeSet.add("��");
		treeSet.add("��");
		treeSet.add("��");
		
		System.out.println(treeSet);
		
	}

}
