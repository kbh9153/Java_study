package chap17.Ex12;

import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.SortedMap;
import java.util.TreeMap;

/*
 * TreeMap<K, V> : 저장시에 Key를 기준으로 정렬되어 저장(오름차순)
 * 	- 출력시에 오름차순으로 정렬되어 출력
 * 	- Key에 일반 객체를 저장할 때 Comparable<E> compareTo()를 재정의 => 객체 수정 및 재컴파일
 * 						   Comparator<E> compare()를 재정의함 => 객체 수정없이 사용
 * Map<K, V> > SortedMap<K, V>(정렬 method 정의) > NavigableMap<K, V>(검색 method 정의) > TreeMap<K, V>
 * 	- TreeMap을 사용할 때는 Type을 꼭 TreeMap으로 지정하여야 정렬 및 검색 기능 사용 가능
 */

public class TreeMapMethod01 {
	public static void main(String[] args) {
		// TreeMap<K, V>은 Map<K, V> method를 모두 사용. 추가적으로 SortedMap, NavigableMap의 추가적은 method를 사용
		TreeMap<Integer, String> treeMap = new TreeMap<Integer, String>();	// 오름차순으로 정렬되어 입력됨
		
		for (int i = 20; i > 0; i -= 2) {
			treeMap.put(i, i + "번째");
		}
		System.out.println(treeMap);	// Key, Value : Key를 기준으로 오름차순 정렬됨
		
		// 1. firstKey() : 제일 첫번째 값을 출력
		System.out.println(treeMap.firstKey());		// 2
		
		// 2. firstEntry() : 제일 첫번째 entry(Key + Value) 출력
		System.out.println(treeMap.firstEntry());
		
		// 3. lastKey() : 제일 마지막 값을 출력
		System.out.println(treeMap.lastKey());
		
		// 4. lastKey() : 제일 마지막 entry(Key + Value) 출력
		System.out.println(treeMap.lastEntry());
		
		// 5. lowerKey() : 입력 받는 키보다 바로 한 단계 낮은 키값 출력
		System.out.println(treeMap.lowerKey(12));
		
		// 6. higherKey() : 입력 받은 키보다 바로 한 단계 높은 키값 출력
		System.out.println(treeMap.higherKey(12));
		
		// 7. pollFirstEntry() : 첫번째 키와 값을 가져옴(출력 후 목록에서 삭제)
		System.out.println(treeMap.pollFirstEntry());
		System.out.println(treeMap);
		
		// 8. pollLastEntry() : 마지막 키와 값을 가져옴(출력 후 목록에서 삭제)
		System.out.println(treeMap.pollLastEntry());
		System.out.println(treeMap);
		
		// 9. SortedMap<K, V> headMap(K toKey) : 인풋 받은 Key의 head 방향의 값들을 출력
		SortedMap<Integer, String> sMap = treeMap.headMap(8);	// key 8을 포함하지 않고 Head 방향의 값들을 출력
		System.out.println(sMap);
		
		// 10. NavigableMap<K, V> headMap(K toKey, boolean inclusive)
		NavigableMap<Integer, String> nMap = treeMap.headMap(8, true);		// key 8을 포함하면서 Head 방향의 값들을 출력
		// NavigableMap<Integer, String> nMap = treeMap.headMap(8, false);		// key 8은 미포함하여 Head 방향의 값들을 출력
		System.out.println(nMap);
		
		// 11. SortedMap<K, V> tailMap(K toKey) : 인풋 받은 Key의 tail 방향의 값들을 출력
		SortedMap<Integer, String> sMap2 = treeMap.tailMap(8);	// key 8을 포함하여 tail 방향의 값들을 출력
		System.out.println(sMap2);
		
		// 12. Navigable<K, V> tailMap(K toKey, boolean inclusive)
		NavigableMap<Integer, String> nMap2 = treeMap.tailMap(8, true);		// key 8을 포함하면서 tail 방향의 값들을 출력
		// NavigableMap<Integer, String> nMap2 = treeMap.tailMap(8, false);		// key 8은 미포함하여 tail 방향의 값들을 출력
		System.out.println(nMap2);
		
		// 13. SortedMap<K, V> subMap(K fromKey, K toKey) : 특정 범위의 값을 저장
		SortedMap<Integer, String> subMap = treeMap.subMap(6,10);	// 시작값은 포함, 끝값은 미포함이 기본
		System.out.println(subMap);
		
		// 14. NavigableMap<K, V> subMap(K fromKey, boolean inclusive, K toKey, boolean inclusive)
		NavigableMap<Integer, String> nSubMap = treeMap.subMap(6, true, 10, true);
		System.out.println(nSubMap);
		
		// 15. NavigableSet<K> descendingKeySet() : 현재 Key의 정렬을 반대로 출력
		NavigableSet<Integer> nSet = treeMap.descendingKeySet();
		System.out.println(nSet);
		System.out.println(nSet.descendingSet());
		
		// 16. NavigableMap<K, V> descendingMap() : 현재 정렬을 반대로 정렬
		NavigableMap<Integer, String> nvMap = treeMap.descendingMap();
		System.out.println(nvMap);
		System.out.println(nvMap.descendingMap());
	}
}
