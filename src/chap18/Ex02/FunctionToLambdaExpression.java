package chap18.Ex02;

// 람다식 문법

@FunctionalInterface
interface A {		// 입력 X, return X
	void method1();
}

@FunctionalInterface
interface B {		// 입력 O, return X
	void method2(int a);
}

@FunctionalInterface
interface C {		// 입력 X, return O
	int method3();
}

@FunctionalInterface
interface D {		// 입력 O, return O
	double method4(int a, int b);
}

public class FunctionToLambdaExpression {

	public static void main(String[] args) {
		// interface의 구현되지 않느 함수를 구현 -> 람다식
		
		// 1. 입력 X, return X
		// 1-1. 익명 이너 클래스로 처리
		A a1 = new A() {
			@Override
			public void method1() {
				System.out.println("method 1");
				
			}
		};
		a1.method1();
		System.out.println();
		
		// 1-2. 람다식으로 처리
			// 람다식은 return 타입, method 이름까지 제거
			// input -> 구현부;
		A a2 = () -> {System.out.println("method 1");};		// 전체
		A a3 = () -> System.out.println("method 1");		// 구현부에 한 라인만 존재할 때 {};를 생략 가능
		a2.method1();
		a3.method1();
		System.out.println("----------");
		
		// 2. 입력 O, return X
		// 2-1. 익명이너클래스로 처리
		B b1 = new B() {
			@Override
			public void method2(int a) {
				System.out.println("method 2 : " + a);
				
			}
		};
		b1.method2(0);
		System.out.println();
		
		B b2 = (int a) -> {System.out.println("method 2 : " + a);};		// 전체구문
		B b3 = (a) -> {System.out.println("method 2 : " + a);};		// 입력매개 변수의 타입은 생략가능
		B b4 = (a) -> System.out.println("method 2 : " + a);		// 실행문의 한 라인일 때 {}; 생략가능
		B b5 = a -> {System.out.println("method 2 : " + a);};		// 입력매개변수가 하나일 때 () 생략가능
		
		b2.method2(1);
		b3.method2(2);
		b4.method2(3);
		b5.method2(4);
		System.out.println("----------");
		
		// 3. 입력 X, return O
		// 3-1. 익명이너클래스
		C c1 = new C() {
			@Override
			public int method3() {
				return 4;
			}
		};
		System.out.println(c1.method3());
		System.out.println();
		
		// 3-2. 람다식으로 펴현
		
		C c2 = () -> {return 5;};		// 전체구문
		C c3 = () -> 6;		// return이 한 라인으로 적용된 경우 : return 생략 가능(반드시 중괄호와 함께 생략해야함)
		
		System.out.println("return 값 : " + c2.method3());
		System.out.println("return 값 : " + c3.method3());
		System.out.println("----------");
		
		// 4. 입력 O, return O
		// 3-1. 익명이너클래스
		D d1 = new D() {
			@Override
			public double method4(int a, int b) {
				return a + b;
			}
		};
		System.out.println("a + b = " + d1.method4(1, 2));
		System.out.println();
		
		// 3-2. 람다식으로 처리
		D d2 = (int a, int b) -> {return a + b;};		// 전체 표현
		D d3 = (int a, int b) -> a + b;		// return이 한 라인으로 적용된 경우 : return 생략 가능(반드시 중괄호와 함께 생략해야함)
		D d4 = (a, b) -> {return a + b;};	// 입력매개 변수의 타입은 생략가능
		D d5 = (a, b) -> a + b;				// 입력매개 변수의 타입은 생략가능 + 실행문의 한 라인일 때 {}; 생략가능
		
		System.out.println("a + b = " + d2.method4(2, 3));
		System.out.println("a + b = " + d3.method4(3, 4));
		System.out.println("a + b = " + d4.method4(4, 5));
		System.out.println("a + b = " + d5.method4(5, 6));
	}

}
