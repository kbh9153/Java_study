package chap13.Ex07.Ex01;

// 1. Interface�� �߻� method�� ������ << �͸�(����) class >> �� ȣ�� => �ѹ��� ����ϴ� ��� ���

interface A {		// Interface, �߻� method�� ����
	void cry();		// �߻� method. �����ΰ� ����. public abstract�� �����Ǿ� ����
	void fly();
}

class B {
	A a = new A() {		// Interface�� ��üȭ�� �� ����. ������ �͸�(����) class�� �����ϼ� ������ �� ����
						// A Interface�� ������ �ڽ� class ��� : class �̸��� ����(�����Ϸ��� �̸��� �����ϰ� �ڵ����� �Ҵ�)
		public void cry() {
			System.out.println("�۸�");
		};
		
		public void fly() {
			System.out.println("���� ���մϴ�.");
		};
	};
		
	void abc() {
		a.cry();
		a.fly();
	}
}

public class AnonymousClass02_01 {

	public static void main(String[] args) {
		B b = new B();
		b.abc();
	}
}