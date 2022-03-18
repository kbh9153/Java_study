package chap12.Ex01;

class AA {		// �Ϲ� class : ��ü ������ ��ü���� stack ����. �ʵ��� �޼ҵ���� heap �޸� ������ ����
					// heap : �ݵ�� �ʱ�ȭ�� ���� ����
					// �ʵ� : heap �޸� ������ �ʵ��� ���� ������ ����
					// �ν��Ͻ� �޼ҵ� : class �޸� ������ �ν��Ͻ� ������ �޼ҵ��� �����ڵ带 ����
					// heap �޸� �������� �������� ��ġ�� ��Ÿ���� ������ ������ ����
	int a ;
	double b;
	char c ;		// char�� ���� �Ҵ���� ������ ������ ���
	boolean d ;
	byte e;
	float f;
	String g;		// ���� ����
	
	void cry() {}
	
	@Override
		public String toString() {
			return a + ", " + b + ", " + c + ", " + d + ", " + e + ", " + f + ", "  + g;
		}
}

// 1. �߻� class�� ��üȭ�ؼ� ����ϴ� ���1
	// => ����� ���ؼ� �ڽ� class�� ���� �� �ڽ� class���� �߻� method�� �������ϰ� �ڽ� class�� ��üȭ
	// => ���� ��ü�� �����ϴ� ��� ���
	
// 2. �߻� class�� ��üȭ�ؼ� ����ϴ� ���2
	// => �ڽ� class �������� main method���� �͸� ��ü�� �����ؼ� ����ϴ� ���
	// => �ڽ� ��ü�� ������ �ʿ���� �ӽ÷� ����� ��� ���

abstract class A {		// �߻� class : �̿ϼ� method�� �����ϹǷ� ��ü ������ �Ұ�
	abstract void abc();		// �߻� method : �̿ϼ� method. �����ΰ� �������� �ʴ� method
}

class B extends A {		// �߻� class�� ������ ��ü : ����ϰ� ����� ���
	@Override
	void abc() {
		System.out.println("��� 1 : �ڽ� class ���� �� �߻� class ����");
		
	}
	
}

public class AbstractClass01 {

	public static void main(String[] args) {
		// 1. AA class�� ��üȭ�� ������
		
		AA aa = new AA();		// �ʵ� : �ڵ� �ʱ�ȭ, �Ϲ� �޼ҵ� (�����ΰ� �����ϴ� �޼ҵ�) 
		System.out.println(aa);		// ��ü�� �����Ϸ��� heap ������ ���� �ݵ�� �� �־����
		
		// 2. �߻� �޼ҵ�� ��ü ���� �Ұ� : �޼ҵ尡 �̿ϼ� �޼ҵ��̱� ������ ��ü ������ �Ұ���
		// A a = new A();		// ��ü ������ �Ұ�, �߻� �޼ҵ带 �����ϰ� �ֱ� ����
		
		// 3. �߻� class�� ������ �ڽ� class ����, ��ü�� �������� ������ �� 
		A a1 = new B();
		A a2 = new B();
		A a3 = new B();
		
		// 4. method ȣ��
		a1.abc();		// A�� abc() method ȣ��
		a2.abc();
		a3.abc();
		
	}
	

}
