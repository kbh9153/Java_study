package chap17.Ex12;

import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.SortedMap;
import java.util.TreeMap;

/*
 * TreeMap<K, V> : ����ÿ� Key�� �������� ���ĵǾ� ����(��������)
 * 	- ��½ÿ� ������������ ���ĵǾ� ���
 * 	- Key�� �Ϲ� ��ü�� ������ �� Comparable<E> compareTo()�� ������ => ��ü ���� �� ��������
 * 						   Comparator<E> compare()�� �������� => ��ü �������� ���
 * Map<K, V> > SortedMap<K, V>(���� method ����) > NavigableMap<K, V>(�˻� method ����) > TreeMap<K, V>
 * 	- TreeMap�� ����� ���� Type�� �� TreeMap���� �����Ͽ��� ���� �� �˻� ��� ��� ����
 */

public class TreeMapMethod01 {
	public static void main(String[] args) {
		// TreeMap<K, V>�� Map<K, V> method�� ��� ���. �߰������� SortedMap, NavigableMap�� �߰����� method�� ���
		TreeMap<Integer, String> treeMap = new TreeMap<Integer, String>();	// ������������ ���ĵǾ� �Էµ�
		
		for (int i = 20; i > 0; i -= 2) {
			treeMap.put(i, i + "��°");
		}
		System.out.println(treeMap);	// Key, Value : Key�� �������� �������� ���ĵ�
		
		// 1. firstKey() : ���� ù��° ���� ���
		System.out.println(treeMap.firstKey());		// 2
		
		// 2. firstEntry() : ���� ù��° entry(Key + Value) ���
		System.out.println(treeMap.firstEntry());
		
		// 3. lastKey() : ���� ������ ���� ���
		System.out.println(treeMap.lastKey());
		
		// 4. lastKey() : ���� ������ entry(Key + Value) ���
		System.out.println(treeMap.lastEntry());
		
		// 5. lowerKey() : �Է� �޴� Ű���� �ٷ� �� �ܰ� ���� Ű�� ���
		System.out.println(treeMap.lowerKey(12));
		
		// 6. higherKey() : �Է� ���� Ű���� �ٷ� �� �ܰ� ���� Ű�� ���
		System.out.println(treeMap.higherKey(12));
		
		// 7. pollFirstEntry() : ù��° Ű�� ���� ������(��� �� ��Ͽ��� ����)
		System.out.println(treeMap.pollFirstEntry());
		System.out.println(treeMap);
		
		// 8. pollLastEntry() : ������ Ű�� ���� ������(��� �� ��Ͽ��� ����)
		System.out.println(treeMap.pollLastEntry());
		System.out.println(treeMap);
		
		// 9. SortedMap<K, V> headMap(K toKey) : ��ǲ ���� Key�� head ������ ������ ���
		SortedMap<Integer, String> sMap = treeMap.headMap(8);	// key 8�� �������� �ʰ� Head ������ ������ ���
		System.out.println(sMap);
		
		// 10. NavigableMap<K, V> headMap(K toKey, boolean inclusive)
		NavigableMap<Integer, String> nMap = treeMap.headMap(8, true);		// key 8�� �����ϸ鼭 Head ������ ������ ���
		// NavigableMap<Integer, String> nMap = treeMap.headMap(8, false);		// key 8�� �������Ͽ� Head ������ ������ ���
		System.out.println(nMap);
		
		// 11. SortedMap<K, V> tailMap(K toKey) : ��ǲ ���� Key�� tail ������ ������ ���
		SortedMap<Integer, String> sMap2 = treeMap.tailMap(8);	// key 8�� �����Ͽ� tail ������ ������ ���
		System.out.println(sMap2);
		
		// 12. Navigable<K, V> tailMap(K toKey, boolean inclusive)
		NavigableMap<Integer, String> nMap2 = treeMap.tailMap(8, true);		// key 8�� �����ϸ鼭 tail ������ ������ ���
		// NavigableMap<Integer, String> nMap2 = treeMap.tailMap(8, false);		// key 8�� �������Ͽ� tail ������ ������ ���
		System.out.println(nMap2);
		
		// 13. SortedMap<K, V> subMap(K fromKey, K toKey) : Ư�� ������ ���� ����
		SortedMap<Integer, String> subMap = treeMap.subMap(6,10);	// ���۰��� ����, ������ �������� �⺻
		System.out.println(subMap);
		
		// 14. NavigableMap<K, V> subMap(K fromKey, boolean inclusive, K toKey, boolean inclusive)
		NavigableMap<Integer, String> nSubMap = treeMap.subMap(6, true, 10, true);
		System.out.println(nSubMap);
		
		// 15. NavigableSet<K> descendingKeySet() : ���� Key�� ������ �ݴ�� ���
		NavigableSet<Integer> nSet = treeMap.descendingKeySet();
		System.out.println(nSet);
		System.out.println(nSet.descendingSet());
		
		// 16. NavigableMap<K, V> descendingMap() : ���� ������ �ݴ�� ����
		NavigableMap<Integer, String> nvMap = treeMap.descendingMap();
		System.out.println(nvMap);
		System.out.println(nvMap.descendingMap());
	}
}
