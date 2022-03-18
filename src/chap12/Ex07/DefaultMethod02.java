package chap12.Ex07;

interface A {		// �θ� Interface
	default void abc() {		// Interface���� �����ΰ� �ִ� method�� ������ ���� default�� �� �ۼ�
		System.out.println("A Interface�� abc() method");
	}
}

class B implements A {		// �⺻������ extends Object�� ������ ����
	@Override
	public void abc() {		// A Interface�� default abc() method�� Overriding
		// super.abc();		// super�� Object�� ����Ŵ(A Interface�� ����Ű�� ���� �ƴ�) 
								// => super.abc() => Object�� abc()�� ȣ��(���� �߻�)
		A.super.abc();		// A.super�� A Interface�� ����Ŵ
								// => A Interface�� abc()�� ȣ��
		System.out.println("B class�� abc() method");
	}
}

public class DefaultMethod02 {

	public static void main(String[] args) {
		// 1. ��ü ����
		B b = new B();
		
		// 2. method ȣ��
		b.abc();		// B class�� abc()�� ȣ��
		
		System.out.println("---------------------");
		
		A a1 = new B();		// Interface�� ��ü ������ �Ұ�. Ÿ�� ������ ����
		a1.abc();		// A Interface Ÿ���� ȣ���ص� B class�� Overriding�� ���� B class ���� ȣ��
	}

}
