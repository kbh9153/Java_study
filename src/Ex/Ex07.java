package Ex;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		// ���� 7. ���� ������ 10�� �Է¹޾� �迭�� �����ϰ�, �迭�� �ִ� ���� �߿��� 3�� ����� ����ϴ� ���α׷��� �ۼ��϶�.
		
		Scanner sc = new Scanner(System.in);
		
		int array[] = new int[10];
		
		System.out.println("���� ���� 10���� �Է��Ͻÿ� >> ");
		for (int i = 0; i < array.length; i++) {
			array[i] = sc.nextInt();
			if (array[i] % 3 == 0) {
				System.out.println("3�� ����� " + array[i]);
			}
		}
		sc.close();
	}

}
