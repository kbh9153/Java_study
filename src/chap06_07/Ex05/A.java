package chap06_07.Ex05;

// ���� ������(ĸ��ȭ ���� => ĸ��ȭ : �����͸� �ܺηκ��� ��ȣ) : public, protected, default(�����ؼ� ���), private
	// => class �̸�, �ʵ��, method �̸�, �����ڸ� �տ��� ���� �����ڰ� �ݵ�� �Ҵ�Ǿ� ����
	// class �̸� : public, default ��� ����

	// default : ���� package�� �ٸ� class������ ���� ����. �ٸ� package�� class������ ���� �Ұ�
	// private : �ܺ� class���� ���� �Ұ�
	// public : �ٸ� package���� ���� ����

public class A {
	
	int m = 3;		// �ʵ��� �⺻ ���� �����ڴ� default => ������
	int n = 4;
	
	public int k = 10;
	
	void print() {		// ���� ������ default�� ������ ���� => ���� package�� class������ ��� ����
		System.out.println("import ���� " + m + ", " + n);
	}
	
	public void print2() {
		System.out.println("�ܺ� package�� �ٸ� class���� ���� ���� " + k);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
