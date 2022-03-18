package chap12.Ex09;

public class Iphone implements PhoneInterface {
	
	// Interface에서 정의한 method를 구현
	@Override
	public void sendCall() {
		System.out.println("뚜뚜뚜뚜뚜뚜");
	}

	@Override
	public void receiveCall() {
		System.out.println("누구쎄용?");
	}
	
	// 추가적인 iPhone 만의 기능을 추가
	public void screenshot() {
		System.out.println("스크린샷 기능이 추가되었습니다.");

	}

}
