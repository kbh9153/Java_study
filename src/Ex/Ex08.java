package Ex;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		/*
		배열과 반복문을 이용하여 프로그램을 작성해보자. 키보드에서 정수로 된 돈을 입력받아 오만원권, 만원권, 천원권, 500원 동전, 100원 동전,
		10원 동전, 1원 동전이 각 몇 개로 변환되는지 예시와 같이 출력하라. 이 때 반드시 다음 배열을 이용하고 반복문으로 작성하라.
		*/
		
		Scanner sc = new Scanner(System.in);
		
		int[] unit = {50000, 10000, 1000, 500, 100, 50, 10, 1}; 
		
		System.out.println("금액을 입력하시오 >> ");
			
		for (int i = 0; i < unit.length; i++) {
			int money = sc.nextInt();
			for (int k = 0; k < unit.length; k++) {
				System.out.println(unit[k] + "원 : " + (money / unit[k]) + "개");
				money %= unit[k];
			}
			
		}
		sc.close();
	}

}
