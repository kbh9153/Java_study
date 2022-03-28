package chap15.Ex18;

// BLOCKED 상태 : 동기화 method나 동기화 블록에서 하나의 스레드가 key를 점유한 경우 대기 상태의 스레드 

class MyBlockTest {
	// 1. 공유 객체 (동기화 method, 동기화 블록)
	MyClass mc = new MyClass();
	
	// 2. 3개의 스레드 필드 생성
	Thread t1 = new Thread("thread1") {
		public void run() {
			mc.syncMethod();
		};
	};
	
	Thread t2 = new Thread("thread2") {
		public void run() {
			mc.syncMethod();
		};
	};
	
	Thread t3 = new Thread("thread3") {
		public void run() {
			mc.syncMethod();
		};
	};
	
	void startAllMethod() {
		t1.start();
		t2.start();
		t3.start();
	}
	
	class MyClass {		// MyBLockTest의 InnerClass
		synchronized void syncMethod() {		// 동기화 method : 스레드가 키를 가진 스레드만 접근
			try {Thread.sleep(100);} catch (InterruptedException e) {}		// 스레드 준비시간 0.1초 지연
			System.out.println("---<< " + Thread.currentThread().getName() + " >>---");
			System.out.println("thread1 -> " + t1.getState());
			System.out.println("thread2 -> " + t2.getState());
			System.out.println("thread3 -> " + t3.getState());
		}
	}

}


public class BlockedState {

	public static void main(String[] args) {
		MyBlockTest mdt = new MyBlockTest();
		mdt.startAllMethod();

	}

}
