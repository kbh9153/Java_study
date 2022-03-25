package chap15.Ex10;

// 동기화 : 여러 스레드가 공유된 필드에 접근할 떄 기존 하나의 스레드 작업 중일 때 다른 스레드가 접근하지 못하도록 설정
//	=> method 동기화, 블록 동기화 2가지로 구분

// 블록 동기화 : method 내부의 일부분만 동기화
//	=> 구문 형식 : synchronized(this) {}
	// => this: 자신의 객체, new 자신의 객체

class MyData {		// 스레드가 공유하는 객체 필드 생성
	int data = 3;		// 데이터 가져오기
	
	public void plusData() {
		synchronized (this) {		// 블록 동기화 : method 내부의 특정(일부분) 블록만 동기화. this : 자신의 객체
			int myData = data;
			try {Thread.sleep(2000);} catch (InterruptedException e) {}
			data = myData + 1;
		}
	}
}

class PlusThread extends Thread {		// 1씩 증가하면서 2개의 스레드
	MyData myData;		// 객체 (구현부 X)
	
	public PlusThread(MyData myData) {
		this.myData = myData;
	}
	
	@Override
	public void run() {
		myData.plusData();
		System.out.println(getName() + "실행 결과 : " + myData.data);
	}
}

public class SynchronizedBlock {

	public static void main(String[] args) {
		// 공유 객체 생성
		MyData myData = new MyData();
		
		// 1. PlusThread 1
		Thread plusThread1 = new PlusThread(myData);
		plusThread1.setName("plusThread1");
		
		plusThread1.start();
		
		try {Thread.sleep(1000);} catch (InterruptedException e) {}
		
		// 2. PlusThread2
		Thread plusThread2 = new PlusThread(myData);
		plusThread2.setName("plusThread2");
		
		plusThread2.start();

	}

}
