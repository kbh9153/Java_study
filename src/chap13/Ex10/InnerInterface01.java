package chap13.Ex10;

// Innerinterface : class 내부에 interface가 선언. 외부 class가 간단하게 사용할 목적으로 생성
	// => class 내부에 선언
	// => ※ 주의 : static이 자동으로 컴파일러에 의해서 생성 

class A {
	interface B {		// static이 컴파일러에 의해서 자동으로 생성
		void bcd();		// public abstract가 생략된 상태
	}
}

// innerinterface를 구현한 class C
class C implements A.B {		// A.B : A class의 innerinterface B를 의미 / A, B : A interface, B interface를 의미
	@Override
	public void bcd() {
		System.out.println("Inner Interface를 구현한 class C");
	}
}

public class InnerInterface01 {

	public static void main(String[] args) {
		// 1. 자식 객체를 직접 생성 후 출력 (자식 class가 구현된 경우)
		A.B ab = new C();		// 부모의 타입으로 업캐스팅 후 overriding을 통해서 출력
		ab.bcd();
		
		C c = new C();		// C 자신의 method를 직접 호출
		c.bcd();
		
		// 2. 익명 innerclass로 출력 (자식 class 없이 출력)
		A.B b = new A.B() {		// A.B : A class 내부의 interface (innerinterface)
			@Override
			public void bcd() {
				System.out.println("익명 innerclass로 객체 생성 후 출력");
			}
		};
		b.bcd();
	}

}
