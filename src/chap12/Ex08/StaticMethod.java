package chap12.Ex08;

// ���� method : Java 1.8 �̻���� �ű� �߰� ���
// Interface ���ο� static�� �� method : ���� class���� �������� ȣ�� ����

/* Interface ���� ���� ��� ([] ���� Ű������� ���� ����)
 * 	1. �ʵ� : [public, static, final]
 * 	2. method
 * 	 - [public abstract(�߻� method)] : �����ΰ� ���� method => ���� ����
 *   - [public] default : �����ΰ� �ִ� method => Java 1.8 �̻󿡼� ��� ����
 *   - [public] static : �����ΰ� �ְ� ��ä �������� ȣ���� ������ method => Java 1.8 �̻󿡼� ��� ����
 */

interface A {
	static void abc() {
		System.out.println("A Interface�� ���� method abc()");
	}
}

public class StaticMethod {

	public static void main(String[] args) {
		// 1. ����(static) method ȣ��
		A.abc();		// implements ���� Interface �̸����� �ٷ� ȣ�� ���� 
	}

}
