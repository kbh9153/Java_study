package chap13.Ex01;

/*
 * Innerclass : class ������ class.
 * 	1. �ν��Ͻ� Innerclass : class �̸� �տ� static�� ���� ���� class
 * 		=> �ܺ� ��ü�� ���� ���� -> �ڽ��� ��ü ���� �� ��� ����
 * 		=> ex. A a = new A(); : �ܺ� ��ü ���� -> A.B b = a.new B(); : ���� ��ü ���� 
 * 	2. Static(����) Innerclass : class �̸� �տ� static�� �ִ� ���� class  
 * 
 * 	3. ���� Innerclass : class�� �ν��Ͻ� method ���ο� �ִ� class
 * 
 * << ��� Ư¡ >>
 * 	1. Outer class�� ���� ������ ���� ���� ����
 * 	2. �ٸ� ��ü �������� ��ü�� �ʵ峪 method ���� ������ ���� ���
 * 
 * class ���� : A.class, A$B.class => byte code (�߰����� �����ϵ� ����)
 */

class A {		// Outer class : ��� ���� �����ڸ� ���� class���� ���� ����
	public int a = 3;		// public : �ٸ� package���� ���� ����. ���� package���� ���� ����
	protected int b = 4;		// protected : �ٸ� package���� ���� ����(��ӵ� ���迡����). ���� package���� ���� ����
	int c = 5;				// �ٸ� package���� ���� �Ұ���. ���� package���� ���� ����
	private int d = 6;		// �ٸ� package���� ���� �Ұ���. ���� package������ ���� �Ұ���. ���� class������ ���� ����
	void abc() {
		System.out.println("A class�� method abc() �Դϴ�.");
	}
	
	//	InnerClass
	class B {		// �ν��Ͻ� ���� class : �ܺ� class�� ��üȭ �Ǿ�� ��� ���� 
		void bcd() {		// Outer class�� �ʵ� ���� ���� ���� Ȯ��
			System.out.println(a);		// this.a => this�� �����Ǿ� �ִ� ����
			System.out.println(b);		// this.b
			System.out.println(c);
			System.out.println(d);
			abc();		 // Outer class�� method ���� ���� ���� Ȯ��
		}
	}
}

public class InnerClass01 {

	public static void main(String[] args) {
		// 1. �ܺ� ��ü ���� (1�ܰ�) => Innerclass�� ����ϱ� ���ؼ��� �ܺ� class ��ü�� ���� ��������� ��
		A a = new A();		// �ܺ� class
		
		// 2. ���� class ��ü ���� (2�ܰ�)
		A.B b = a.new B();		// A.B : �ܺ� class.���� class b : ���� class �ν��Ͻ� ���� a.new B(); : �ܺ� �ν��Ͻ���.new ���� class ������ ȣ��
		
		// 3. ���� class�� method ȣ��
		b.bcd();

	}

}
