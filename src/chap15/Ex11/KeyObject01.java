package chap15.Ex11;

/*
 * 여러 스레드가 공유된 필드에 접근할 때 동시성의 문제가 발생 => 동기화로 동시성 문제를 해결
 * 
 * 동기화 : 여러 스레드가 공유된 필드를 접근할 때 하나의 스레드가 완료되면 다른 스레드에서 접근이 가능 
 * 	- 하나의 스레드가 사용중인 경우 lock을 걸고 작업이 완료되면 다른 스레드가 접근 가능하도록 lock 해제
 * 	- 모든 동기화된 메소드는 this 키워드만 가짐
 * 	- 여러 메소드가 동기화된 메소드일 경우 : 하나의 스레드만 접근이 가능
 */

class MyData {		// 공유 객체 : 여러 스레드가 오유 객체에 접근
	// 동기화된 method는 key 값이 모두 this가 자동으로 생성되며 수정이 불가
	// 동기화 method는 key 값을 넣을 수 없음
	// 하나의 스레드가 접근할 때 key를 가지고 동기화된 method를 접근
	// key는 객체를 key로 사용 가능
	// 동기화 블록은 key 값을 임의로 할당 가능
	synchronized void abc() {		// 여러 스레드가 접근할 때 동시성 문제를 방지하기 위해 동기화 처리
		for (int i = 0; i < 3; i++) {
			try {Thread.sleep(10);} catch (InterruptedException e1) {}		// 0.01초 지연
			System.out.println(i + " sec");
			try {Thread.sleep(1000);} catch (InterruptedException e) {}		// 1초 지연
		}
	}
	
	synchronized void bcd() {		// 여러 스레드가 접근할 때 동시성 문제를 방지하기 위해 동기화 처리
		for (int i = 0; i < 3; i++) {
			try {Thread.sleep(30);} catch (InterruptedException e1) {}		// 0.02초 지연
			System.out.println(i + " 초");
			try {Thread.sleep(1000);} catch (InterruptedException e) {}		// 1초 지연
		}
	}
	
	synchronized void cde() {		// 여러 스레드가 접근할 때 동시성 문제를 방지하기 위해 동기화 처리
		for (int i = 0; i < 3; i++) {
			try {Thread.sleep(50);} catch (InterruptedException e1) {}		// 0.03초 지연
			System.out.println(i + " 번째");
			try {Thread.sleep(1000);} catch (InterruptedException e) {}		// 1초 지연
		}
	}
}

public class KeyObject01 {

	public static void main(String[] args) {
		// 공유 객체
		MyData myData = new MyData();
		
		// 3개의 스레드가 각각의 method 호출
		new Thread() {		// 익명 class : 스레드 class를 구현하는 자식 익명 class
			public void run() {
				myData.abc();		// 첫번째 스레드 : abc() method 호출
			};
		}.start();
		
		new Thread() {		// 익명 class : 스레드 class를 구현하는 자식 익명 class
			public void run() {
				myData.bcd();		// 두번째 스레드 : bcd() method 호출
			};
		}.start();
		
		new Thread() {		// 익명 class : 스레드 class를 구현하는 자식 익명 class
			public void run() {
				myData.cde();		// 세번째 스레드 : cde() method 호출
			};
		}.start();

	}

}
