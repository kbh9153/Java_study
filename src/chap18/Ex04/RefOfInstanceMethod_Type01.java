package chap18.Ex04;

/*
 * 람다식의 활용
 * 	1. 익명이너클래스
 * 	2. method 참조 (1. 인스턴스 method 참조, 2. 정적 method 참조)
 * 		=> method 참조 : 구현되어 있는 method를 참조
 * 			- method 참조를 위해서는 return 타입과 매개변수가 동일해야함 
 */

interface A {
	void abc();
}

class B {
	void bcd() {		// 인스턴스 method : 객체화 해야 호출이 가능
		System.out.println("method");
	}
}

public class RefOfInstanceMethod_Type01 {
	public static void main(String[] args) {
		// 1. 인스턴스 method 참조 type 1 => 익명이너클래스
		A a1 = new A() {
			@Override
			public void abc() {
				B b = new B();
				b.bcd();
			}
		};
		
		// 2. 1번을 람다식으로 표현
		A a2 = () -> {
			B b = new B();
			b.bcd();
		};
		
		// 3. 인스턴스 참조 표현 type 1
		B b = new B();		// 인스턴스 객체를 생성 (객체명::method 이름;)
		A a3 = b::bcd;		// 인스턴스 참조 표현 => return 타입이 같아야함. 매개변수가 동일해야 함
		
		a1.abc();
		a2.abc();
		a3.abc();
		
	}
}
