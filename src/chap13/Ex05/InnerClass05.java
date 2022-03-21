package chap13.Ex05;

// 지역 Innerclass의 컴파일 이후 생성 class 파일
// 지역 innerclass : method 내부의 선언된 class

class A {		// A.class
	void abc() {
		class B {}		// A$1B.class
		class C {}		// A$1C.class
	}
	
	void bcd() {
		class C {}		// A$2C.class		동일한 이름이 존재할 경우 method 숫자가 들어감
		class D {}		// A$1D.class
	}
	
	void cde() {
		class B {}		// A$2B.class
		class C {}		// A$3C.class
	}
}

public class InnerClass05 {

	public static void main(String[] args) {
		

	}

}
