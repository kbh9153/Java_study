package chap14.Ex01;

import java.util.Scanner;

// Error : ���α׷��Ӱ� ������ �� ���� �κ�. OS, Hardware���� �߻��ϴ� Error
// Exception(����) : ���α׷��Ӱ� ������ �� �ִ� �κ�
	// => ���ܰ� �߻��Ǹ� ���α׷��� �����
	// => ���ܰ� �߻��ǵ��� ���α׷��� ��������ʰ� ó���� �ؾ���. �̸� Exception ���� ó���� ��

// ArithmeticException : � ���� 0���� ������ �߻��ϴ� ����
	// => ��ǻ�ʹ� � ���� 0���� ���� ��� ��� �Ұ�

public class CheckedException01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("<< ���� �ϳ��� �Է��Ͻÿ� >>");
		
		int a = sc.nextInt();
		int b = 10;
		
		try {		// try ��Ͽ��� ����(Exception)�� �߻��� ���
			// try ���
			System.out.println(b / a);
		} catch (ArithmeticException e) {
			// catch ��� : try{} ��Ͽ��� ������ �߻��� ��� catch ����� �۵�
			System.out.println("������ �߻��߽��ϴ�. 0���� ���� �� �����ϴ�. �ٸ� ���� �־��ּ���");
		} finally {
			
		}
		
		System.out.println("���α׷��� �����մϴ�.");
		
	}

}
