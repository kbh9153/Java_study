package chap14.Ex06;

/*
 * �Ϲ� ���� (Checked Exception) : ������ �ܰ迡�� ����
 * 	1. ���� ó��
 * 	2. throws ���� (�̷��)
 */

// main method�� throws ������� ���ܸ� ������Ű�� ��� => Exception�� �߻��� ��� throws�� ���ܸ� ó���ϴ� ���� �ƴ϶� ���� ������ ��� �� ����Ǿ����


public class ThrowsException02 {

	public static void main(String[] args) throws ClassNotFoundException {
		// ���������� ����(java.lang.Object)�� ����. ClassNotFoundException �߻� X
		Class cls = Class.forName("java.lang.Object");
		
		// ����(java.lang.Object37)�� �������� ����. ClassNotFoundException �߻� O
		Class cls2 = Class.forName("java.lang.Object37");

	}

}
