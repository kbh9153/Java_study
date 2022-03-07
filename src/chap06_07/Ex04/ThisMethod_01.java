package chap06_07.Ex04;

/*
 * this가 키워드로 사용되는 경우
 * 1. this.m : method 내에서 지역변수 m이 아닌 필드의 m임
 * 2. this.init() : 자신 객체의 method임
 * 
 * this가 method로 사용되는 경우
 * 1. this(); : 생성자 안에서 다른 생성자를 호출할 때 사용
 * 		=> 반드시 생성자 내부의 첫줄에 위치해야함
 * 		=> method 내부에서는 사용할 수 없음 (생성자 내부에서만 사용 가능)
 */

class Abc {
	Abc() {		// 생성자의 매개변수값(())이 없는 생성자
		System.out.println("첫번째 생성자입니다.");
	};
	
	Abc(int a) {
		this();		// 매개변수가 없는 생성자를 호출 => 증요) 생성자의 첫줄에 와야함
		System.out.println("두번째 생성자입니다.");
		System.out.println(a);
	}
	
	Abc(int a, String b) {
		this(30);		// this(30) : 매개변수가 정수 1개가 들어가는 생성자 호출
		System.out.println("세번째 생성자입니다.");
		System.out.println(a + "\n" + b);
	}
	
	/*
	void abc() {
		this();		// this(); : method 안에서는 this(); 사용불가 => 오류 발생 
	}
	*/
}

public class ThisMethod_01 {

	public static void main(String[] args) {
		// 1. 객체 생성
		Abc aa = new Abc();		// 매개변수가 없는 생성자 호출
		System.out.println("--------------------------------");
		
		Abc bb = new Abc(7);
		System.out.println("--------------------------------");
		
		Abc cc = new Abc(3, "hello java");

	}

}
