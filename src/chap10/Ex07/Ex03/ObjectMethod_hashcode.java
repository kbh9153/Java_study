package chap10.Ex07.Ex03;

import java.util.HashMap;
// HashMap : key = 값으로 저장되는 자료구조.
	// => key는 중복될 수 없음
	// HashMap에 key에 객체를 저장할 경우, key에 저장되는 객체가 중복되지 않는 고유한 정보를 저장해야 함
	// (객체가 중복되지 않는 고유한 정보) => Object class의 hashcode()를 사용해서 객체가 중복되지 않도록 설정

class A {
	String name;
	A (String name) {
		this.name = name;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this.name == ((A)obj).name) {
			return true;
		} else {
			return false;
		}
	}
	
	@Override
	public String toString() {
		return name;
	}
}

class B {
	String name;
	B (String name) {
		this.name = name;
	}
	
	@Override
	public boolean equals(Object obj) {		// hashCode() + equals() 재정의 => 이 조건을 만족시 동일한 객체로 인식
		if (this.name == ((B)obj).name) {
			return true;
		} else {
			return false;
		}
	}
	@Override
	public int hashCode() {			// hashCode() 재정의
		return name.hashCode();
	}
	
	@Override
	public String toString() {		// toString() 재정의
		return name;
	}
}

public class ObjectMethod_hashcode {

	public static void main(String[] args) {
		HashMap<Integer, String> hashMap01 = new HashMap<>();		// <Integer => key, String => value>
		hashMap01.put(1, "데이터01");
		hashMap01.put(1, "데이터03");		// 하나의 key에는 중복된 value를 넣을 수 없음 => "데이터01" -> "데이터03"
		hashMap01.put(2, "데이터07");
		
		System.out.println(hashMap01);		// 1=데이터03, 2=데이터07 출력

		System.out.println("-------------------------");
		
		HashMap<A, String> hashMap02 = new HashMap<>();		// hashCode() + equals() 재정의 조건 불만족
		hashMap02.put(new A("첫번째"), "데이터01");
		hashMap02.put(new A("첫번째"), "데이터02");
		hashMap02.put(new A("두번째"), "데이터03");
		
		System.out.println(hashMap02);		// HashMap이 잘못 구현된 경우
		
		System.out.println("-------------------------");
		
		HashMap<B, String> hashMap03 = new HashMap<>();		// hashCode() + equals() 재정의 조건 만족
		hashMap03.put(new B("첫번째"), "데이터01");
		hashMap03.put(new B("첫번째"), "데이터02");
		hashMap03.put(new B("두번째"), "데이터03");
		
		System.out.println(hashMap03);		// HashMap 구현이 제대로 설정된 경우 : Key가 중복되면 안됨
											// hashMap3는 toString() method가 재정의
		
		System.out.println("첫번째".hashCode());
		System.out.println("첫번째".hashCode());
		System.out.println("두번째".hashCode());
		
	}

}
