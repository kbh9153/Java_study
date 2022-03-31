package chap17.Ex01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * List의 method : 13개 정도의 method
 * 	1. ArrayList
 * 	2. Vector
 * 	3. LinkedList
 */

public class ArrayListMethod01 {

	public static void main(String[] args) {
		List<Integer> aList1 = new ArrayList<Integer>();
		
		// 1. add(E element) : 마지막 index 이후에 값 추가하기
		aList1.add(3);
		aList1.add(6);
		aList1.add(9);
		
		System.out.println(aList1);		// 값출력
		System.out.println(aList1.size());		// 값의 개수
		
		System.out.println("---------------");
		
		// 2. add(int index, E element)
		aList1.add(1, 6);		// index 번호 1번에 6을 추가하고 기존 값들은 다음 index로 밀려남
		System.out.println(aList1);
		
		System.out.println("---------------");

		// 3. addAll : 또 다른 list의 객체를 복사해서 추가
		List<Integer> aList2 = new ArrayList<Integer>();
		aList2.add(1);
		aList2.add(2);
		
		aList2.addAll(aList1);		// aList1에 저장된 값을 복사해서 aList2에 추가
		
		System.out.println(aList2);		// 기존 있던 값들 다음으로 복사한 aList1 값을 추가
		
		System.out.println("---------------");
		
		// 4. addAll(int index, 또 다른 객체)
		List<Integer> aList3 = new ArrayList<Integer>();
		aList3.add(1);
		aList3.add(2);
		
		aList3.addAll(1, aList3);		// 자신의 값에 다른 객체를 추가(각각의 기존 index 다음에 복사한 객체의 값들을 순차적으로 추가) 
		System.out.println(aList3);
		
		System.out.println("---------------");
		
		// 5. set(int Index, E element) : 특정 방 번호의 값을 수정
		aList3.set(1, 5);
		aList3.set(3, 6);
		// aList3.set(4, 7);		// 오류 발생, IndexOutOfBoundsException
		
		System.out.println(aList3);
		
		System.out.println("---------------");
		
		// 6. remove(int index) : 특정 방번호의 값을 삭제
		aList3.remove(1);		// 방번호 1번 방에 있는 값을 삭제
		System.out.println(aList3);
		
		System.out.println("---------------");
		
		// 7. remove(Object o) : 값을 삭제
		aList3.remove(new Integer(6));		// 값으로 삭제할 수 있음. Integer에 표시된 선은 오류표시가 아니라 추후 이 구문이 삭제되거나 변경될 수 있음을 알림
		System.out.println(aList3);
		
		System.out.println("---------------");
		
		// 8. clear() : 모두 삭제
		aList3.clear();
		System.out.println(aList3);
		
		System.out.println("---------------");
		
		// 9. isEmpty() : 값이 비어 있으면 True, 비어있지 않으면 False
		System.out.println(aList3.isEmpty());
		
		System.out.println("---------------");
		
		// 10. size() : 방의 개수, 값의 개수
		System.out.println(aList3.size());
		aList3.add(1);
		aList3.add(2);
		aList3.add(3);
		System.out.println(aList3);
		System.out.println(aList3.size());
		
		System.out.println("---------------");
		
		// 11. get(int index) : 방 번호의 값을 출력
		System.out.println(aList3.get(0));
		System.out.println(aList3.get(1));
		System.out.println(aList3.get(2));
		
		System.out.println(aList3);		// List일 때 객체를 출력하면 객체의 값을 출력
		
		System.out.println("---------------");
		
		// 12. toArray() : List -> Array. List를 배열로 변환
		Object[] object = aList3.toArray();		// 기본적으로 toArray() method는 Object 타입으로 return이 됨 => 다운 캐스팅이 필요
		System.out.println(Arrays.toString(object));		// 배열로 변환된 상태. 배열일 때는 Arrays.toString() 사용
		
		System.out.println("---------------");
		
		// 13-1 toArray(T[] t) => t[] : Integer로 바로 캐스팅
		Integer[] integer1 = aList3.toArray(new Integer[0]);	
		// (new Integerp[0] => [0] : 방의 크기. * 0 -> 실제 값의 개수(현재 3)보다 방의 크기를 작게 설정하면 실제 값의 개수(현재 3)만큼 출력
		System.out.println(Arrays.toString(integer1));
		
		// 13-2 toArray(T[] t) => t[] : Integer로 바로 캐스팅
		Integer[] integer2 = aList3.toArray(new Integer[5]);
		System.out.println(Arrays.toString(integer2));
		
	}

}
