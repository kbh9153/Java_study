package chap14.Ex08;

// ID�� ���� null�� ��� Exception �߻�
// user ID�� 8�ڸ� �̻� 20�ڸ� ���ϰ� �ƴѰ�� Exception ���

// �Ϲ� ����
class IDFormatException extends Exception {		// 2���� �����ڸ� ����
	public IDFormatException() {
		super();
	}
	
	public IDFormatException(String msg) {		// ���� �߻��� ���ܸ޼����� ���, e.getMessage();
		super(msg);
	}
}

public class IDFormatTest {
	private String userID;		// üũ : null, 8�ڸ� �̻� 20�ڸ� ���ϰ� �ƴ� ��� Exception �ٻ�
		// userID�� ĸ��ȭ�Ǿ��ִ� ����. private : �ܺγ� �ٸ� class���� ���� ����
			// ������. setter�� ����ؼ� ���� �Ҵ�
		// private���� ������ ��� : getter and setter�� ����Ͽ� ���� �Է��ϰų� ��� ����
	
	public String getUserID() {		// method ȣ��� �޸��� userID�� ������
		return "ID : " + userID;
	}
	
	
	public void setUserID(String userID) throws IDFormatException {		// setter : �޸� ���� �Ҵ�
		
		if (userID == null) {
			throw new IDFormatException("ID�� null�� �� �����ϴ�.");
		} else if (userID.length() < 8 || userID.length() > 20) {
			throw new IDFormatException("ID�� 8�� �̻� 20�� ���Ϸ� ��� �����մϴ�.");
		} else {
			System.out.println("���������� �� �ԷµǾ����ϴ�.");
		}
		this.userID = userID;
	}

	public static void main(String[] args) {
		IDFormatTest test = new IDFormatTest();
		
		// userID�� null�� ���
		String userID = null;
		
		try {
			test.setUserID(userID);		// setter ȣ��� null ���� �Է� �� ȣ��
		} catch (IDFormatException e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("--------------------------------");
		
		userID = "1234567";
		
		try {
			test.setUserID(userID);
		} catch (IDFormatException e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("--------------------------------");
		
		// 3. null�� �ƴϰ� 8�� �̻� 20�� �̸�
		
		userID = "123456789";
		
		try {
			test.setUserID(userID);
		} catch (IDFormatException e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println();
		System.out.println(test.getUserID());
	}

}
