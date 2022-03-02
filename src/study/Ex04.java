package study;

public class Ex04 {

	public static void main(String[] args) {
		/*
		 *  문항 4. for 문을 이용해서 실행 결과와 같은 삼각형을 출력하는 코드를 작성해보세요.
		 *  
		 *  *
		 *  **
		 *  ***
		 *  ****
		 */
		
		for (int i = 1; i < 6; i++) {
			for (int k = 0; k < i; k++) {
			System.out.print("*");
		}
		System.out.println();
		}
		
		for (int j = 4; j > 0; j--) {
			for (int a = 1; a <= j; a++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("==================================");
		System.out.println();
		
		for (int a = 1; a < 6; a++) {
			for (int b = 5; b > 0; b--) {
				if (a < b) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		
		for (int c = 5; c > 1; c--) {
			for (int d = 6; d > 1; d--) {
				if (c < d) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}

}
