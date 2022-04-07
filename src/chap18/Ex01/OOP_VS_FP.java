package chap18.Ex01;

/*
 * 1. Java�� ��ü�������α׷�(OOP) : ��� �Լ�(method)�� ��ü ���ο� �����ؾ���. �Լ��� class, interface ���ο� �־����
 * 	- ���ٽ� : Java���� �Լ��� ���α׷����� �����ϵ��� �������ִ� ��� �� �ϳ�. ���ٽ��� �����ϱ� ���ؼ��� �Լ��� interface�� �־����
 * 		=> ������ ������ method�� �������ϴ� ���� �ƴ϶� �����ΰ� ���� method�� ���ٽ����� ����� �ο��ؼ� �۵���Ű�� ���� 
 * 		=> ���ٽ��� ������ ���� ������ ���(���� ������ ���� �ִ��� �����ؼ� ǥ��) ������ ������ ������
 * 		=> ���ٽ��� Java���� ���������� �͸� class�� ��ȯ�Ǿ� ó����
 *		=> ���ٽ��� �Լ��� interface���� �͸� class�� ��ȯ�� ����
 *		=> ���ٽ��� �Լ��� interface�� ������ �͸� class�� ���ٽ����� ���
 * 		=> �Լ��� interface : �� �Ѱ��� �߻� class�� ���ǵ� interface
 * 		=> Java�� ���ο� �Լ� ������ ������ ���� �ƴ϶� �̹� �����ϴ� interface�� ������ ���ٽ����� ǥ��
 */

@FunctionalInterface		// @FunctionalInterface : �Լ��� interface�� ���� / @(annotation)
interface A {	// �Լ��� interface
	void abc();		// public abstract ������
}

// interface�� ���ǵ� method�� �����ϴ� ��� 1 : interface�� method�� �����ϴ� class�� ����
class B implements A {
	@Override
	public void abc() {
		System.out.println("method ���� 1");
	}
}


public class OOP_VS_FP {

	public static void main(String[] args) {
		// Java�� ��ü ���� ���α׷��̹Ƿ� ��� �Լ�(method)�� class ���ο� �ְ� ��ü ���� �� ȣ��. ��ü �������� method������ �ٷ� ȣ���� �Ұ���
		
		// 1. ��ü ���� ���α׷��� ���� => class�� �����ؼ� ��� : ��� method�� ��ü ���ο� �����ϸ� ��ü�� ���� �� ȣ�� ����
		A a1 = new B();
		a1.abc();
		
		// 2. ��ü ���� ���α׷��� ���� => �͸��̳�Ŭ������ �����ؼ� ���
		// interface�� �߻� method�� ���� ������ class�� �������� �ʰ� �͸��̳�Ŭ������ ����ؼ� method ȣ��
		A a2 = new A() {
			@Override
			public void abc() {
				System.out.println("method ���� 2");
			}
		};
		a2.abc();		// OOP�� ��ü ���� �� method ȣ��
		
		// 3. ���ٽ�(�Լ���) ���α׷��� ����
		A a3 = () -> {System.out.println("method ���� 3");};		// ���ٽĿ� ���Ǵ� interface�� �Լ��� interface���� ��
		a3.abc();
		
	}

}
