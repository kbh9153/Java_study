package chap12.Ex07;

interface A {		// 부모 Interface
	default void abc() {		// Interface에서 구현부가 있는 method를 정의할 때는 default를 꼭 작성
		System.out.println("A Interface의 abc() method");
	}
}

class B implements A {		// 기본적으로 extends Object가 생략된 상태
	@Override
	public void abc() {		// A Interface의 default abc() method를 Overriding
		// super.abc();		// super는 Object를 가리킴(A Interface를 가리키는 것이 아님) 
								// => super.abc() => Object의 abc()를 호출(오류 발생)
		A.super.abc();		// A.super은 A Interface를 가리킴
								// => A Interface의 abc()를 호출
		System.out.println("B class의 abc() method");
	}
}

public class DefaultMethod02 {

	public static void main(String[] args) {
		// 1. 객체 생성
		B b = new B();
		
		// 2. method 호출
		b.abc();		// B class의 abc()를 호출
		
		System.out.println("---------------------");
		
		A a1 = new B();		// Interface는 객체 생성은 불가. 타입 변경은 가능
		a1.abc();		// A Interface 타입을 호출해도 B class의 Overriding에 의해 B class 값이 호출
	}

}
