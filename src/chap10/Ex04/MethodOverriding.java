package chap10.Ex04;

/*
 *  MethodOverriding 구현 조건
 *   1. 반드시 상속 관계에서만 구현 가능
 *   2. 부모 class에서 선언된 method를 새롭게 정의해서 사용하는 것
 *   3. @Override 라는 annotation(주석)를 사용하면 method 재정의 시 오류를 줄일 수 있음
 *   4. Signature(특징)가 같아야 함 (method 이름, 메개변수(인자) 타입, 매개변수(인자) 갯수)
 *   5. method의 접근 제어자의 범위가 같거나 또는 넓어야함
 */

class A {
	void print() {
		System.out.println("A class입니다.");
	}
}

class B extends A {
	@Override		// method overriding 시 반드시 부모의 method를 재정의하도록 설정 => 설정시 오타나 형식이 맞지 않을 경우 오류를 발생시킴
							// @Override annotation을 사용하지 않을 경우 : 오타나 있거나 형식에 맞지 않을 경우 => 별개의 method로 정의(오류가 발생하지는 않음)
	void print() {
		System.out.println("B class입니다.");
	}
}

public class MethodOverriding {

	public static void main(String[] args) {
		// 1. A 타입
		A aa = new A();
		aa.print();		// A class의 print() 출력
		
		// 2. B 타입
		B bb = new B();
		bb.print();		// B class의 print() 출력
		
		// 3. A 타입 업캐스팅	<<=== B를 A타입으로 업캐스팅하였지만 상속받은 A타입을 B 값으로 재정의(덮어쓰기 - override)하여 B 값들이 출력(하지만 타입은 A) 
		A ab = new B();
		ab.print();		// B class의 print() 출력
	}

}
