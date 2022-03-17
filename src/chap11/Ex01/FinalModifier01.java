package chap11.Ex01;

/*
 * Final : ������
 *  - �ʵ��, ���������� : ��� => final double PI = 3.14;
 *  - ����� ���� ������ �� ����
 *  - method �̸� : final void print() {} => Overriding�� �Ұ��� method (�θ� class, �ڽ� class���� method Overriding �Ұ�)
 * 	- class �̸� : final class A => ��� �Ұ��� class (�ڽ� class�� ���� �ʴ� ������ class)
 * 	- class �޸� ������ ��� ������ ���� ����, ��ü�� method�� ����� ��쿡�� ȣ���Ͽ� ���� ����
 */

class A1 {
	int a = 3;		// �ʵ��, ������������ �ҹ��ڷ� �ۼ�. ���� ���ڰ� �̾��� ��� ù�ڸ� �빮�ڷ� �ۼ�
	final int B = 5;		// ������� �빮�ڷ� �ۼ�. ���� ������ _ ���
	A1 () {};
}

class A2 {
	int a;
	final int B;
	A2 () {
		a = 3;
		B = 5;
	}
}

class A3 {
	int a = 3;		// �ʵ� : �� ���� ����
	final int B = 5;
	A3 () {
		a = 5;
	// B = 10;		// final�� ���� ������ �� ����
	}
}

class B {
	void bcd() {		// �������� : method���� ������ ���� (method ȣ���� ������ ���������� �޸𸮿��� �����)
		int a = 3;		// ���� ������ ���� ���� �Ҵ�. method ȣ���� ������ �����
		final int B = 5;		// ����� class ���� �� ��������� ���簡 �Ǿ� method ȣ���� �������� ��������� ��������
		a = 7;
	// B = 9;		// final�� �� ���� �Ұ�
	}
	
}

public class FinalModifier01 {

	public static void main(String[] args) {
		

	}

}
