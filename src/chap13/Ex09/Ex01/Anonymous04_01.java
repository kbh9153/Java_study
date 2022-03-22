package chap13.Ex09.Ex01;

interface A {
	void cry();
	void fly();
}

class C {
	void abc(A a) {
		a.cry();
		a.fly();
	}
}

public class Anonymous04_01 {

	public static void main(String[] args) {
		C c = new C();
		// 1. class X + ���� ���� O
		A a = new A() {		// ���� ���� a ����
			@Override
			public void cry() {
				System.out.println("���� �۸�");
			}
			
			@Override
			public void fly() {
				System.out.println("���� ���� ���մϴ�");
			}
		};
		
		c.abc(a);
		
		System.out.println("----------------------");
		
		// 2. class X + ���� ���� X
		c.abc(new A() {
			@Override
			public void cry() {
				System.out.println("����̴� �߿�");
			}
			
			@Override
			public void fly() {
				System.out.println("����̵� ���� ���մϴ�");
			}
		});
	}

}
