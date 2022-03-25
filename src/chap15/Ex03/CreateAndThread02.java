package chap15.Ex03;

// 2��° ������ (index ��ȣ : 0)
class SMIFileThrad extends Thread {		// �ڸ� ���� ó���ϴ� ������
	@Override
	public void run() {
		// 1. �ڸ� ��ȣ ���
		String[] strArray = {"�ϳ�", "��", "��", "��", "�ټ�"};
		
		try {Thread.sleep(10);} catch (InterruptedException e1) {}
		
		for (int i = 0; i < strArray.length; i++) {
			System.out.println(" - (�ڸ���ȣ) " + strArray[i]);
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {

			}
		}
	}
}

// 3��° ������ (index ��ȣ : 1)
class VideoFileThread extends Thread {		// ���� ���� ó���ϴ� ������
	@Override
	public void run() {
		// 2. ���� ������ ���
		int[] intArray = {1, 2, 3, 4, 5};
		
		for (int i = 0; i < intArray.length; i++) {
			System.out.println(" - (���� ������) " + intArray[i]);
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				
			}
		}
	}
}

public class CreateAndThread02 {

	// ù��° ������
	public static void main(String[] args) {
		// SMIFileThread ��ü ����
		Thread smi = new SMIFileThrad();
		smi.start();
		
		// VideoFileThread ��ü ����
		Thread video = new VideoFileThread();
		video.start();

	}

}
