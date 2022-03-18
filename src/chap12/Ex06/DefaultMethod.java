package chap12.Ex06;

// Interface�� default method : Interface ������ �����ΰ� �ִ� method�� ������ �� ���
	// => public default void bcd() {} 
	// => default Ű������ �ۼ��Ͽ�����(Interface�� default�� ���� �����ڰ� �ƴ�)
	// => Java 1.8 �̻���� �ű� �߰� ���
	// => ������ �����Ǿ� �ִ� Interface���� ���ο� ����� �߰��� �� ���� class���� ������ �ʿ� ���� �ű� ����� �߰��� �� ���

	// => default method�´� �ϼ��� �ڵ��̱� ������ ��ӵǾ� ��� ����
	// => �߻� method(�̿ϼ� �ڵ�)�� ��ӵǾ� �ϼ����� ������ ������ �߻�

interface A {
	void abc();		// 2005�� ���� method. public abstract�� ������. �����ΰ� ���� �߻� method
	
	default void bcd() {		// 2020�� ���� method
		System.out.println("A Interface�� bcd()");
	}
	
	// void ttt();		// ���� class���� ���ο� �߻� method�� �߰��ϸ� ��ӵ� ��� ���� class�� ���� �߻�
}

class B implements A {		// 2005�� ���� class
	@Override
	public void abc() {
		System.out.println("B class�� abc()");
	}
}

class C implements A {
	@Override
	public void abc() {
		System.out.println("C class�� abc()");
	}
	
	@Override
	public void bcd() {		// Interface�� default method�� Overriding ����
		System.out.println("C class�� bcd()");
	}
}

public class DefaultMethod {

	public static void main(String[] args) {
		// 1. ��ü ����
		A a1 = new B();
		A a2 = new C();
		
		// 2. method ȣ��
		a1.abc();
		a1.bcd();		// Interface�� bcd() method ȣ��. A Interface���� ��ӵ� method
		
		a2.abc();
		a2.bcd();
		

	}

}
