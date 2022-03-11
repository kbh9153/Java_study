package chap10.Ex04;

// method overriding

class Animal {
	void cry() {
		
	}
}

class Bird extends Animal {
	@Override
	
	void cry() {
		System.out.println("짹짹");
	}
}

class Cat extends Animal {
	@Override
	
	void cry() {
		System.out.println("냥냥냥냥");
	}
}

class Dog extends Animal {
	@Override
	
	void cry() {
		System.out.println("멍");
	}
}

public class MethodOverriding_01 {

	public static void main(String[] args) {
		// 1. 각각의 타입으로 선언 + 각각의 타입으로 생성
		
		Animal aa = new Animal();
		Bird bb = new Bird();
		Cat cc = new Cat();
		Dog dd = new Dog();
		
		aa.cry();		// Animal class의 cry method 호출
		bb.cry();		// Bird class의 cry method 호출
		cc.cry();		// Cat class의 cry method 호출
		dd.cry();		// Dog class의 cry method 호출
		
		System.out.println("-------------------------------");

		// 2. Animal 타입으로 선언 + 자식 타입으로 생성 => 동적 Binding(연결)에 의해서 부모의 method를 호출할 경우 자식의 overloading된 method로 binding됨 
		
		Animal ab = new Bird();		 // ab는 Animal, Bird 타입을 가지고 있음. Animal class의 필드와 method만 접근
		Animal ac = new Cat();		// ac는 Animal, Cat 타입을 가지고 있음. Animal class의 필드와 method만 접근
		Animal ad = new Dog();		// ad는 Animal, Dog 타입을 가지고 있음. Animal class의 필드와 method만 접근
		
		ab.cry();		// Animal의 cry method 호출할 경우 => 동적 Binding에 의해서 Bird class의 cry method를 호출(Overriding)
		ac.cry();		// Animal의 cry method 호출할 경우 => 동적 Binding에 의해서 Cat class의 cry method를 호출(Overriding)
		ad.cry();		// Animal의 cry method 호출할 경우 => 동적 Binding에 의해서 Dog class의 cry method를 호출(Overriding)
		
		System.out.println("----------Enhanced FOr---------");
		
		// 3. 객체 배열로 관리
		
		Animal[] animal = {ab, ac, ad};
	// 객체타입배열  배열이름   {객체, 객체, 객체};
		
		for (Animal k : animal) {
			k.cry();
		}
		
		System.out.println("-------------For-------------");
		
		for (int i = 0; i < animal.length; i++) {
			animal[i].cry();
		}
	}

}
