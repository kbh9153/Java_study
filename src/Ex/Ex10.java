package Ex;

public class Ex10 {

	public static void main(String[] args) {
		// ���� 10. �ݺ����� �̿��Ͽ� 369 ���ӿ��� �ڼ��� �ľ� �ϴ� ��츦 ������� ȭ�鿡 ����غ���. 1���� �����ϸ� 99������ �Ѵ�. ���� ��ʴ� ������ ����.
		
		for (int i = 3; i < 100; i++) {
			int unit = i % 10;
			int ten = i / 10;
			if (i < 10) {
				if (i % 3 == 0) {
					System.out.println(i + " �ڼ� ¦");
				} 
			} else {
				if (ten % 3 == 0 && i % 10 == 0) {
					System.out.println(i + " �ڼ� ¦");
				} else if (unit % 3 == 0 && ten % 3 == 0) {
					System.out.println(i + " �ڼ� ¦¦");
				} else if (unit % 3 == 0 || ten % 3 == 0) {
					if (i % 10 != 0) {
						System.out.println(i + " �ڼ� ¦");
					}
				}
			}
				
		}
	}

}
