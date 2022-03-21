package chap13.Ex02;

/*
 * Innerclass에서 외부 class의 필드와 method 접근 방법
 * 
 * Overriding
 * 	1. 부모와 자식이 상속 관계가 있어야 함
 * 	2. << 인스턴스 method Overriding >>
 * 	 - 인스턴스 필드, static(정적) 필드, static method는 Overriding 불가능 
 */


class A {
	int a = 3;
	int b = 4;
	int c = 33;
	int d = 44;
	void abc() {		// ※ 주의 : Overriding이 아님. 외부 class, 내부 class의 동일한 method는 별개의 공간에 위치
		System.out.println("A class의 method abc();");
	}
	
	class B {		// Innerclass에서 외부 class의 중복된 필드나 method를 호출할 경우 : A.this.
		int a = 5;
		int b = 6;
		void abc() {		// Overriding이 아님. 별개의 method
			System.out.println("B class의 method abc();");
		}
		
		void bcd() {
			// 1. 자기자신(Innerclass)의 필드와 method 호출
			System.out.println(a);		// 5. this.a => B class의 a
			System.out.println(b);		// 6. this.b => B class의 b
			abc();
			
			// 2. Outerclass의 필드와 method 호출
			System.out.println(A.this.a);		// 3. A.this.a : Outerclass의 필드값 호출 ※ 주의 : Super가 아님
			System.out.println(A.this.b);		// 4. A.this.b : Outerclass의 필드값 호출 ※ 주의 : Super가 아님
			A.this.abc();
			
			// 3. Outerclass의 필드와 method 호출
			System.out.println(c);		// 33
			System.out.println(d);		// 44
		}
	
	
	}
}

public class InnerClass02 {

	public static void main(String[] args) {
		// 1. Outterclass 객체 생성
		A a = new A();
		
		// 2. Innerclass 객체 생성
		A.B b = a.new B();
		b.bcd();
		
		System.out.println("----------------------------");
		
		// 3. 내부 class의 필드와 method 호출
		System.out.println(b.a);
		System.out.println(b.b);
		b.abc();
	}

}
