package chap14.Ex07;

/*
 * Exception - Checked Exception(�Ϲ� ����) : ������ ����, �ݵ�� ����ó��
 * 			 - unChecked Exception(���� ����) : Runtime Exception => ����� ���ܹ߻�
 * 
 * ����ó����� - try catch : �ڽ��� ���� ���ܸ� ó��
 * 			- throws : ����ó���� �̷�� ��(����), method ��� ������ ���ܸ� method ȣ��� ȣ���ϴ� ������ ���ܸ� �̷�� �� 
 * 				=> main method�� ��쿡�� ���� �޼����� ����ϰ� �ٷ� ������
 * 			- throw : ���ܸ� ���� �߻�
 */

// 1. Exception�� �߻��Ǵ� method ���ο��� �ڽ��� ���� ���ܸ� ó���ϴ� ���
class A {
	void abc() {
		bcd();		// bcd(); ȣ��
	}
	
	void bcd() {
		try {
			Class cls = Class.forName("java.lang.Object");		// �Ϲݿ���
			// Class.forName : ���� loading (�����Ͻÿ� üũ���� �ʰ� ������ �� ��ü�� �����ϴ��� Ȯ���ϴ� ��)
			// => ����� class ������ ������ ���� �ְ� �������� ���� ���� �ֱ� ������ ���� ó���� �ʿ�
			Thread.sleep(1000);		// �Ϲݿ�			
			// ms : 1000 (= 1��)
		} catch (ClassNotFoundException | InterruptedException e) {
			e.printStackTrace();
		}		
			
				
	}
}

// 2. throws�� ����ؼ� Exception�� �̷�� ���(����)
class B {
	void abc() {
		try {
			bcd();
		} catch (ClassNotFoundException | InterruptedException e) {
		}
	}
	
	// bcd() method�� ȣ���ϴ� ������ ���ܸ� ó���ϵ��� �̷� 
	void bcd() throws ClassNotFoundException, InterruptedException {
		Class cls = Class.forName("java.lang.Object");		// �Ϲݿ���
		Thread.sleep(1000);
	}
}

public class ThrowsException03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
