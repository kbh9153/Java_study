package Ex;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		// ���� 12. ���������� ����

		Scanner sc = new Scanner(System.in);
		String str[] = { "����", "����", "��" };
		System.out.println("��ǻ�Ϳ� ���������� ������ �մϴ�.");
		while (true) {
			int k = (int) (Math.random() * 3);
			System.out.print("���� ���� ��");
			String play = sc.next();
			if (play.equals("Stop")) {
				System.out.println("��������");
				break;
			}
			System.out.print("����ڴ� " + play + ", ��ǻ�� = " + str[k] + ", ");
			
			if (play.equals("����")) {
				if (str[k].equals("����")) {
					System.out.println("���º�");
				} else if (str[k].equals("����")) {
					System.out.println("��ǻ�� win");
				} else if (str[k].equals("��")) {
					System.out.println("����� win");
				}
			} else if (play.equals("����")) {
				if (str[k].equals("����")) {
					System.out.println("����� win");
				} else if (str[k].equals("����")) {
					System.out.println("���º�");
				} else if (str[k].equals("��")) {
					System.out.println("��ǻ�� win");
				}
			} else if (play.equals("��")) {
				if (str[k].equals("����")) {
					System.out.println("��ǻ�� win");
				} else if (str[k].equals("����")) {
					System.out.println("����� win");
				} else if (str[k].equals("��")) {
					System.out.println("���º�");
				}
			} else {
				System.out.println("Error");
			}

		}
		sc.close();
	}

}
