package chap10.Ex06;

// super : 부모 class => super를 사용할 때는 상속관계이여야만 함
// this : 자신의 객체

// overriding : 덮어쓰기 => 덮어쓰기 하여도 부모 method 값이 삭제되지는 않음. super 사용시 부모 method 값을 다시 불러냄

class A {
	void abc() {
		System.out.println("A class의 abc()");
	}
}

class B extends A {
	void abc() {
		System.out.println("B class의 abc()");
	}
	
	void bcd() {
		// abc();		// this.abc => this 생략. this는 자신의 객체
		super.abc();
	}
}

public class SuperKeyword01 {

	public static void main(String[] args) {
		// 1. 객체 생성
		
		B bb = new B();
		
		// 2. method 호출
		
		bb.bcd();		// B class의

	}

}
