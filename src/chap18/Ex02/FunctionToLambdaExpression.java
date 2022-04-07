package chap18.Ex02;

// ���ٽ� ����

@FunctionalInterface
interface A {		// �Է� X, return X
	void method1();
}

@FunctionalInterface
interface B {		// �Է� O, return X
	void method2(int a);
}

@FunctionalInterface
interface C {		// �Է� X, return O
	int method3();
}

@FunctionalInterface
interface D {		// �Է� O, return O
	double method4(int a, int b);
}

public class FunctionToLambdaExpression {

	public static void main(String[] args) {
		// interface�� �������� �ʴ� �Լ��� ���� -> ���ٽ�
		
		// 1. �Է� X, return X
		// 1-1. �͸� �̳� Ŭ������ ó��
		A a1 = new A() {
			@Override
			public void method1() {
				System.out.println("method 1");
				
			}
		};
		a1.method1();
		System.out.println();
		
		// 1-2. ���ٽ����� ó��
			// ���ٽ��� return Ÿ��, method �̸����� ����
			// input -> ������;
		A a2 = () -> {System.out.println("method 1");};		// ��ü
		A a3 = () -> System.out.println("method 1");		// �����ο� �� ���θ� ������ �� {};�� ���� ����
		a2.method1();
		a3.method1();
		System.out.println("----------");
		
		// 2. �Է� O, return X
		// 2-1. �͸��̳�Ŭ������ ó��
		B b1 = new B() {
			@Override
			public void method2(int a) {
				System.out.println("method 2 : " + a);
				
			}
		};
		b1.method2(0);
		System.out.println();
		
		B b2 = (int a) -> {System.out.println("method 2 : " + a);};		// ��ü����
		B b3 = (a) -> {System.out.println("method 2 : " + a);};		// �Է¸Ű� ������ Ÿ���� ��������
		B b4 = (a) -> System.out.println("method 2 : " + a);		// ���๮�� �� ������ �� {}; ��������
		B b5 = a -> {System.out.println("method 2 : " + a);};		// �Է¸Ű������� �ϳ��� �� () ��������
		
		b2.method2(1);
		b3.method2(2);
		b4.method2(3);
		b5.method2(4);
		System.out.println("----------");
		
		// 3. �Է� X, return O
		// 3-1. �͸��̳�Ŭ����
		C c1 = new C() {
			@Override
			public int method3() {
				return 4;
			}
		};
		System.out.println(c1.method3());
		System.out.println();
		
		// 3-2. ���ٽ����� ����
		
		C c2 = () -> {return 5;};		// ��ü����
		C c3 = () -> 6;		// return�� �� �������� ����� ��� : return ���� ����(�ݵ�� �߰�ȣ�� �Բ� �����ؾ���)
		
		System.out.println("return �� : " + c2.method3());
		System.out.println("return �� : " + c3.method3());
		System.out.println("----------");
		
		// 4. �Է� O, return O
		// 3-1. �͸��̳�Ŭ����
		D d1 = new D() {
			@Override
			public double method4(int a, int b) {
				return a + b;
			}
		};
		System.out.println("a + b = " + d1.method4(1, 2));
		System.out.println();
		
		// 3-2. ���ٽ����� ó��
		D d2 = (int a, int b) -> {return a + b;};		// ��ü ǥ��
		D d3 = (int a, int b) -> a + b;		// return�� �� �������� ����� ��� : return ���� ����(�ݵ�� �߰�ȣ�� �Բ� �����ؾ���)
		D d4 = (a, b) -> {return a + b;};	// �Է¸Ű� ������ Ÿ���� ��������
		D d5 = (a, b) -> a + b;				// �Է¸Ű� ������ Ÿ���� �������� + ���๮�� �� ������ �� {}; ��������
		
		System.out.println("a + b = " + d2.method4(2, 3));
		System.out.println("a + b = " + d3.method4(3, 4));
		System.out.println("a + b = " + d4.method4(4, 5));
		System.out.println("a + b = " + d5.method4(5, 6));
	}

}
