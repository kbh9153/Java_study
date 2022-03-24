package chap14.Ex08;

/*
 * 1. Exception�� ��� �޴� ����� ���� : �Ϲ� ����
 * 	1-1. ������ ������ ��� ����
 * 	1-2. ������ 100���� �ʰ��� ��� ���� 
 */

class MinusException extends Exception {		// ������ �Էµ� ��� ���� �߻�
	public MinusException() {
		super();		// �θ��� ������ ȣ�� (= Exception)
	}
	
	public MinusException(String msg) {			// ���� �޼��� ���, e.getMessage();
		super(msg);
	}
}

class OverException extends Exception {			// 100�� �ʰ��� ���� �Էµ� ��� ���� �߻�
	public OverException() {
		super();
	}
	
	public OverException(String msg) {			// ���� �޼��� ���, e.getMessage();
		super(msg);
	}
}

class AAA {
	int score;
	
	void checkScore (int score) throws MinusException, OverException {
		if (score < 0) {
			throw new MinusException("���� �߻� : ������ �Է��� �� �����ϴ�.");
		} else if (score > 100) {
			throw new OverException("���� �߻� : 100���� �ʰ��Ͽ� �Է��� �� �����ϴ�.");
		} else {
			System.out.println("���������� �ԷµǾ����ϴ�.");
			this.score = score;
			System.out.println("Score : " + this.score);
		}
	}
}

public class UserException {

	public static void main(String[] args) {
		AAA a = new AAA();
		
		try {
			a.checkScore(-100);		// ������ �Է�
		} catch (MinusException | OverException e) {
			// e.printStackTrace();		// ���� ���� ���
			System.out.println(e.getMessage());		// ���� ���� ���
		}
		
		System.out.println("-------------------------------------");
		
		try {
			a.checkScore(200);
		} catch (MinusException | OverException e) {
			// e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
		System.out.println("-------------------------------------");
		
		try {
			a.checkScore(99);
		} catch (MinusException | OverException e) {
			// e.printStackTrace();
			System.out.println(e.getMessage());
		}

	}

}
