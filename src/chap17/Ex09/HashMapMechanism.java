package chap17.Ex09;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/*
 * Map : Key는 중복되면 안됨. equals(), hashCode() 재정의 시켜야함
 * 		 value는 중복되어도 됨
 * 
 */

// equals(), hashCode()를 재정의하지 않는 class
class A {
	int data;
	public A(int data) {
		this.data = data;
	}
	
	@Override
	public String toString() {
		return data + "";
	}
}

// equals()만 재정의 class
class B {
	int data;
	public B(int data) {
		this.data = data;
	}
	
	@Override
	public boolean equals(Object obj) {		// obj는 Object 타입으로 업캐스팅
		if (obj instanceof B) {		// obj가 B 타입을 가지고 있을 때 true
			if (this.data == ((B) obj).data) {
				return true;
			}
		}
		return false;
	}
	
	@Override
	public String toString() {
		return data + "";
	}
}

// equals(), hashCode()를 재정의 class : Map의 Key로 사용 가능
class C {
	int data;
	public C(int data) {
		this.data = data;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof C) {
			if (this.data == ((C) obj).data) {
				return true;
			}
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(data);		// 권장 방법
		// return data;
	}
	
	@Override
	public String toString() {
		return data + "";
	}
}


public class HashMapMechanism {
	public static void main(String[] args) {
		// 1. 두 method 모두 overriding하지 않는 경우 => 두 객체 모두 Map의 Key로 등록됨
		Map<A, String> hashMap1 = new HashMap<A, String>();
		
		A a1 = new A(3);
		A a2 = new A(3);
		
		System.out.println(a1 == a2);		// false. stack 메모리 주소를 비교
		System.out.println(a1.equals(a2));	// false. equals() 재정의가 되지 않아 == 와 같이 stack 메모리 주소를 비교
		
		hashMap1.put(a1, "첫번째");
		hashMap1.put(a2, "두번째");
		
		System.out.println(hashMap1.size());
		System.out.println(hashMap1);
		
		System.out.println("----------");
		
		// 2. equals() method만 overriding된 경우
		Map<B, String> hashMap2 = new HashMap<B, String>();
		
		B b1 = new B(3);
		B b2 = new B(3);
		
		System.out.println(b1 == b2);
		System.out.println(b1.equals(b2));
		
		hashMap2.put(b1, "첫번째");
		hashMap2.put(b2, "두번째");
		
		System.out.println(hashMap2.size());
		System.out.println(hashMap2);
		
		System.out.println("----------");
		
		// 3. equals(), hashCode() 둘 다 overriding된 경우
		Map<C, String> hashMap3 = new HashMap<C, String>();
		
		C c1 = new C(3);
		C c2 = new C(3);
		
		System.out.println(c1 == c2);
		System.out.println(c1.equals(c2));
		
		System.out.println(c1.hashCode() + ", " + c2.hashCode());
		
		hashMap3.put(c1, "첫번째");
		hashMap3.put(c2, "두번째");
		
		System.out.println(hashMap3.size());
		System.out.println(hashMap3);		// key 값이 같으면 기존 값을 최신 값이 덮어씀
	}
}
