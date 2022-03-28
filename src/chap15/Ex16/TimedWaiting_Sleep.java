package chap15.Ex16;

// Thread.sleep(1000) => 1000 : �ð�. TImedWaiting ���·� �̵� -> Ư�� �ð�(1��) ����Ǹ� Runnable ���·� ��ȯ
	// => ���ͷ�Ʈ�� �߻��Ǹ� ���ܸ� �߻���Ű�� Runnable ���·� ��ȯ

// �ν��Ͻ���(��ü��).join(1000) => 1000 : �ð�. TimeWaiting ���·� ��ȯ -> Ư�� �ð��� ����Ǹ� Runnable ���·� ��ȯ
	// => ex) a.join(1000) : �ڽ��� ������� 1�ʸ� ��ٸ��� a ��ü���� CPU �۾� �Ҵ�(Runnable ���·� ��ȯ) 
	// => 1�� �ڿ��� �ڽ��� �����嵵 Runnable ���·� ��ȯ

// => ����. �ν��Ͻ���(��ü��).join() : �ð��� ������ ���, Waiting ���·� ��ȯ
	// => �ڽ��� ������� ��� Waiting ���·� ��ȯ�ϰ� a ��ü�� CPU(Runnable)�� �۾��ϵ��� �Ҵ�
	// => a ��ü�� �۾��� ��� �Ϸ�� ��� �ڽ��� ������� Runnable ���·� ��ȯ

class MyThread extends Thread {
	@Override
	public void run() {
		try {
			Thread.sleep(3000);		// 3�ʵ��� TimedWaiting ���·� ����, 3�� �Ŀ��� Runnable ���·� �̵�
									// Interrupt�� �߻��Ǹ� ���ܸ� �߻���Ű�� �ٽ� Runnable ���·� ��ȯ
		} catch (InterruptedException e) {
			System.out.println("---<< sleep() ���� �� Interrupt �߻�>>---");
			for (long i = 0; i < 100000000L; i++) {}		 // 0.5�� �ð�����
		}
	}
}

public class TimedWaiting_Sleep {

	public static void main(String[] args) {
		MyThread myThread = new MyThread();
		myThread.start();		// Runnable
		System.out.println("MyThread State1 : " + myThread.getState());		// runnable ����
		
		try {Thread.sleep(100);} catch (InterruptedException e) {}		// ������ ���� �غ�ð�
		System.out.println("MyThread State2 : " + myThread.getState());		// TimedWaiting
		
		// 3�� ������ Interrupt �߻�
		myThread.interrupt();		// TimedWaiting ����
		try {Thread.sleep(1);} catch (InterruptedException e) {}
		System.out.println("MyThread State3 : " + myThread.getState());		// runnable ����
		

	}

}
