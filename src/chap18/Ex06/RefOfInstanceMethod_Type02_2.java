package chap18.Ex06;

interface A {
	void abc(B b, int k);	// B b = B class를 참조변수 사용
}

class B {
	void bcd(int k) {		// 인스턴스 메소드 : 
		System.out.println(k);
	}
}

public class RefOfInstanceMethod_Type02_2 {
	public static void main(String[] args) {
		// 인스턴스 메소드 참조 Type2
		// 익며이너클래스
		
		A a1 = new A() {
			@Override
			public void abc(B b, int k) {
				b.bcd(k);
			}
		};
		
		// 람다식 표현
		A a2 = (B b, int k) -> {b.bcd(k);};
		
		// 인스턴스 메소드 참조
		A a3 = B::bcd;		// 인스턴스 메소드나 B 객체를 인풋 받아서 bcd 메소드 호출
			// B::bcd와 같이 객체명이 대문자로 입력되는 경우 - 정적 method(static) 호출일 때, 인스턴스 메소드 호출이지만 매개변수로 객체가 인풋 값으로 들어갈 때
				
		B b = new B();
		
		a1.abc(b, 7);
		a2.abc(b, 8);
		a3.abc(b, 9);
	}
}
