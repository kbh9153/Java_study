package chap12.Ex09;

public class EX {

	public static void main(String[] args) {
		// 1. 객체 생성
		Iphone i1 = new Iphone();
		
		i1.printLogo();		// Interface에서 default method가 상속되어 내려온 기능
		i1.sendCall();		// Iphone class에서 재정의된 method
		i1.receiveCall();	// Iphone class에서 재정의된 method
		i1.screenshot();	// Iphone class에서 신규 추가된 method

		System.out.println("------------------------");

		// 2. PhoneInterface로 업캐스팅
		PhoneInterface i2 = new Iphone();
		
		i2.printLogo();
		i2.sendCall();
		i2.receiveCall();
		
		Iphone ii = (Iphone) i2;		// PhoneInterface 타입의 i2를 Iphone 타입으로 다운캐스팅
		
		ii.screenshot();		// screeshot은 다운캐스팅 후 출력 가능
	}

}
