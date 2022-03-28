package chap15.Ex17;

// a.join(1000) : a ��ü���� CPU�� �Ҵ��ϰ� �ڽ��� TimeWaiting ���·� ���

class MyThread1 extends Thread {
	@Override
	public void run() {
		for (long i = 0; i < 300000000000L; i++) {}	// �۾� Ƚ��. 0.5�� �ð� ����
	};
}

class MyThread2 extends Thread {
	MyThread1 myThread1;		// classŸ�� ����������;
	
	public MyThread2(MyThread1 myThread1) {		// �����ڸ� ���ؼ� ���������� �� �Ҵ�
		this.myThread1 = myThread1;
	}
	
	@Override
	public void run() {
		try {
			myThread1.join(3000);		// MyThread2�� 3�� ����ϰ� myThread1���� CPU �Ҵ�
		} catch (InterruptedException e) {
			System.out.println("---<< join(...) ���� �� Interrupt �߻� >>---");
			for (long i = 0; i < 300000000000L; i++) {}	// 0.5�� �ð� ����
		}
	}
}

public class TimeWaiting_Join {

	public static void main(String[] args) {
		// 1. ��ü ����
		
		MyThread1 myThread1 = new MyThread1();
		MyThread2 myThread2 = new MyThread2(myThread1);
		myThread1.start();
		myThread2.start();

		try {Thread.sleep(1);} catch (InterruptedException e) {}		// ������ ���� �غ� �ð� 0.1��
		System.out.println("MyThread1 State : " + myThread1.getState());		// runnable
		System.out.println("MyThread2 State : " + myThread2.getState());		// timed_waiting
		
		myThread2.interrupt();		// 3�� ��� �� ���� interrupt�� �߻��Ǹ� ���ܸ� �߻���Ű�� Runnable�� ��ȯ
		try {Thread.sleep(1);} catch (InterruptedException e) {}		// ������ ���� �غ� �ð� 0.1��
		System.out.println("MyThread1 State : " + myThread1.getState());		// terminated. �̹� �۾� ��
		System.out.println("MyThread2 State : " + myThread2.getState());		// runnable
	}

}
