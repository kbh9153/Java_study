package chap13.Ex06;

//Interface�� ����� class�� �����Ͽ� ��ü ���

class A {
	C c = new B();		// C Ÿ��. �ν��Ͻ� ���� c
	
	void abc() {
		c.bcd();
		
	}
	
	// innerclass
	class B implements C {		// �������̽� C�� �߻� method ���� B class
		@Override
		public void bcd() {
			System.out.println("�ν��Ͻ� �̳� Ŭ����");
		}
	}
}



interface C {
	public abstract void bcd();
}

public class AnonymousClass {

	public static void main(String[] args) {
		// 1. ��ü ���� �� method ȣ��
		A a  = new A();
		a.abc();		// �ν��Ͻ� �̳� Ŭ����

	}

}
