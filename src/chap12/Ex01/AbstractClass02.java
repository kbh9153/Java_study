package chap12.Ex01;

// 2. 추상 method를 사용하는 2번째 방법 : 자식 객체 생성없이 익명 class를 활용하는 방법
	// 1번 임시적으로 사용할 때 사용 => 이벤트 처리
	// 장점 : 자식 class 생성을 하지 않음. 임시적으로 사용할 경우 유용
	// 단점 : 여러개의 객체를 생성해야할 경우 코드가 길어짐 (1번 방법 권장)
abstract class AAA {		// 추상 method를 객체화할 수 없음
	abstract void abc();		// 추상 method
}

public class AbstractClass02 {

	public static void main(String[] args) {
		// 1. 익명 객체 생성
		AAA aaa = new AAA() {		// 익명 객체를 활용한 추상 method를 class 생성없이 구현
			void abc() {
				System.out.println("방법 2 : 객체 생성없이 익명 class로 추상 method 구현");
			}
		};
		
		 AAA aaa1 = new AAA() {		// 추상 class는 객체화 불가, 익명 클래스 생성 후 메소드 재정의해서 출력
			 void abc() {
				 System.out.println("방법 2 : 객체 생성없이 익명 class로 추상 method 구현");
			 }
		 };
		 
		 AAA aaa2 = new AAA() {
			 void abc() {
				 System.out.println("방법 2 : 객체 생성없이 익명 class로 추상 method 구현");
			 }
		 };
		
		// 2. method 호출
		aaa.abc();
		aaa1.abc();
		aaa2.abc();

	}

}
