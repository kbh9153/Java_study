package Ex;

import java.util.Scanner;

public class Quiz {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str;		// ��ü String ���� input �޴� ����
		String[] arr;		// ������ �������� �߶� �迭�� �����ϴ� ����
		int sum = 0;		// � ������ ����� ���� �����ϴ� ����
		int eventCount = 0;		// � ������ ������ �����ϴ� ����
		double avg = 0;		// ����� ���ϴ� ���� : (double) ��ü �������� �� / ������ ��
		int b = 0;		// �� ������ �������� ��� ����

		do {
			sum = 0;
			avg = 0;
			b = 0;
			eventCount = 0;
			
			System.out.println("��̸� ���������� ������ �̿��ؼ� �Է� �ϼ���.");
			System.out.println("<< ���α׷��� �����Ϸ��� \"�׸�\"�� �Է��ϼ���. >>");
			System.out.println("��) �Է� >> Ź�� 2 �߱� 9 �౸ 11 �� 4");
			
			str = sc.nextLine();		// sc.next() : ���� ��������� String ����
										// sc.nextLine() : ���� ���� + ������(Enter)���� String���� ����
			if (str.equals("�׸�")) {		// str�� ���� �ڷ����̹Ƿ� str.equls�� ����ؾ��� (== �� �⺻ �ڷ���)
				System.out.println("���α׷� ����");
				break;
			}
			arr = str.split(" ");		// str�� ������ �������� �߶� arr �迭�� ���� 

			for (int i = 0; i < arr.length; i++) {		// arr.length : �迭�� index 0 ~ ������ �����
				if (i % 2 != 0) {		// i : �迭�� �� ��ȣ(����)
					b = Integer.parseInt(arr[i]);		// �� ���� String Ÿ���� ������ ��ȯ
					sum += b;		// sum = sum + b => sum : ��ü �������� ��
					eventCount++;		// � ������ ������ �����ϴ� ����
				} 
			}
			avg = (double) sum / eventCount;		// ���
			
			System.out.println("�Է��Ͻ� ���� : " + str);
			System.out.println("�������� ���� : " + sum );
			System.out.println("�������� ��� : " + avg);
			System.out.println();
			
		} while(true); 
	}

}
