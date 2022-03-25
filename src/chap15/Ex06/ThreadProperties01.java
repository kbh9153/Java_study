package chap15.Ex06;

public class ThreadProperties01 {

	public static void main(String[] args) {
		// 1. ��ü �������� (currentThread)		// ������ �� (activeCount())
			// static
		Thread curThread = Thread.currentThread();		// ���� ������. Thread.currentThread() : ���� ������ ����
		// class��(Ÿ��) ���������� = class��.method��
		System.out.println("���� �������� �̸� : " + curThread.getName());		// .getName() : ���� ������ ���� �̸�
		System.out.println("�����ϴ� ������ �� : "+ Thread.activeCount());		// Thread.activeCount : �����ϴ� ������ ��

		System.out.println("----------------------------");
		
		// 2. �������� �̸� ��� (�ڵ����) : JVM�� ������ �̸��� �ڵ����� �Ҵ� => ex. Thread-0, 1, 2 ������ Thread-9
		for (int i = 0; i < 10; i++) {
			Thread thread = new Thread();
			System.out.println(thread.getName());		// ������ �̸� ���
			thread.start();
		}
		
		System.out.println("----------------------------");
		
		// 3. ������ �̸� ���� ���� �� ��� : ��ü��.setName();
		for (int i = 0; i < 10; i++) {
			Thread thread = new Thread();
			thread.setName(i + "��° ������");
			System.out.println(thread.getName());		// ������ �̸� ���
			thread.start();
		}
		
		System.out.println("----------------------------");
		
		// 4. �������� �̸� ��� (�ڵ����) : JVM�� ������ �̸��� �ڵ����� �Ҵ� => ex. Thread-20, 1, 2 ������ Thread-29
		for (int i = 0; i < 10; i++) {
			Thread thread = new Thread();
			System.out.println(thread.getName());
			thread.start();
		}
		
		// 5. ������ �� ����ϱ�
		System.out.println("�����ϴ� ������ �� : " + Thread.activeCount());
	}

}
