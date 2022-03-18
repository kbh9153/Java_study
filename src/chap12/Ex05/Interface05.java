package chap12.Ex05;

// 1. 방법1 : 객체를 생성 후 구현
// 2. 방법2 : 익명 class를 이용하는 방법

// Interface 선언 : 기업의 최고 프로그래머(PM)가 설계

interface A {
	double PI = 3.14;		// public static final이 생략된 상태
	void run();				// public abstract
}

class B implements A {
	@Override
	public void run() {		// public 주의
		System.out.println("달립니다.");
		
	}
}

public class Interface05 {

	public static void main(String[] args) {
		// 1. 객체 생성 후 출력
		A a1 = new B();
		a1.run();
		
		// 2. 익명 객체로 출력
		A a2 = new A() {
			public void run() {
				System.out.println("훨훨 납니다.");
			}
		};
		a2.run();

	}

}
