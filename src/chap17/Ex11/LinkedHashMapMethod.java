package chap17.Ex11;

/*
 * Map<K, V> : Key는 중복되지 않음 => Set으로 관리(중복값 불가능)
 * HashMap vs LinkedHashMap
 * 	- HashMap<K, V> : 입력과 출력이 다를 수 있음. 출력이 랜덤하게 출력
 * 	- LinkedHashMap<K, V> : Key는 링크되어 있음(앞의 값과 뒤의 값의 정보를 가짐)
 * 		=> 입력 순서대로 출력이 됨 
 */

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class LinkedHashMapMethod {
	public static void main(String[] args) {
		Map<Integer, String> lhMap1 = new LinkedHashMap<Integer, String>();
		
		// 1. put(K key, V value) : 값을 넣을 때
		lhMap1.put(2, "나다라");
		lhMap1.put(1, "가나다");
		lhMap1.put(3, "다라마");
		lhMap1.put(3, "가가가");	// Key는 중복해서 저장될 수 없음. 값을 넣으면 최신 값이 기존 값을 덮어버림
		
		System.out.println(lhMap1);
		
		// 2. putAll(다른 맵 객체) : 다른 맵을 복사해서 사용
		Map<Integer, String> lhMap2 = new LinkedHashMap<Integer, String>();
		lhMap2.putAll(lhMap1);
		
		System.out.println(lhMap2);
		
		// 3. replace(K Key, V Value); key에 저장된 값을 value로 수정
		lhMap2.replace(1, "가가가");
		lhMap2.replace(4, "라라라");	// key 4는 존재하지 않음. 작동이 안됨
		
		// 4. replace(K key, V oldvalue, V newvalue) : oldvalue를 newvalue로 수정
		lhMap2.replace(1, "가가가", "나나나");
		lhMap2.replace(2, "마다나", "라라라");		// 동작안됨... key와 value가 정확히 일치해야 수정됨
		
		System.out.println(lhMap2);
		
		// 5. get(Object key) : Map의 값을 가져올 때. key를 넣어줘야 key에 할당된 value를 출력
		System.out.println(lhMap2.get(1));	// 주의. 1은 index가 아님. key임
		System.out.println(lhMap2.get(1));
		System.out.println(lhMap2.get(1));
		
		// 6. containsKey(Object key) : 맵에 해당 키가 존재하는지 확인 => true, false
		System.out.println(lhMap2.containsKey(1));	// true
		System.out.println(lhMap2.containsKey(5));	// false
		
		// 7. containsValue(Object value) : 맵에 해당 값이 존재하는지 확인 => true, false
		System.out.println(lhMap2.containsValue("나나나"));	// true
		System.out.println(lhMap2.containsValue("하하하"));	// false
		
		// 8. Set<K> keySet() : key만 추출
		Set<Integer> keySet = lhMap2.keySet();	// lhMap2의 저장된 keySet을 추출
		System.out.println(keySet);
		
		// 9. Set<Map.Entry<K, V>> entrySet() : key와 value의 Set을 추출
		Set<Map.Entry<Integer, String>> entrySet = lhMap2.entrySet();
		System.out.println(entrySet);
		
		// 10. size() : 총 개수
		System.out.println(lhMap2.size());	// 3
		
		// 11. remove(Object key) :	해당 key를 이용하여 key와 value를 삭제
		lhMap2.remove(1);		// 1번 삭제
		lhMap2.remove(4);		// 없는 key. 동작하지 않음
		System.out.println(lhMap2);
		
		// 12. remove(Object key, Object value) : 해당 key와 value가 정확히 일치할 때 key, value 삭제
		lhMap2.remove(2, "나다라");		// 삭제
		lhMap2.remove(3, "가다다");		// 동작 안함. key와 value 둘다 정확히 일치하지 않음
		System.out.println(lhMap2);
		
		// 13. clear()
		lhMap2.clear();
		System.out.println(lhMap2);
	}
}
