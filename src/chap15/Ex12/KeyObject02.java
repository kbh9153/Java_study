package chap15.Ex12;

class A {}
class B {}
class C {}

class MyData {                                                         // 공유객체 : 여러 스레드가 공유 객체에 접근
	   
	   // 동기화된 메소드는 Key값이 모두 this 이며, 수정이 불가능하다.
	   // 동기화된 메소드는 Key값을 넣을 수 없다.
	   // 하나의 스레드가 접근할 때, key를 가지고 동기화된 메소드에 접근이 가능하다.
	   
	   // 동기화 블럭은 Key 값을 임의로 할당이 가능하다.
	   // 객체를 Key로 사용할 수 있다.
	   
	   synchronized void abc() {                                             // 여러 스레드가 접근할 때, 동시성 문제를 방지하기위해 동기화처리
	      for (int i = 0; i < 3; i++) {
	         try {Thread.sleep(10);} catch (InterruptedException e1) {}
	         System.out.println(i + "sec");
	         try {Thread.sleep(1000);} catch (InterruptedException e) {}               // 1초 딜레이
	      }
	   }
	   
	   void bcd() {
	      synchronized(new A()) {                                             // A클래스 익명 객체를 Key로 블락동기화
	         for (int i = 0; i < 3; i++) {
	            try {Thread.sleep(20);} catch (InterruptedException e1) {}
	            System.out.println(i + "초");
	            try {Thread.sleep(1000);} catch (InterruptedException e) {}               // 1초 딜레이
	         }
	      }
	   }
	   
	   void cde() {
	      synchronized (new Object()) {                                       // Object 클래스 익명 객체를 Key로 블락동기화
	         for (int i = 0; i < 3; i++) {
	            try {Thread.sleep(30);} catch (InterruptedException e1) {}
	            System.out.println(i + "번 째");
	            try {Thread.sleep(1000);} catch (InterruptedException e) {}            // 1초 딜레이
	         }
	      }
	   }
	}

public class KeyObject02 {

	public static void main(String[] args) {
		// 공유 객체
		MyData myData = new MyData();
		
		// 3개의 스레드가 각각의 method 호출
		new Thread() {		// 익명 class : 스레드 class를 구현하는 자식 익명 class
			public void run() {
				myData.abc();		// 첫번째 스레드 : abc() method 호출
			};
		}.start();
		
		new Thread() {		// 익명 class : 스레드 class를 구현하는 자식 익명 class
			public void run() {
				myData.bcd();		// 두번째 스레드 : bcd() method 호출
			};
		}.start();

	}

}
