package chap15.Ex06;

// ������ �켱����

class MyThread extends Thread {
	@Override
	public void run() {
		for (long i = 0L; i < 1000000000; i++) {		// �ð� ������
			
		}
		System.out.println(getName() + "\t" +"�켱���� "+ getPriority());
	}
}

public class ThreadProperties02 {

	public static void main(String[] args) {
		// 1. ���� : CPU core Ȯ�� �ϱ�
		System.out.println("�ھ� �� : " + Runtime.getRuntime().availableProcessors());
		
		System.out.println("----------------------");
		
		// 2. �켱 ���� => min : 0 ~ max : 10 (default : 5)
		for (int i = 0; i < 3; i++) {
			Thread thread = new Thread();
			System.out.print(thread.getName() + "\t");		// ������ �̸� ���
			System.out.println(thread.getPriority());		
			thread.start();
		}
		
		System.out.println("----------------------");
		
		try {Thread.sleep(1000);} catch (InterruptedException e) {}		// 1�� ����
		
		// 3. �켱���� ���� ����
		for (int i = 0; i < 10; i++) {		// ������ 0 ~ 8 : �켱������ 5 (default)
			Thread thread = new MyThread();

			thread.setName(i + "��° ������");
			
			// System.out.print(thread.getName() + "\t");		// ������ �̸� ���
			// System.out.println(thread.getPriority());		// ������ �켱 ���� ���
			
			if (i == 9) {		// ������ �������� �켱 ������ 10���� �Ҵ�
				thread.setPriority(10);
			}
			thread.start(); 
		}
	}

}
