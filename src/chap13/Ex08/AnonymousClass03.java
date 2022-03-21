package chap13.Ex08;

// class ���� �� ���� ������ ���/�̻���� ��� �Ű� ������ ��ü�� ����

interface A {
	public abstract void abc();
}

// 1. �ڽ� class�� ���� ����
class B implements A {
	@Override
	public void abc() {
		System.out.println("�Ű����� ����");
	}
}

class C {		// cde method�� ��ǲ������ A Ÿ���� ��ü a�� ����
	void cde(A a) {		// cde method�� ȣ���ϸ鼭 �Ű������� A Ÿ���� ��ü�� ���� 
		a.abc();
	}
}

public class AnonymousClass03 {

	public static void main(String[] args) {
		// 1�� ��� : class �̸� + ���� ������
		C c = new C();
		
		A a = new B();		// class �̸�(A), ���� ����(a) ����
		
		c.cde(a);		// �Ű������� ��ü a�� ���� �� ����
		
		System.out.println("------------------------------ ");
		
		// 2�� ��� : class �̸� O + ���������� X 
		c.cde(new B());

	}

}
