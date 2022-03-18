package chap12.Ex02;

// Interface : �ܺο� ���θ� ��������ִ� ����
	// ex 1. TV(����) - �ܼ�Ʈ(�������̽�) - ������ǰ(�����)
	// ex 2. TV(����) - ������(�������̽�) - ���(�����)
	// ex 3. ���� �� ���(����) - API(�������̽�) - ��(�����)

// ��ü �����Ұ�. Ÿ���� ���� ����
// ��� �ʵ�� �ݵ�� public static final �ۼ�
// ��� method�� �ݵ�� public abstract ���� (������ �ڵ��߰� => Java 1.8), default method ���� 

interface A {
	public static final int A = 3;		// Interface�� �ʵ� ���� ǥ��
	public abstract void abc();			// Interface�� method�� ���� ǥ��
}

interface B {
	int A = 3;		// Interface �ʵ� ���� ǥ�� �� public static final ����
	void abc();		// Interface method ���� ǥ�� �� public abstract ���� = �߻� method
}

abstract class C {		// �߻� class�� abstract�� �����Ǹ� ���� �߻� => ������ Interface�� ����
	abstract void abc();		// �߻� method�� abstract�� �����Ǹ� ���� �߻� => ������ Interface�� ����
}

public class Interface01 {

	public static void main(String[] args) {
		// Interface�� ��ü ���� �Ұ�. �������� �ʴ� method�� ���ԵǾ� �ֱ� ����
		// A a = new A();		// A�� Interface�̹Ƿ� ��ü ���� �Ұ�
		
		// 1. Interface�� static �ʵ��� ���� ���
		System.out.println(A.A);		// Interface�� �ʵ� ���. A => static
		System.out.println(B.A);
		
		// 2. final�� ����Ǿ� �ֱ� ������ �� ���� �Ұ�
		// A.A = 5;		// final�� �����Ǿ� �־� �� ���� �Ұ�
		// B.A = 6;		// final�� �����Ǿ� �־� �� ���� �Ұ�
	}

}
