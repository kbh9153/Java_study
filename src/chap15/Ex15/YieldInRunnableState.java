package chap15.Ex15;
	
/* 
 * Thread.yield(); : �������� ������� (RUUNNABLE)�� �ִ� Ư�� �����忡�� �ڽ��� ������� �Ͻ� �纸
 * 	- ������� ���ο��� �ٸ� �����带 ���� �����ϵ��� �纸
 * 	- ex. ����ȭ���� key�� ���� �����ϴ� ������ �߻���. Ű�� �纸�ؼ� �յ��ϰ� ó���ϵ��� 
 */

class MyThread extends Thread {
	boolean yieldFlag;
	@Override
	public void run() {
		while (true) {		// ���� ����
			if (yieldFlag) {		// yieldFlag�� True�� �� �����带 �纸
				Thread.yield();		// �����带 �纸
			} else {		// yieldFalg�� False�� �� ������ ������ ���
				System.out.println(getName() + "����");
				for (long i = 0; i < 100000000L; i++) {}	// 0.5�� �ð� ����
			}
		}
	}
}

public class YieldInRunnableState {
	public static void main(String[] args) {
		MyThread thread1 = new MyThread();
		thread1.setName("thread1");
		thread1.yieldFlag = false;		// false�� �� ������ ���� ���
		thread1.setDaemon(true);		// ������ (�Ϲ�)�����尡 ����� �� ����. while ���� ������ ���� ���������� ���ؼ���
		thread1.start();
		
		MyThread thread2 = new MyThread();
		thread2.setName("thread2");
		thread2.yieldFlag = true;
		thread2.setDaemon(true);
		thread2.start();
		
		// ������ 6�� ���� (1�ʸ��� �ѹ��� �纸)
		for (int i = 0; i < 6; i++) {
			try {Thread.sleep(1000);} catch (InterruptedException e) {}		// 1�� ����
			thread1.yieldFlag = !thread1.yieldFlag;		// ���� �� ������ �����ϰ� ������ �� ���� ����
			thread2.yieldFlag = !thread2.yieldFlag;		// ���� �� ������ �����ϰ� ������ �� ���� ����
		}
	}
}


