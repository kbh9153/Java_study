package chap12.Ex02;

// Interface ������ class
	// Overriding : method�� �ڽ� class���� ���Ӱ� �����ϴ� ��
	// Implements : (Interface�� ����)�̿ϼ� method�� �ϼ���Ű�� ��
	// extends : �θ� class�� ����� ��ӹ޾� �ڽ��� ����� �߰�, Ȯ���ϴ� ��

interface AA {
	void cry();		// �߻� method(�̿ϼ��� method). public abstract ����
	void run();		// �߻� method(�̿ϼ��� method). public abstract ����
}

class BB implements AA {		// BB class�� AA Interface�� �̿ϼ��� method�� �����Ѵٶ�� �ǹ�
	@Override
	public void cry() {
		System.out.println("�߿�");
		
	}
	
	@Override
	public void run() {
		System.out.println("������");
		
	}
}

public class Interface02 {

	public static void main(String[] args) {
		//
		AA aa = new BB();		// BB : Interface�� �̿ϼ� method�� ������ class
		aa.cry();
		aa.run();

	}

}
