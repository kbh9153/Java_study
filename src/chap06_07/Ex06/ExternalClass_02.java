package chap06_07.Ex06;

import chap06_07.Ex05.Bb;

// import chap06_07.Ex05.B;		// class B는 접근 제어자가 default이기 때문에 다른 package에서 접근 불가 => import 불가


public class ExternalClass_02 {

	public static void main(String[] args) {
	// 	B b = new B();
		
	// 다른 package의 class에서 Bb class를 접근하는 경우
		
		// 1. import를 먼저 사용
		// 2. Bb class의 class 접근 제어자는 public
		// 3. 필드, method의 접근 제어자에 따라서 접근이 가능 (protected (상속관계), public), 불가능(private, default)
		
		Bb bb = new Bb();
		
		// 필드 접근
		// bb.a = 10;		// private : 같은 class 안에서만 접근
		// bb.b = 20;		// default : 같은 package 안에서 접근 가능
		// bb.c = 30;		// protected : default 포함 + 다른 package에서 접근 가능(상속관계)
		bb.d = 40;			// public : protected + 다른 package에서 접근 가능
		
		// method 접근
		// bb.print1();	// private
		// bb.print2();	// default
		// bb.print3();	// protected
		bb.print4();	// public
		
		
	}

}
