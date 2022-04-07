package chap18.Ex03;

import java.util.Scanner;

/*
 * 1. Scanner�� ����ؼ� double�� �� ���� �Է� �޽��ϴ�.
 * 2. ��� 1. ���ٽ��� ����ؼ� �Է¹��� �� ���� +, -, *, / ��Ģ������ �����ؼ� ���
 * 3. ��� 2. �������̽��� ������ �ڽ� ��ü�� ����ؼ� �Է¹��� �� ���� +, -, *, / ��Ģ������ �����ؼ� ���
 * 4. ��� 3. �͸��̳�Ŭ������ ����ؼ� �Է¹��� �� ���� +, -, *, / ��Ģ������ �����ؼ� ���
 * 5. Arithmetic Exception ó�� : 0 ���� �Է¹����� ���� �߻� => int�� ��� ����ó���� �ʿ������� double�� ��쿡�� �̹� ����ó���� �Ǿ��־� ���ʿ�
 */


@FunctionalInterface
interface Arithmetic {
	void arithmeticOpr(double a, double b);
}

class Ari implements Arithmetic {
	@Override
	public void arithmeticOpr(double a, double b) {
		System.out.println("�� : " + (a + b) + "\n�� : " + (a - b) + "\n�� : " + (a * b) + "\n�� : " + (a / b));
	}
}

public class ArithmeticOperation {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("������ ���� 2���� �Է��ϼ��� >> (ex. 1 1)");
		double num1 = scanner.nextInt();
		double num2 = scanner.nextInt();
		
		Arithmetic ari1 = new Arithmetic() {
			@Override
			public void arithmeticOpr(double a, double b) {
				System.out.println("�� : " + (a + b) + "\n�� : " + (a - b) + "\n�� : " + (a * b) + "\n�� : " + (a / b));
			}
		};
		
		System.out.println("---<< �͸��̳�Ŭ���� >>---");
		ari1.arithmeticOpr(num1, num2);
		System.out.println();
		
		
		Arithmetic ari2 = (a, b) -> {
			System.out.println("�� : " + (a + b) + "\n�� : " + (a - b) + "\n�� : " + (a * b) + "\n�� : " + (a / b));
		};
		
		System.out.println("---<< ���ٽ� >>---");
		ari2.arithmeticOpr(num1, num2);
		System.out.println();
		
		
		Arithmetic ari3 = new Ari();
		
		System.out.println("---<< �������̽� ���� >>---");
		ari3.arithmeticOpr(num1, num2);
	}

}
