package chap16.Ex09;

// Generic method의 범위 지정

// Number : Boolean, Character를 제외한 6개 타입(Byte, short, Integer, Long, Float, Double)
class A {		// 일반 class 내부의 Generic method
	public<T extends Number> void method1(T t) {
		System.out.println(t.intValue());		// Number 타입의 method t.intValue()
	}
	
}

interface MyInterface {
	void print();		// public abstract 생략된 상태
}

class B {		// Generic Type 내부에서 Interface를 적용할 때는 extends 키를 사용함
	public<T extends MyInterface> void method2(T t) {		// T에 타입에 올 수 있는 것은 MyInterface를 구현한 class만 올 수 있음
		t.print();
	}
}

class C implements MyInterface {		// Interface를 구현한 class
	@Override
	public void print() {
		System.out.println("Interface를 구현한 class");
	}
}

class D {
	public<T extends String> void abc(T t) {
		System.out.println(t);		// String은 toString method가 재정의되어있음
	}
}

public class BoundedTypeOfGenericMethod {

	public static void main(String[] args) {
		A a = new A();
		a.<Double>method1(5.8);
		a.method1(22.5);		// 매개변수로 던지는 값이 타입을 식별할 수 있는 경우 생략가능
		a.<Long>method1(10000000L);		// Long
		a.<Float>method1(100.20939F);		// Float
		// a.<Boolean>method1(true);		// Chracter, Boolean은 Number 타입에 있지 않음

		// method2에 매개변수로 올 수 있는 것은 interface 타입, interface를 구현한 자식 class
		// Interface를 구현한 내부 익명 class
		B b = new B();
		b.<MyInterface>method2(
			new MyInterface() {
				@Override
				public void print() {
					System.out.println("print() 익명 클래스로 출력");
				};
			}
		);		
		
		b.<MyInterface> method2(new C());		// 매개변수로 interface를 구현한 자식 객체
		
		// 익명 class로 Generic method 호출 후 매개변수로 던져주기
		b.method2(new MyInterface() {
			@Override
			public void print() {
				System.out.println("익명으로 처리된 class 출력");
			}
		});
		
		D d = new D();
		d.<String> abc("Hello World");
		d.abc("Hello Java");
	}

}
