package chap06_07.Ex02;

import java.util.Scanner;

public class Q2 {
	
	static void math(String...values) {
		int sum = 0;		// ������ ������ ���ϴ� ����
		double avg;
		
		for (int i = 0; i < values.length; i++) {
			sum += Integer.parseInt(values[i]);			// Inter.parseInt(String) : String Ÿ���� ������ ��ȯ
			// sum += values[i];		// values[i]��° ���� ���� String Ÿ���̹Ƿ� ����Ÿ������ ��ȯ
		}
		
		avg = (double) sum / values.length; 		// ����� ����ȯ�� �ʼ�!
		System.out.println();
		
		System.out.println("���� �������� �հ�� : " + sum);
		System.out.println("���� �������� ����� : " + avg);
	}

	public static void main(String[] args) {
		// Scanner�� ������ ���� ���� �Ҵ� �޾Ƽ� �հ�� ��հ��� ���
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���� ���� ������ �־ �Է��ϼ���. >>>");
		
		String num = sc.nextLine();		// ������ ���Ƿ� ��ü �������� String���� �Է¹���
		String[] array = num.split(" ");		// split�� �����ڸ� �������� ���ڸ� �߶� �迭�� ����
		
		for (int i = 0; i < array.length; i++) {		// �Է� ���� ���
			System.out.print(array[i] + " ");
		}
		
		math(array);		// ���� ���� method math�� ȣ���ϸ鼭 �ް������� array�� �־���

	}

}
