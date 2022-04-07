package chap18.Ex05;

/*
 * 2. method 참조 (정적 method 표현)
 * 	- method 참조 : 내가 구현하지 않고 구현되어 있는 method를 참조해서 사용
 * 	- 정적 method 참조 : 구현되어 있는 method를 참조
 */

interface A {
	void abc();
}

class B {
	static void bcd() {		// static method : class 이름으로 호출이 가능함
		System.out.println("method");
	}
}

public class RefOfInstanceMethod_Type02_1 {
	public static void main(String[] args) {
		// 1. 정적 method 참조 : 이너클래스로 처리
		A a1 = new A() {
			@Override
			public void abc() {
				B.bcd();	// static이 적용된 정적 method 호출. 객체 생성없이 class이름.method이름 으로 호출
			}
		};
		
		// 2. 람다식 표현
		A a2 = () -> { B.bcd(); };		// 람다식 표현
		
		// 3. 정적 method 참조
		A a3 = B::bcd;
		
		a1.abc();
		a2.abc();
		a3.abc();
	}
}
