package chap06_07.Ex01;

/*
 * Ŭ����(class) : ��ü�� �����ϱ� ���� Ʋ(���ø�), ���赵, �ؾ Ʋ � ����
 * ��ü(object) : class�� �����Ͽ� �޸𸮿��� �۵��Ǵ� �ڵ�
 * ��ü = �ν��Ͻ�(instance)
 * �ν��Ͻ�ȭ(��üȭ) ��Ų�� ��� �ǹ� => ���� method���� ��ü�� �ν��Ͻ�ȭ�� ���������
 * 	=> ex. A a = new A(); ==> Ŭ������ ��üȭ ���Ѽ� �޸𸮿� �ε�
 */

class A {		// �ܺ� class ( = outerclass ). ��üȭ �������� class �޸𸮿� ����
	int m = 3;		// �ʵ�(=����) : class ��Ͽ��� ����� ����
					// �ʵ�� �ν��Ͻ�ȭ(��üȭ) ���Ѿ� ��� ����
					// �ʵ�� heap �޸𸮿� ����
	void print() {		// method : �Լ� (�������⿡���� function(=�Լ�), ��ü���⿡���� method��� Ī��)
						// print : �Լ���
						// void : �Լ� �����ڵ��� return ���� ���ٴ� ��
		System.out.println("��ü ���� �� Ȱ��");
	}
}

class B {		// �ܺ� class ( = outerclass )
	String name = "ȫ�浿";
	int age = 24;
	String phone = "010-1111-2222";
	
	void printName() {
		System.out.println(name);
	}
	
	void printAge() {
		System.out.println(age);
	}
	
	void printPhone() {
		System.out.println(phone);
	}
}

public class CreateObjectAndUsingOfMeber {	// public class (java ���ϸ�� ���ƾ���)
		
	public static void main(String[] args) {	// main method
		// �������� : method�� ����� ����
		
		A a = new A();		// A(Ŭ������) a(A Ŭ������ ������ ���� ������) = new A(A Ŭ���� ���������� ����)();
							// Class�� ��üȭ => �޸𸮿� �ε��Ŵ(heap �޸𸮿� ����)
		System.out.println(a.m);
		a.print();
		
		System.out.println("==========================");
		
		A b = new A();		// class A�� ��üȭ���Ѽ� �޸𸮿� �ε�
		
		System.out.println(b.m);
		b.print();
		
		System.out.println("==========================");
		
		A c = new A();
		
		System.out.println(c.m);
		c.print();
		
		System.out.println("==========================");
		
		B bb = new B();		// B class bb��� �̸����� ��üȭ
		
		bb.printName();		// bb ��ü�� �޼ҵ带 ȣ��
		bb.printAge();
		bb.printPhone();
		System.out.println("���� : " + bb.age);
		
		B cc = new B();
		cc.printName();
		cc.printAge();
		cc.printPhone();
		
	}

}
