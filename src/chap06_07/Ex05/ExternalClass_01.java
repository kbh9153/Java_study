package chap06_07.Ex05;

import chap06_07.Ex05.Bb;		// 다른 package의 class에서 class를 호출할 때 public 접근 제어자가 부여되어야 함

class B {		// 외부 class : public이 올 수 없음. default가 생략된 상태
					// => 다른 package의 class에서는 접근 불가. 같은 package 안에서만 접근 가능
	
	private int a = 1;		// private : 같은 class에서만 접근 가능(같은 package의 다른 class에서는 접근 불가)
	int b = 2;				// default : 같은 package 안에서 다른 class에서도 접근 가능
	protected int c = 3;	// protected : default 포함 + 다른 package에서도 접근 가능(단, 상속된 경우만 가능)
	public int d = 4;		// public : protected 포함 + 다른 package에서 전부 접근 가능
	
	// 접근 권한 범위 : private < default < protected < public
	
	private void print1() {		// 같은 calss에 존재하는 method
		a = 10;
		b = 20;
		c = 30;
		d = 40;
	}
	
	void print2() {		// 같은 calss에 존재하는 method
		a = 10;
		b = 20;
		c = 30;
		d = 40;
	}
	
	protected void print3() {		// 같은 calss에 존재하는 method
		a = 10;
		b = 20;
		c = 30;
		d = 40;
	}
	
	public void print4() {		// 같은 calss에 존재하는 method
		a = 10;
		b = 20;
		c = 30;
		d = 40;
}

public class ExternalClass_01 {

	public static void main(String[] args) {
		B b = new B();		// default 접근 제어자가 class 이름에 할당 / 같은 class에 존재하므로 B class를 생성 가능
		
		Bb bb = new Bb();		// public 접근 제어자 => 같은 package 접근 가능
								// 다른 package의 class : 1. class 접근 제어자에 public 사용

		// 같은 package의 다른 class에서 접근
		
		// 필드 접근
		
		// bb.a = 10;		// private : a는 bb class 내부에서만 사용 가능 >> 오류 발생
		bb.b = 20;			// default : 같은 package의 class에서 접근을 허용
		bb.c = 30;			// protected : default를 포함 + << 다른 package에서 접근이 가능하지만 상속 관계일때만 가능 >>
		bb.d = 40;			// public : protected를 포함 + 다른 package에서 접근 가능
		
		// method 접근
		// bb.print1();		// private : 오류 발생. class 내부에서만 호출
		bb.print2();		// default
		bb.print3();		// protected
		bb.print4();		// public
		
		}

	}
}
