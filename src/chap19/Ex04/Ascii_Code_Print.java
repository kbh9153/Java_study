package chap19.Ex04;

/*
 * ASCII �ڵ� �� ��� : 1byte(= 8bit), ���� ó�� ��Ʈ�� ��ȣ ��Ʈ, ���� ��� bit�� 7bit
 * 	- 1 ~ 32bit������ ����� �� �� ���� Ư���� �ڵ� (ex. null, ����� ����, �����(7), ���� 10, (LF)..)
 * 	- 127 : delete
 * 
 * ���� ��� ������ 33�� bit ~ 126 bit
 * ����, ����, Ư������
 * 
 * ���
 * ========================================
 * �ƽ�Ű�ڵ�	����		�ƽ�Ű�ڵ�		����
 * ========================================
 * 33		!		34			&
 * 35		#		36
 * 
 * ......
 * 126		~
 */

public class Ascii_Code_Print {

	public static void main(String[] args) {
		System.out.println("=====================================");
		System.out.println("ASCII\t����\tASCII\t����");
		System.out.println("=====================================");
		
		char[] a = new char[94];
		int b;
		char[] c = new char[94];
		int d;
		
		for (int i = 0; i < a.length; i+=2) {
			a[i] = (char)('!' + i);
			b = (int)a[i];
			
			c[i] = (char)('!' + (i + 1));
			d = (int)c[i];
			System.out.println(b + "\t" + a[i] + "\t" + d + "\t" + c[i]);
		}
		
//		for (int i = 33; i < 127; i+=2) {
//			System.out.println(i + "\t" + (char)i + "\t\t" + (i + 1) + "\t" + (char)(i + 1));
//		}

	}

}
