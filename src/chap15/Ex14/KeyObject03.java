package chap15.Ex14;

/*
 * 여러 스레드가 공유된 필드에 접근할 때 동시성의 문제가 발생 => 동기화로 동시성 문제를 해결
 * 
 * 동기화 : 여러 스레드가 공유된 필드를 접근할 때 하나의 스레드가 완료되면 다른 스레드에서 접근이 가능 
 * 	- 하나의 스레드가 사용중인 경우 lock을 걸고 작업이 완료되면 다른 스레드가 접근 가능하도록 lock 해제
 * 	- 모든 동기화된 메소드는 this 키워드만 가짐
 * 	- 여러 메소드가 동기화된 메소드일 경우 : 하나의 스레드만 접근이 가능
 * 
 * class 내부에 여러개의 동기화 method가 있을 경우 : 모두 스레드가 접근하는 키가 this
 * 	- 여러개의 동기화 method 내부에서 멀티 스레드를 사용하고자 할 경우 : 동기화 블록을 생성 후 키를 다르게 설정
 */

class A{}
class B{}
class C{}

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

public class KeyObject03 {

	public static void main(String[] args) {
		 // 공유 객체
      MyData myData = new MyData();
      
      // 세개의 쓰레드가 각각의 메소드 호출
      new Thread() {                                                   // Thread 클래스를 구현하는 자식 익명 클래스
         @Override
          public void run() {
            myData.abc();                                             // 첫 번째 스레드, abc() 메소드 호출
         };
      }.start();
      
      new Thread() {                                                   // Thread 클래스를 구현하는 자식 익명 클래스
         @Override
          public void run() {
            myData.bcd();                                             // 두 번째 스레드, bcd() 메소드 호출
         };
      }.start();
      
      new Thread() {                                                   // Thread 클래스를 구현하는 자식 익명 클래스
         @Override
          public void run() {
            myData.cde();                                             // 세 번째 스레드, cde() 메소드 호출
         };
      }.start();
      
	}
}
