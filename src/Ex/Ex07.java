package Ex;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		// 문항 7. 양의 정수를 10개 입력받아 배열에 저장하고, 배열에 있는 정수 중에서 3의 배수만 출력하는 프로그램을 작성하라.
		
		Scanner sc = new Scanner(System.in);
		
		int array[] = new int[10];
		
		System.out.println("양의 정수 10개를 입력하시오 >> ");
		for (int i = 0; i < array.length; i++) {
			array[i] = sc.nextInt();
			if (array[i] % 3 == 0) {
				System.out.println("3의 배수는 " + array[i]);
			}
		}
		sc.close();
	}

}
