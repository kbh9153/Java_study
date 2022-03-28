package chap15.Ex12;

class A {}
class B {}
class C {}

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

public class KeyObject02 {

	public static void main(String[] args) {
		// ���� ��ü
		MyData myData = new MyData();
		
		// 3���� �����尡 ������ method ȣ��
		new Thread() {		// �͸� class : ������ class�� �����ϴ� �ڽ� �͸� class
			public void run() {
				myData.abc();		// ù��° ������ : abc() method ȣ��
			};
		}.start();
		
		new Thread() {		// �͸� class : ������ class�� �����ϴ� �ڽ� �͸� class
			public void run() {
				myData.bcd();		// �ι�° ������ : bcd() method ȣ��
			};
		}.start();

	}

}
