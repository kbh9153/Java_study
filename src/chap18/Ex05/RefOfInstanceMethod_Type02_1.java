package chap18.Ex05;

/*
 * 2. method ���� (���� method ǥ��)
 * 	- method ���� : ���� �������� �ʰ� �����Ǿ� �ִ� method�� �����ؼ� ���
 * 	- ���� method ���� : �����Ǿ� �ִ� method�� ����
 */

interface A {
	void abc();
}

class B {
	static void bcd() {		// static method : class �̸����� ȣ���� ������
		System.out.println("method");
	}
}

public class RefOfInstanceMethod_Type02_1 {
	public static void main(String[] args) {
		// 1. ���� method ���� : �̳�Ŭ������ ó��
		A a1 = new A() {
			@Override
			public void abc() {
				B.bcd();	// static�� ����� ���� method ȣ��. ��ü �������� class�̸�.method�̸� ���� ȣ��
			}
		};
		
		// 2. ���ٽ� ǥ��
		A a2 = () -> { B.bcd(); };		// ���ٽ� ǥ��
		
		// 3. ���� method ����
		A a3 = B::bcd;
		
		a1.abc();
		a2.abc();
		a3.abc();
	}
}
