package Ex;

public class Ex09 {

	public static void main(String[] args) {
		// ������ 10�� �����ϴ� �迭�� ����� 1���� 10���� ������ ������ �����ϰ� �����Ͽ� �迭�� �����϶�. �׸��� �迭�� �� ���ڵ�� ����� ����϶�.
		
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
