package chap14.Ex02;

import java.io.FileInputStream;
import java.io.InputStreamReader;

/*
 * Checked Exception (�Ϲ� ����) : ������ �ܰ迡�� ���ܰ� �߻�
 * 	=> ������(*.java -> *.class)�ϱ�(����) ���� ���� ó��
 * 
 * unChecked Exception (���� ����), Runtime Exception : ����ÿ� ���ܰ� �߻��� �� ����
 * 	=> ���� �ʼ��� �ƴ����� ���� ó��
 */

class A {
	B b;		// b = null
	A () {}		// �⺻ ������
	
	A (B b) {
		this.b = b;
	}
	
	interface B {		// interface ����
		void cry();
	}
	
	void abc() {
		System.out.println(b);
		b.cry();
	}
}

public class CheckedException {

	public static void main(String[] args) {
		// 1. �Ϲ� ���� (Checked Exception) : ������ �ܰ迡�� ���� ó���� �ʿ�
		
		// InterruptedException : thread �߰��� �����Ⱑ �߻��ϸ� ���ܰ� �߻�
		// Thread.sleep(1000);
		
		// ClassNotFoundException : class�� ã�� ���ϴ� ���ܰ� �߻�
		// Class cls = Class.forName("java.lang.Object");
		
		// IOException : ��Ʈ��ũ���� ��(����)�� ���� ���ϴ� ���ܰ� �߻�
		// System.in : Console�� �ǹ�
		InputStreamReader in = new InputStreamReader(System.in);
		// in.read();
		
		// FileNotFoundException : ������ ã�� ���ϴ� ���ܰ� �߻� 
		// FileInputStream fis = new FileInputStream("text.txt");
		
		// 2. ���� ���� (unChecked Exception) : ����� �߻��Ǵ� ����
		
		// NullPointerException : ��ü�� null ���¿��� ��ü�� �ʵ峪 method ȣ��
		A a1 = new A();
		
		// a1.abc();		// ������ �ܰ迡���� ���ܰ� �߻����� ����
	}

}
