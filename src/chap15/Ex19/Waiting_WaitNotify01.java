package chap15.Ex19;

/*
 * Waiting :
 * 	a.join() : �ڽ��� ������� Waiting �����̰� a ��ü���� CPU �۾��� �Ҵ�
 * 		=> a ��ü�� �۾��� �Ϸ�Ǹ� �ڽ��� �����尡 ����(runnable ����)
 * 		 	- �ڽ� �������� ó���� ������ �ٸ� �������� ����� �޾Ƽ� ó���ؾ��� ��� ���
 * 	
 * 	wait(), notify(), notifyAll() => ����ȭ ��Ͽ����� ����
 * 	 - wait() : ����ȭ ���(or method) ���ο��� wait() method�� ������ Waiting ���·� ��ȯ
 * 	 - notify(), notifyAll() : wait() method�� ������ => �ݵ�� �ٸ� �����忡�� ���
 */

class DataBox {
	int data;		// ���� �ʵ�
	
	synchronized void inputData(int data) {		// ����ȭ method
		this.data = data;
		System.out.println("�Է� ������ : " + data);		// data : �Ű����� ������ ���� ������
	}
	
	synchronized void outputData() {		// ����ȭ method
		System.out.println("��� ������ : " + data);
	}
}

public class Waiting_WaitNotify01 {

	public static void main(String[] args) {
		DataBox dataBox = new DataBox();
		
		// 1�� ������ : ���� ��ü���� �ִ� ������
		Thread t1 = new Thread() {		// �͸� ����Ŭ����
			@Override
			public void run() {
				for (int i = 1; i < 9; i++) {
					dataBox.inputData(i);
				}
			}
		};	
		
		// 2�� ������ : ���� ��ü�κ��� ���� �о���� ������
		Thread t2 = new Thread() {
			@Override
			public void run() {
				for (int i = 1; i < 9; i++) {
					dataBox.outputData();
				}
			}
		};
		t1.start();
		t2.start();
	}

}
