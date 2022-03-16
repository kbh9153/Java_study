package chap10.Ex06.Ex01;

// 자식 객체를 생성할 때 부모 class의 기본 생성자를 먼저 호출 => super(); 
// 모든 자식 객체의 생성자에는 super();가 생략되어 있음

class A {
	A() {
		System.out.println("A class의 기본 생성자");
	}
	
	A(int a) {
		System.out.println("A class의 매개변수 정수 1개 생성자 : " + a);
	}
	
	A(int a, int b) {
		System.out.println("A class의 매개변수 정수 2개 생성자 : " + a + ", " + b);
	}
}

class B extends A {
	B() {
//		super(); => A(부모 class) 호출. 생략된 상태
//		super(5, 3) => A(부모 class) 중 매개변수가 2가지인 생성자를 호출
		System.out.println("B class의 기본 생성자");
	}
	
	B (String a) {
		super(3, 5);
		System.out.println("B class의 문자열 1개 입력 : " + a);
	}
}

class C extends B {
	C() {
//		super(); => B(부모 class) 호출. 생략된 상태
		super("C에서 호출");
		System.out.println("C class의 기본 생성자");
	}
}

public class SuperMethod02 {

	public static void main(String[] args) {
		C c = new C();

	}

}
