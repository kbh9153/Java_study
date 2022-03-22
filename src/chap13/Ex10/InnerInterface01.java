package chap13.Ex10;

// Innerinterface : class ���ο� interface�� ����. �ܺ� class�� �����ϰ� ����� �������� ����
	// => class ���ο� ����
	// => �� ���� : static�� �ڵ����� �����Ϸ��� ���ؼ� ���� 

class A {
	interface B {		// static�� �����Ϸ��� ���ؼ� �ڵ����� ����
		void bcd();		// public abstract�� ������ ����
	}
}

// innerinterface�� ������ class C
class C implements A.B {		// A.B : A class�� innerinterface B�� �ǹ� / A, B : A interface, B interface�� �ǹ�
	@Override
	public void bcd() {
		System.out.println("Inner Interface�� ������ class C");
	}
}

public class InnerInterface01 {

	public static void main(String[] args) {
		// 1. �ڽ� ��ü�� ���� ���� �� ��� (�ڽ� class�� ������ ���)
		A.B ab = new C();		// �θ��� Ÿ������ ��ĳ���� �� overriding�� ���ؼ� ���
		ab.bcd();
		
		C c = new C();		// C �ڽ��� method�� ���� ȣ��
		c.bcd();
		
		// 2. �͸� innerclass�� ��� (�ڽ� class ���� ���)
		A.B b = new A.B() {		// A.B : A class ������ interface (innerinterface)
			@Override
			public void bcd() {
				System.out.println("�͸� innerclass�� ��ü ���� �� ���");
			}
		};
		b.bcd();
	}

}
