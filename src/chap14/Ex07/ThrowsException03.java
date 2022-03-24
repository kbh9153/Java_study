package chap14.Ex07;

/*
 * Exception - Checked Exception(일반 예외) : 컴파일 오류, 반드시 예외처리
 * 			 - unChecked Exception(실행 예외) : Runtime Exception => 실행시 예외발생
 * 
 * 예외처리방식 - try catch : 자신이 직접 예외를 처리
 * 			- throws : 예외처리를 미루는 것(전가), method 블록 내부의 예외를 method 호출시 호출하는 쪽으로 예외를 미루는 것 
 * 				=> main method의 경우에는 오류 메세지만 출력하고 바로 종료함
 * 			- throw : 예외를 강제 발생
 */

// 1. Exception이 발생되는 method 내부에서 자신이 직접 예외를 처리하는 경우
class A {
	void abc() {
		bcd();		// bcd(); 호출
	}
	
	void bcd() {
		try {
			Class cls = Class.forName("java.lang.Object");		// 일반예외
			// Class.forName : 동적 loading (컴파일시에 체크하지 않고 실행할 때 객체가 존재하는지 확인하는 것)
			// => 실행시 class 파일이 존재할 수도 있고 존재하지 않을 수도 있기 때문에 예외 처리가 필요
			Thread.sleep(1000);		// 일반예			
			// ms : 1000 (= 1초)
		} catch (ClassNotFoundException | InterruptedException e) {
			e.printStackTrace();
		}		
			
				
	}
}

// 2. throws를 사용해서 Exception을 미루는 경우(전가)
class B {
	void abc() {
		try {
			bcd();
		} catch (ClassNotFoundException | InterruptedException e) {
		}
	}
	
	// bcd() method를 호출하는 곳에서 예외를 처리하도록 미룸 
	void bcd() throws ClassNotFoundException, InterruptedException {
		Class cls = Class.forName("java.lang.Object");		// 일반예외
		Thread.sleep(1000);
	}
}

public class ThrowsException03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
