package chap16.Ex09;

// Generic method�� ���� ����

// Number : Boolean, Character�� ������ 6�� Ÿ��(Byte, short, Integer, Long, Float, Double)
class A {		// �Ϲ� class ������ Generic method
	public<T extends Number> void method1(T t) {
		System.out.println(t.intValue());		// Number Ÿ���� method t.intValue()
	}
	
}

interface MyInterface {
	void print();		// public abstract ������ ����
}

class B {		// Generic Type ���ο��� Interface�� ������ ���� extends Ű�� �����
	public<T extends MyInterface> void method2(T t) {		// T�� Ÿ�Կ� �� �� �ִ� ���� MyInterface�� ������ class�� �� �� ����
		t.print();
	}
}

class C implements MyInterface {		// Interface�� ������ class
	@Override
	public void print() {
		System.out.println("Interface�� ������ class");
	}
}

class D {
	public<T extends String> void abc(T t) {
		System.out.println(t);		// String�� toString method�� �����ǵǾ�����
	}
}

public class BoundedTypeOfGenericMethod {

	public static void main(String[] args) {
		A a = new A();
		a.<Double>method1(5.8);
		a.method1(22.5);		// �Ű������� ������ ���� Ÿ���� �ĺ��� �� �ִ� ��� ��������
		a.<Long>method1(10000000L);		// Long
		a.<Float>method1(100.20939F);		// Float
		// a.<Boolean>method1(true);		// Chracter, Boolean�� Number Ÿ�Կ� ���� ����

		// method2�� �Ű������� �� �� �ִ� ���� interface Ÿ��, interface�� ������ �ڽ� class
		// Interface�� ������ ���� �͸� class
		B b = new B();
		b.<MyInterface>method2(
			new MyInterface() {
				@Override
				public void print() {
					System.out.println("print() �͸� Ŭ������ ���");
				};
			}
		);		
		
		b.<MyInterface> method2(new C());		// �Ű������� interface�� ������ �ڽ� ��ü
		
		// �͸� class�� Generic method ȣ�� �� �Ű������� �����ֱ�
		b.method2(new MyInterface() {
			@Override
			public void print() {
				System.out.println("�͸����� ó���� class ���");
			}
		});
		
		D d = new D();
		d.<String> abc("Hello World");
		d.abc("Hello Java");
	}

}
