package chap06_07.Ex06;

import chap06_07.Ex05.A;

public class Ex_A {

	public static void main(String[] args) {
		
		//다른 package의 객체를 사용하는 방법
		
		// 1. 전체 class 이름 사용하는 방법
		chap06_07.Ex05.A a = new chap06_07.Ex05.A();		// class의 full name 사용 : 패키지명.클래스명 
		
		// a.m = 10;		// 접근불가 : default는 다른 package의 class에서는 접근 불가
		a.k = 50;		// public : 다른 package의 class에서 접근 가능
		a.print2();		// public : 다른 package의 class에서 접근 가능
		
		// 2. import를 사용해서 접근하는 방법
		A aa = new A();		// import 루 사용하는 방법
		
		aa.k = 100;
		aa.print2();		// public : 다른 package의 class에서 접근 가능
	}

}
