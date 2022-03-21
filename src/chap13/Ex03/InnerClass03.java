package chap13.Ex03;

// static innerclass : 외부 class의 인스턴스 필드, 인스턴스 method는 접근 불가
	// 외부 class의 static 필드나 static method는 접근 가능

class A {
	int a = 3;		// 인스턴스 필드. 객체화 하여야 접근 가능
	static int b = 4;		// static(정적) 필드. 객체 생성없이 접근. 객체 생성 후 접근
	
	void method1() {		// 인스턴스 method : 객체 생성 후 접근
		System.out.println("instance method");
	}
	
	static void method2() {		// static method : 객체 생성없이 접근 가능. 객체 생성하여 접근도 가능
		System.out.println("static method");
	}
	
	static class B {		// static innerclass : 외부 객체를 생성하지 않고 객체 생성이 가능
		void bcd() {
			// 1. Static class에서 외부 class의 인스턴스 필드 접근 (접근 불가)
			// System.out.println(a);		// 외부 class의 인스턴스 필드 (접근 불가)
			System.out.println(b);		// static innerclass에서 외부 class의 static 필드나 method 접근 가능
			
			// 2. method 호출
			// method1();		// 인스턴스 method는 호출 불가
			method2();		// static method는 호출 가능
		}
		
	}
	
}

public class InnerClass03 {

	public static void main(String[] args) {
		// 1. static innerclass 객체 생성
		A.B b = new A.B();		// static innerclass는 외부 객체 생성없이 객체 생성 가능\
		b.bcd();

	}

}
