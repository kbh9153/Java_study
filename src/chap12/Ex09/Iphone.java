package chap12.Ex09;

public class Iphone implements PhoneInterface {
	
	// Interface���� ������ method�� ����
	@Override
	public void sendCall() {
		System.out.println("�ѶѶѶѶѶ�");
	}

	@Override
	public void receiveCall() {
		System.out.println("�������?");
	}
	
	// �߰����� iPhone ���� ����� �߰�
	public void screenshot() {
		System.out.println("��ũ���� ����� �߰��Ǿ����ϴ�.");

	}

}
