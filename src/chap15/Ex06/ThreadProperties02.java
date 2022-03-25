package chap15.Ex06;

// 스레드 우선순위

class MyThread extends Thread {
	@Override
	public void run() {
		for (long i = 0L; i < 1000000000; i++) {		// 시간 지연용
			
		}
		System.out.println(getName() + "\t" +"우선순위 "+ getPriority());
	}
}

public class ThreadProperties02 {

	public static void main(String[] args) {
		// 1. 참고 : CPU core 확인 하기
		System.out.println("코어 수 : " + Runtime.getRuntime().availableProcessors());
		
		System.out.println("----------------------");
		
		// 2. 우선 순위 => min : 0 ~ max : 10 (default : 5)
		for (int i = 0; i < 3; i++) {
			Thread thread = new Thread();
			System.out.print(thread.getName() + "\t");		// 스레드 이름 출력
			System.out.println(thread.getPriority());		
			thread.start();
		}
		
		System.out.println("----------------------");
		
		try {Thread.sleep(1000);} catch (InterruptedException e) {}		// 1초 지연
		
		// 3. 우선순위 직접 지정
		for (int i = 0; i < 10; i++) {		// 스레드 0 ~ 8 : 우선순위가 5 (default)
			Thread thread = new MyThread();

			thread.setName(i + "번째 스레드");
			
			// System.out.print(thread.getName() + "\t");		// 스레드 이름 출력
			// System.out.println(thread.getPriority());		// 스레드 우선 순위 출력
			
			if (i == 9) {		// 마지막 스레드의 우선 순위를 10으로 할당
				thread.setPriority(10);
			}
			thread.start(); 
		}
	}

}
