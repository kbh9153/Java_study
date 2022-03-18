package chap12.Ex02;

// Interface 구현한 class
	// Overriding : method를 자식 class에서 새롭게 정의하는 것
	// Implements : (Interface를 구현)미완성 method를 완성시키는 것
	// extends : 부모 class의 기능을 상속받아 자신의 기능을 추가, 확장하는 것

interface AA {
	void cry();		// 추상 method(미완성된 method). public abstract 생략
	void run();		// 추상 method(미완성된 method). public abstract 생략
}

class BB implements AA {		// BB class는 AA Interface의 미완성된 method를 구현한다라는 의미
	@Override
	public void cry() {
		System.out.println("야옹");
		
	}
	
	@Override
	public void run() {
		System.out.println("살포작");
		
	}
}

public class Interface02 {

	public static void main(String[] args) {
		//
		AA aa = new BB();		// BB : Interface의 미완성 method를 구현한 class
		aa.cry();
		aa.run();

	}

}
