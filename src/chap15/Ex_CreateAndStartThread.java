package chap15;

/*
 * ������ 4�� ����
 * 	1. �����带 ���
 * 	2. Runnable ����
 * 	3. �͸� ���� class�� �����ؼ� ����
 * 
 *		 1		  2		  3
 * �̸�	ȫ�浿	�̼���	�Ż��Ӵ�
 * ����   40		 50		  60
 * ����	100		 50		  80
 * ����	 70		 60		 100
 * ����	 50		 70		  80
 */

class Hong extends Thread {
	@Override
	public void run() {
		String[] hong = {"ȫ�浿", " 40  ", "100  ", " 70  ", " 50  "};
		
		try {
			Thread.sleep(20);
		} catch (InterruptedException e1) {
			
		}
		
		for (int i = 0; i < hong.length; i++) {
			System.out.print(hong[i] + "  ");
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				
			}
		}
	}
}

class Lee implements Runnable {
	@Override
		public void run() {
		String[] lee = {"�̼���", "50   ", "50   ", "60  ", "70   "};
		
		try {
			Thread.sleep(40);
		} catch (InterruptedException e1) {
			
		}
				
		for (int i = 0; i < lee.length; i++) {
			System.out.print(lee[i] + "  ");
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				
			}
		}
	}
}

public class Ex_CreateAndStartThread {

	public static void main(String[] args) {
		Thread hong = new Hong();
		
		Runnable leeThread = new Lee();
		Thread lee = new Thread(leeThread);
		
		Thread list = new Thread(
			new Runnable() {
				public void run() {
					String[] list = {"�̸�", "����", "����", "����", "����"};
					
					for (int i = 0; i < list.length; i++) {
						System.out.print(list[i] + "  ");
						try {
							Thread.sleep(200);
						} catch (InterruptedException e) {
							
						}
					}
				};
			}
		);
		
		Thread sin = new Thread(
			new Runnable() {
				public void run() {
					String[] sin = {"�Ż��Ӵ�", "60", "80", "100", "80"};
					
					try {
						Thread.sleep(60);
					} catch (InterruptedException e1) {
						
					}
					
					for (int i = 0; i < sin.length; i++) {
						System.out.println(sin[i]);
						try {
							Thread.sleep(200);
						} catch (InterruptedException e) {
							
						}
					}
				};
			}
		);
		list.start();
		hong.start();
		lee.start();
		sin.start();

	}

}
