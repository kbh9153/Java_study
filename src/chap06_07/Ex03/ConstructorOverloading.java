package chap06_07.Ex03;

// ������ overloading : �ϳ��� ������ �� ������Ÿ��, ������ ���� �ٸ� �����ڰ� ȣ��
	// => ����) ������Ÿ�Ե� ���� ������ ���� ��찡 2�� �̻� ������ ���� �߻�

class Abc {
	int a, b, c;
	String d;
	
	Abc() {		// �⺻ ������
		System.out.println("�⺻ �������Դϴ�.");
		System.out.println(a + ", " + b);
		System.out.println("--------------------------------------");
	}
	
	Abc(String d) {
		this.d = d;
		System.out.println(d);
		System.out.println("--------------------------------------");
	}
	
	Abc(int a) {		// �Ű����� 1���� ������
		this.a = a;
		System.out.println(a);
		System.out.println("--------------------------------------");
	}
	
	Abc(int a, int b) {		//�Ű� ������ 2���� ������
		this.a = a;
		this.b = b;
		System.out.println(a + ", " + b);
		System.out.println("--------------------------------------");
	}
	
	Abc(int a, int b, int c) {		//�Ű� ������ 3���� ������
		this.a = a;
		this.b = b;
		this.c = c;
		System.out.println(a + ", " + b + ", " + c);
		System.out.println("--------------------------------------");
	}
}

public class ConstructorOverloading {

	public static void main(String[] args) {
		
		Abc abc = new Abc();		// �⺻ ������
		Abc abc1 = new Abc(37);		// �Ű� ���� �ϳ��� ������ ȣ��
		Abc abc2 = new Abc("HYUNDAI");		// �Ű����� ���� ������ Ÿ���� �ٸ��� �ش� method�� ȣ��
		Abc abc3 = new Abc(10, 20);
		Abc abc4 = new Abc(10, 20, 30);
	}

}
