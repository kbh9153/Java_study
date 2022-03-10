package chap06_07.Ex06;

class Abc {		// �ܺ� Ŭ���� : public �����ڸ� ��� ����. default
					// => public class�� class ���� �� �ѹ��� ��� ����. public�� ���� class�� ���ϸ�� �����ϱ� ����
					// class�� ��� ������ ���� ������ : public, default
					// ���� �����ڰ� ���� �� �ִ� Ű���� : class ��, �ʵ� ��, method ��, ������ ��
					// �ݵ�� ���� �����ڰ� �Ҵ�Ǿ� ����. �����Ǿ� ������ default�� ������ ��
					// ���� ������
						// 1. public : �ٸ� package���� ���� ����
						// 2. protected : �ٸ� package���� ���� ���� (��� ������ �Ǿ��־�� ����)
						// 3. default : ���� package���� ���� ����. ���� package�� �����ϴ� class�� import���� ��� ����
						// 4. private : ���� class ���ο����� ��� ����
	
	public int a = 10;
	protected int b = 20;
	int c = 30;
	private int d = 40;
	
	// Abc() {} => �⺻ ������ : ������ �ʱⰪ�� �ο��ؼ� ��ü�� ����
	
	public void print1() {
		System.out.println("�ٸ� package���� ���� ���� : public");
	}
	
	protected void print2() {
		System.out.println("�ٸ� package���� ���� ����(��Ӱ��谡 �����Ǿ� ���� �� : protected");
	}
	
	void print3() {
		System.out.println("���� package���� ���� ���� : default");
	}
	
	private void pritn4() {
		System.out.println("���� class������ ���� ���� : private");
	}
}

public class Ex06_All {

	public static void main(String[] args) {
		Abc abc1 = new Abc();		// ��üȭ. �⺻ ������ ȣ��
		// Abc : class �̸�, abc1 : �޸𸮿� �ε��� ��ü��, new : ��ü�� heap �޸� ������ ����, Abc() : ������ ȣ�� 
			// Abc() : �⺻ ������ => ���� ����
				// ������ : 1. class�̸��� ������ method, return Ÿ���� ���� method ������
		
		// ���� package �ȿ��� �ʵ� ȣ��
		abc1.a = 100;	// public
		abc1.b = 200;	// protected
		abc1.c = 300;	// default
		// abc1.d = 400;	// private : �ٸ� class���� ���� �Ұ�
		
		// ���� package �ȿ��� method ȣ��
		abc1.print1();		// public
		abc1.print2();		// protected
		abc1.print3();		// default
		// abc1.print4();	// private
	}

}
