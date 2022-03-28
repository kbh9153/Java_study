package chap15.Ex16;

// Thread.sleep(1000) => 1000 : 시간. TImedWaiting 상태로 이동 -> 특정 시간(1초) 경과되면 Runnable 상태로 전환
	// => 인터럽트가 발생되면 예외를 발생시키고 Runnable 상태로 전환

// 인스턴스명(객체명).join(1000) => 1000 : 시간. TimeWaiting 상태로 전환 -> 특정 시간이 경과되면 Runnable 상태로 전환
	// => ex) a.join(1000) : 자신의 스레드는 1초를 기다리고 a 객체에게 CPU 작업 할당(Runnable 상태로 전환) 
	// => 1초 뒤에는 자신의 스레드도 Runnable 상태로 전환

// => 참고. 인스턴스명(객체명).join() : 시간을 생략할 경우, Waiting 상태로 전환
	// => 자신의 스레드는 잠시 Waiting 상태로 전환하고 a 객체를 CPU(Runnable)가 작업하도록 할당
	// => a 객체의 작업이 모두 완료된 경우 자신의 스레드로 Runnable 상태로 전환

class MyThread extends Thread {
	@Override
	public void run() {
		try {
			Thread.sleep(3000);		// 3초동안 TimedWaiting 상태로 진입, 3초 후에는 Runnable 상태로 이동
									// Interrupt가 발생되면 예외를 발생시키고 다시 Runnable 상태로 전환
		} catch (InterruptedException e) {
			System.out.println("---<< sleep() 진행 중 Interrupt 발생>>---");
			for (long i = 0; i < 100000000L; i++) {}		 // 0.5초 시간지연
		}
	}
}

public class TimedWaiting_Sleep {

	public static void main(String[] args) {
		MyThread myThread = new MyThread();
		myThread.start();		// Runnable
		System.out.println("MyThread State1 : " + myThread.getState());		// runnable 상태
		
		try {Thread.sleep(100);} catch (InterruptedException e) {}		// 스레드 시작 준비시간
		System.out.println("MyThread State2 : " + myThread.getState());		// TimedWaiting
		
		// 3초 이전에 Interrupt 발생
		myThread.interrupt();		// TimedWaiting 상태
		try {Thread.sleep(1);} catch (InterruptedException e) {}
		System.out.println("MyThread State3 : " + myThread.getState());		// runnable 상태
		

	}

}
