package chap14.Ex06;

/*
 * ���� ó�� 2���� ���
 * 	1. ���� ó�� : try catch
 * 	2. ���� ����(�̷��) : throws. method�� ȣ���ϴ� �ʿ��� ���ܸ� ó���ϵ��� ����
 * 		- throw : ������ ���ܸ� �߻���Ŵ
 */

class A {		// method ���ο��� ���ܸ� ���� ó��
	void abc() {
		bcd();
	}
	
	void bcd() {
		try {
		Thread.sleep(1000);			// �Ϲ� ���� : InterruptedException		
		// 1000�и��� = 1��
		} catch (InterruptedException e) {
			// e.printStackTrace();
			System.out.println("���� �߻� 1");
		}
	}
}
	
class B {
	void abc() {		// bcd() method�� ���ܸ� ó���� �ǹ��� ����
		try {
			bcd();
		} catch (InterruptedException e) {
			// e.printStackTrace();
			System.out.println("���� �߻� 2");
		}
	}
	
	void bcd() throws InterruptedException {		// bcd() method�� ȣ���ϴ� ��(abc())���� ���ܸ� ó���ϵ��� ����
		Thread.sleep(1000);		// �Ϲ� ���� : InterruptedException �߻�		
	}
}

public class ThrowsException {

	public static void main(String[] args) {
		A a1 = new A();
		a1.abc();

	}

}
