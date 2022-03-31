package chap17.Ex01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class CreateListObject {

	public static void main(String[] args) {
		// 1. List 구현 class의 생성자를 사용하여 객체 생성
		// List는 interface이므로 new 키 뒤에 올 수 없음. ArrayList, Vector, LinkedLIst
		// capacity : 메모리 방 크기를 할당, 기본값은 10
		// *** size() : 방에 저장된 값의 개수 ***
		
		List<Integer> aList1 = new ArrayList<Integer>();		// capacity = 0
		List<Integer> aList2 = new ArrayList<Integer>(30);		// capacity = 30, 메모리 공간 확보
		
		List<Integer> aList3 = new Vector();
		List<Integer> aList4 = new Vector(30);
		
		List<Integer> aList5 = new LinkedList();
		// List<Integer> aList6 = new LinkedList(30);		// LinkedList는 저장 공간 할당이 불가능
		
		// 2. Arrays class의 정적 method 이용하는 방법 : 데이터 크기를 바꿀 수 없음
			// => 요일, 계정, 하루 24시간 -> 이처럼 고정된 값을 저장할 때 사용
		
		List<Integer> aList7 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		List<String> aList8 = Arrays.asList("월", "화", "수", "목", "금", "토", "일");
		aList7.set(1, 12);		// set() : 기존의 있는 값을 수정할 때. index 1의 값을 12로 수정
		// aList7.add(5);		// asList()는 고정된 값이기 때문에 값 추가가 불가능. add() : 마지막에서 값을 더 추가할 때 사용
		
		System.out.println(aList7);
		
		aList8.set(0, "누구쎄용?");
		// aList8.add("일");
		
		System.out.println(aList8);
	}

}
