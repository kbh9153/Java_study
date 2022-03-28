package chap15.Ex14;

/*
 * ���� �����尡 ������ �ʵ忡 ������ �� ���ü��� ������ �߻� => ����ȭ�� ���ü� ������ �ذ�
 * 
 * ����ȭ : ���� �����尡 ������ �ʵ带 ������ �� �ϳ��� �����尡 �Ϸ�Ǹ� �ٸ� �����忡�� ������ ���� 
 * 	- �ϳ��� �����尡 ������� ��� lock�� �ɰ� �۾��� �Ϸ�Ǹ� �ٸ� �����尡 ���� �����ϵ��� lock ����
 * 	- ��� ����ȭ�� �޼ҵ�� this Ű���常 ����
 * 	- ���� �޼ҵ尡 ����ȭ�� �޼ҵ��� ��� : �ϳ��� �����常 ������ ����
 * 
 * class ���ο� �������� ����ȭ method�� ���� ��� : ��� �����尡 �����ϴ� Ű�� this
 * 	- �������� ����ȭ method ���ο��� ��Ƽ �����带 ����ϰ��� �� ��� : ����ȭ ����� ���� �� Ű�� �ٸ��� ����
 */

class A{}
class B{}
class C{}

class MyData {                                                         // ������ü : ���� �����尡 ���� ��ü�� ����
   
   // ����ȭ�� �޼ҵ�� Key���� ��� this �̸�, ������ �Ұ����ϴ�.
   // ����ȭ�� �޼ҵ�� Key���� ���� �� ����.
   // �ϳ��� �����尡 ������ ��, key�� ������ ����ȭ�� �޼ҵ忡 ������ �����ϴ�.
   
   // ����ȭ ���� Key ���� ���Ƿ� �Ҵ��� �����ϴ�.
   // ��ü�� Key�� ����� �� �ִ�.
   
   synchronized void abc() {                                             // ���� �����尡 ������ ��, ���ü� ������ �����ϱ����� ����ȭó��
      for (int i = 0; i < 3; i++) {
         try {Thread.sleep(10);} catch (InterruptedException e1) {}
         System.out.println(i + "sec");
         try {Thread.sleep(1000);} catch (InterruptedException e) {}               // 1�� ������
      }
   }
   
   void bcd() {
      synchronized(new A()) {                                             // AŬ���� �͸� ��ü�� Key�� �������ȭ
         for (int i = 0; i < 3; i++) {
            try {Thread.sleep(20);} catch (InterruptedException e1) {}
            System.out.println(i + "��");
            try {Thread.sleep(1000);} catch (InterruptedException e) {}               // 1�� ������
         }
      }
   }
   
   void cde() {
      synchronized (new Object()) {                                       // Object Ŭ���� �͸� ��ü�� Key�� �������ȭ
         for (int i = 0; i < 3; i++) {
            try {Thread.sleep(30);} catch (InterruptedException e1) {}
            System.out.println(i + "�� °");
            try {Thread.sleep(1000);} catch (InterruptedException e) {}            // 1�� ������
         }
      }
   }
}

public class KeyObject03 {

	public static void main(String[] args) {
		 // ���� ��ü
      MyData myData = new MyData();
      
      // ������ �����尡 ������ �޼ҵ� ȣ��
      new Thread() {                                                   // Thread Ŭ������ �����ϴ� �ڽ� �͸� Ŭ����
         @Override
          public void run() {
            myData.abc();                                             // ù ��° ������, abc() �޼ҵ� ȣ��
         };
      }.start();
      
      new Thread() {                                                   // Thread Ŭ������ �����ϴ� �ڽ� �͸� Ŭ����
         @Override
          public void run() {
            myData.bcd();                                             // �� ��° ������, bcd() �޼ҵ� ȣ��
         };
      }.start();
      
      new Thread() {                                                   // Thread Ŭ������ �����ϴ� �ڽ� �͸� Ŭ����
         @Override
          public void run() {
            myData.cde();                                             // �� ��° ������, cde() �޼ҵ� ȣ��
         };
      }.start();
      
	}
}
