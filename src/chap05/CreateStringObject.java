package chap05;

public class CreateStringObject {

	public static void main(String[] args) {
		
		// 1. String ��ü ���� 1 : new Ű�� ����ؼ� ��ü ���� : Heep ���� ������ ������ ���� ����
		// RAM(�޸�)�� ���� ���� �������� �ʴ´�.
		
		String str1 = new String("�ȳ�");		
		String str11 = new String("�ȳ�");		// str1�� str11�� ���� ������, ������ �޸� ������ ���´�.
		System.out.println(str1);			
		/*
		 * new Ű�� ��ü�� �����϶�� �ǹ� (Heep �޸𸮿� �����ض�)	
		 * String�� ��ü�� ��������� ��ü�� ���� ���	
		 * �ٸ� ��ü�������� heep������ �޸��ּҸ� ���
		 * 	��ü������ ���� ����Ҷ��� ��ü��.toString() ������							
		*/
		
		if (str1 == str11) {					// ���� �ڷ����� ��, ==�� �޸� �ּҸ� ���ϴ� ���̴�.
			System.out.println(true);
		} else {
			System.out.println(false);
		}
		
		System.out.println("====================");
		
		// 2. ���ͷ� ���� �ٷ� �Ҵ� : ���� ���� ���, RAM(�޸�)�� ����
		String str2 = "�ȳ��ϼ���.";		// ������ ���� ��Ī�ؼ� ���ͳ��̶�� �Ѵ�.
		String str22 = "�ȳ��ϼ���.";		// str2�� str22�� ���� �����Ƿ�, ������ �޸� ������ ���´�.
		
		if (str2 == str22) {					// ���� �ڷ����� ��, ==�� �޸� �ּҸ� ���ϴ� ���̴�.
			System.out.println(true);
		} else {
			System.out.println(false);
		}
	}
}
