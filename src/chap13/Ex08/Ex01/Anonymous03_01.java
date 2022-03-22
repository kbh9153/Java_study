package chap13.Ex08.Ex01;

/*
 * 3. method�� �Ű������� ���� : ����ϰ� ����ϴ� ���
 * 	3-1 : ��ü ���� �� �Ű������� ���� (class �̸� O + �������� O)
 * 	3-2 : ��ü ���� �� �Ű������� ���� (class �̸� O + �������� X)
 */

interface A {		// Interface, �߻� method�� ����
	void cry();		// �߻� method. �����ΰ� ����. public abstract�� �����Ǿ� ����
	void fly();
}

class B implements A {		// B�� A Interface�� ������ class
	@Override
	public void cry() {
		System.out.println("�۸� : �Ű����� ����");
	}
	
	@Override
	public void fly() {
		System.out.println("���� ���մϴ� : �Ű����� ����");
	}
}

class C {		// C ��ü�� abc method�� ȣ��� A Ÿ���� �Ű������� ����
	void abc(A a) {		// ���� �ڽ� class�� �Ű������� ���� ��� A Ÿ������ �ڵ����� ��ĳ����
		a.cry();
		a.fly();
	}
}

public class Anonymous03_01 {

	public static void main(String[] args) {
		// 1. class O + �������� O
		
		C c = new C();
		A a = new B();		// B�� ��üȭ�ؼ� A Ÿ������ ����. a : ���� ����
		
		c.abc(a);
		
		System.out.println("----------------------");
		
		// 2. class O + �������� X
		
		c.abc(new B());
	}

}
