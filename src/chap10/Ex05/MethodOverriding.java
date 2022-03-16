package chap10.Ex05;

class A {
	A () {};		// �⺻ ������. Class �� �ٸ� �����ڰ� �������� ���� ��� ���� ����
	
	// �ν��Ͻ� method �������̵� : ��Ӱ��迡�� method �������̵��� �ν��Ͻ� method�� �������̵���
		// ��Ӱ��迡�� �ν��Ͻ� �ʵ�, static �ʵ�, static method�� �������̵� ���� ����
		// �������̵��� ���� signature(Ư¡)�� ���ƾ� ��. return Ÿ��, method �̸�, �Ű����� Ÿ��, �Ű����� ����
	void print() {
		System.out.println("Class A ���");
	}
}

class B extends A {
	@Override
	void print() {
		System.out.println("Class B ���");
	}
}

class C extends A {
	@Override
	void print() {
		System.out.println("Class C ���");
	}
}

public class MethodOverriding {
	
	public static void main(String[] args) {
		// 1. A Ÿ��, A ������
		
		A a = new A();
		a.print();
		
		// 2. B Ÿ��, B ������
		
		B b = new B();
		b.print();
		
		// 3. C Ÿ��, C ������
		
		C c = new C();
		c.print();
		
		System.out.println("---------------------------");
		
		// 4. A Ÿ��, B ������ (�������̵� �Ǿ� A�� print ȣ��� B�� print ���� ���)
		
		A ab = new B();
		ab.print();		// A�� print() method ȣ�� => B�� print()�� ���
		
		A ac = new C();
		ac.print();		// A�� print() method ȣ�� => C�� print()�� ���
		
		System.out.println("---------------------------");	
		
		A[] arr = {ab, ac};		// �迭�� A Ÿ���� ��ü�� ����
		
		for (int i = 0; i < arr.length; i++) {
			arr[i].print();
		}
		
		System.out.println("---------------------------");
		
		for (A k : arr) {
			k.print();
		}
	}

}
