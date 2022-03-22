package chap13.Ex06.Ex01;

// 1. Interface�� �߻� method�� ������ << class�� ���� >> �� ȣ�� => ����ϰ� �Ͽ��ϴ� ��� ���

interface A {		// Interface, �߻� method�� ����
	void cry();		// �߻� method. �����ΰ� ����. public abstract�� �����Ǿ� ����
	void fly();
}

class B {
	A a = new C();
	
	void abc() {
		a.cry();
		a.fly();
	}
	
	class C implements A {		// class C�� A Interface�� method�� ������ class
		@Override
		public void cry() {
			System.out.println("�۸�");
			
		}
		
		@Override
		public void fly() {
			System.out.println("���� ���մϴ�");
				
		}
	}
}

public class AnonymousClass01_01 {

	public static void main(String[] args) {
		B b = new B();
		b.abc();

	}

}
