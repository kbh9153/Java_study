package chap17.Ex08;

import java.util.NavigableSet;
import java.util.SortedSet;
import java.util.TreeSet;

/*
 * TreeSet : 출력시 정렬되어서 출력(오름차순 정렬 => ascending) ex. 1 ~> 9, a ~> z, 가 ~> 하
 * 	- 출력시 검색 method(검색기능) 지원
 * 	- 임의의 값을 넣으면 Set에 정렬되어서 저장. 출려깃에 오름차순으로 정렬되어서 출력
 * 	- Set > SortedSet(정렬 method) > NavigableSet(검색 method) > TreeSet
 * 	- TreeSet<String> treeSet = new TreeSet<String>(); : 타입을 TreeSet으로 지정해야 정렬과 검색기능을 사용 가능
 * 	- Set interface의 모든 method 사용. 추가적으로 정렬 method와 검색 method를 사용가능
 */


public class TreeSetMethod {

	public static void main(String[] args) {
		// TreeSet은 Set의 모든 method 사용
		// TreeSet에 값을 넣었을 경우 오름차순 정렬되어 값이 Set에 저장. 출력시 오름차순 정렬로 출력
		TreeSet<Integer> treeSet = new TreeSet<Integer>();		// Type을 TreeSet으로 지정해야 정렬(Sort)과 검색을 사용가능
		for (int i = 50; i > 0; i -= 2) {		// 50, 48, 46, 44, 42 ··· 2씩 감소
			treeSet.add(i);		// 내부적으로 임의의 값을 넣을 때 오름차순으로 정렬되어 값이 저장
		}
		System.out.println(treeSet);
		
		// TreeSet에서만 사용 가능한 method (1. ~ 15.)
		
		System.out.println("-----<< 데이터 검색(가져오기) >>-----");
		
		// 1. first() : 제일 처음 값을 return
		System.out.println(treeSet.first());	// 2
		
		// 2. last() : 제일 마지막 값을 return
		System.out.println(treeSet.last());		// 50
		
		// 3. lower(E element) : 지정한 element(List 값)보다 작은 값 하나
		System.out.println(treeSet.lower(26));		// 24
		
		// 4. higher(E element) : 지정한 element(List 값)보다 큰 값 하나
		System.out.println(treeSet.higher(26));		// 28
		
		// 5. floor(E element) : 지정한 element(List 값)랑 같거나 작은 값 중 가장 가까운 값 
		System.out.println(treeSet.floor(27));		// 26
		System.out.println(treeSet.floor(25));		// 24
		
		// 6. ceiling(E element) : 지정한 element(List 값)랑 같거나 큰 값 중 가장 가까운 값
		System.out.println(treeSet.ceiling(27));	// 28
		System.out.println(treeSet.ceiling(25));	// 26
		
		System.out.println("-----<< 데이터 꺼내기 >>-----");
		// 7. pollFirst() : 첫번째 값을 꺼내기 (꺼낸 값은 List에서 삭제)
		int treeSetSize = treeSet.size();		// 값의 개수
		System.out.println(treeSetSize);
		System.out.println("--------------------------");
		
		for (int i = 0; i < treeSetSize; i++) {
			System.out.println(treeSet.pollFirst());		// 25번 루프돌면서 첫번째 값만 꺼내와서 출력
		}
		System.out.println();
		System.out.println(treeSet.size());		// 0
		
		// 8. pollLast() : 마지막 값을 꺼내기 (꺼낸 값은 List에서 삭제)
		for (int i = 50; i > 0; i -= 2) {
			treeSet.add(i);		// 오름차순으로 정렬되어서 저장
		}
		treeSetSize = treeSet.size();
		System.out.println(treeSetSize);
		System.out.println(treeSet);
		
		for (int i = 0; i < treeSetSize; i++) {
			System.out.println(treeSet.pollLast());
		}
		System.out.println();
		System.out.println(treeSet.size());		// 0
		
		System.out.println("-----------<< 정렬 기능 >>----------");
		
		// 9. SortedSet<E> headSet(E element)		// 정렬기능 (사용하기 위해서는 SortedSet<E> 객체를 생성해야함)
			// SortedSet<E> : 정렬된 데이터를 저장하는 Set
			// headSet(E element) : element의 Head 쪽으로의 값을 저장 .<element 값은 미포함>
		for (int i = 50; i > 0; i -= 2) {
			treeSet.add(i);		// 오름차순으로 정렬되어서 treeSet에 저장
		}
		System.out.println(treeSet);
		SortedSet<Integer> sSet = treeSet.headSet(20);		// headSet(20)은 SortedSet으로 return 값을 돌려줌. Set 타입도 사용 가능
		// Set<Integer> sSet = treeSet.headSet(20);		// Set 타입도 사용 가능
		System.out.println(sSet);		// 20을 기준으로 미만 값을 출력
		
		// 10. NavigableSet<E> headSet(E element, boolean inclusive)
		NavigableSet<Integer> nSet = treeSet.headSet(20, true);		// true의 경우 element 값을 포함하여 head 쪽으로 출력
		// NavigableSet<Integer> nSet = treeSet.headSet(20, false);		// false의 경우 element 값을 미포함하여 head 쪽으로 출력
		// Set<Integer> nSet = treeSet.headSet(20, false);		// Set 타입도 사용 가능
		System.out.println(nSet);
		
		// 11. SortedSet<E> tailSet(E element) : element의 tail 쪽으로의 값을 저장 .<element 값 포함>
		SortedSet<Integer> sSet2 = treeSet.tailSet(20);
		// Set<Integer> sSet2 = treeSet.tailSet(20);	// Set 타입도 사용 가능
		System.out.println(sSet2);		// 20을 기준으로 20 이상 값을 출력
		
		// 12. NavigableSet<E> tailSet(E element, boolean inclusive)
		NavigableSet<Integer> nSet2 = treeSet.tailSet(20, true);	// true의 경우 element 값을 포함하여 tail 쪽으로 출력
		// NavigableSet<Integer> nSet2 = treeSet.tailSet(20, false);	// true의 경우 element 값을 미포함하여 tail 쪽으로 출력
		// Set<Integer> nSet = treeSet.tailSet(20, false);		// Set 타입도 사용 가능
		System.out.println(nSet2);
		
		System.out.println("-----------------<< 특정 범위의 값 가져오기(subSet) >>-----------------");
		
		// 13. SortedSet<E> subSet(E element, E element) : 특정 범위의 값을 set으로 담을 때 
		SortedSet sSet3 = treeSet.subSet(10, 20);		// 시작값(포함) 마지막값(미포함) 사이의 범위의 값
		System.out.println(sSet3);		// 10 이상 20 미만 사이의 범위의 값
		
		// 14. NavigableSet<E> subSet(E element, boolean inclusive, E element, boolean inclusive)
		NavigableSet<Integer> nSet4 = treeSet.subSet(10, false, 20, true);		// true는 포함, false는 미포함
		// Set<Integer> nSet4 = treeSet.subSet(10, false, 20, true);		// Set 타입도 사용 가능
		System.out.println(nSet4);		// 10 초과 20 이하 값 출력
		
		System.out.println("-----------------<< 반대로 정렬하기(descendingSet) >>-----------------");
		
		// 15. NavigableSet<E> descendingSet() : 현재 정렬을 기준으로 반대로 정렬함 => descending(내림차순 정렬)과는 다름. descendingSet은 현재 정렬의 반대임 
		System.out.println(treeSet);		// 오름차순 정렬
		
		NavigableSet<Integer> descendingSet = treeSet.descendingSet();		// 내림차순 정렬
		// Set<Integer> descendingSet = treeSet.descendingSet();		// Set 타입도 사용 가능
		System.out.println(descendingSet);
		
		NavigableSet<Integer> descendingSet2 = descendingSet.descendingSet();		// 오름차순 정렬
		// Set<Integer> descendingSet2 = treeSet.descendingSet();		// Set 타입도 사용 가능
		System.out.println(descendingSet2);
	}

}
