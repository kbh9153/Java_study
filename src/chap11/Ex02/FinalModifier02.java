package chap11.Ex02;

// final method와 final class의 특징
	// final method : overriding 불가 => 아주 중요한 method는 자식에서 재정의하지 못하도록 설정
	// final class : 상속이 불가한 class

class A {
	void abc() {
		
	}
	
	final void bcd() {		// final이 할당된 method는 자식 class에서 overriding 불가
		
	}
}

class B extends A {
	void abc() {}		// method overriding 가능
	
	// void bcd() {}		// method overriding 불가능
}

final class C {}		// final이 할당된 class는 상속이 불가
// class D extends C {}

public class FinalModifier02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
