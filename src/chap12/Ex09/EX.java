package chap12.Ex09;

public class EX {

	public static void main(String[] args) {
		// 1. ��ü ����
		Iphone i1 = new Iphone();
		
		i1.printLogo();		// Interface���� default method�� ��ӵǾ� ������ ���
		i1.sendCall();		// Iphone class���� �����ǵ� method
		i1.receiveCall();	// Iphone class���� �����ǵ� method
		i1.screenshot();	// Iphone class���� �ű� �߰��� method

		System.out.println("------------------------");

		// 2. PhoneInterface�� ��ĳ����
		PhoneInterface i2 = new Iphone();
		
		i2.printLogo();
		i2.sendCall();
		i2.receiveCall();
		
		Iphone ii = (Iphone) i2;		// PhoneInterface Ÿ���� i2�� Iphone Ÿ������ �ٿ�ĳ����
		
		ii.screenshot();		// screeshot�� �ٿ�ĳ���� �� ��� ����
	}

}
