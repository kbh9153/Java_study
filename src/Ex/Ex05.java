package Ex;

public class Ex05 {

	public static void main(String[] args) {
		// ���� 5. �迭�� �̿��ؼ� 1 ~ 10���� ���� ��� �Ͻÿ�.
		
		int sum = 0;
		
		int[] scores = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		for (int i = 0; i < scores.length; i++) {
			sum += scores[i];
		}
		System.out.println(sum);
	}

}
