package chap16.Ex06.Ex01;

// GenericPrinter�� ���� ��ü[���]

public class Plastic extends Merterial {
	public void doPrinting() {
		System.out.println("�ö�ƽ ���� ����մϴ�.");
	}
	
	@Override
	public String toString() {
		return "���� �ö�ƽ �Դϴ�.";
	}
}
