package chap10.Ex06;

// super : �θ� class => super�� ����� ���� ��Ӱ����̿��߸� ��
// this : �ڽ��� ��ü

// overriding : ����� => ����� �Ͽ��� �θ� method ���� ���������� ����. super ���� �θ� method ���� �ٽ� �ҷ���

class A {
	void abc() {
		System.out.println("A class�� abc()");
	}
}

class B extends A {
	void abc() {
		System.out.println("B class�� abc()");
	}
	
	void bcd() {
		// abc();		// this.abc => this ����. this�� �ڽ��� ��ü
		super.abc();
	}
}

public class SuperKeyword01 {

	public static void main(String[] args) {
		// 1. ��ü ����
		
		B bb = new B();
		
		// 2. method ȣ��
		
		bb.bcd();		// B class��

	}

}
