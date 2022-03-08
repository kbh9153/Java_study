package chap06_07.Ex05;

import chap06_07.Ex05.Bb;		// �ٸ� package�� class���� class�� ȣ���� �� public ���� �����ڰ� �ο��Ǿ�� ��

class B {		// �ܺ� class : public�� �� �� ����. default�� ������ ����
					// => �ٸ� package�� class������ ���� �Ұ�. ���� package �ȿ����� ���� ����
	
	private int a = 1;		// private : ���� class������ ���� ����(���� package�� �ٸ� class������ ���� �Ұ�)
	int b = 2;				// default : ���� package �ȿ��� �ٸ� class������ ���� ����
	protected int c = 3;	// protected : default ���� + �ٸ� package������ ���� ����(��, ��ӵ� ��츸 ����)
	public int d = 4;		// public : protected ���� + �ٸ� package���� ���� ���� ����
	
	// ���� ���� ���� : private < default < protected < public
	
	private void print1() {		// ���� calss�� �����ϴ� method
		a = 10;
		b = 20;
		c = 30;
		d = 40;
	}
	
	void print2() {		// ���� calss�� �����ϴ� method
		a = 10;
		b = 20;
		c = 30;
		d = 40;
	}
	
	protected void print3() {		// ���� calss�� �����ϴ� method
		a = 10;
		b = 20;
		c = 30;
		d = 40;
	}
	
	public void print4() {		// ���� calss�� �����ϴ� method
		a = 10;
		b = 20;
		c = 30;
		d = 40;
}

public class ExternalClass_01 {

	public static void main(String[] args) {
		B b = new B();		// default ���� �����ڰ� class �̸��� �Ҵ� / ���� class�� �����ϹǷ� B class�� ���� ����
		
		Bb bb = new Bb();		// public ���� ������ => ���� package ���� ����
								// �ٸ� package�� class : 1. class ���� �����ڿ� public ���

		// ���� package�� �ٸ� class���� ����
		
		// �ʵ� ����
		
		// bb.a = 10;		// private : a�� bb class ���ο����� ��� ���� >> ���� �߻�
		bb.b = 20;			// default : ���� package�� class���� ������ ���
		bb.c = 30;			// protected : default�� ���� + << �ٸ� package���� ������ ���������� ��� �����϶��� ���� >>
		bb.d = 40;			// public : protected�� ���� + �ٸ� package���� ���� ����
		
		// method ����
		// bb.print1();		// private : ���� �߻�. class ���ο����� ȣ��
		bb.print2();		// default
		bb.print3();		// protected
		bb.print4();		// public
		
		}

	}
}
