package chap06_07.Ex06;

import chap06_07.Ex05.A;

public class Ex_A {

	public static void main(String[] args) {
		
		//�ٸ� package�� ��ü�� ����ϴ� ���
		
		// 1. ��ü class �̸� ����ϴ� ���
		chap06_07.Ex05.A a = new chap06_07.Ex05.A();		// class�� full name ��� : ��Ű����.Ŭ������ 
		
		// a.m = 10;		// ���ٺҰ� : default�� �ٸ� package�� class������ ���� �Ұ�
		a.k = 50;		// public : �ٸ� package�� class���� ���� ����
		a.print2();		// public : �ٸ� package�� class���� ���� ����
		
		// 2. import�� ����ؼ� �����ϴ� ���
		A aa = new A();		// import �� ����ϴ� ���
		
		aa.k = 100;
		aa.print2();		// public : �ٸ� package�� class���� ���� ����
	}

}
