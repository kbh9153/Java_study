package chap17.Ex01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// java.lang package의 class들은 import가 필요하지 않음

/*
 * 컬렉션 : 동일한 자료형을 저장. 방의 크기가 동적으로 변화함
 * 배열 : 동일한 자료형을 저장. 방의 크기가 고정되어있음 => 배열 생성시 방의 크기를 지정. 방의 크기는 수정 불가
 * 
 * List<E> : Interface, Generic Interface => 다양한 데이터 타입을 사용 가능
 * 	- Index(방 번호)를 가지고 있음. 방의 크기는 동적으로 변화함
 * 
 * 	<< List<E>의 class 종류 >>
 * 	1. ArrayList<E> : 싱글 스레드 환경에서 사용. 검색은 빠르나 값을 추가하거나 삭제할 때 느림
 * 	2. Vector<E> : 멀티 스레드 환경에서 사용. 모든 메소드가 동기화 되어있다
 * 	3. LinkedList<E> : 검색은 느리나 값을 추가하거나 삭제할 때 빠름
 */

public class ArrayList01 {

	public static void main(String[] args) {
		// 1. 배열
		String[] array = new String[] {"ㄱ", "ㄴ", "ㄷ", "ㄹ", "ㅁ", "븅", "신"};
		System.out.println(array.length);		// 배열 방의 크기
		array[2] = null;
		array[4] = null;
		System.out.println(array.length);
		
		// 1. Arrays.toString(배열변수)
		System.out.println(Arrays.toString(array));		// Arrays.toString(배열변수명)
		
		// 2. for문을 사용해서 출력
		for (int i = 0; i < array.length; i++) {
			if (i == array.length - 1) {
				System.out.println(array[i]);
			} else {
				System.out.print(array[i] + ", ");
			}
		}
		
		// 3. Enhanced For 문을 사용해서 출력
		for (String k : array) {
			System.out.print(k + " ");
		}
		
		System.out.println();
		
		// 1. List : Interface, 객체 생성을 할 수 없음. 타입은 지정 가능
		List<String> aList = new ArrayList<String>();
		List<String> aList2 = new ArrayList<>();
		List<String> aList3 = new ArrayList();
		
		// List에서 방의 개수 출력 : aList.size(); => 배열은 length()
		System.out.println(aList.size());
		
		// List에서 값 할당하기 : aList.add("값 할당") => 제일 마지막에 값을 추가함
		aList.add("ㄱ");
		aList.add("ㄴ");
		aList.add("ㄷ");
		aList.add("ㄹ");
		aList.add("ㅁ");
		aList.add("ㅂ");
		aList.add("ㅅ");
		
		System.out.println(aList);
		System.out.println(aList.size());
		
		// List에서 값 제거하기 : aList.remove("제거할 내용")
		aList.remove("ㄴ");
		aList.remove("ㄹ");
		
		System.out.println(aList);
		System.out.println(aList.size());
		
		// List는 index를 가지고 있음
		for (int i = 0; i < aList.size(); i++) {
			System.out.print(aList.get(i) + ", ");
		}
		
		System.out.println();
		
		// 2. Enhanced For 문을 사용해서 출력
		for (String k : aList) {
			System.out.print(k + " ");
		}
		
		System.out.println();
		
		// 3. 객체의 toString()을 호출해서 출력
		System.out.println(aList);		// List는 toString method가 재정의 되어있음
	}

}
