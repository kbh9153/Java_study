package chap10.Ex05;

class A {
	A () {};		// 기본 생성자. Class 내 다른 생성자가 존재하지 않을 경우 생략 가능
	
	// 인스턴스 method 오버라이딩 : 상속관계에서 method 오버라이딩은 인스턴스 method만 오버라이딩됨
		// 상속관계에서 인스턴스 필드, static 필드, static method는 오버라이딩 되지 않음
		// 오버라이딩할 때는 signature(특징)가 같아야 함. return 타입, method 이름, 매개변수 타입, 매개변수 개수
	void print() {
		System.out.println("Class A 출력");
	}
}

class B extends A {
	@Override
	void print() {
		System.out.println("Class B 출력");
	}
}

class C extends A {
	@Override
	void print() {
		System.out.println("Class C 출력");
	}
}

public class MethodOverriding {
	
	public static void main(String[] args) {
		// 1. A 타입, A 생성자
		
		A a = new A();
		a.print();
		
		// 2. B 타입, B 생성자
		
		B b = new B();
		b.print();
		
		// 3. C 타입, C 생성자
		
		C c = new C();
		c.print();
		
		System.out.println("---------------------------");
		
		// 4. A 타입, B 생성자 (오버라이딩 되어 A의 print 호출시 B의 print 값이 출력)
		
		A ab = new B();
		ab.print();		// A의 print() method 호출 => B의 print()가 출력
		
		A ac = new C();
		ac.print();		// A의 print() method 호출 => C의 print()가 출력
		
		System.out.println("---------------------------");	
		
		A[] arr = {ab, ac};		// 배열에 A 타입의 객체를 저장
		
		for (int i = 0; i < arr.length; i++) {
			arr[i].print();
		}
		
		System.out.println("---------------------------");
		
		for (A k : arr) {
			k.print();
		}
	}

}
