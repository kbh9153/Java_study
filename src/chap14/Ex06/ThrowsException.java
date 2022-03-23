package chap14.Ex06;

/*
 * 예외 처리 2가지 방법
 * 	1. 직접 처리 : try catch
 * 	2. 예외 전가(미루다) : throws. method를 호출하는 쪽에서 예외를 처리하도록 전가
 * 		- throw : 강제로 예외를 발생시킴
 */

class A {		// method 내부에서 예외를 직접 처리
	void abc() {
		bcd();
	}
	
	void bcd() {
		try {
		Thread.sleep(1000);			// 일반 예외 : InterruptedException		
		// 1000밀리초 = 1초
		} catch (InterruptedException e) {
			// e.printStackTrace();
			System.out.println("예외 발생 1");
		}
	}
}
	
class B {
	void abc() {		// bcd() method의 예외를 처리할 의무를 가짐
		try {
			bcd();
		} catch (InterruptedException e) {
			// e.printStackTrace();
			System.out.println("예외 발생 2");
		}
	}
	
	void bcd() throws InterruptedException {		// bcd() method를 호출하는 쪽(abc())에서 예외를 처리하도록 전가
		Thread.sleep(1000);		// 일반 예외 : InterruptedException 발생		
	}
}

public class ThrowsException {

	public static void main(String[] args) {
		A a1 = new A();
		a1.abc();

	}

}
