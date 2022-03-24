package chap14.Ex08;

/* 사용자 정의 에외
 * 	1. Exception을 상속하는 예외 : Checked Exception => 컴파일 단계에서 예외처리 필요
 * 	2. Runtime Exception을 상속하는 예외 : unChecked Exception(Runtime Exception) => 실행시에 예외처리 필요
 */

class MyException extends Exception {		// 일반예외
	public MyException() {		// 기본 생성자
		super();
	}
	
	public MyException(String msg) {		// 예외 메세지 출력시 사용
		super(msg);
	}
}

class MyRTException extends RuntimeException {		// 실행예외
	public MyRTException() {		// 기본 생성자
		super();
	}
	
	public MyRTException(String msg) {		// 예외 메세지 출력시 사용
		super(msg);
	}
}

class A {
	// 1. 사용자 정의 예외 객체 생성 (일반 예외 객체)
	MyException me1 = new MyException();		// 기본 생성자 호출
	MyException me2 = new MyException("예외 메세지 : MyException");		// 예외가 발생할 때 예외 메세지를 출력하는 생성자
	
	// 2. 런타임 예외 객체
	MyRTException mre1 = new MyRTException();		// 기본 생성자
	MyRTException mre2 = new MyRTException("예외 메세지 : MyRTException");
	
	// 예외를 강제로 발생시키기 (throw)
	void abc_1(int num) {
		try {
			if (num > 70) {		// abc_1()
				System.out.println("정상작동");
			} else {
				throw me2;		// throw : 예외를 강제로 발생시킴
			}
		} catch (MyException e){		// me1의 강제로 throw를 사용해서 강제로 예외를 발생시킴
			System.out.println("70 이하 값을 넣었습니다. 70 이상 값을 넣으세요.");
			System.out.println(e.getMessage());
		}
		 
	}
	
	// 예외의 전가 (throws) : abc_2() method를 호출하는 곳에서 예외처리
	void abc_2(int num) throws MyException {
		if (num > 70) {
			System.out.println("정상작동");
		} else {
			throw me2;		// throw : 예외를 강제로 발생시킴
		}
	}
	
	void bcd_1() {
		abc_1(65);		// 예외가 강제로 발생
	}
	
	void bcd_2() {
		try {
			abc_2(65);
		} catch (MyException e) {
			System.out.println("70 이상의 값을 넣으세요.");
			System.out.println(e.getMessage());
		}
	}
}

public class CreateUserException01 {

	public static void main(String[] args) {
		A a = new A();
		
		a.bcd_1();		// 예외를 직접 구현
		a.bcd_2();		// throws 예외 전가, 호출하는 쪽에서 예외 처리

	}

}
