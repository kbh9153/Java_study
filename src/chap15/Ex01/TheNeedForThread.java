package chap15.Ex01;



public class TheNeedForThread {

	public static void main(String[] args) {
		// 1. ���� ������ : 1 ~ 5
		int[] intArray = {1, 2, 3, 4, 5};
		
		// 2. �ڸ� ������ : �ϳ� �� �� �� �ټ�
		String[] strArray = {"�ϳ�", "��", "��", "��", "�ټ�"};

		// 3. ���� ������ ���
		System.out.print("(���� ������) ");
		
		for (int i = 0; i < intArray.length; i++) {
			System.out.print(intArray[i] + " ");
			try {
				Thread.sleep(200);		// 0.2�ʵ��� �Ͻ�����. Thread.sleep ���� : 1000ms
			} catch (InterruptedException e) {
				
			}
		}
		System.out.println();
		System.out.println("-----------------------");
		
		// 4. �ڸ� ������ ���
		System.out.print("(�ڸ���ȣ) ");
		
		for (int i = 0; i < strArray.length; i++) {
			System.out.print(strArray[i] + " ");
			try {
				Thread.sleep(200);		// 0.2�ʵ��� �Ͻ�����. Thread.sleep ���� : 1000ms
			} catch (InterruptedException e) {
				
			}
		}
	}

}
