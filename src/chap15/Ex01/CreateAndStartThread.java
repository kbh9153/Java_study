package chap15.Ex01;

/*
 * 새로운 스레드 생성 방법
 * 	1. Thread class를 상속하여 run()을 Overriding해서 구현 (run(){} : 완성된 method)
 * 	2. Runnable interface의 run()을 구현 (run(); : 미완성된 method)
 */

class SMIFileThread extends Thread {
	@Override
	public void run() {		// 생성된 스레드에서 작업할 내용을 구현
		// 2번째 스레드에서 작업할 내용
		// 자막 스레드 출력
		String[] strArray = {"하나", "둘", "셋", "넷", "다섯"};
		
		// 자막 출력구문
		for (int i = 0; i < strArray.length; i++) {
			System.out.println(" - (자막 번호) " + strArray[i]);
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {

			}
		}
	}
}

public class CreateAndStartThread {

	public static void main(String[] args) {
		// 0 스레드 작동
		Thread sm = new SMIFileThread();		// Thread 타입으로 업캐스팅
		
		sm.start();		// run(); method를 실행 - 스레드 시작
		// 주의 : run() 직접 호출하면 스레드가 작동되는 것이 아니라 method만 출력
		// start() : 스레드를 작동하기 위한 메모리 할당 후 run()을 호출 => 스레드로 작업됨
		
		// 1. 첫번째 스레드 (main thread에서 작동) - 비디오 프레임 출력 (1번 스레드)
		int[] intArray = {1, 2, 3, 4, 5};
		
		// 비디오 프레임 출력
		for (int i = 0; i < intArray.length; i++) {
			System.out.print("(비디오 프레임) " + intArray[i] + " ");
			
			// 작업 지연 (0.2초 지연)
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {

			}
		}

	}

}
