package chap13.Ex03;

// static innerclass : �ܺ� class�� �ν��Ͻ� �ʵ�, �ν��Ͻ� method�� ���� �Ұ�
	// �ܺ� class�� static �ʵ峪 static method�� ���� ����

class A {
	int a = 3;		// �ν��Ͻ� �ʵ�. ��üȭ �Ͽ��� ���� ����
	static int b = 4;		// static(����) �ʵ�. ��ü �������� ����. ��ü ���� �� ����
	
	void method1() {		// �ν��Ͻ� method : ��ü ���� �� ����
		System.out.println("instance method");
	}
	
	static void method2() {		// static method : ��ü �������� ���� ����. ��ü �����Ͽ� ���ٵ� ����
		System.out.println("static method");
	}
	
	static class B {		// static innerclass : �ܺ� ��ü�� �������� �ʰ� ��ü ������ ����
		void bcd() {
			// 1. Static class���� �ܺ� class�� �ν��Ͻ� �ʵ� ���� (���� �Ұ�)
			// System.out.println(a);		// �ܺ� class�� �ν��Ͻ� �ʵ� (���� �Ұ�)
			System.out.println(b);		// static innerclass���� �ܺ� class�� static �ʵ峪 method ���� ����
			
			// 2. method ȣ��
			// method1();		// �ν��Ͻ� method�� ȣ�� �Ұ�
			method2();		// static method�� ȣ�� ����
		}
		
	}
	
}

public class InnerClass03 {

	public static void main(String[] args) {
		// 1. static innerclass ��ü ����
		A.B b = new A.B();		// static innerclass�� �ܺ� ��ü �������� ��ü ���� ����\
		b.bcd();

	}

}
