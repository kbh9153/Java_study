package chap13.Ex02;

/*
 * Innerclass���� �ܺ� class�� �ʵ�� method ���� ���
 * 
 * Overriding
 * 	1. �θ�� �ڽ��� ��� ���谡 �־�� ��
 * 	2. << �ν��Ͻ� method Overriding >>
 * 	 - �ν��Ͻ� �ʵ�, static(����) �ʵ�, static method�� Overriding �Ұ��� 
 */


class A {
	int a = 3;
	int b = 4;
	int c = 33;
	int d = 44;
	void abc() {		// �� ���� : Overriding�� �ƴ�. �ܺ� class, ���� class�� ������ method�� ������ ������ ��ġ
		System.out.println("A class�� method abc();");
	}
	
	class B {		// Innerclass���� �ܺ� class�� �ߺ��� �ʵ峪 method�� ȣ���� ��� : A.this.
		int a = 5;
		int b = 6;
		void abc() {		// Overriding�� �ƴ�. ������ method
			System.out.println("B class�� method abc();");
		}
		
		void bcd() {
			// 1. �ڱ��ڽ�(Innerclass)�� �ʵ�� method ȣ��
			System.out.println(a);		// 5. this.a => B class�� a
			System.out.println(b);		// 6. this.b => B class�� b
			abc();
			
			// 2. Outerclass�� �ʵ�� method ȣ��
			System.out.println(A.this.a);		// 3. A.this.a : Outerclass�� �ʵ尪 ȣ�� �� ���� : Super�� �ƴ�
			System.out.println(A.this.b);		// 4. A.this.b : Outerclass�� �ʵ尪 ȣ�� �� ���� : Super�� �ƴ�
			A.this.abc();
			
			// 3. Outerclass�� �ʵ�� method ȣ��
			System.out.println(c);		// 33
			System.out.println(d);		// 44
		}
	
	
	}
}

public class InnerClass02 {

	public static void main(String[] args) {
		// 1. Outterclass ��ü ����
		A a = new A();
		
		// 2. Innerclass ��ü ����
		A.B b = a.new B();
		b.bcd();
		
		System.out.println("----------------------------");
		
		// 3. ���� class�� �ʵ�� method ȣ��
		System.out.println(b.a);
		System.out.println(b.b);
		b.abc();
	}

}
