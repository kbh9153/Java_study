package chap11.Ex01;

/*
 * Final : 마지막
 *  - 필드명, 지역변수명 : 상수 => final double PI = 3.14;
 *  - 상수는 값을 변경할 수 없음
 *  - method 이름 : final void print() {} => Overriding이 불가한 method (부모 class, 자식 class에서 method Overriding 불가)
 * 	- class 이름 : final class A => 상속 불가한 class (자식 class를 두지 않는 마지막 class)
 * 	- class 메모리 영역의 상수 영역에 값이 복사, 객체나 method가 사라질 경우에도 호출하여 재사용 가능
 */

class A1 {
	int a = 3;		// 필드명, 지역변수명은 소문자로 작성. 여러 문자가 이어질 경우 첫자를 대문자로 작성
	final int B = 5;		// 상수명은 대문자로 작성. 띄어쓰기 구간은 _ 사용
	A1 () {};
}

class A2 {
	int a;
	final int B;
	A2 () {
		a = 3;
		B = 5;
	}
}

class A3 {
	int a = 3;		// 필드 : 값 변경 가능
	final int B = 5;
	A3 () {
		a = 5;
	// B = 10;		// final은 값을 수정할 수 없음
	}
}

class B {
	void bcd() {		// 지역변수 : method에서 선언한 변수 (method 호출이 끝나면 지역변수는 메모리에서 사라짐)
		int a = 3;		// 스택 공간에 변수 값이 할당. method 호출이 끝나면 사라짐
		final int B = 5;		// 상수는 class 영역 중 상수영역에 복사가 되어 method 호출이 끝나더라도 상수영역에 남아있음
		a = 7;
	// B = 9;		// final은 값 변경 불가
	}
	
}

public class FinalModifier01 {

	public static void main(String[] args) {
		

	}

}
