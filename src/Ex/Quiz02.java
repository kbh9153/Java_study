package Ex;

import java.util.Scanner;

public class Quiz02 {

	public static void main(String[] args) {
		boolean run = true;
		int nu = 0;		// Scanner�� ��ȣ�� input �޴� ����
		
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("---------------------------------------------------------------------------------------------");
			System.out.println("| 1. 1�� ~ 19�� ��� | 2. 1�� ~ 19�� �� Ȧ���ܸ� ��� | 3. 1�� ~ 19�� �� 3�� ����ܸ� ��� | 4. ���α׷� ���� |");
			System.out.println("---------------------------------------------------------------------------------------------");
			System.out.println(">> 1 ~ 4 �� ����ϴ� ��ȣ�� �Է����ּ���.");
			
			nu = sc.nextInt();
			
			if (nu == 1) {	// ���� for ���� ����ؼ� 19�� ��� 
				for (int i = 1; i < 20; i++) {
					for (int k = 1; k < 10; k++) {
						System.out.println(i + " x " + k  +" = " + i * k);
					}
				}
			} else if (nu == 2) {	// Ȧ���ܸ� ���
				for (int a = 1; a < 20; a++) {
					for (int b = 1; b < 10; b++) {
						if (a % 2 == 1) {
							System.out.println(a + " x " + b  +" = " + a * b);
						}
					}
				}
			} else if (nu == 3) {	// 3�� ����ܸ� ���
				for (int c = 1; c < 20; c++) {
					for (int d = 1; d < 10; d++) {
						if (c % 3 == 0) {
							System.out.println(c + " x " + d  +" = " + c * d);
						}
					}
				}
			} else if (nu == 4) {		// ���α׷� ����
				break;
			}
		} while(run);
			
		// Scanner�� �޸𸮿��� ����
		
		sc.close();
		System.out.println("���α׷��� �����մϴ�.");
	}

}
