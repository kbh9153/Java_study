package chap18.Ex04;

/*
 * ���ٽ��� Ȱ��
 * 	1. �͸��̳�Ŭ����
 * 	2. method ���� (1. �ν��Ͻ� method ����, 2. ���� method ����)
 * 		=> method ���� : �����Ǿ� �ִ� method�� ����
 * 			- method ������ ���ؼ��� return Ÿ�԰� �Ű������� �����ؾ��� 
 */

interface A {
	void abc();
}

class B {
	void bcd() {		// �ν��Ͻ� method : ��üȭ �ؾ� ȣ���� ����
		System.out.println("method");
	}
}

public class RefOfInstanceMethod_Type01 {
	public static void main(String[] args) {
		// 1. �ν��Ͻ� method ���� type 1 => �͸��̳�Ŭ����
		A a1 = new A() {
			@Override
			public void abc() {
				B b = new B();
				b.bcd();
			}
		};
		
		// 2. 1���� ���ٽ����� ǥ��
		A a2 = () -> {
			B b = new B();
			b.bcd();
		};
		
		// 3. �ν��Ͻ� ���� ǥ�� type 1
		B b = new B();		// �ν��Ͻ� ��ü�� ���� (��ü��::method �̸�;)
		A a3 = b::bcd;		// �ν��Ͻ� ���� ǥ�� => return Ÿ���� ���ƾ���. �Ű������� �����ؾ� ��
		
		a1.abc();
		a2.abc();
		a3.abc();
		
	}
}
