package chap06_07.Ex05;

public class Bb {		// class �̸� : public (���� package���� ���� ����, �ٸ� package�� class������ ���� ����)
	
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

class C {		// ���� class�� �����ϴ� 
	
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
