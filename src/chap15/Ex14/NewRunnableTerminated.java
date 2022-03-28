package chap15.Ex14;

/*
 * 스레드 상태
 * 	1. NEW : 스레드 객체 생성 후 .start() method가 호출되기 전 상태
 * 	2. RUNNABLE : .start() method가 호출되면 run() method 내부의 코드가 CPU에서 실행되고 있는 상태
 * 	3. TERMINATE : run()의 모든 코드가 실행된 후 스레드 종료 상태
 * 	4. TIMED WAIT : 특정 시간동안만 대기상태. Thread.sleep();
 * 		=> a.join(1000) -> 현재 자신의 스레드는 1초 대기 상태에 있고 a 객체를 실행상태로 먼저 보냄 (양보)
 * 		=> 특정 시간이 종료되면 실행 상태로 감. 인터럽트가 발생되면 예외를 발생시키고 실행상태로 감
 * 	5. BLOCK : 동기화 처리에서 lock이 걸려서 접근이 잠시 차단된 상태. 다른 작업의 접근을 위해서는 기존 작업이 반납한 키를 획득 후 실행 가능  
 * 	6. WAIT : 무한정 대기 상태. 다시 실행 상태로 처리해야 실행 가능
 */

public class NewRunnableTerminated {

	public static void main(String[] args) {
		// 스레드의 상태를 저장해놓은 class. 총 6가지의 상태를 저장 가능
		Thread.State state;		// state 변수에는 6가지 상수만 저장 가능
		
		// 1. 객체 생성 (NEW)		// 익명 내부 class 생성
			// NEW : 스레드 객체 생성 후 start() 호출 되기 전까지
		Thread myThread = new Thread() {
			@Override
			public void run() {
				for (long i = 0L; i < 100000000L; i++) {}		// 약 0.5초 시간 지연, CPU 연산 속도에 따라 시간 상이
				// 객체 생성시 약간의 시간이 소요
				// 메모리의 할당
			}
		};
		
		state = myThread.getState();		// 스레드의 상태를 가지고 와서 state 변수에 할당
		System.out.println("myThread state : " + state);
		
		// 2. myThread 시작
		myThread.start();		// 스레드를 시작시 CPU에서 실행
		state = myThread.getState();		
		System.out.println("myThread state : " + state);		// RUNNABLE
		
		// 3. myThread 종료 
		
		// myThread.join(); : 메인 스레드는 대기하고 myThread를 처리 명령
		try {myThread.join();} catch (InterruptedException e) {}
		state = myThread.getState();		
		System.out.println("myThread state : " + state);		// TERMINATED
	}

}
