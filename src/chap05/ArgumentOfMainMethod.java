package chap05;							// Ŭ������ ��ġ�ϴ� �����ּ�

public class ArgumentOfMainMethod {		// Ŭ���� �̸��� �����̸��� �����ؾ��Ѵ�. Ŭ���� �̸��� �빮�ڷ� �����ؾ��Ѵ�.
	public static void main(String[] ar) {	// ���� �޼ҵ�[c������ �Լ�]
		/*
		 * void main(String[] args) { 		void : ���ϰ��� ������ ���Ѵ�.	main : �޼ҵ��	(���� �Ű�����)
		 * 	�޼ҵ带 ȣ��� ������ �ڵ�;
		 * }
		 * 
		 */
		String a = ar[0];			// "�ȳ��ϼ���" : ���ڿ� ����
		String b = ar[1];			// 3 : ���� ����
		String c = ar[2];			// 3.8 : �Ǽ� ����
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		System.out.println();
		
		// main �޼ҵ忡 ���ڰ����� ������ �Ǽ��� �Ѱ� �ٶ�  String ���� ��ȯ
		System.out.println(b + 1);		// 31
		System.out.println(c+1);		// 3.81
		
		
		
		// String �� ������ �Ǽ��� ��ȯ�ؼ� ���
		
		int d = Integer.parseInt(b);		// b(string) �� d(Integer) Ÿ�Ժ�ȯ 
		double e = Double.parseDouble(c);	// c(String) �� e(double) Ÿ�Ժ�ȯ 
		
		System.out.println(d+1);
		System.out.println(e+1);
		
		
		
		
		
	}
	
}
