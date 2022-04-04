package chap17.Ex07;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/*
 * LinkedHashSet : 값의 정보에 내 앞의 값 위치 정보와 내 뒤의 값 위치 정보를 가지고 있음
 * 	- HashSet과 공통점 : 모든 method가 동일함. 중복된 값을 저장하지 않음. index(방 번호)값을 가지지 않음
 * 		=> index 번호가 없기 때문에 기본 for문으로 출력 불가능. iterator 또는 Enhanced for문을 사용하여 출력해야함
 * 	- HashSet과 차이점 : HashSet은 입력 순으로 출력되지 않음. LinkedHashSet은 입력 순으로 출력됨
 */

public class LinkedHashSetMethod {

	public static void main(String[] args) {
		Set<String> linkedSet1 = new LinkedHashSet<String>();		// Set은 Interface 이므로 타입으로만 지정
			// Set의 Generic 타입변수로 wrapper class를 사용할 경우, equals(), hashCode() method가 재정의 
		
		// 1. add(E element) : Set에 값을 추가
		linkedSet1.add("가");
		linkedSet1.add("나");
		linkedSet1.add("다");
		
		System.out.println(linkedSet1);		// [나, 다, 가] => 입력과 출력이 동일함
		System.out.println(linkedSet1.toString());		// toString method가 재정의되어 있음
		
		System.out.println("------------------------------");
		
		// 2. addAll(다른 set 객체) : 자신의 Set에 다른 Set에 저장된 값을 추가 => 중복된 값을 제거함
		Set<String> linkedSet2 = new LinkedHashSet();
		linkedSet2.add("나");
		linkedSet2.add("다");
		linkedSet2.addAll(linkedSet1);
		
		System.out.println(linkedSet2);
		
		// 3. remove(Object o) : 특정 값으로 삭제 => List의 경우 index(방) 번호로 삭제
		linkedSet2.remove("나");
		System.out.println(linkedSet2);
		
		// 4. clear() : 모두 삭제
		linkedSet2.clear();
		System.out.println(linkedSet2);
		
		// 5. isEmpty() : 비어있으면 true, 비어있이잖으면 false
		System.out.println(linkedSet2.isEmpty());
		
		// 6. contains(Object o) : 값이 Set에 존재하면 true, 존재하지 않으면 false
		Set<String> linkedSet3 = new LinkedHashSet<String>();
		linkedSet3.add("가");
		linkedSet3.add("나");
		linkedSet3.add("다");
		
		System.out.println(linkedSet3);
		System.out.println(linkedSet3.contains("나"));
		
		// 7. size() : Set에 포함된 값의 개수
		System.out.println(linkedSet3.size());
		
		System.out.println("-----<< iterator()를 사용한 출력 >>-----");
		
		/*
		 * 8. iterator() : Set은 index를 가지지 않음. for 문은 방번호로 값을 출력하기 때문에 사용불가. enhanced for 문은 사용 가능
		 * 	- 순회자. Set들의 값들을 순회하면서 출력
		 * 	1. hasNext() : Set의 값이 존재하면 true, 존재하지 않으면 false
		 * 	2. next() : 현재 값을 출력하고 다음 값으로 이동
		 */
		Iterator<String> iterator = linkedSet3.iterator();
		// 구문 : class<E> 참조객체 = Set객체.iterator(): 
		while(iterator.hasNext()) {
			System.out.print(iterator.next() + " ");
		}
		System.out.println();
		
		System.out.println("-----<< enhanced for 문을 사용한 출력 >>-----");
		
		for (String k : linkedSet3) {
			System.out.print(k + " ");
		}
		System.out.println();
		
		// 9. toArray() : Set들의 값들을 배열로 보냄. Object 타입으로 return, 다운 캐스팅이 필요함
		Object[] objArray = linkedSet3.toArray();
		System.out.println(Arrays.toString(objArray));
		for (int i = 0; i < objArray.length; i++) {
			System.out.print(objArray[i] + " ");
		}
		System.out.println();
		
		System.out.println("-----------------------------");
		
		for (Object k : objArray) {		// 다운 캐스팅이 필요함
			System.out.print(k + " ");
		}
		System.out.println();
		
		// 10. toArray(T[] t)		// 바로 다운캐스팅이 한 후 출력 가능
		String[] strArray1 = linkedSet3.toArray(new String[0]);		// 0 : 방의 크기를 지정 => 방의 크기가 실제값보다 작을 경우 컴파일러가 방의 크기만큼 지정
		
		System.out.println(Arrays.toString(strArray1));
		
		// 11. 실제 Set의 값보다 방의 크기를 크게 했을 경우는 Null이 들어갈 수 있음
		String[] strArray2 = linkedSet3.toArray(new String[5]);
		System.out.println(Arrays.toString(strArray2));
		
		
		// 12. iterator 출력, Enhanced for 문을 사용해서 출력 
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
