package chap15.Ex19;

/*
 * Waiting :
 * 	a.join() : 자신의 스레드는 Waiting 상태이고 a 객체에게 CPU 작업을 할당
 * 		=> a 객체가 작업이 완료되면 자신의 스레드가 실행(runnable 상태)
 * 		 	- 자신 스레드의 처리할 내용이 다른 스레드의 결과를 받아서 처리해야할 경우 사용
 * 	
 * 	wait(), notify(), notifyAll() => 동기화 블록에서만 사용됨
 * 	 - wait() : 동기화 블록(or method) 내부에서 wait() method를 만나면 Waiting 상태로 전환
 * 	 - notify(), notifyAll() : wait() method를 깨워줌 => 반드시 다른 스레드에서 사용
 */

class DataBox {
	int data;		// 공유 필드
	
	synchronized void inputData(int data) {		// 동기화 method
		this.data = data;
		System.out.println("입력 데이터 : " + data);		// data : 매개변수 값으로 들어온 데이터
	}
	
	synchronized void outputData() {		// 동기화 method
		System.out.println("출력 데이터 : " + data);
	}
}

public class Waiting_WaitNotify01 {

	public static void main(String[] args) {
		DataBox dataBox = new DataBox();
		
		// 1번 스레드 : 공유 객체값을 넣는 스레드
		Thread t1 = new Thread() {		// 익명 내부클래스
			@Override
			public void run() {
				for (int i = 1; i < 9; i++) {
					dataBox.inputData(i);
				}
			}
		};	
		
		// 2번 스레드 : 공유 객체로부터 값을 읽어오는 스레드
		Thread t2 = new Thread() {
			@Override
			public void run() {
				for (int i = 1; i < 9; i++) {
					dataBox.outputData();
				}
			}
		};
		t1.start();
		t2.start();
	}

}
