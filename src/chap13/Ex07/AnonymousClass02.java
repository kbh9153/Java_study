package chap13.Ex07;

// �͸� innerclass�� ����Ͽ� Interface ��ü ����

class A {
	C c = new C() {		// �͸� innerclass
		public void bcd() {
			System.out.println("�͸� �̳� Ŭ����");
		};
	};		// C Ÿ��, �ν��Ͻ� ���� c		
	
	void abc() {
		c.bcd();
	}
}

interface C {		// Interface, �߻� method ���� : void bcd()
	public abstract void bcd();
}

public class AnonymousClass02 {

	public static void main(String[] args) {
		// 1. ��ü ���� �� method ȣ��
		A a  = new A();
		a.abc();		// �͸� �̳� Ŭ����

	}

}
