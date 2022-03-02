package Ex;

public class Ex09 {

	public static void main(String[] args) {
		// 정수를 10개 저장하는 배열을 만들고 1에서 10까지 범위의 정수를 랜덤하게 생성하여 배열에 저장하라. 그리고 배열에 든 숫자들고 평균을 출력하라.
		
		int[] random = new int[10];
		
		for (int i = 0; i < random.length; i++) {
			random[i] = (int)(Math.random() * 10 + 1); 
		}
		
		int sum = 0;
		for (int k = 0; k < random.length; k++) {
			sum += random[k];
		}

		System.out.println((double)(sum / random.length));
	}

}
