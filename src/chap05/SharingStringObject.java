package chap05;

public class SharingStringObject {

	public static void main(String[] args) {
		// 1. ���ڿ� ��ü ���� (���ͷ��� ������ ���) new Ű����� ������ ��� (������ heep������ ����)
		
		String str1 = new String("�ȳ�");		// new��� Ű����� �����ϸ� �޸𸮸� �������� �ʴ´�.
		String str2 = "�ȳ�";
		String str3 = "�ȳ�";
		String str4 = new String("�ȳ�");
		
		// �� ������ RAM(�޸�) �ּ� �� (==)		�⺻�ڷ����� ���, ���� ��
		
		System.out.println(str1 == str2);
		System.out.println(str2 == str3);
		System.out.println(str3 == str4);
		System.out.println(str1 == str4);
		System.out.println("================");
		
		// �� ������ �޸� ���� �� (������.equals(������2))
		
		System.out.println(str1.equals(str2));
		System.out.println(str2.equals(str2));
		System.out.println(str3.equals(str4));
		System.out.println(str1.equals(str4));
		System.out.println("================");
		
		
		
	}

}
