package chap17.Ex06_HashSet;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* 
 * Set<E> : interface. 방번호(index)가 없음. set에는 중복된 값을 넣을 수 없음
 * 	- HashSet : 중복된 값을 넣을 수 없음. 값을 꺼내면 순서대로 꺼내지지 않음
 * 	- LinkedHashSet : 중복된 값을 넣을 수 없음. 출력시 순서대로 출력 
 * 	- TreeSet : 저장될 떄 값이 정렬이 되어서 저장(ascending 정렬 : 오름 차순 정렬 / descendint 정렬 : 내림 차순 정렬)
 * 		=> ex) 오름차순 : 0 ~> 9, A ~> Z, 가 ~> 하 / 내림차순 : 9 ~> 0, Z ~> A, 하 ~> 가
 */

public class HashSetMethod {

	public static void main(String[] args) {
		Set<String> hSet1 = new HashSet<String>();		// Set은 Interface 이므로 타입으로만 지정
		
		// 1. add(E element) : Set에 값을 추가
		hSet1.add("가");
		hSet1.add("나");
		hSet1.add("다");
		
		System.out.println(hSet1);
		System.out.println(hSet1.toString());		// toString method가 재정의되어 있음
		
		// 2. addAll(다른 set 객체) : 자신의 Set에 다른 Set에 저장된 값을 추가 => 중복된 값을 제거함
		Set<String> hSet2 = new HashSet();
		hSet2.add("나");
		hSet2.add("다");
		hSet2.addAll(hSet1);
		
		System.out.println(hSet2);
		
		// 3. remove(Object o) : 특정 값으로 삭제 => List의 경우 index(방) 번호로 삭제
		hSet2.remove("나");
		System.out.println(hSet2);
		
		// 4. clear() : 모두 삭제
		hSet2.clear();
		System.out.println(hSet2);
		
		// 5. isEmpty() : 비어있으면 true, 비어있이잖으면 false
		System.out.println(hSet2.isEmpty());
		
		// 6. contains(Object o) : 값이 Set에 존재하면 true, 존재하지 않으면 false
		Set<String> hSet3 = new HashSet<String>();
		hSet3.add("가");
		hSet3.add("나");
		hSet3.add("다");
		
		System.out.println(hSet3);
		System.out.println(hSet3.contains("나"));
		
		// 7. size() : Set에 포함된 값의 개수
		System.out.println(hSet3.size());
		
		System.out.println("-----<< iterator()를 사용한 출력 >>-----");
		
		/*
		 * 8. iterator() : Set은 index를 가지지 않음. for 문은 방번호로 값을 출력하기 때문에 사용불가. enhanced for 문은 사용 가능
		 * 	- 순회자. Set들의 값들을 순회하면서 출력
		 * 	1. hasNext() : Set의 값이 존재하면 true, 존재하지 않으면 false
		 * 	2. next() : 현재 값을 출력하고 다음 값으로 이동
		 */
		Iterator<String> iterator = hSet3.iterator();
		// 구문 : class<E> 참조객체 = Set객체.iterator(): 
		while(iterator.hasNext()) {
			System.out.print(iterator.next() + " ");
		}
		System.out.println();
		
		System.out.println("-----<< enhanced for 문을 사용한 출력 >>-----");
		
		for (String k : hSet3) {
			System.out.print(k + " ");
		}
		System.out.println();
		
		// 9. toArray() : Set들의 값들을 배열로 보냄. Object 타입으로 return, 다운 캐스팅이 필요함
		Object[] objArray = hSet3.toArray();
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
		String[] strArray1 = hSet3.toArray(new String[0]);		// 0 : 방의 크기를 지정 => 방의 크기가 실제값보다 작을 경우 컴파일러가 방의 크기만큼 지정
		
		System.out.println(Arrays.toString(strArray1));
		
		// 11. 실제 Set의 값보다 방의 크기를 크게 했을 경우는 Null이 들어갈 수 있음
		String[] strArray2 = hSet3.toArray(new String[5]);
		System.out.println(Arrays.toString(strArray2));
		
		
		// 12. iterator 출력, Enhanced for 문을 사용해서 출력 
		Set<Integer> intSet1 = new HashSet();
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
