package chap17.Ex06_HashSet;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/*
 * Set : 중복된 값을 넣을 수 없음
 * 	- equals() method, hashCode() method가 정의되어 있어야 함
 * 	- String, Integer, Double class들은 equals()와 hashCode()가 재정의되어 있음
 * 	- 특정 객체를 set에 저장할 경우 중복 저장을 하지 못하도록 하기 위해서는 equals()와 hashCode() method를 재정의해야 함
 * 	- Object class의 equals()와 hashCode()
 * 		=> Object class의 equals() method는 == 과 같음
 * 			* ==은 stack 메모리의 값을 비교
 */

// equals(), hashCode()가 정의되어 있지 않음
class A {
	int data;
	public A(int data) {
		this.data = data;
	}
}

// equals()는 재정의하고 hashCode()는 재정의 되지않은 상태
class B {		// 두개의 객체의 Data 필드의 값이 같을 때 동일하다라고 식별자를 넣어줘야 함 => equals(), hashCode()
	int data;
	public B(int data) {
		this.data = data;
	}
	
	@Override
	public boolean equals(Object obj) {		// 객체 주소를 비교하는 것이 아니라 객체 내부의 특정 필드의 값을 비교하도록 설정
		if (obj instanceof B) {		// obj(Object)에 B타입을 내포하고 있는지 체크. 내포하고 있을 때만 다운 캐스팅
			if (this.data == ((B)obj).data)		// 주의 : 잘못 다운캐스팅할 경우(지금은 B타입으로 다운캐스팅)
			return true;
		}
		return false;
	}
}

// equals(), hashCode() 재정의함
class C {		// 두개의 객체의 Data 필드의 값이 같을 때 동일하다라고 식별자를 넣어줘야 함 => equals(), hashCode()
	int data;
	public C(int data) {
		this.data = data;
	}
	
	@Override
	public boolean equals(Object obj) {		// 객체 주소를 비교하는 것이 아니라 객체 내부의 특정 필드의 값을 비교하도록 설정
		if (obj instanceof C) {		// obj(Object)에 B타입을 내포하고 있는지 체크. 내포하고 있을 때만 다운 캐스팅
			if (this.data == ((C)obj).data)		// 주의 : 잘못 다운캐스팅할 경우(지금은 B타입으로 다운캐스팅)
			return true;
		}
		return false;
	}
	
	@Override
		public int hashCode() {
			return Objects.hashCode(data);		// Objects.hash(필드명, 필드명, 필드명) => 여러개의 필드의 hashCode()를 동일하게 설정 가능
			// return data;		// data 필드의 값이 같으면 hashCode()를 동일하게 생성
		}
}

public class HashSetMechanism {

	public static void main(String[] args) {
		// 1. equals(), hashCode()가 정의되어 있지 않음
		Set<A> hashSet1 = new HashSet<A>();
		A a1 = new A(3);
		A a2 = new A(3);
		
		System.out.println(a1 == a2);		// false
		// == : stack 메모리의 주소값을 비교(a1과 a2의 값은 같지만 객체의 주소값이 다름)
		
		System.out.println(a1);
		System.out.println(a2);		// 객체명을 출력하면 주소값(패키지명.클래스명@heap메모리주소의 hashCode(16진수))이 출력. a1과 값은 같지만 주소값이 다름
		
		System.out.println(a1.equals(a2));		// false 출력. Object equals()는 == 와 같음
		
		System.out.println(a1.hashCode() + " vs " + a2.hashCode());		// hashCode(10진수) 출력
		
		hashSet1.add(a1);
		hashSet1.add(a2);		// Set은 중복된 값을 넣지 못함
		
		System.out.println(hashSet1.size());		// 2 => equals()와 hashCode() method가 재정의되어 있지 않음
		
		System.out.println("--------------------------");
		
		// 2. equals() 재정의 (객체의 Data 필드의 값을 비교), hashCode()가 정의되어 있지 않음
		Set<B> hashSet2 = new HashSet<B>();
		B b1 = new B(5);
		B b2 = new B(5);
		
		System.out.println(b1 == b2);		// false. stack 메모리의 값을 비교
		System.out.println(b1.equals(b2));
		
		hashSet2.add(b1);
		hashSet2.add(b2);
		
		System.out.println(hashSet2.size());		// 2 출력. equals()만 재정의, hashCode() 재정의 안되어있는 상태
		
		System.out.println(b1.hashCode() + " vs " + b2.hashCode());
		
		System.out.println("--------------------------");
		
		
		// 3. equals() 재정의 (객체의 Data 필드의 값을 비교), hashCode() 재정의
		Set<C> hashSet3 = new HashSet<C>();
		
		C c1 = new C(182);
		C c2 = new C(182);
		
		System.out.println(c1 == c2);		// false. stack의 주소를 비교
		System.out.println(c1.equals(c2));		// true. 객체의 data 필드의 값을 비교하도록 재정의되어 있음
		
		System.out.println(c1.hashCode() + " vs " + c2.hashCode());
		
		hashSet3.add(c1);
		hashSet3.add(c2);
		System.out.println(hashSet3.size());
		
		
		
	}

}
