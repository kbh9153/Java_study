package chap14.Ex08;

/* ����� ���� ����
 * 	1. Exception�� ����ϴ� ���� : Checked Exception => ������ �ܰ迡�� ����ó�� �ʿ�
 * 	2. Runtime Exception�� ����ϴ� ���� : unChecked Exception(Runtime Exception) => ����ÿ� ����ó�� �ʿ�
 */

class MyException extends Exception {		// �Ϲݿ���
	public MyException() {		// �⺻ ������
		super();
	}
	
	public MyException(String msg) {		// ���� �޼��� ��½� ���
		super(msg);
	}
}

class MyRTException extends RuntimeException {		// ���࿹��
	public MyRTException() {		// �⺻ ������
		super();
	}
	
	public MyRTException(String msg) {		// ���� �޼��� ��½� ���
		super(msg);
	}
}

class A {
	// 1. ����� ���� ���� ��ü ���� (�Ϲ� ���� ��ü)
	MyException me1 = new MyException();		// �⺻ ������ ȣ��
	MyException me2 = new MyException("���� �޼��� : MyException");		// ���ܰ� �߻��� �� ���� �޼����� ����ϴ� ������
	
	// 2. ��Ÿ�� ���� ��ü
	MyRTException mre1 = new MyRTException();		// �⺻ ������
	MyRTException mre2 = new MyRTException("���� �޼��� : MyRTException");
	
	// ���ܸ� ������ �߻���Ű�� (throw)
	void abc_1(int num) {
		try {
			if (num > 70) {		// abc_1()
				System.out.println("�����۵�");
			} else {
				throw me2;		// throw : ���ܸ� ������ �߻���Ŵ
			}
		} catch (MyException e){		// me1�� ������ throw�� ����ؼ� ������ ���ܸ� �߻���Ŵ
			System.out.println("70 ���� ���� �־����ϴ�. 70 �̻� ���� ��������.");
			System.out.println(e.getMessage());
		}
		 
	}
	
	// ������ ���� (throws) : abc_2() method�� ȣ���ϴ� ������ ����ó��
	void abc_2(int num) throws MyException {
		if (num > 70) {
			System.out.println("�����۵�");
		} else {
			throw me2;		// throw : ���ܸ� ������ �߻���Ŵ
		}
	}
	
	void bcd_1() {
		abc_1(65);		// ���ܰ� ������ �߻�
	}
	
	void bcd_2() {
		try {
			abc_2(65);
		} catch (MyException e) {
			System.out.println("70 �̻��� ���� ��������.");
			System.out.println(e.getMessage());
		}
	}
}

public class CreateUserException01 {

	public static void main(String[] args) {
		A a = new A();
		
		a.bcd_1();		// ���ܸ� ���� ����
		a.bcd_2();		// throws ���� ����, ȣ���ϴ� �ʿ��� ���� ó��

	}

}
