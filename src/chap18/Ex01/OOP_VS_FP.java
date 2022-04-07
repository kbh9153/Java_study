package chap18.Ex01;

/*
 * 1. Java는 객체지향프로그램(OOP) : 모든 함수(method)는 객체 내부에 존재해야함. 함수는 class, interface 내부에 있어야함
 * 	- 람다식 : Java에서 함수형 프로그래밍이 가능하도록 지원해주는 기능 중 하나. 람다식을 구현하기 위해서는 함수형 interface가 있어야함
 * 		=> 기존의 구현된 method를 재정의하는 것은 아니라 구현부가 없는 method를 람다식으로 기능을 부여해서 작동시키는 문법 
 * 		=> 람다식은 가능한 축약된 문법을 사용(생략 가능한 것을 최대한 생략해서 표현) 문법이 굉장이 간결함
 * 		=> 람다식은 Java에서 내부적으로 익명 class로 변환되어 처리됨
 *		=> 람다식은 함수형 interface에서 익명 class로 변환이 가능
 *		=> 람다식은 함수형 interface의 구현된 익명 class를 람다식으로 축약
 * 		=> 함수형 interface : 단 한개의 추상 class가 정의된 interface
 * 		=> Java는 새로운 함수 문법을 정의한 것이 아니라 이미 존재하는 interface를 빌려서 람다식으로 표현
 */

@FunctionalInterface		// @FunctionalInterface : 함수형 interface를 선언 / @(annotation)
interface A {	// 함수형 interface
	void abc();		// public abstract 생략됨
}

// interface의 정의된 method를 구현하는 방법 1 : interface의 method를 구현하는 class를 생성
class B implements A {
	@Override
	public void abc() {
		System.out.println("method 내용 1");
	}
}


public class OOP_VS_FP {

	public static void main(String[] args) {
		// Java는 객체 지향 프로그램이므로 모든 함수(method)는 class 내부에 있고 객체 생성 후 호출. 객체 생성없이 method명으로 바로 호출이 불가능
		
		// 1. 객체 지향 프로그래밍 문법 => class를 생성해서 사용 : 모든 method는 객체 내부에 존재하며 객체를 생성 후 호출 가능
		A a1 = new B();
		a1.abc();
		
		// 2. 객체 지향 프로그래밍 문법 => 익명이너클래스를 생성해서 사용
		// interface의 추상 method를 직접 구현한 class를 생성하지 않고 익명이너클래스를 사용해서 method 호출
		A a2 = new A() {
			@Override
			public void abc() {
				System.out.println("method 내용 2");
			}
		};
		a2.abc();		// OOP는 객체 생성 후 method 호출
		
		// 3. 람다식(함수적) 프로그래밍 문법
		A a3 = () -> {System.out.println("method 내용 3");};		// 람다식에 사용되는 interface는 함수형 interface여야 함
		a3.abc();
		
	}

}
