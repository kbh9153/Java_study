package chap06_07.Ex06;

public class Bcd {		// ��� �� �θ� class
	public int a = 10;
	protected int b = 20;		// ��� �� �ڽ� class���� ������ ���� (�ٸ� package����)
	int c = 30;
	private int d = 40;
	
	// Bcd() {} => �⺻ ������ : ������ �ʱⰪ�� �ο��ؼ� ��ü�� ����
	
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
