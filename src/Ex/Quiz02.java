package Ex;

import java.util.Scanner;

public class Quiz02 {

	public static void main(String[] args) {
		boolean run = true;
		int nu = 0;		// Scanner로 번호를 input 받는 변수
		
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("---------------------------------------------------------------------------------------------");
			System.out.println("| 1. 1단 ~ 19단 출력 | 2. 1단 ~ 19단 중 홀수단만 출력 | 3. 1단 ~ 19단 중 3의 배수단만 출력 | 4. 프로그램 종료 |");
			System.out.println("---------------------------------------------------------------------------------------------");
			System.out.println(">> 1 ~ 4 중 희망하는 번호를 입력해주세요.");
			
			nu = sc.nextInt();
			
			if (nu == 1) {	// 이중 for 문을 사용해서 19단 출력 
				for (int i = 1; i < 20; i++) {
					for (int k = 1; k < 10; k++) {
						System.out.println(i + " x " + k  +" = " + i * k);
					}
				}
			} else if (nu == 2) {	// 홀수단만 출력
				for (int a = 1; a < 20; a++) {
					for (int b = 1; b < 10; b++) {
						if (a % 2 == 1) {
							System.out.println(a + " x " + b  +" = " + a * b);
						}
					}
				}
			} else if (nu == 3) {	// 3의 배수단만 출력
				for (int c = 1; c < 20; c++) {
					for (int d = 1; d < 10; d++) {
						if (c % 3 == 0) {
							System.out.println(c + " x " + d  +" = " + c * d);
						}
					}
				}
			} else if (nu == 4) {		// 프로그램 종료
				break;
			}
		} while(run);
			
		// Scanner를 메모리에서 삭제
		
		sc.close();
		System.out.println("프로그램을 종료합니다.");
	}

}
