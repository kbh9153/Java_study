package chap14.Ex03;

public class MultiCatch02 {

	public static void main(String[] args) {
		// 1. Exception���� ��� ���ܸ� ó�� ����
			// => ��� ���ܴ� Exception�� ��� ����
		try {
			System.out.println(10 / 0);
			int num = Integer.parseInt("10A");
		} catch(Exception e) {
			// try{} ��Ͽ��� �߻��ϴ� ��� ���ܴ� Exception class�� ��� ó��
			System.out.println("���� ó�� (Exception)");
		}
		
		// 2. catch ����� ������ �߸��� ��� : Exception�� catch�� �������� ��ġ�ؾ���
		/*
		try {
			System.out.println(10 / 0);
			int num = Integer.parseInt("10A");
		} catch (Exception e) {
			// try{} ��Ͽ��� �߻��ϴ� ��� ���ܴ� Exception class�� ��� ó��
			System.out.println("���� ó�� (Exception)");
		} catch (ArithmeticException e) {
			
		} catch (NumberFormatException e) {
			
		}
		*/
		
		// 3. catch ����� �ùٸ� ���� : �ֻ��� Exception�� catch ����� ���� �������� ��ġ�ؾ���
		try {
			System.out.println(10 / 0);
			int num = Integer.parseInt("10A");
		} catch (ArithmeticException e) {		// �������� 
			
		} catch (NumberFormatException e) {
			
		} catch (Exception e) {		// �ֻ��� �θ��� Exception�� �������� ��ġ�ؾ���
			
		}
		
		// 4. �������� Exception�� �����ؼ� ����
		try {
			System.out.println(10 / 0);
			int num = Integer.parseInt("10A");
		} catch (ArithmeticException | NumberFormatException e) {	 
			// �������� Exception�� ����
			
		} catch (Exception e) {
			
		}
		
		System.out.println("���α׷� ����");
	}

}
