package chap13.Ex09;

// �Ű������� �޾Ƽ� ó�� : Interface�� ������ class�� X

interface A {
	void abc();
}

class C {
	void cde(A a) {
		a.abc();
	}
}

public class Anonymous04 {

	public static void main(String[] args) {
		C c = new C();
		
		// 3. Interface�� ������ class X + ���������� ���� O
		A a = new A() {		// Interface�� ������ �ڽ� �͸� ��ü ���� �� Ÿ���� A�� ������ ���������� ����
			@Override
			public void abc() {
				System.out.println("Ŭ����(X) + ��������(O)");
			}
		};
		
		c.cde(a);		// ���� ������ �Ű������� ����
		
		// 4. Interface�� ������ class X + ���������� ���� X => ���� ���� ��� (�ӽ÷� �ѹ��� ����� ��)
			// => �̺�Ʈ ó�� ���
		
		c.cde(new A() {
			@Override
			public void abc() {
				System.out.println("class (O) + �������� (X)");
				
			}
		});

	}

}
