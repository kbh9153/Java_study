package chap12.Ex09;

public interface PhoneInterface {
	int TIMEOUT = 10000;		// 상수. public static final 생략된 상태
	
	void sendCall();			// public abstract 생략된 상태
	void receiveCall();			// public abstract 생략된 상태
	default void printLogo() {
		System.out.println("Logo를 출력합니다.");
	}
}
