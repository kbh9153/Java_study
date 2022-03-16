package chap10.Ex06.Ex01;

// �ڽ� ��ü�� ������ �� �θ� class�� �⺻ �����ڸ� ���� ȣ�� => super(); 
// ��� �ڽ� ��ü�� �����ڿ��� super();�� �����Ǿ� ����

class A {
	A() {
		System.out.println("A class�� �⺻ ������");
	}
	
	A(int a) {
		System.out.println("A class�� �Ű����� ���� 1�� ������ : " + a);
	}
	
	A(int a, int b) {
		System.out.println("A class�� �Ű����� ���� 2�� ������ : " + a + ", " + b);
	}
}

class B extends A {
	B() {
//		super(); => A(�θ� class) ȣ��. ������ ����
//		super(5, 3) => A(�θ� class) �� �Ű������� 2������ �����ڸ� ȣ��
		System.out.println("B class�� �⺻ ������");
	}
	
	B (String a) {
		super(3, 5);
		System.out.println("B class�� ���ڿ� 1�� �Է� : " + a);
	}
}

class C extends B {
	C() {
//		super(); => B(�θ� class) ȣ��. ������ ����
		super("C���� ȣ��");
		System.out.println("C class�� �⺻ ������");
	}
}

public class SuperMethod02 {

	public static void main(String[] args) {
		C c = new C();

	}

}
