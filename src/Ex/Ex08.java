package Ex;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		/*
		�迭�� �ݺ����� �̿��Ͽ� ���α׷��� �ۼ��غ���. Ű���忡�� ������ �� ���� �Է¹޾� ��������, ������, õ����, 500�� ����, 100�� ����,
		10�� ����, 1�� ������ �� �� ���� ��ȯ�Ǵ��� ���ÿ� ���� ����϶�. �� �� �ݵ�� ���� �迭�� �̿��ϰ� �ݺ������� �ۼ��϶�.
		*/
		
		Scanner sc = new Scanner(System.in);
		
		int[] unit = {50000, 10000, 1000, 500, 100, 50, 10, 1}; 
		
		System.out.println("�ݾ��� �Է��Ͻÿ� >> ");
			
		for (int i = 0; i < unit.length; i++) {
			int money = sc.nextInt();
			for (int k = 0; k < unit.length; k++) {
				System.out.println(unit[k] + "�� : " + (money / unit[k]) + "��");
				money %= unit[k];
			}
			
		}
		sc.close();
	}

}
