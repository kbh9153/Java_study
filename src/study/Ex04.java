package study;

public class Ex04 {

	public static void main(String[] args) {
		/*
		 *  ���� 4. for ���� �̿��ؼ� ���� ����� ���� �ﰢ���� ����ϴ� �ڵ带 �ۼ��غ�����.
		 *  
		 *  *
		 *  **
		 *  ***
		 *  ****
		 */
		
		for (int i = 1; i < 6; i++) {
			for (int k = 0; k < i; k++) {
			System.out.print("*");
		}
		System.out.println();
		}
		
		for (int j = 4; j > 0; j--) {
			for (int a = 1; a <= j; a++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("==================================");
		System.out.println();
		
		for (int a = 1; a < 6; a++) {
			for (int b = 5; b > 0; b--) {
				if (a < b) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		
		for (int c = 5; c > 1; c--) {
			for (int d = 6; d > 1; d--) {
				if (c < d) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}

}
