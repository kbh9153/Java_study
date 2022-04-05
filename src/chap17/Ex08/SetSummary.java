package chap17.Ex08;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

/*
 * Set : 중복되지 않는 값을 저장 (equals(), hashCode() method를 재정의), Wrapper class는 모두 재정의
 * 	1. HashSet : 출력되는 것이 랜덤하게 출력
 * 	2. LinkedHashSet : 입력되는 대로 출력
 * 	3. TreeSet : 입력값을 넣으면 내부적으로 정렬. 오름차순으로 정렬되어 출력
 */

public class SetSummary {

	public static void main(String[] args) {
		// 1. HashSet
		Set<String> hashSet = new HashSet<String>();
		hashSet.add("다");
		hashSet.add("마");
		hashSet.add("가");
		hashSet.add("라");
		
		System.out.println(hashSet);
		
		// 2. LinkedHashSet
		Set<String> linkedHashSet = new LinkedHashSet<String>();
		linkedHashSet.add("다");
		linkedHashSet.add("마");
		linkedHashSet.add("가");
		linkedHashSet.add("라");

		System.out.println(linkedHashSet);
		
		// 3. TreeSet => 정렬하기 위해서 Comparable<E>, Comparator<E>
		TreeSet<String> treeSet = new TreeSet<String>();
		treeSet.add("다");
		treeSet.add("마");
		treeSet.add("가");
		treeSet.add("라");
		
		System.out.println(treeSet);
		
	}

}
