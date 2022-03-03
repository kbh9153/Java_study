package chap05;

import java.util.Arrays;

public class MethodOfString_02 {

	public static void main(String[] args) {
		// 5. ���ڿ� ����
		// toLowerCase() : �ҹ��ڷ� ��ȯ, toUpperCase() : �빮�ڷ� ��ȯ
		
		String str1 = "JAVA Study";
		System.out.println(str1.toLowerCase());		// java study. �ҹ��ڷ� ��ȯ
		System.out.println(str1.toUpperCase());		// JAVA STUDY. �빮�ڷ� ��ȯ
		
		System.out.println();
		
		// replace(old, new) : old�� new�� �ٲٱ�
		
		System.out.println(str1.replace("Study", "����"));	// Java ����. Study => ���η� �ٲ�.
		
		// substring(���� index, �߶� ����� ������ index) : ���ڿ��� �߶� ���
		
		System.out.println(str1.substring(0, 4));		// Java. cursor �������� �����ϸ� ����
		System.out.println(str1.substring(6, 8));		// tu
		
		// split() : Ư�� ���ڸ� �������� �߶� String[] �迭�� ����
		
		String str11 = "abc/def-ghi jkl";
		String[] strArray = str11.split("/|-| ");		// '/' �Ǵ� '-' �Ǵ� '����' => | �������� �ڸ�
		System.out.println(Arrays.toString(strArray));
		
		String str111 = "������ ������ �帳�ϴ�. ";
		String[] strArray2 = str111.split(" ");
		System.out.println(Arrays.toString(strArray2));
		
		String str1111 = "�̸�, ����, ����, ��ȭ��ȣ, �����ּ�";
		String[] strArray3 = str1111.split(", ");
		System.out.println(Arrays.toString(strArray3));
		for (int i = 0; i < strArray3.length; i++) {
			System.out.print(strArray3[i] + " ");
		}
		
		System.out.println();
		System.out.println("===============================");
			
		// trim() : �յ��� ������ ����
			
		System.out.println("         abc         ");
		System.out.println("         abc         ".trim());
		
		// 6. ���ڿ��� ���� �� (equals() : ��ҹ��� �����ϸ鼭 ���� ��
			// , equalsIgnoreCase() : ��ҹ��� �������� ���� ��
		
		String str2 = new String("Java");
		String str3 = new String("Java");
		String str4 = new String("java");
		
		// �޸��� �ּ� �� �� (==)
		System.out.println(str2 == str3);
		System.out.println(str3 == str4);
		System.out.println(str4 == str2);
		
		System.out.println();
		
		// ���� �� (equals(), equalsIgnoreCase())
		System.out.println(str2.equals(str3));	// true. ��ҹ��� �����Ͽ� ��
		System.out.println(str2.equals(str4));	// false. ��ҹ��� �����Ͽ� ��
		System.out.println(str2.equalsIgnoreCase(str4));	// true. ��ҹ��� �������� �ʰ� ��
		
		}
	}

