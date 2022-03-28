package chap15.Ex14;

/*
 * ������ ����
 * 	1. NEW : ������ ��ü ���� �� .start() method�� ȣ��Ǳ� �� ����
 * 	2. RUNNABLE : .start() method�� ȣ��Ǹ� run() method ������ �ڵ尡 CPU���� ����ǰ� �ִ� ����
 * 	3. TERMINATE : run()�� ��� �ڵ尡 ����� �� ������ ���� ����
 * 	4. TIMED WAIT : Ư�� �ð����ȸ� ������. Thread.sleep();
 * 		=> a.join(1000) -> ���� �ڽ��� ������� 1�� ��� ���¿� �ְ� a ��ü�� ������·� ���� ���� (�纸)
 * 		=> Ư�� �ð��� ����Ǹ� ���� ���·� ��. ���ͷ�Ʈ�� �߻��Ǹ� ���ܸ� �߻���Ű�� ������·� ��
 * 	5. BLOCK : ����ȭ ó������ lock�� �ɷ��� ������ ��� ���ܵ� ����. �ٸ� �۾��� ������ ���ؼ��� ���� �۾��� �ݳ��� Ű�� ȹ�� �� ���� ����  
 * 	6. WAIT : ������ ��� ����. �ٽ� ���� ���·� ó���ؾ� ���� ����
 */

public class NewRunnableTerminated {

	public static void main(String[] args) {
		// �������� ���¸� �����س��� class. �� 6������ ���¸� ���� ����
		Thread.State state;		// state �������� 6���� ����� ���� ����
		
		// 1. ��ü ���� (NEW)		// �͸� ���� class ����
			// NEW : ������ ��ü ���� �� start() ȣ�� �Ǳ� ������
		Thread myThread = new Thread() {
			@Override
			public void run() {
				for (long i = 0L; i < 100000000L; i++) {}		// �� 0.5�� �ð� ����, CPU ���� �ӵ��� ���� �ð� ����
				// ��ü ������ �ణ�� �ð��� �ҿ�
				// �޸��� �Ҵ�
			}
		};
		
		state = myThread.getState();		// �������� ���¸� ������ �ͼ� state ������ �Ҵ�
		System.out.println("myThread state : " + state);
		
		// 2. myThread ����
		myThread.start();		// �����带 ���۽� CPU���� ����
		state = myThread.getState();		
		System.out.println("myThread state : " + state);		// RUNNABLE
		
		// 3. myThread ���� 
		
		// myThread.join(); : ���� ������� ����ϰ� myThread�� ó�� ���
		try {myThread.join();} catch (InterruptedException e) {}
		state = myThread.getState();		
		System.out.println("myThread state : " + state);		// TERMINATED
	}

}
