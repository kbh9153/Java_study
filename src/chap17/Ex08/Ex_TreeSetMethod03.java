package chap17.Ex08;

import java.util.Comparator;
import java.util.TreeSet;

// 이름과 나이를 입력했을 때 이름을 오름차순으로 출력하도록 구현하세요. TreeSet에 name column을
// 1. Comparable<E>의 compareTo() method 재정의해서 구현
	// 기존의 객체 수정이 필요
// 2. Comparator<E>의 compare() method 재정의해서 구현
	// 기존의 객체를 수정없이 구현

class Abc {
	String name;	// 정렬 column. 오름차순 : 가나다라...하
					// 홍길동, 이순신, 강감찬	=> 강감찬, 이순신, 홍길동
	
	int age;		// 나이
	
	public Abc(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "이름: " + name + " 나이: " + age;
	}
	
}

class Abc_T implements Comparable<Abc_T> {
	String name;
	int age;
	
	public Abc_T(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "이름: " + name + " 나이: " + age;
	}

	@Override
	public int compareTo(Abc_T o) {
		if (this.name.equals(o.name)) {
			return 0;
		} else if (this.name.compareTo(o.name) < 0){
			return -1;
		} else {
			return 1;
		}
	}

}



public class Ex_TreeSetMethod03 {

	public static void main(String[] args) {
		TreeSet<Abc_T> treeSet1 = new TreeSet<Abc_T>();
		Abc_T abc1 = new Abc_T("이순신", 50);
		Abc_T abc2 = new Abc_T("강감찬", 53);
		Abc_T abc3 = new Abc_T("홍길동", 37);
		
		treeSet1.add(abc1);
		treeSet1.add(abc2);
		treeSet1.add(abc3);
		
		System.out.println(treeSet1);
		
		TreeSet<Abc> treeSet2 = new TreeSet<Abc>(new Comparator<Abc>() {
			@Override
			public int compare(Abc o1, Abc o2) {
				if (o1.equals(o2)) {
					return 0;
				} else if (o1.name.compareTo(o2.name) < 0) {
					return -1;
				} else {
					return 1;
				}
			}
		});
		Abc abc4 = new Abc("이순신", 50);
		Abc abc5 = new Abc("강감찬", 53);
		Abc abc6 = new Abc("홍길동", 37);
		
		treeSet2.add(abc4);
		treeSet2.add(abc5);
		treeSet2.add(abc6);
		
		System.out.println(treeSet2);
	}

}
