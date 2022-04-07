package chap18.Ex09;

interface A {
	B abc();		// return 타입이 B 객체
}

class B {
	B() {
		System.out.println("첫번째 생성자");
	}
	
	B(int k) {
		System.out.println("두번째 생성자");
	}
}

public class RefOfClassConstructor_01 {

	public static void main(String[] args) {
		// 1. 클래스 생성자 참조
		// 익명이너클래스
		A a1 = new A() {
			@Override
			public B abc() {		// abc() 메소드 호출시 B 객체의 기본 생성자 호출 => 생성자 참조
				return new B();
			}
		};
		
		// 람다식 표현
		A a2 = () -> {return new B();};	// 전체 구문
		A a3 = () -> new B();	// 축약구문. reutn 제거시 중괄호도 제거
		
		// 클래스 생성자 참조
		A a4 = B::new;
		
		a1.abc();
		a2.abc();
		a3.abc();
		a4.abc();
		
	}
}
