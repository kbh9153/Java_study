package chap06_07.Ex05;

// 같은 package 내에서 class A를 접근

public class Ex_A {

	public static void main(String[] args) {
		// A class는 같은 package 내부에 존재하기 때문에 import를 사용하지 않고 사용 가능
		
		A a = new A();		// import 없이 사용 : A class가 같은 package 내에 존재
		
		a.m = 10;		// A class의 접근 제어자가 default(같은 package의 다른 class에서 접근 가능)
		a.n = 20;

		a.print();		// default 저근 제어자이므로 접근 가능
	}

}
