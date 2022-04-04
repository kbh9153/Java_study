package chap17.Ex08;

import java.util.NavigableSet;
import java.util.SortedSet;
import java.util.TreeSet;

/*
 * TreeSet : ��½� ���ĵǾ ���(�������� ���� => ascending) ex. 1 ~> 9, a ~> z, �� ~> ��
 * 	- ��½� �˻� method(�˻����) ����
 * 	- ������ ���� ������ Set�� ���ĵǾ ����. ����꿡 ������������ ���ĵǾ ���
 * 	- Set > SortedSet(���� method) > NavigableSet(�˻� method) > TreeSet
 * 	- TreeSet<String> treeSet = new TreeSet<String>(); : Ÿ���� TreeSet���� �����ؾ� ���İ� �˻������ ��� ����
 * 	- Set interface�� ��� method ���. �߰������� ���� method�� �˻� method�� ��밡��
 */


public class TreeSetMethod {

	public static void main(String[] args) {
		// TreeSet�� Set�� ��� method ���
		// TreeSet�� ���� �־��� ��� �������� ���ĵǾ� ���� Set�� ����. ��½� �������� ���ķ� ���
		TreeSet<Integer> treeSet = new TreeSet<Integer>();		// Type�� TreeSet���� �����ؾ� ����(Sort)�� �˻��� ��밡��
		for (int i = 50; i > 0; i -= 2) {		// 50, 48, 46, 44, 42 ������ 2�� ����
			treeSet.add(i);		// ���������� ������ ���� ���� �� ������������ ���ĵǾ� ���� ����
		}
		System.out.println(treeSet);
		
		// TreeSet������ ��� ������ method (1. ~ 15.)
		
		System.out.println("-----<< ������ �˻�(��������) >>-----");
		
		// 1. first() : ���� ó�� ���� return
		System.out.println(treeSet.first());	// 2
		
		// 2. last() : ���� ������ ���� return
		System.out.println(treeSet.last());		// 50
		
		// 3. lower(E element) : ������ element(List ��)���� ���� �� �ϳ�
		System.out.println(treeSet.lower(26));		// 24
		
		// 4. higher(E element) : ������ element(List ��)���� ū �� �ϳ�
		System.out.println(treeSet.higher(26));		// 28
		
		// 5. floor(E element) : ������ element(List ��)�� ���ų� ���� �� �� ���� ����� �� 
		System.out.println(treeSet.floor(27));		// 26
		System.out.println(treeSet.floor(25));		// 24
		
		// 6. ceiling(E element) : ������ element(List ��)�� ���ų� ū �� �� ���� ����� ��
		System.out.println(treeSet.ceiling(27));	// 28
		System.out.println(treeSet.ceiling(25));	// 26
		
		System.out.println("-----<< ������ ������ >>-----");
		// 7. pollFirst() : ù��° ���� ������ (���� ���� List���� ����)
		int treeSetSize = treeSet.size();		// ���� ����
		System.out.println(treeSetSize);
		System.out.println("--------------------------");
		
		for (int i = 0; i < treeSetSize; i++) {
			System.out.println(treeSet.pollFirst());		// 25�� �������鼭 ù��° ���� �����ͼ� ���
		}
		System.out.println();
		System.out.println(treeSet.size());		// 0
		
		// 8. pollLast() : ������ ���� ������ (���� ���� List���� ����)
		for (int i = 50; i > 0; i -= 2) {
			treeSet.add(i);		// ������������ ���ĵǾ ����
		}
		treeSetSize = treeSet.size();
		System.out.println(treeSetSize);
		System.out.println(treeSet);
		
		for (int i = 0; i < treeSetSize; i++) {
			System.out.println(treeSet.pollLast());
		}
		System.out.println();
		System.out.println(treeSet.size());		// 0
		
		System.out.println("-----------<< ���� ��� >>----------");
		
		// 9. SortedSet<E> headSet(E element)		// ���ı�� (����ϱ� ���ؼ��� SortedSet<E> ��ü�� �����ؾ���)
			// SortedSet<E> : ���ĵ� �����͸� �����ϴ� Set
			// headSet(E element) : element�� Head �������� ���� ���� .<element ���� ������>
		for (int i = 50; i > 0; i -= 2) {
			treeSet.add(i);		// ������������ ���ĵǾ treeSet�� ����
		}
		System.out.println(treeSet);
		SortedSet<Integer> sSet = treeSet.headSet(20);		// headSet(20)�� SortedSet���� return ���� ������. Set Ÿ�Ե� ��� ����
		// Set<Integer> sSet = treeSet.headSet(20);		// Set Ÿ�Ե� ��� ����
		System.out.println(sSet);		// 20�� �������� �̸� ���� ���
		
		// 10. NavigableSet<E> headSet(E element, boolean inclusive)
		NavigableSet<Integer> nSet = treeSet.headSet(20, true);		// true�� ��� element ���� �����Ͽ� head ������ ���
		// NavigableSet<Integer> nSet = treeSet.headSet(20, false);		// false�� ��� element ���� �������Ͽ� head ������ ���
		// Set<Integer> nSet = treeSet.headSet(20, false);		// Set Ÿ�Ե� ��� ����
		System.out.println(nSet);
		
		// 11. SortedSet<E> tailSet(E element) : element�� tail �������� ���� ���� .<element �� ����>
		SortedSet<Integer> sSet2 = treeSet.tailSet(20);
		// Set<Integer> sSet2 = treeSet.tailSet(20);	// Set Ÿ�Ե� ��� ����
		System.out.println(sSet2);		// 20�� �������� 20 �̻� ���� ���
		
		// 12. NavigableSet<E> tailSet(E element, boolean inclusive)
		NavigableSet<Integer> nSet2 = treeSet.tailSet(20, true);	// true�� ��� element ���� �����Ͽ� tail ������ ���
		// NavigableSet<Integer> nSet2 = treeSet.tailSet(20, false);	// true�� ��� element ���� �������Ͽ� tail ������ ���
		// Set<Integer> nSet = treeSet.tailSet(20, false);		// Set Ÿ�Ե� ��� ����
		System.out.println(nSet2);
		
		System.out.println("-----------------<< Ư�� ������ �� ��������(subSet) >>-----------------");
		
		// 13. SortedSet<E> subSet(E element, E element) : Ư�� ������ ���� set���� ���� �� 
		SortedSet sSet3 = treeSet.subSet(10, 20);		// ���۰�(����) ��������(������) ������ ������ ��
		System.out.println(sSet3);		// 10 �̻� 20 �̸� ������ ������ ��
		
		// 14. NavigableSet<E> subSet(E element, boolean inclusive, E element, boolean inclusive)
		NavigableSet<Integer> nSet4 = treeSet.subSet(10, false, 20, true);		// true�� ����, false�� ������
		// Set<Integer> nSet4 = treeSet.subSet(10, false, 20, true);		// Set Ÿ�Ե� ��� ����
		System.out.println(nSet4);		// 10 �ʰ� 20 ���� �� ���
		
		System.out.println("-----------------<< �ݴ�� �����ϱ�(descendingSet) >>-----------------");
		
		// 15. NavigableSet<E> descendingSet() : ���� ������ �������� �ݴ�� ������ => descending(�������� ����)���� �ٸ�. descendingSet�� ���� ������ �ݴ��� 
		System.out.println(treeSet);		// �������� ����
		
		NavigableSet<Integer> descendingSet = treeSet.descendingSet();		// �������� ����
		// Set<Integer> descendingSet = treeSet.descendingSet();		// Set Ÿ�Ե� ��� ����
		System.out.println(descendingSet);
		
		NavigableSet<Integer> descendingSet2 = descendingSet.descendingSet();		// �������� ����
		// Set<Integer> descendingSet2 = treeSet.descendingSet();		// Set Ÿ�Ե� ��� ����
		System.out.println(descendingSet2);
	}

}
