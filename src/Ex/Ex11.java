package Ex;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		/*
		 * ���� 11. ���� �ڵ�� ���� ������ ������ ¦�� �̷絵�� 2���� �迭�� �ۼ��϶�. String course[] = {"kava", "C++",
		 * "HTML5", "��ǻ�ͱ���", "�ȵ���̵�}; int score[] = {95, 88, 76, 62, 55};
		 */

		String course[] = {"Java", "C++", "HTML5", "��ǻ�ͱ���", "�ȵ���̵�"};
		int score[] = {95, 88, 76, 62, 55};
		Scanner sc = new Scanner(System.in);
		String name;
		int i;
		int k;
		while (true) {
			k = 0;
			System.out.println("������� �����ּ���!");
			name = sc.next();
			
			if (name.equals("Stop")) {
				System.out.println("�ý����� �����մϴ�.");
				break;
			}
			
			for (i = 0; i < course.length; i++) {
				if (course[i].equals(name)) {
					System.out.println(name + "�� ������ " + score[i]);
					k = 1;
				}
			}
			
			if (k == 0) {
				System.out.println("���� �����Դϴ�.");
			}
		}
		sc.close();
	}

}
