package chap06_07.Ex06;

import chap06_07.Ex05.Bb;

// import chap06_07.Ex05.B;		// class B�� ���� �����ڰ� default�̱� ������ �ٸ� package���� ���� �Ұ� => import �Ұ�


public class ExternalClass_02 {

	public static void main(String[] args) {
	// 	B b = new B();
		
	// �ٸ� package�� class���� Bb class�� �����ϴ� ���
		
		// 1. import�� ���� ���
		// 2. Bb class�� class ���� �����ڴ� public
		// 3. �ʵ�, method�� ���� �����ڿ� ���� ������ ���� (protected (��Ӱ���), public), �Ұ���(private, default)
		
		Bb bb = new Bb();
		
		// �ʵ� ����
		// bb.a = 10;		// private : ���� class �ȿ����� ����
		// bb.b = 20;		// default : ���� package �ȿ��� ���� ����
		// bb.c = 30;		// protected : default ���� + �ٸ� package���� ���� ����(��Ӱ���)
		bb.d = 40;			// public : protected + �ٸ� package���� ���� ����
		
		// method ����
		// bb.print1();	// private
		// bb.print2();	// default
		// bb.print3();	// protected
		bb.print4();	// public
		
		
	}

}
