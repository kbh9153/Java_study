package chap16.Ex06.Ex01;

// GenericPrinter�� ���� ��ü[���]

public class Powder extends Merterial {
	public void doPrinting() {
		System.out.println("�Ŀ�� ���� ����մϴ�.");
	}
	
	@Override
	public String toString() {
		return "���� Powder �Դϴ�.";
	}
}
