package chap15.Ex09;

//����ȭ (Synchronized) : ���� �����尡 �ϳ��� ������ �ʵ带 ������ ���
	//	�� �۾��� ������ �Ϸ� �� ���� �۾��� ó���ϵ��� ����
	// ���� �۾��� �� lock�� �ɰ� �۾��� ��ġ�� lock�� ���� �� ���� �۾� ����

// 1. method ����ȭ : method ��ü�� ����ȭ�ϴ� ��
	// key ���� this �Ҵ�
class MyData {		// �����尡 �����ϴ� ��ü �ʵ� ����
	int data = 3;		// ������ ��������
	
	public synchronized void plusData() {		// method ����ȭ : method ��ü�� ����ȭ
		// ����ȭ ó�� method : �ϳ��� �����尡 �۾��� �Ϸ�Ǹ� ���� �����尡 �۾� ����
		int myData = data;
		try {Thread.sleep(2000);} catch (InterruptedException e) {}
		data = myData + 1;
		
	}
}

class PlusThread extends Thread {		// 1�� �����ϸ鼭 2���� ������
	MyData myData;		// ��ü (������ X)
	
	public PlusThread(MyData myData) {
		this.myData = myData;
	}
	
	@Override
	public void run() {
		myData.plusData();
		System.out.println(getName() + "���� ��� : " + myData.data);
	}
}

public class SynchronizedMethod {

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
