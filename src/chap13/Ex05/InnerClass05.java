package chap13.Ex05;

// ���� Innerclass�� ������ ���� ���� class ����
// ���� innerclass : method ������ ����� class

class A {		// A.class
	void abc() {
		class B {}		// A$1B.class
		class C {}		// A$1C.class
	}
	
	void bcd() {
		class C {}		// A$2C.class		������ �̸��� ������ ��� method ���ڰ� ��
		class D {}		// A$1D.class
	}
	
	void cde() {
		class B {}		// A$2B.class
		class C {}		// A$3C.class
	}
}

public class InnerClass05 {

	public static void main(String[] args) {
		

	}

}
