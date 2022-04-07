package chap18.Ex10;

interface A {
	B abc(int k);		// return 타입이 B 객체
}

class B {
	B() {
		System.out.println("첫번째 생성자");
	}
	
	B(int k) {
		System.out.println("두번째 생성자");
	}
}

public class RefOfClassConstructor_02 {
	
	public static void main(String[] args) {
		// 익명이너클래스
		A a1 = new A() {
			@Override
			public B abc(int k) {
				return new B(k);
			}
		};
		
		// 람다식 표현
		A a2 = (int k) -> {return new B(k);};	// 전체구문
		A a3 = k -> new B(k);	// 약식표현
		
		// 클래스 생성자 표현
		A a4 = B::new;
		
		a1.abc(3);
		a2.abc(2);
		a3.abc(3);
		a4.abc(3);
	}
}
