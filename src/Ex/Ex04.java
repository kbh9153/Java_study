package Ex;

public class Ex04 {

	public static void main(String[] args) {
		// 문항 4. for 문을 이용해서 실행 결과와 같은 삼각형을 출력하는 코드를 작성해 보세요.
		
		for (int i = 1; i < 5; i++) {
			for (int k = 0; k < i; k++) {
				System.out.print("*");
			} 
			System.out.println("");
		} 
	}

}
