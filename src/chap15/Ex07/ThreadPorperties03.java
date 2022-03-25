package chap15.Ex07;

/*
 * 일반스레드 : setDaemon(false) => 마지막 스레드가 종료되더라도 자신의 일을 모두 끝마치고 종료됨
 * 데몬스레드 : setDaemon(true) => 스레드를 시작할 때, 데몬스레드도 설정. 수정 변경은 불가
 * 	- 마지막 일반 스레드가 종료되는 시점에 데몬스레드도 종료
 * 	- 데몬스레드는 일반적으로 다른 스레드의 작업을 돕는 보조 스레드 역할
 * 	- 종료시점이 마지막 일반스레드 종료될 때 종료될 때 종료점 외에는 일반스레드와 동일
 * 	- 대표적인 예 : 가비지 컬렉트 (메모리의 사용되지 않는 객체를 가비지 컬렉터가 자동으로 객체를 제거해줌)
 * 		=> 실사용 유형 ex. 프로세스가 종료시점에 자동저장, 화면 자동 갱신 등
 * 	- 무한 루프를 사용해서 항시 대기하고 있다가 특정 조건이 만족되면 작업을 수행하고 다시 대기 상태에 들어감
 */

class MyThread extends Thread {		// 스레드를 작동시킬 class
	@Override
	public void run() {
		System.out.println(getName() + " : " + (isDaemon() ? "데몬스레드" : "일반스레드"));
		
		for (int i = 0; i < 6; i++) {
			System.out.println(getName() + " : " + i + "초");
			try {Thread.sleep(1000);} catch (InterruptedException e) {}
		}
	}
}

public class ThreadPorperties03 {

	public static void main(String[] args) {
		// 1. 일반 스레드
		
		/*
		Thread thread1 = new MyThread();
		thread1.setDaemon(false);		// setDaemon : 기본값으로 false 설정되어있음
		thread1.setName("thread1");
		
		thread1.start();
		
		System.out.println("----------------------");
		*/
		
		// 2. Daemon 스레드 : 마지막 스레드가 종료되는 시점에 종료
		Thread thread2 = new MyThread();
		thread2.setDaemon(true);		// setDaemon : 기본값으로 false 설정되어있음
		thread2.setName("thread2");
		
		thread2.start();
		
		System.out.println("----------------------");
		
		// 3. 3.5초 후에 main 스레드를 종료
		try {Thread.sleep(3500);} catch (InterruptedException e) {}
		System.out.println("main Thread 종료");
	}

}
