package chap11.Ex04;

/*
 * 추상 class를 사용하지 않는 경우 발생하는 상황
 * 	1. 자식 class에서 method overriding시 overriding이 오타를 통해 잘못 구현될 수 있음
 */

class Animal {
	void cry() {};		// 팀장이 cry() method를 정의해주고 구현은 팀원에게 전달
}

class Cat extends Animal {
//	void cRy() {		// 오타로 인해 overriding이 아닌 자식 class에서 새로운 method로 구현됨
	@Override
	void cry() {
		System.out.println("야옹");
	}
}

class Dog extends Animal {
//	void Cry() {		// 오타로 인해 overriding이 아닌 자식 class에서 새로운 method로 구현됨
	@Override
	void cry() {
		System.out.println("멍멍");
	}
}
public class AbstractModifier02 {

	public static void main(String[] args) {
		// 1. 객체 생성
		Animal a1 = new Cat();
		Animal a2 = new Dog();
		
		// 2. method 호출
		a1.cry();
		a2.cry();

	}

}
