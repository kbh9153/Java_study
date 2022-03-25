package chap15.Ex01;

/*
 * ���ο� ������ ���� ���
 * 	1. Thread class�� ����Ͽ� run()�� Overriding�ؼ� ���� (run(){} : �ϼ��� method)
 * 	2. Runnable interface�� run()�� ���� (run(); : �̿ϼ��� method)
 */

class SMIFileThread extends Thread {
	@Override
	public void run() {		// ������ �����忡�� �۾��� ������ ����
		// 2��° �����忡�� �۾��� ����
		// �ڸ� ������ ���
		String[] strArray = {"�ϳ�", "��", "��", "��", "�ټ�"};
		
		// �ڸ� ��±���
		for (int i = 0; i < strArray.length; i++) {
			System.out.println(" - (�ڸ� ��ȣ) " + strArray[i]);
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {

			}
		}
	}
}

public class CreateAndStartThread {

	public static void main(String[] args) {
		// 0 ������ �۵�
		Thread sm = new SMIFileThread();		// Thread Ÿ������ ��ĳ����
		
		sm.start();		// run(); method�� ���� - ������ ����
		// ���� : run() ���� ȣ���ϸ� �����尡 �۵��Ǵ� ���� �ƴ϶� method�� ���
		// start() : �����带 �۵��ϱ� ���� �޸� �Ҵ� �� run()�� ȣ�� => ������� �۾���
		
		// 1. ù��° ������ (main thread���� �۵�) - ���� ������ ��� (1�� ������)
		int[] intArray = {1, 2, 3, 4, 5};
		
		// ���� ������ ���
		for (int i = 0; i < intArray.length; i++) {
			System.out.print("(���� ������) " + intArray[i] + " ");
			
			// �۾� ���� (0.2�� ����)
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {

			}
		}

	}

}
