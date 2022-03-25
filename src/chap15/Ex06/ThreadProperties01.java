package chap15.Ex06;

public class ThreadProperties01 {

	public static void main(String[] args) {
		// 1. 객체 가져오기 (currentThread)		// 스레드 수 (activeCount())
			// static
		Thread curThread = Thread.currentThread();		// 메인 스레드. Thread.currentThread() : 현재 스레드 정보
		// class명(타입) 참조변수명 = class명.method명
		System.out.println("현재 스레드의 이름 : " + curThread.getName());		// .getName() : 현재 스레드 수의 이름
		System.out.println("동작하는 스레드 수 : "+ Thread.activeCount());		// Thread.activeCount : 동작하는 스레드 수

		System.out.println("----------------------------");
		
		// 2. 스레드의 이름 출력 (자동출력) : JVM이 스레드 이름을 자동으로 할당 => ex. Thread-0, 1, 2 ··· Thread-9
		for (int i = 0; i < 10; i++) {
			Thread thread = new Thread();
			System.out.println(thread.getName());		// 스레드 이름 출력
			thread.start();
		}
		
		System.out.println("----------------------------");
		
		// 3. 스레드 이름 직접 지정 후 출력 : 객체명.setName();
		for (int i = 0; i < 10; i++) {
			Thread thread = new Thread();
			thread.setName(i + "번째 스레드");
			System.out.println(thread.getName());		// 스레드 이름 출력
			thread.start();
		}
		
		System.out.println("----------------------------");
		
		// 4. 스레드의 이름 출력 (자동출력) : JVM이 스레드 이름을 자동으로 할당 => ex. Thread-20, 1, 2 ··· Thread-29
		for (int i = 0; i < 10; i++) {
			Thread thread = new Thread();
			System.out.println(thread.getName());
			thread.start();
		}
		
		// 5. 스레드 수 출력하기
		System.out.println("동작하는 스레드 수 : " + Thread.activeCount());
	}

}
