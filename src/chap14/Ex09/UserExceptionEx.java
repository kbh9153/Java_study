package chap14.Ex09;

class AllException extends Exception {
	public AllException() {
		super();
	}
	
	public AllException(String value) {
		super(value);
	}
	
}

class A {
	private String season;		// ��, ����, ����, �ܿ� �� ���� �Էµ� ��� ���� �߻�
	private String week;		// ��, ȭ, ��, ��, ��, ��, �� �� ���� �Էµ� ��� ���� �߻�
	private int scoreKor;		// 0 ~ 100 ���� �� ���� �Էµ� ��� ���� �߻�
	private int scoreEng;		// 0 ~ 100 ���� �� ���� �Էµ� ��� ���� �߻�
	private String userID;		// 12 ~ 20�� ���� �� ���ڰ��� �Էµ� ��� ���� �߻�
	
	void info (String season, String week, int scoreKor, int scoreEng, String userID) throws AllException {
		
		if (!season.equals("��") && !season.equals("����") && !season.equals("����") && !season.equals("�ܿ�")) {
			throw new AllException("���� �߻� : ��, ����, ����, �ܿ� �߿��� �Է��Ͽ��߸� �մϴ�.");
		} else if (!week.equals("��") && !week.equals("ȭ") && !week.equals("��") && !week.equals("��") && !week.equals("��") && !week.equals("��") && !week.equals("��")) {
			throw new AllException("���� �߻� : �� ~ �Ͽ��� �߿��� �Է��Ͽ��߸� �մϴ�.");
		} else if (scoreKor < 0 || scoreKor > 100) {
			throw new AllException("���� �߻� : 0 ~ 100�� �������� �Է��Ͽ��߸� �մϴ�.");
		} else if (scoreEng < 0 || scoreEng > 100) {
			throw new AllException("���� �߻� : �� ~ �Ͽ��� �߿��� �Է��Ͽ��߸� �մϴ�.");
		} else if (userID == null || userID.length() < 12 || userID.length() > 20 ) {
			throw new AllException("���� �߻� : 12 ~ 20�� �������� �Է��Ͽ��� �մϴ�.");
		} else {
			this.season = season;
			this.week = week;
			this.scoreKor = scoreKor;
			this.scoreEng = scoreEng;
			System.out.println("���������� �ԷµǾ����ϴ�.\n");
		}
		System.out.printf("���� : " + season + "\n���� : " + week + "����\n�������� : " + scoreKor + "��\n�������� : " + scoreEng + "��");
	}
}

public class UserExceptionEx {

	public static void main(String[] args) {
		A a = new A();
		
		try {
			a.info("����", "ȭ", 100, 80, "123456789101112");
		} catch (AllException e) {
			System.out.println(e.getMessage());
		}
		
	}

}
