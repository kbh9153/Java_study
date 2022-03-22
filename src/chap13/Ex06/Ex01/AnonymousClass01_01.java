package chap13.Ex06.Ex01;

// 1. Interface의 추상 method를 구현한 << class를 생성 >> 후 호출 => 빈번하게 하용하는 경우 사용

interface A {		// Interface, 추상 method를 정의
	void cry();		// 추상 method. 구현부가 없음. public abstract가 생략되어 있음
	void fly();
}

class B {
	A a = new C();
	
	void abc() {
		a.cry();
		a.fly();
	}
	
	class C implements A {		// class C는 A Interface의 method를 구현한 class
		@Override
		public void cry() {
			System.out.println("멍멍");
			
		}
		
		@Override
		public void fly() {
			System.out.println("날지 못합니다");
				
		}
	}
}

public class AnonymousClass01_01 {

	public static void main(String[] args) {
		B b = new B();
		b.abc();

	}

}
