package chap15.Ex11;

/*
 * ���� �����尡 ������ �ʵ忡 ������ �� ���ü��� ������ �߻� => ����ȭ�� ���ü� ������ �ذ�
 * 
 * ����ȭ : ���� �����尡 ������ �ʵ带 ������ �� �ϳ��� �����尡 �Ϸ�Ǹ� �ٸ� �����忡�� ������ ���� 
 * 	- �ϳ��� �����尡 ������� ��� lock�� �ɰ� �۾��� �Ϸ�Ǹ� �ٸ� �����尡 ���� �����ϵ��� lock ����
 * 	- ��� ����ȭ�� �޼ҵ�� this Ű���常 ����
 * 	- ���� �޼ҵ尡 ����ȭ�� �޼ҵ��� ��� : �ϳ��� �����常 ������ ����
 */

class MyData {		// ���� ��ü : ���� �����尡 ���� ��ü�� ����
	// ����ȭ�� method�� key ���� ��� this�� �ڵ����� �����Ǹ� ������ �Ұ�
	// ����ȭ method�� key ���� ���� �� ����
	// �ϳ��� �����尡 ������ �� key�� ������ ����ȭ�� method�� ����
	// key�� ��ü�� key�� ��� ����
	// ����ȭ ����� key ���� ���Ƿ� �Ҵ� ����
	synchronized void abc() {		// ���� �����尡 ������ �� ���ü� ������ �����ϱ� ���� ����ȭ ó��
		for (int i = 0; i < 3; i++) {
			try {Thread.sleep(10);} catch (InterruptedException e1) {}		// 0.01�� ����
			System.out.println(i + " sec");
			try {Thread.sleep(1000);} catch (InterruptedException e) {}		// 1�� ����
		}
	}
	
	synchronized void bcd() {		// ���� �����尡 ������ �� ���ü� ������ �����ϱ� ���� ����ȭ ó��
		for (int i = 0; i < 3; i++) {
			try {Thread.sleep(30);} catch (InterruptedException e1) {}		// 0.02�� ����
			System.out.println(i + " ��");
			try {Thread.sleep(1000);} catch (InterruptedException e) {}		// 1�� ����
		}
	}
	
	synchronized void cde() {		// ���� �����尡 ������ �� ���ü� ������ �����ϱ� ���� ����ȭ ó��
		for (int i = 0; i < 3; i++) {
			try {Thread.sleep(50);} catch (InterruptedException e1) {}		// 0.03�� ����
			System.out.println(i + " ��°");
			try {Thread.sleep(1000);} catch (InterruptedException e) {}		// 1�� ����
		}
	}
}

public class KeyObject01 {

	public static void main(String[] args) {
		// ���� ��ü
		MyData myData = new MyData();
		
		// 3���� �����尡 ������ method ȣ��
		new Thread() {		// �͸� class : ������ class�� �����ϴ� �ڽ� �͸� class
			public void run() {
				myData.abc();		// ù��° ������ : abc() method ȣ��
			};
		}.start();
		
		new Thread() {		// �͸� class : ������ class�� �����ϴ� �ڽ� �͸� class
			public void run() {
				myData.bcd();		// �ι�° ������ : bcd() method ȣ��
			};
		}.start();
		
		new Thread() {		// �͸� class : ������ class�� �����ϴ� �ڽ� �͸� class
			public void run() {
				myData.cde();		// ����° ������ : cde() method ȣ��
			};
		}.start();

	}

}
