package chap06_07.Ex04;

/*
 * ������ this Ű���� �ڵ� �߰�
 * 
 * 1. class ���ο��� �ʵ�, method �̸� �տ� �ڵ����� this Ű���� �߰�
 * 		=> this Ű�� �ڱ��ڽ��� ��ü�� �ʵ�� ��ü�� method�� ��Ī
 */

class A {
	int m;
	int n;
	
//	 A() {};		// �⺻ ������ : ����
	
	void init(int a, int b) {
		int c;			// (����)a, b, c�� ���� ���� (stack �޸� ������ ������� ���� ����)
		c = 3;			// init() method ������ stack �޸� ������ �����ǰ� method�� ������ �Ҹ�
		this.m = a;		// this Ű�� �������� �� �����Ϸ��� �ڵ����� �߰�
		this.n = b;		// this Ű�� �������� �� �����Ϸ��� �ڵ����� �߰�
	}
	
	void work() {
		this.init(2, 3);		// this Ű�� �������� �� �����Ϸ��� �ڵ����� �߰�
		System.out.println(this.m + ", " + this.n);		// this�� ���� ����. ������ �����Ϸ��� �ڵ����� �߰�
	}
}

public class ThisKeyword_01 {

	public static void main(String[] args) {
		// 2. ��ü ����
		A a = new A();
		
		// 3. method ȣ��
		a.work();

	}

}
