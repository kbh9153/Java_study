package chap18.Ex10;

interface A {
	B abc(int k);		// return Ÿ���� B ��ü
}

class B {
	B() {
		System.out.println("ù��° ������");
	}
	
	B(int k) {
		System.out.println("�ι�° ������");
	}
}

public class RefOfClassConstructor_02 {
	
	public static void main(String[] args) {
		// �͸��̳�Ŭ����
		A a1 = new A() {
			@Override
			public B abc(int k) {
				return new B(k);
			}
		};
		
		// ���ٽ� ǥ��
		A a2 = (int k) -> {return new B(k);};	// ��ü����
		A a3 = k -> new B(k);	// ���ǥ��
		
		// Ŭ���� ������ ǥ��
		A a4 = B::new;
		
		a1.abc(3);
		a2.abc(2);
		a3.abc(3);
		a4.abc(3);
	}
}
