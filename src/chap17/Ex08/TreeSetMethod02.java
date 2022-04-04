package chap17.Ex08;

import java.util.TreeSet;

/*
 * TreeSet의 이점
 * 	1. 값이 중복 저장되지 않음
 * 	2. 오름차순 정렬되어 입력
 * 	3. 오름차순 정렬되어 출력
 * 	4. 검색기능 사용 가능
 * 	5. 특정 범위의 값을 추출
 * 	6. asc(오름차순 정렬), desc(내림차순 정렬)
 * 
 * TreeSet에 일반 객체를 저장할 경우, 특정 필드를 크기 비교 기준 필드가 존재해야함
 * 	1. Comparable<E> interface의 compareTo() method : TreeSet에 일반 객체를 저장할 때 일반 객체의 특정 필드를 Comparable를 재정의 해야함
 * 	2. Comparable<E> interface의 compareTo() method 재정의함
 * 	3. 익명 내부 객체를 사용해서 처리하는 방법 
 */

class MyClass {		// CompareTo() 재정의되지 않아 TreeSet에 사용 불가
	int data1;
	int data2;
	
	public MyClass(int data1, int data2) {
		this.data1 = data1;
		this.data2 = data2;
	}
	
}

// Comparable<E> interface를 구현한 class 생성
class MyComparableClass implements Comparable<MyComparableClass> {		// 
	int data1;		// 이 필드를 비교 기준으로 설정. compareTo() 재정의
	int data2;
	
	public MyComparableClass(int data1, int data2) {
		this.data1 = data1;
		this.data2 = data2;
	}
	
	@Override
	public int compareTo(MyComparableClass o) {		// compareTo 재정의. 객체의 크기 비교 기준을 설정하는 method => TreeSet에서 사용 (음수, 0, 양수)
													// 오름차순 처리 방식
		if (this.data1 < o.data1) {		// this.data1 기준 값이 작을 경우 : -1 (음수)
			return -1;
		} else if (this.data1 == o.data1) {		// this.data1 기준 값이 작을 경우 : -1 (음수)
			return 0;
		} else {		// this.data1 기준 값이 작을 경우 : +1 (양수)
			return 1;
		}
		
	}
	
	@Override
	public String toString() {
		return data1 + " " + data2;
	}
	
}

public class TreeSetMethod02 {

	public static void main(String[] args) {
		// wrapper class는 comparable<E>에 interface의 compareTO() method를 이미 재정의되어 있음
			// => wrapper class의 값을 TreeSet에 넣으면 정렬되어서 저장
		
		// 1. Integer wrapper class의 크기 비교
		TreeSet<Integer> treeSet1 = new TreeSet<Integer>();		// TreeSet은 꼭 타입을 TreeSet으로 지정해야함. Set은 안됨
		Integer intValue1 = new Integer(20);		// 큰값
		Integer intValue2 = new Integer(10);		// 작은값
		
		treeSet1.add(intValue1);
		treeSet1.add(intValue2);
		
		System.out.println(treeSet1);		// 오름차순 정렬되어 출력
		System.out.println(treeSet1.descendingSet());		// 내림차순 정렬되어 출력
		
		// 2. String wrapper class의 크기 비교
		TreeSet<String> treeSet2 = new TreeSet<String>();
		String str1 = new String("가나");		// 작은값
		String str2 = new String("다라");		// 큰값
		
		treeSet2.add(str1);		// treeSet2.add()를 사용해서 객체를 저장할 경우 값의 크기를 비교하는 필드가 정의되어 있어야 함
		treeSet2.add(str2);		// Comparable<E> interface의 compareTo() method가 재정의 되어야함
		System.out.println(treeSet2);
		System.out.println(treeSet2.descendingSet());
		
		// 3. MyClass가 TreeSet에 저장이 될까? => Compareable<E> interface의 compareTo() method가 재정의 되어야 TreeSet collection에 저장 가능
		/*
		 * TreeSet<MyClass> treeSet3 = new TreeSet<MyClass>(); MyClass myClass1 = new
		 * MyClass(2, 5); MyClass myClass2 = new MyClass(3, 3);
		 * 
		 * treeSet3.add(myClass1); // TreeSet에는 comparable<E> interface의 compareTo()
		 * method를 재정의한 class만 넣을 수 있음 treeSet3.add(myClass2); // 실행시 Runtime 오류 발생
		 * System.out.println(treeSet3);
		 */
		
		// 4. MyComparableClass 객체 크기 비교
		TreeSet<MyComparableClass> treeSet4 = new TreeSet<MyComparableClass>();
		MyComparableClass mcc1 = new MyComparableClass(2, 5);
		MyComparableClass mcc2 = new MyComparableClass(5, 3);
		MyComparableClass mcc3 = new MyComparableClass(4, 3);
		
		treeSet4.add(mcc1);
		treeSet4.add(mcc2);
		treeSet4.add(mcc3);
		
		System.out.println(treeSet4);
		
		
		
	}

}
