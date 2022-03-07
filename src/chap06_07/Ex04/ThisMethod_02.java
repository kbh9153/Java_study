package chap06_07.Ex04;

// Aaa class�� ������ ������ �������� ����� ��� this(); ���� ����� ��� : �ߺ��� ���� �Ź� �Է�
class Aaa {
	int m1, m2, m3, m4;		// �ʵ庯�� 4�� ����
	
	Aaa() {			// �Ű������� ���� ������ => �ʵ庯���� ���� �ʱ�ȭ �� �� ����
		m1 = 1;
		m2 = 2;
		m3 = 3;
		m4 = 4;
	};
	
	Aaa(int a) {
		m1 = a;
		m2 = 2;
		m3 = 3;
		m4 = 4;
	}
	
	Aaa(int a, int b) {
		m1 = a;
		m2 = b;
		m3 = 3;
		m4 = 4;
	}
	
	void print() {		// �� �޸��� ���� ��� ...
		System.out.println(m1 + " ");
		System.out.println(m2 + " ");
		System.out.println(m3 + " ");
		System.out.println(m4 + " ");
	}
	
}

//Aaa class�� ������ ������ �������� ����� ��� this();�� ����� ��� : �ߺ��� ���� ����
class Bbb {
int m1, m2, m3, m4;		// �ʵ庯�� 4�� ����
	
	Bbb() {			// �Ű������� ���� ������ => �ʵ庯���� ���� �ʱ�ȭ �� �� ����
		m1 = 1;
		m2 = 2;
		m3 = 3;
		m4 = 4;
	};
	
	Bbb(int a) {
		this();		// ��ǲ���� ���� ������ ȣ��
		m1 = a;
	}
	
	Bbb(int a, int b) {
		this(a);		// ��ǲ���� 1���� ������ ȣ��
		m2 = b;
	}
	
	void print() {		// �� �޸��� ���� ��� ...
		System.out.println(m1 + " ");
		System.out.println(m2 + " ");
		System.out.println(m3 + " ");
		System.out.println(m4 + " ");
	}
}

public class ThisMethod_02 {

	public static void main(String[] args) {
		// 1. 3���� ��ü ���� (this �̻��)
		Aaa a = new Aaa();		// �Ű� ������ ���� ������ ȣ��
		a.print();
		
		System.out.println();
		
		Aaa aa = new Aaa(10);		// �Ű� ������ 1������ ������ ȣ��
		aa.print();
		
		System.out.println();		// �Ű� ������ 2���� ������ ȣ��
		
		Aaa aaa = new Aaa(10, 20);
		aaa.print();
		
		System.out.println("-------------------------");
		
		// 2. 3���� ��ü ���� (this ���)
		Bbb b = new Bbb();		// �Ű� ������ ���� ������ ȣ��
		b.print();
		
		System.out.println();
		
		Bbb bb = new Bbb(30);		// �Ű� ������ 1������ ������ ȣ��
		bb.print();
		
		System.out.println();		// �Ű� ������ 2���� ������ ȣ��
		
		Bbb bbb = new Bbb(30 ,40);
		bbb.print();
		
	}

}
