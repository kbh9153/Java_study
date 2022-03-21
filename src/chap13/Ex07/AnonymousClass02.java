package chap13.Ex07;

// 익명 innerclass를 사용하여 Interface 객체 생성

class A {
	C c = new C() {		// 익명 innerclass
		public void bcd() {
			System.out.println("익명 이너 클래스");
		};
	};		// C 타입, 인스턴스 변수 c		
	
	void abc() {
		c.bcd();
	}
}

interface C {		// Interface, 추상 method 정의 : void bcd()
	public abstract void bcd();
}

public class AnonymousClass02 {

	public static void main(String[] args) {
		// 1. 객체 생성 및 method 호출
		A a  = new A();
		a.abc();		// 익명 이너 클래스

	}

}
