package chap11.Ex05;

/*
 * 추상 class를 사용해서 기능 구현하는 경우
 * 
 */

abstract class Animal {
	abstract void cry();		// 추상 method : 선언만 되어있고 구현부가 없는 method
}

class Cat extends Animal {
	@Override
	void cry() {
		System.out.println("야옹");
	}
}		

class Dog extends Animal {
	@Override
	void cry() {
		System.out.println("멍멍");
	}
}

public class AbstractModifier03 {

	public static void main(String[] args) {
		Animal a1 = new Cat();		// 추상 class는 타입으로는 지정될 수 있음
		Animal a2 = new Dog();
		
		a1.cry();
		a2.cry();
		
		// 추상 class는 객체화 불가능
		// Animal a3 = new Animal();		// 추상 class는 객체화 불가능
	}

}
