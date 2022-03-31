package chap17.Ex04;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/*
 * ArrayList vs LinkedList
 * 
 * ArrayList : 값에 대해서 index 값을 가지고 있음. 검색 속도가 빠름
 * 	- 장점 : 검색 시 부하가 걸리지 않음 -> 속도가 빠름
 * 	- 단점 : 중간에서 값을 추가/삭제 시 부하가 굉장히 많이 걸림 -> 속도가 느림
 * LinkedList : 각각의 값은 앞뒤의 연결고리만 가지고 있음. 검색시 각 데이터별 index가 부여됨
 * 	- 장점 : 중간에 값을 추가/삭제 시 부하가 걸리지 않음 -> 속도가 빠름
 * 	- 단점 : 검색이 ArrayList에 비해 상대적으로 느림
 */

public class ArrayListVSLinkedList {

	public static void main(String[] args) {
		// 1. 데이터 추가시간 비교
		
		List<Integer> aList = new ArrayList<Integer>();
		List<Integer> linkedList = new LinkedList<Integer>();
		
		long startTime = 0,
		endTime = 0;
		
		// 1-1. ArrayList에서 데이터 추가시간
		startTime = System.nanoTime();		// System.nanoTime() : static method
		
		for (int i = 0; i < 100000; i++) {
			aList.add(0, i);		// 0번째 방에 계속해서 10만번째까지 계속 뒤로 밀리면서 값이 추가
		}
		endTime = System.nanoTime();
		System.out.println("ArrayList에서 데이터 추가 시간 : " + (endTime - startTime) + "ns");
		
		// 1-2. LinkedList에서 데이터 추가 시간
		startTime = System.nanoTime();
		for (int i = 0; i < 100000; i++) {
			linkedList.add(0, i);
		}
		endTime = System.nanoTime();
		System.out.println("LinkedList에서 데이터 추가 시간 : " + (endTime - startTime) + "ns");
		
		System.out.println("--------------------------------------");
		
		// 2-1. ArrayList에서 검색 시간
		startTime = System.nanoTime();
		for (int i = 0; i < 100000; i++) {
			aList.get(i);
		}
		endTime = System.nanoTime()	;
		System.out.println("ArrayList에서 데이터 검색 시간 : " + (endTime - startTime) + "ns");
		
		// 2-2. LinkedList에서 검색 시간
		startTime = System.nanoTime();
		for (int i = 0; i < 100000; i++) {
			linkedList.get(i);
		}
		endTime = System.nanoTime()	;
		System.out.println("LinkedList에서 데이터 검색 시간 : " + (endTime - startTime) + "ns");
		
		System.out.println("--------------------------------------");
		
		// 3-1. ArrayList에서 데이터 삭제 시간
		startTime = System.nanoTime();
		for (int i = 0; i < 100000; i++) {
			aList.remove(0);
		}
		endTime = System.nanoTime()	;
		System.out.println("ArrayList에서 데이터 삭제 시간 : " + (endTime - startTime) + "ns");
		

		// 3-2. LinkedList에서 데이터 삭제 시간
		startTime = System.nanoTime();
		for (int i = 0; i < 100000; i++) {
			linkedList.remove(0);
		}
		endTime = System.nanoTime()	;
		System.out.println("LinkedList에서 데이터 삭제 시간 : " + (endTime - startTime) + "ns");
	}

}
