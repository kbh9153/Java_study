package chap15.Ex17;

// a.join(1000) : a 객체에게 CPU를 할당하고 자신은 TimeWaiting 상태로 대기

class MyThread1 extends Thread {
	@Override
	public void run() {
		for (long i = 0; i < 300000000000L; i++) {}	// 작업 횟수. 0.5초 시간 지연
	};
}

class MyThread2 extends Thread {
	MyThread1 myThread1;		// class타입 참조변수명;
	
	public MyThread2(MyThread1 myThread1) {		// 생성자를 통해서 참조변수의 값 할당
		this.myThread1 = myThread1;
	}
	
	@Override
	public void run() {
		try {
			myThread1.join(3000);		// MyThread2는 3초 대기하고 myThread1에게 CPU 할당
		} catch (InterruptedException e) {
			System.out.println("---<< join(...) 진행 중 Interrupt 발생 >>---");
			for (long i = 0; i < 300000000000L; i++) {}	// 0.5초 시간 지연
		}
	}
}

public class TimeWaiting_Join {

	public static void main(String[] args) {
		// 1. 객체 생성
		
		MyThread1 myThread1 = new MyThread1();
		MyThread2 myThread2 = new MyThread2(myThread1);
		myThread1.start();
		myThread2.start();

		try {Thread.sleep(1);} catch (InterruptedException e) {}		// 스레드 시작 준비 시간 0.1초
		System.out.println("MyThread1 State : " + myThread1.getState());		// runnable
		System.out.println("MyThread2 State : " + myThread2.getState());		// timed_waiting
		
		myThread2.interrupt();		// 3초 대기 중 전에 interrupt가 발생되면 예외를 발생시키고 Runnable로 전환
		try {Thread.sleep(1);} catch (InterruptedException e) {}		// 스레드 시작 준비 시간 0.1초
		System.out.println("MyThread1 State : " + myThread1.getState());		// terminated. 이미 작업 끝
		System.out.println("MyThread2 State : " + myThread2.getState());		// runnable
	}

}
