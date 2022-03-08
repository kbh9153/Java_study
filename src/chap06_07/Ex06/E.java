package chap06_07.Ex06;

// static �ʱ�ȭ ��� : �����ڿ� ���� static �ʵ��� ���� ȣ��� �ʱ�ȭ(�ʱⰪ ����)�ϴ� ����
// �����ڿ� static ���
	// - ������ : �ν��Ͻ� �ʵ带 �ʱ�ȭ, ���� �ʵ��� ���� �ʱ�ȭ
	// - static ��� : static �ʵ��� ���� �ʱ�ȭ, instance �ʵ��� ���� �ʱ�ȭ �Ұ�

class E {

	int a;
	static int b;		// ��ü ���� ���̵� ȣ��
	
	static {		// ����(static) �ʱ�ȭ ��� : ��ü �������� class ������ ȣ���� �� �ʱ�ȭ(�ʱⰪ�� ����) 
		// a = 3;	// static ��Ͽ����� instance �ʵ�� �ʱ�ȭ�� �� ���� => ���� �߻�
		b = 5;
		System.out.println("class E�� �ε� �Ǿ����ϴ�.");
	}
	
	E() {		// ������ : ��üȭ�� �� �� �ʵ��� ���� �ʱ�ȭ
		a = 3;		// instance �ʵ� �ʱ�ȭ
		b = 10; 	// static �ʵ� �ʱ�ȭ
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(E.b);		// ��ü �������� E.b ȣ��� �� static ����� �۵��� => static ���� �ʱ�ȭ
	}

}
