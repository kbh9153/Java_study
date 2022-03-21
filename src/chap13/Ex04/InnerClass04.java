package chap13.Ex04;

// ���� Innerclass : class�� method ���ο� ����� class
	// method ������ �ʵ�� final Ű���尡 ������

class A {
	int a = 3;		// �ʵ� ���� : heap �޸� ������ ���� ���� (�ݵ�� �ʱ�ȭ�� ������ ����)
					// �ʵ��� �ʱⰪ�� �Ҵ� �� ���� ������ ���� ��üȭ �� ������ ����
					// �����ڳ� setter�� ���ؼ� �ʱⰪ�� �Ҵ� �� ��ü�� ����
	
	A () {};
	
	A(int a) {
		this.a = a;
	}
	
	public void setA(int a) {		// setter�� ���ؼ� �ʵ��� ���� �ʱ�ȭ
		this.a = a;
	}



	void aaa() {		// ���� ���� : method ������ ����. ���� �޸𸮿� ����
		int a = 3; 		// ���� ����. �ʱⰪ 3 �Ҵ�
		a = 4;			// a ������ ���� 4�� ����
		a = 10;			// a ������ ���� 10���� ����
		
		int b;
		
		System.out.println(a);
		// System.out.println(b);		// b ���� ������ �ʱⰪ�� �Ҵ����� �ʾ� ���� �߻�(�ʱⰪ �Ҵ� X = heap �޸� ������ �ʱ�ȭ X)
	}
	
	void abc() {
		int b = 5;		// �������� : method ���ο� ����� ���� (final�� �����Ϸ��� ���ؼ� �Ҵ�)
						// �ڵ����� final Ű���尡 �����Ϸ��� ���ؼ� �ڵ����� �Ҵ�
		class B {		// ���� inner class
			void bcd() {
				System.out.println(a);		// �ʵ�
				System.out.println(b);		// �������� : final�� ������. �� ���� �Ұ�
				
				a = 5;
				// b = 7;		// ���� class ���ο� ����� ���������� �ڵ����� final Ű���尡 �����Ϸ��� ���ؼ� �Ҵ�
			}
		}
	}
}

public class InnerClass04 {
	
	public static void main(String[] args) {
		// 1. ��ü�� ���� �� method ȣ��
		A aa = new A();
		aa.abc();
	}

}
