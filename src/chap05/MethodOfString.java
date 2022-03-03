package chap05;

import java.util.Arrays;

public class MethodOfString {
	public static void main(String[] args) {
		
		String str1 = "Hello Java!";			// str1 : �������� or ��ü or �ν��Ͻ�
		String str2 = "�ȳ��ϼ���! �ݰ����ϴ�.";
		
		// 1. ���ڿ� ���� (length()) �� int Ÿ������ ��ȯ
		
		System.out.println(str1.length());
		System.out.println(str2.length());
		/*
		 * Java���� length�� byte���� �ƴ϶�, ���ڼ��� ���Ѵ�.
		 */
		System.out.println("========================");
		
		
		// 2. ���ڿ� �˻� ( charAt(), indexOf(), lastIndexOf() )
		System.out.println(str1.charAt(1));					// 1������ ���ڸ� ��� (0���� ����)
		System.out.println(str2.charAt(1));					// 1������ ���ڸ� ��� (0���� ����)
		System.out.println();
		
		System.out.println(str1.indexOf('a'));				// 0���� ����� ������ ����� ������ ���ȣ(index)�� int Ÿ������ ��ȯ
		System.out.println(str1.indexOf('a', 8));			// 8������� ���������� �˻�
		System.out.println();
		
		System.out.println(str1.lastIndexOf('a'));			// ������ ����� 0��° ����� ������ ���ȣ(index)�� int Ÿ������ ��ȯ
		System.out.println(str1.lastIndexOf('a', 8));		// 8������� �������� �˻�
		System.out.println();
		
		System.out.println(str1.indexOf("Java"));			// ���ڿ��� �����ϴ� ���ȣ�� int Ÿ������ ��ȯ
		System.out.println(str1.lastIndexOf("Java"));
		System.out.println(str2.indexOf("�ϼ���"));
		System.out.println(str2.lastIndexOf("�ϼ���"));
		System.out.println();
		
		System.out.println(str1.indexOf("bye"));			// ���� ���, -1�� ���
		
		System.out.println("==========================");
		
		// 3. ���ڿ� ��ȯ �� ���� ( String.valueOf(), concat() )
		
		// String.valueOf(�⺻�ڷ���) : �⺻�ڷ����� String Ÿ������ ��ȯ
		String str3 = String.valueOf(2.3);					// �Ǽ��� String Ÿ������ ��ȯ
		String str4 = String.valueOf(false);				// boolean�� String Ÿ������ ��ȯ
		
		System.out.println(str3);
		System.out.println(str4);
		System.out.println();
		
		// concat() : ���ڿ��� ���ڿ��� ���� : + �����ڿ� ����.
		String str5 = str3.concat(str4);
		System.out.println(str5);
		System.out.println();
		
		// concat() �޼ҵ忡�� String.valueOf ���
		String str6 = "�ȳ�" + 3;								// + �����ڴ� �ڵ����� String Ÿ������ ��ȯ���ش�.
		String str7 = "�ȳ�".concat(String.valueOf(3));		// concat �޼ҵ�� ���ڿ��� ���� �� �����Ƿ� ��ȯ�Ͽ� ����ؾ��Ѵ�.
		
		System.out.println(str6);
		System.out.println(str7);
		System.out.println("==========================");
		
		// 4. ���ڿ��� byte[] �迭 Ÿ������ ��ȯ, �ƽ�Ű �ڵ尡 ���, ����� ���� ó���� �� ��� ( getBytes() )
		
		String str8 = "Hello Java!";
		String str9 = "�ȳ��ϼ���";
		
		byte[] array1 = str8.getBytes();
		byte[] array2 = str9.getBytes();
		
		System.out.println(Arrays.toString(array1));
		System.out.println(Arrays.toString(array2));
		System.out.println("==========================");
		
		// 5. ���ڿ��� char[] Ÿ������ ��ȯ ( toCharArray() )
		char[] array3 = str8.toCharArray();
		char[] array4 = str9.toCharArray();
		
		System.out.println(Arrays.toString(array3));
		System.out.println(Arrays.toString(array4));
		
		
		
	}
}
