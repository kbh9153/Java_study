package chap12.Ex06;

// Interface의 default method : Interface 내에서 구현부가 있는 method를 정의할 때 사용
	// => public default void bcd() {} 
	// => default 키워르를 작성하여야함(Interface의 default는 접근 제어자가 아님)
	// => Java 1.8 이상부터 신규 추가 기능
	// => 기존의 구현되어 있는 Interface에서 새로운 기능을 추가할 때 하위 class에서 재정의 필요 없이 신규 기능을 추가할 때 사용

	// => default method는는 완성된 코드이기 때문에 상속되어 사용 가능
	// => 추상 method(미완성 코드)는 상속되어 완성하지 않으면 오류가 발생

interface A {
	void abc();		// 2005년 생성 method. public abstract가 생략됨. 구현부가 없는 추상 method
	
	default void bcd() {		// 2020년 생성 method
		System.out.println("A Interface의 bcd()");
	}
	
	// void ttt();		// 상위 class에서 새로운 추상 method를 추가하면 상속된 모든 하위 class는 오류 발생
}

class B implements A {		// 2005년 생성 class
	@Override
	public void abc() {
		System.out.println("B class의 abc()");
	}
}

class C implements A {
	@Override
	public void abc() {
		System.out.println("C class의 abc()");
	}
	
	@Override
	public void bcd() {		// Interface의 default method도 Overriding 가능
		System.out.println("C class의 bcd()");
	}
}

public class DefaultMethod {

	public static void main(String[] args) {
		// 1. 객체 생성
		A a1 = new B();
		A a2 = new C();
		
		// 2. method 호출
		a1.abc();
		a1.bcd();		// Interface의 bcd() method 호출. A Interface에서 상속된 method
		
		a2.abc();
		a2.bcd();
		

	}

}
