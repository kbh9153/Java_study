package chap14.Ex03;

// �������� Exception�� ���ÿ� �߻��� ��� ó��

public class MultiCatch01 {

	public static void main(String[] args) {
		// 1. ���� Exception ó�� => try catch ó��
		
		// ArrayIndexOutOfBoundsException
		try {
			System.out.println(10 / 0);
		} catch(ArithmeticException e) {
			// catch ����� �ƹ� ������ ��� ����ó�� �����
			System.out.println("���� ��� (ArithmeticException)");
		}
		
		
		// NumberFormatException
		try {
			int num = Integer.parseInt("10A");
		} catch (NumberFormatException e) {
			// catch ����� �ƹ� ������ ��� ����ó�� �����
			System.out.println("���� ��� (NumberFormatException)");
		}
		
		System.out.println("--------------------------------");
		
		// 2. ���� Exception(MultiException) ó��
		try {
			System.out.println(10 / 0);
			int num2 = Integer.parseInt("10A");
		} catch (ArithmeticException e) {
			System.out.println("ArithmeticException");
		} catch (NumberFormatException k) {
			System.out.println("NumberFormatException");
		}
		
		System.out.println("--------------------------------");
		
		// 3. ���� Exception(MultiException) ó�� 2
		try {
			System.out.println(10 / 0);
			int num3 = Integer.parseInt("10A");
		} catch(ArithmeticException | NumberFormatException e) {
			System.out.println("���� ���� ó��");
		}
		
		System.out.println("���α׷� ����");
	}

}
