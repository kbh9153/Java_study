package chap18.Ex06;

interface A {
	void abc(B b, int k);	// B b = B class�� �������� ���
}

class B {
	void bcd(int k) {		// �ν��Ͻ� �޼ҵ� : 
		System.out.println(k);
	}
}

public class RefOfInstanceMethod_Type02_2 {
	public static void main(String[] args) {
		// �ν��Ͻ� �޼ҵ� ���� Type2
		// �͸��̳�Ŭ����
		
		A a1 = new A() {
			@Override
			public void abc(B b, int k) {
				b.bcd(k);
			}
		};
		
		// ���ٽ� ǥ��
		A a2 = (B b, int k) -> {b.bcd(k);};
		
		// �ν��Ͻ� �޼ҵ� ����
		A a3 = B::bcd;		// �ν��Ͻ� �޼ҵ峪 B ��ü�� ��ǲ �޾Ƽ� bcd �޼ҵ� ȣ��
			// B::bcd�� ���� ��ü���� �빮�ڷ� �ԷµǴ� ��� - ���� method(static) ȣ���� ��, �ν��Ͻ� �޼ҵ� ȣ�������� �Ű������� ��ü�� ��ǲ ������ �� ��
				
		B b = new B();
		
		a1.abc(b, 7);
		a2.abc(b, 8);
		a3.abc(b, 9);
	}
}
