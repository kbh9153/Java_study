package chap06_07.Ex03;

import chap06_07.Ex03.A;
import chap06_07.Ex03.B;
import chap06_07.Ex03.C;

/*
 기본 생성자 : class A는 기본 생성자가 생략되어 있음
 일반적인 class 블록 작성 순서
 	1. 필드
 	2. 생성자
 	3. method
 	
 생성자의 역할
 	1. 객체 생성
 	2. 필드의 초기값을 설정
 */

class A {		// class A는 현재 기본 생성자가 생략되어 있음
	int m;		// 필드(class 블록에 변언된 변수) => 데이터타입 변수명
					// => heap 메모리 영역에 저장. 객체화 시켜야 사용 가능(static 사용시 객체화하지 않아도 사용 가능)
					// => heap 메모리 영역에는 반드시 초기값이 들어가야함
	
	// A () {};		// 기본 생성자 : class 이름과 동일하면서 return 타입이 없는 method를 칭함
						// => 기본 생성자는 생략 가능
						// => 기본 생성자는 매개 변수도 없고 실행부도 가지지 않은 생성자
	
void work() {		// method => (인풋 매개변수) { 실행부 }
						// => return 타입이 있으면 자료형(int, String 등). return 타입이 없으면 void
						// => method는 호출해야 실행 : work()
		System.out.println(m);		// m : 메모리의 값을 가지고 옴
	}
}

class B {
	int m;		// 필드. heap 메모리 영역에 저장. 기본값으로 0을 출력
	
	B() {};		// 기본 생성자. 생략 가능 => 객체의 필드 초기값을 기본값으로 출력
	
	void work() {
		System.out.println(m);		// 0 출력(필드 m 값(메모리 초기값 0) 출력)
	}
}

// 객체 생성시 생성자를 통해 필드에 초기값을 할당하고 객체 생성

class C {		// 기본 생성자는 생략됨 
	int m;
	
	// C() {}		// 기본 생성자 생략
					// 다른 생성자가 존재하는 경우, 외부에서 기본 생성자 호출시 기본 생성자가 생략되면 안됨
	
	C (int c) {		 // 생성자의 인풋값을 받아서 메모리의 기본값으로 m 변수값을 읽어옴
		m = c;
	}
	
	void work() {
		System.out.println(m);		// m은 객체 생성시 생성자에 정수값을 넣어서 필드 m을 초기화 시켜줌(m이 필드의 초기값으로 할당됨)
	}
	
}

class D {
	int m, n, l;
	
	D() {};		// 기본 생성자
	D(int m, int n) {		// 매개변수 2개
		this.m = m;			// this : 자기 자신의 객체, 지역변수가 아닌 필드를 지칭
		this.n = n;
	}
	D(int a, int b, int c) {		// 매개 변수가 3개인 생성자
		m = a;
		n = b;
		l = c;
	}
	
	void work() {		// work()를 호출시 각각의 메모리 값을 출력
		System.out.println("m : " + m + ", n : " + n + ", l : " + l);
	}
	
}

public class DefaultConstructor {

	public static void main(String[] args) {
		/*
		class 안에 포함될 수 있는 것
			1. 필드 
			2. method
			3. 생성자
			4. inner class
			
		생성자의 2가지 특징
			1. class 이름과 동일한 이름을 가진 method
			2. 생성자는 return 타입이 없음 (method는 return 타입이 있음)
			3. 생성자 사용 이유
				1) 객체를 생성할 때 필드값을 초기화 하면서 객체를 생성하고자 할 때
				2) class 내에서 필드의 초기 값은 일반적으로 할당하지 않음
				3) 초기값을 할당하면서 객체를 생성할 때
				
			객체를 생성할 때, 반드시 생성자를 호출해야함 : A a = new A(); => 객체 생성 구문 
		*/
		
		/*
		기본 생성자 (Default Constructor)
			- 인풋 매개변수가 없는 생성자, 실행부의 값도 비어있는 상태의 생성자.
			- 기본 생성자는 생략 가능
			- 생략되어 있을 경우, 컴파일러가 자동으로 생성해서 컴파일.
			- class 내 기본 생성자 이외의 다른 생성자가 존재하는 경우, 기본 생성자 호출시 생략되면 안됨
		*/
		
		A a = new A();		// A() : 기본 생성자 호출 << 기본 생성자 생략됨 >>
							// 객체 생성시 반드시 생성자를 호출해야 함
		
		a.work();		// 객체의 초기값인 0 출력
		
		B b = new B();		// 기본 생성자 호출 << 기본 생성자 호출 >>
		b.work();		// 객체의 초기값인 0 출력
		
		C c = new C(7);		// 기본 생성자 생략
							// (7) => 생성자 호출시 기본값으로 인풋해서 메모리 필드에 초기값 구성
		c.work();
		
		C cc = new C(5);		// 객체 생성시 기본 기능 : 객체 생성 + 필드의 초기값 구성
		cc.work();
		
		C ccc = new C(10);
		ccc.work();
		
		// class C는 기본 생성자가 생략되어 있음
		// class C는 인풋 매개 변수가 하나인 생성자가 존재
		
		// C cccc = new C();		// C class에 기본 생성자가 생략되어 있고 다른 생성자가 있는 경우에서 기본 생성자를 호출했기에 오류 발생
		
		D d = new D();		// 기본 생성자 호출. 객체의 필드의 초기값 (0(m), 0(n), 0(l))
		d.work();
		
		D dd = new D(3, 4, 5);		// 매개 변수가 3개인 생성자 호출
									// 생성자 : method 이름이 객체 이름과 동일
									// 객체 내의 필드값을 초기화할 때 overloading에 의해서 해당 생성자라 호출
									// overloading : method(생성자) 이름 = 데이터 타입 = 매개변수 갯수) => 시그니쳐  
										// => overloading 에러 발생 이유 : 동일한 데이터 타입, 개수가 동일한 경우
		dd.work();			
		
		
		D ddd = new D(1, 2);
		ddd.work();
		
	}

}
