package chap17.Ex12;

import java.util.Comparator;
import java.util.TreeMap;

/*
 * TreeMap<K, V> : Key가 정렬되어서 처리 <오름차순 정렬>
 * 	- Key : 일반 객체를 사용할 경우, Comparable compareTo(), Comparator<E> compare() 재정의 필요
 */

// 일반 class
class MyClass {
	int data1;
	int data2;
	
	public MyClass(int data1, int data2) {
		this.data1 = data1;
		this.data2 = data2;
	}
	
	@Override
	public String toString() {
		return data1 + ", " + data2;
	}
}

// Comparable<E> interface의 compareTo() method 재정의
class MyCompareableClass implements Comparable<MyCompareableClass> {
	int data1;
	int data2;
	
	public MyCompareableClass(int data1, int data2) {
		this.data1 = data1;
		this.data2 = data2;
	}
	
	@Override
	public String toString() {
		return data1 + ", " + data2;
	}
	
	@Override
	public int compareTo(MyCompareableClass o) {
		if (this.data1 < o.data1) {
			return -1;
		} else if (this.data1 == o.data1) {
			return 0;
		} else {
			return 1;
		}
		
	}
}

public class TreeMapMethod02 {
	public static void main(String[] args) {
		// 1. MyClass를 TreeMap의 Key로 인풋할 경우 : 실행시 오류
		/*
		TreeMap<MyClass, String> treeMap1 = new TreeMap<MyClass, String>();
		MyClass m1 = new MyClass(2, 5);
		MyClass m2 = new MyClass(3, 3);
		
		treeMap1.put(m1, "첫번째");		// Comparable, Comparator 구현하지 않았는데, TreeMap의 Key로 사용
		treeMap1.put(m2, "두번째");
		*/
		
		// 2. Comparable을 구현한 class를 사용 => 객체 수정
		TreeMap<MyCompareableClass, String> treeMap2 = new TreeMap<MyCompareableClass, String>();
		MyCompareableClass mc1 = new MyCompareableClass(2, 5);
		MyCompareableClass mc2 = new MyCompareableClass(10, 5);
		MyCompareableClass mc3 = new MyCompareableClass(3, 3);
		
		treeMap2.put(mc1, "첫번째");
		treeMap2.put(mc2, "두번째");
		treeMap2.put(mc3, "세번째");
		
		System.out.println(treeMap2);
		System.out.println(treeMap2.size());
		
		System.out.println();
		
		// 3. Comparator<E>를 구현 : 기존의 객체를 사용. 객체 수정이 불필요
		TreeMap<MyClass, String> treeMap3 = new TreeMap<MyClass, String>(new Comparator<MyClass>() {
			@Override
			public int compare(MyClass o1, MyClass o2) {
				if (o1.data1 < o2.data1) {
					return -1;
				} else if (o1.data1 == o2.data1) {
					return 0;
				} else {
					return 1;
				}
				
			}
		});
		
		MyClass my1 = new MyClass(2, 5);
		MyClass my2 = new MyClass(10, 5);
		MyClass my3 = new MyClass(3, 3);
		
		treeMap3.put(my1, "첫번째");
		treeMap3.put(my2, "두번째");
		treeMap3.put(my3, "세번째");
		
		System.out.println(treeMap3);
		System.out.println(treeMap3.size());
	}
}
