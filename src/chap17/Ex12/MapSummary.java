package chap17.Ex12;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

/*
 * Map<K, V> 정리 => K는 중복될 수 없음
 * 	1. HashMap : 랜덤하게 입출력됨. method가 동기화가 안됨. 싱글스레드 환경에 적합
 * 	2. HashTable : 모든 method가 동기화되어 있음. 멀티스레드 환경에 적합
 * 	3. LinkedHashMap : 입력 순서대로 출력
 * 	4. TreeMap : 오름차순 정렬되어 입력 및 출력. Comparable<E>, Comparator<E> 재정의 필요
 */

public class MapSummary {

	public static void main(String[] args) {
		// 1. HashMap : 입력 순서와 출력 순서가 다름
		Map<String, Integer> hashMap = new HashMap<String, Integer>();
		
		hashMap.put("다", 30);
		hashMap.put("가", 40);
		hashMap.put("마", 50);
		hashMap.put("라", 60);
		
		System.out.println(hashMap);
		
		// 2. HashTable : 입력순서와 출력순서와 다름 <동기화 되어있음><멀티스레드 환경에 적합>
		Map<String, Integer> hashTable = new Hashtable<String, Integer>();
		
		hashTable.put("다", 30);
		hashTable.put("가", 40);
		hashTable.put("마", 50);
		hashTable.put("라", 60);
		
		System.out.println(hashTable);
		
		// 3. LinkedHashMap : 입력순서와 출력순서가 같다
		Map<String, Integer> linkedHashMap = new LinkedHashMap<String, Integer>();
		
		linkedHashMap.put("다", 30);
		linkedHashMap.put("가", 40);
		linkedHashMap.put("마", 50);
		linkedHashMap.put("라", 60);
		
		System.out.println(linkedHashMap);
		
		// 4. TreeMap : 오름차순으로 정렬되어 저장(Map<K, V> : Key를 기준으로 오름차순 정렬)
		TreeMap<String, Integer> TreeMap = new TreeMap<String, Integer>();
		
		TreeMap.put("다", 30);
		TreeMap.put("가", 40);
		TreeMap.put("마", 50);
		TreeMap.put("라", 60);
		
		System.out.println(TreeMap);
	}

}
