package chap06_07.Ex05;

// ���� package ������ class A�� ����

public class Ex_A {

	public static void main(String[] args) {
		// A class�� ���� package ���ο� �����ϱ� ������ import�� ������� �ʰ� ��� ����
		
		A a = new A();		// import ���� ��� : A class�� ���� package ���� ����
		
		a.m = 10;		// A class�� ���� �����ڰ� default(���� package�� �ٸ� class���� ���� ����)
		a.n = 20;

		a.print();		// default ���� �������̹Ƿ� ���� ����
	}

}
