package chap13.Ex06;

//Interface를 상속한 class를 생성하여 객체 출력

class A {
	C c = new B();		// C 타입. 인스턴스 변수 c
	
	void abc() {
		c.bcd();
		
	}
	
	// innerclass
	class B implements C {		// 인터페이스 C의 추상 method 구현 B class
		@Override
		public void bcd() {
			System.out.println("인스턴스 이너 클래스");
		}
	}
}



interface C {
	public abstract void bcd();
}

public class AnonymousClass {

	public static void main(String[] args) {
		// 1. 객체 생성 및 method 호출
		A a  = new A();
		a.abc();		// 인스턴스 이너 클래스

	}

}
