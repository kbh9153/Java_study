package chap15.Ex20;

class DataBox {
	boolean isEmpty = true;		// �⺻�� ����
	int data;		// ���� �ʵ�
	
	synchronized void inputData(int data) {		// ����ȭ method
		isEmpty = false;		// Data �ʵ��� ���� �ְ� t2 �����尡 ���� ���� �� �ֵ��� �ڽ��� false ����
		
		if (!isEmpty) {		// ������ false�� �� wait(); ����ȭ ����̳� ����ȭ method���� WAITTING ���·� ��ȯ
							// data �ʵ��� ���� ������� ���� �� t2 �����尡 ó���ϵ��� ��� ��� 
			try {wait();} catch (InterruptedException e) {}
		}
		this.data = data;
		System.out.println("�Է� ������ : " + data);		// data : �Ű����� ������ ���� ������
		notify();
	}
	
	synchronized void outputData() {		// ����ȭ method
		isEmpty = true;
		
		if (isEmpty) {
			try {wait();} catch (InterruptedException e) {}
		}
		System.out.println("��� ������ : " + data);
		notify();		// Wait ������ inputData �����带 ������
	}
}

public class Waiting_WaitNotify02 {

	public static void main(String[] args) {
		DataBox dataBox = new DataBox();
		
		// 1�� ������ : ���� ��ü���� �ִ� ������
		Thread t1 = new Thread() {		// �͸� ����Ŭ����
			@Override
			public void run() {
				for (int i = 1; i < 10; i++) {
					dataBox.inputData(i);
				}
			}
		};	
		
		// 2�� ������ : ���� ��ü�κ��� ���� �о���� ������
		Thread t2 = new Thread() {
			@Override
			public void run() {
				for (int i = 1; i < 10; i++) {
					dataBox.outputData();
				}
			}
		};
		t1.start();
		t2.start();

	}

}
