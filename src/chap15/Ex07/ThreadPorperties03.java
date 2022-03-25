package chap15.Ex07;

/*
 * �Ϲݽ����� : setDaemon(false) => ������ �����尡 ����Ǵ��� �ڽ��� ���� ��� ����ġ�� �����
 * ���󽺷��� : setDaemon(true) => �����带 ������ ��, ���󽺷��嵵 ����. ���� ������ �Ұ�
 * 	- ������ �Ϲ� �����尡 ����Ǵ� ������ ���󽺷��嵵 ����
 * 	- ���󽺷���� �Ϲ������� �ٸ� �������� �۾��� ���� ���� ������ ����
 * 	- ��������� ������ �Ϲݽ����� ����� �� ����� �� ������ �ܿ��� �Ϲݽ������ ����
 * 	- ��ǥ���� �� : ������ �÷�Ʈ (�޸��� ������ �ʴ� ��ü�� ������ �÷��Ͱ� �ڵ����� ��ü�� ��������)
 * 		=> �ǻ�� ���� ex. ���μ����� ��������� �ڵ�����, ȭ�� �ڵ� ���� ��
 * 	- ���� ������ ����ؼ� �׽� ����ϰ� �ִٰ� Ư�� ������ �����Ǹ� �۾��� �����ϰ� �ٽ� ��� ���¿� ��
 */

class MyThread extends Thread {		// �����带 �۵���ų class
	@Override
	public void run() {
		System.out.println(getName() + " : " + (isDaemon() ? "���󽺷���" : "�Ϲݽ�����"));
		
		for (int i = 0; i < 6; i++) {
			System.out.println(getName() + " : " + i + "��");
			try {Thread.sleep(1000);} catch (InterruptedException e) {}
		}
	}
}

public class ThreadPorperties03 {

	public static void main(String[] args) {
		// 1. �Ϲ� ������
		
		/*
		Thread thread1 = new MyThread();
		thread1.setDaemon(false);		// setDaemon : �⺻������ false �����Ǿ�����
		thread1.setName("thread1");
		
		thread1.start();
		
		System.out.println("----------------------");
		*/
		
		// 2. Daemon ������ : ������ �����尡 ����Ǵ� ������ ����
		Thread thread2 = new MyThread();
		thread2.setDaemon(true);		// setDaemon : �⺻������ false �����Ǿ�����
		thread2.setName("thread2");
		
		thread2.start();
		
		System.out.println("----------------------");
		
		// 3. 3.5�� �Ŀ� main �����带 ����
		try {Thread.sleep(3500);} catch (InterruptedException e) {}
		System.out.println("main Thread ����");
	}

}
