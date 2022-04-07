package chap18.Ex09;

interface A {
	B abc();		// return Ÿ���� B ��ü
}

class B {
	B() {
		System.out.println("ù��° ������");
	}
	
	B(int k) {
		System.out.println("�ι�° ������");
	}
}

public class RefOfClassConstructor_01 {

	public static void main(String[] args) {
		// 1. Ŭ���� ������ ����
		// �͸��̳�Ŭ����
		A a1 = new A() {
			@Override
			public B abc() {		// abc() �޼ҵ� ȣ��� B ��ü�� �⺻ ������ ȣ�� => ������ ����
				return new B();
			}
		};
		
		// ���ٽ� ǥ��
		A a2 = () -> {return new B();};	// ��ü ����
		A a3 = () -> new B();	// ��౸��. reutn ���Ž� �߰�ȣ�� ����
		
		// Ŭ���� ������ ����
		A a4 = B::new;
		
		a1.abc();
		a2.abc();
		a3.abc();
		a4.abc();
		
	}
}
