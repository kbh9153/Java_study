package chap14.Ex02;

// ���� ���� (unChecked Exception, RunTime Exception) : ������ �ܰ迡���� ���ܰ� �߻����� �ʰ�, ����ÿ� ���ܰ� �߻� 

class AA {
	
}

class BB extends AA {
	
}

public class unCheckedException {

	public static void main(String[] args) {
		// ���� ����
		
		// ArithmeticException : 0���� � ���� �������� �� ���� �߻� 
		// System.out.println(10 / 0);
		
		// ClassCastException : class�� Ÿ���� ��ȯ�� �� ��ȯ���� �ʴ� ���� �߻�
		AA aa = new AA();
		// BB bb = (BB) aa;		// ������ �ܰ迡���� �����߻� ���� ����
		
		// ArrayIndexOutOfBoundsException : �迭���� �������� �ʴ� ���ȣ�� ����� ��� ���� �߻� 
		int[] array = {1, 2, 3};
		// System.out.println(array[3]);
		
		// NumberFormatException : ������ ���ڸ� ����Ÿ������ ��ȯ�� �� ���� ���� �߻�
		// int num = Integer.parseInt("10!");		// ���ڿ� �� 10�� ������ ��ȯ
		// System.out.println(num);
		
		// NullPointerException : ��ü���� null�ε� method�� ȣ����� ��� ���� �߻�
		String str = null;
		System.out.println(str.charAt(3));

	}

}