package chap13.Ex01;

/*
 * Innerclass : class 내부의 class.
 * 	1. 인스턴스 Innerclass : class 이름 앞에 static이 없는 내부 class
 * 		=> 외부 객체를 먼저 생성 -> 자신의 객체 생성 후 사용 가능
 * 		=> ex. A a = new A(); : 외부 객체 생성 -> A.B b = a.new B(); : 내부 객체 생성 
 * 	2. Static(정적) Innerclass : class 이름 앞에 static이 있는 내부 class  
 * 
 * 	3. 지역 Innerclass : class의 인스턴스 method 내부에 있는 class
 * 
 * << 사용 특징 >>
 * 	1. Outer class의 접근 제어자 없이 접근 가능
 * 	2. 다른 객체 생성없이 객체의 필드나 method 빠른 접근을 위해 사용
 * 
 * class 파일 : A.class, A$B.class => byte code (중간언어로 컴파일된 파일)
 */

class A {		// Outer class : 모든 접근 제어자를 내부 class에서 접근 가능
	public int a = 3;		// public : 다른 package에서 접근 가능. 같은 package에서 접근 가능
	protected int b = 4;		// protected : 다른 package에서 접근 가능(상속된 관계에서만). 같은 package에서 접근 가능
	int c = 5;				// 다른 package에서 접근 불가능. 같은 package에서 접근 가능
	private int d = 6;		// 다른 package에서 접근 불가능. 같은 package에서도 접근 불가능. 같은 class에서만 접근 가능
	void abc() {
		System.out.println("A class의 method abc() 입니다.");
	}
	
	//	InnerClass
	class B {		// 인스턴스 내부 class : 외부 class가 객체화 되어야 사용 가능 
		void bcd() {		// Outer class의 필드 접근 가능 여부 확인
			System.out.println(a);		// this.a => this가 생략되어 있는 상태
			System.out.println(b);		// this.b
			System.out.println(c);
			System.out.println(d);
			abc();		 // Outer class의 method 접근 가능 여부 확인
		}
	}
}

public class InnerClass01 {

	public static void main(String[] args) {
		// 1. 외부 객체 생성 (1단계) => Innerclass를 사용하기 위해서는 외부 class 객체를 먼저 생성해줘야 함
		A a = new A();		// 외부 class
		
		// 2. 내부 class 객체 생성 (2단계)
		A.B b = a.new B();		// A.B : 외부 class.내부 class b : 내부 class 인스턴스 변수 a.new B(); : 외부 인스턴스명.new 내부 class 생성자 호출
		
		// 3. 내부 class의 method 호출
		b.bcd();

	}

}
