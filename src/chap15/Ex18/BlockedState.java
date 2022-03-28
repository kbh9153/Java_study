package chap15.Ex18;

// BLOCKED ���� : ����ȭ method�� ����ȭ ��Ͽ��� �ϳ��� �����尡 key�� ������ ��� ��� ������ ������ 

class MyBlockTest {
	// 1. ���� ��ü (����ȭ method, ����ȭ ���)
	MyClass mc = new MyClass();
	
	// 2. 3���� ������ �ʵ� ����
	Thread t1 = new Thread("thread1") {
		public void run() {
			mc.syncMethod();
		};
	};
	
	Thread t2 = new Thread("thread2") {
		public void run() {
			mc.syncMethod();
		};
	};
	
	Thread t3 = new Thread("thread3") {
		public void run() {
			mc.syncMethod();
		};
	};
	
	void startAllMethod() {
		t1.start();
		t2.start();
		t3.start();
	}
	
	class MyClass {		// MyBLockTest�� InnerClass
		synchronized void syncMethod() {		// ����ȭ method : �����尡 Ű�� ���� �����常 ����
			try {Thread.sleep(100);} catch (InterruptedException e) {}		// ������ �غ�ð� 0.1�� ����
			System.out.println("---<< " + Thread.currentThread().getName() + " >>---");
			System.out.println("thread1 -> " + t1.getState());
			System.out.println("thread2 -> " + t2.getState());
			System.out.println("thread3 -> " + t3.getState());
		}
	}

}


public class BlockedState {

	public static void main(String[] args) {
		MyBlockTest mdt = new MyBlockTest();
		mdt.startAllMethod();

	}

}
