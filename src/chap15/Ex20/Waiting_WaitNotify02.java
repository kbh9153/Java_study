package chap15.Ex20;

class DataBox {
	boolean isEmpty = true;		// 기본값 셋팅
	int data;		// 공유 필드
	
	synchronized void inputData(int data) {		// 동기화 method
		isEmpty = false;		// Data 필드의 값을 넣고 t2 스레드가 값을 읽을 수 있도록 자신은 false 셋팅
		
		if (!isEmpty) {		// 조건이 false일 때 wait(); 동기화 블록이나 동기화 method에서 WAITTING 상태로 전환
							// data 필드의 값이 비어있지 않을 때 t2 스레드가 처리하도록 잠시 대기 
			try {wait();} catch (InterruptedException e) {}
		}
		this.data = data;
		System.out.println("입력 데이터 : " + data);		// data : 매개변수 값으로 들어온 데이터
		notify();
	}
	
	synchronized void outputData() {		// 동기화 method
		isEmpty = true;
		
		if (isEmpty) {
			try {wait();} catch (InterruptedException e) {}
		}
		System.out.println("출력 데이터 : " + data);
		notify();		// Wait 상태의 inputData 스레드를 깨워줌
	}
}

public class Waiting_WaitNotify02 {

	public static void main(String[] args) {
		DataBox dataBox = new DataBox();
		
		// 1번 스레드 : 공유 객체값을 넣는 스레드
		Thread t1 = new Thread() {		// 익명 내부클래스
			@Override
			public void run() {
				for (int i = 1; i < 10; i++) {
					dataBox.inputData(i);
				}
			}
		};	
		
		// 2번 스레드 : 공유 객체로부터 값을 읽어오는 스레드
		Thread t2 = new Thread() {
			@Override
			public void run() {
				for (int i = 1; i < 10; i++) {
					dataBox.outputData();
				}
			}
		};
		t1.start();
		t2.start();

	}

}
