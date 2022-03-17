package chap11.Ex03;

/*
 * abstract(추상) method : 실행영역이 없는 method. 선언만 되어 있는 method
 * 	추상 class는 객체화 할 수 없음. 타입으로 정의할 수는 있음
 * 	=> 자식 class에서 재정의 후 구현부를 생성해야함
 * 	=> method의 기본 형식 : void print() {};
 * 추상 method의 형식 : abstract void print();
 * 추상 class : abstract class A { 추상 method를 하나 이상 포함 } 
 * 	=> 추상 class는 자식 class에서 method를 재정의해서 구현부를 생성
 * 
 * 						<< 실무 사용 예시>>
 * 	1. 팀장이 추상 method를 설계해줌 => 회사에서 구현해야할 기능 method를 정의
 * 	2. 팀원은 설계해준 추상 method를 overriding해서 구현부를 만들게 됨
 * 	3. 하위 class에서 method overriding시 오류를 방지하기 위해 사용 
 */

abstract class A {		// 추상 class : 추상 method를 하나라도 포함하면 반드시 추상 class가 있어야 함
	abstract void print();		// 추상 method : 실행영역이 없는 method
	abstract void cry();
}

class B extends A {		// 콘크리트 class : 추상 class에서 선언한 method를 모두 구현한 class
	@Override
	void print() {
		System.out.println("콘크리트 class : 추상 class의 추상 method를 모두 구현한 class");
	}
	
	@Override
	void cry() {
		System.out.println("야옹");
		
	}
}

abstract class C extends A {		// 부모의 추상 method 중 일부만 구현할 경우 : 추상 class
	@Override
	void print() {
		// TODO Auto-generated method stub
		
	}
}

class D extends C {		// 콘크리트 class : 부모의 모든 추상 method를 마지막으로 구현한 class
	@Override
	void cry() {
		// TODO Auto-generated method stub
		
	}
}

public class AbstractModifier01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
