package chap13.Ex07.Ex01;

// 1. Interface의 추상 method를 구현한 << 익명(내부) class >> 후 호출 => 한번만 사용하는 경우 사용

interface A {		// Interface, 추상 method를 정의
	void cry();		// 추상 method. 구현부가 없음. public abstract가 생략되어 있음
	void fly();
}

class B {
	A a = new A() {		// Interface는 객체화할 수 없음. 하지만 익명(내부) class를 생성하서 구현할 수 있음
						// A Interface를 구현한 자식 class 블록 : class 이름이 없음(컴파일러가 이름을 랜덤하게 자동으로 할당)
		public void cry() {
			System.out.println("멍멍");
		};
		
		public void fly() {
			System.out.println("날지 못합니다.");
		};
	};
		
	void abc() {
		a.cry();
		a.fly();
	}
}

public class AnonymousClass02_01 {

	public static void main(String[] args) {
		B b = new B();
		b.abc();
	}
}