package chap12.Ex01;

// 2. �߻� method�� ����ϴ� 2��° ��� : �ڽ� ��ü �������� �͸� class�� Ȱ���ϴ� ���
	// 1�� �ӽ������� ����� �� ��� => �̺�Ʈ ó��
	// ���� : �ڽ� class ������ ���� ����. �ӽ������� ����� ��� ����
	// ���� : �������� ��ü�� �����ؾ��� ��� �ڵ尡 ����� (1�� ��� ����)
abstract class AAA {		// �߻� method�� ��üȭ�� �� ����
	abstract void abc();		// �߻� method
}

public class AbstractClass02 {

	public static void main(String[] args) {
		// 1. �͸� ��ü ����
		AAA aaa = new AAA() {		// �͸� ��ü�� Ȱ���� �߻� method�� class �������� ����
			void abc() {
				System.out.println("��� 2 : ��ü �������� �͸� class�� �߻� method ����");
			}
		};
		
		 AAA aaa1 = new AAA() {		// �߻� class�� ��üȭ �Ұ�, �͸� Ŭ���� ���� �� �޼ҵ� �������ؼ� ���
			 void abc() {
				 System.out.println("��� 2 : ��ü �������� �͸� class�� �߻� method ����");
			 }
		 };
		 
		 AAA aaa2 = new AAA() {
			 void abc() {
				 System.out.println("��� 2 : ��ü �������� �͸� class�� �߻� method ����");
			 }
		 };
		
		// 2. method ȣ��
		aaa.abc();
		aaa1.abc();
		aaa2.abc();

	}

}
