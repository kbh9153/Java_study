package chap06_07.Ex05;

import chap06_07.Ex06.Bcd;		
// import chap06_07.Ex06.Abc;		// Abc class�� ���� �����ڰ� default : default�� �ܺ� package���� ���� �Ұ�

public class External_Abc extends Bcd{		// External_Abc class�� Bcd class�� ��� ����
												// => Bcd : �θ� class, External_Abc : �ڽ� class

	public static void main(String[] args) {
		// Abc abc2 = new Abc();		// class ���� �����ڰ� default�̱� ������ ���� �Ұ�
		
		Bcd bcd1 = new Bcd();	// ��� �� �θ� class
		External_Abc ext = new External_Abc();	// ��� �� �ڽ� class
		
		// �ٸ� package���� �ʵ� ȣ��
			// 1. import (public : class ���� ������)
			// 2. ��ü ����
			// 3. ���� ������ Ȯ�� �� ���� (�ʵ�, method)
		
		bcd1.a = 1000;		// public : �ٸ� package���� ���� ����
		ext.b = 2000;		// protected : �ٸ� package���� ��� ���迡 ���� �� ���� ����
								// �ڽ� class���� �θ� class�� protected�� �ٸ� package���� ���� (��� ����)
	}

}
