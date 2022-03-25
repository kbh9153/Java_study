package chap15.Ex08;

// ����ȭ (Synchronized) : ���� �����尡 �ϳ��� ������ �ʵ带 ������ ���
	//	�� �۾��� ������ �Ϸ� �� ���� �۾��� ó���ϵ��� ����
	// ���� �۾��� �� lock�� �ɰ� �۾��� ��ġ�� lock�� ���� �� ���� �۾� ����

// 1. ����ȭ�� ó������ �ʾ��� �� ����

class MyData {		// �����尡 �����ϴ� ��ü �ʵ� ����
	int data = 3;		// ������ ��������
	
	void plusData() {
		int myData = data;
		try {Thread.sleep(2000);} catch (InterruptedException e) {}
		data = myData + 1;
		
	}
}

class PlusThread extends Thread {		// 1�� �����ϸ鼭 2���� ������
	MyData myData;		// ��ü (������)
	
	public PlusThread(MyData myData) {
		this.myData = myData;
	}
	
	@Override
	public void run() {
		myData.plusData();
		System.out.println(getName() + "���� ��� : " + myData.data);
	}
}

public class TheNeedForSynchronized {

	public static void main(String[] args) {
		// ���� ��ü ����
		MyData myData = new MyData();
		
		// 1. PlusThread 1
		Thread plusThread1 = new PlusThread(myData);
		plusThread1.setName("plusThread1");
		
		plusThread1.start();
		
		try {Thread.sleep(1000);} catch (InterruptedException e) {}
		
		// 2. PlusThread2
		Thread plusThread2 = new PlusThread(myData);
		plusThread2.setName("plusThread2");
		
		plusThread2.start();
	}

}
