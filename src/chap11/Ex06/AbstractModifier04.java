package chap11.Ex06;

abstract class Animal {		// 추상 class : 추상 method가 하나이상 포함되어 있는 경우
							// 추상 class는 객체 생성 불가. 타입은 생성 가능
								// 자식 class는 부모 class의 method를 구현시 오류를 방지
	String name;
	int age;
	
	abstract void cry();
	// void cry() {} => 일반 method : return 타입 method 이름 (입력매개변수) {구현코드}
	abstract void run(); 
	
	@Override
	public String toString() {
		return "이름 : " + name + "\n" + "나이 : " + age;
	}
}

class Cat extends Animal {		// Cat은 Animal 상속
								// 모두 추상 method를 구현한 경우는 콘크리트(완전히 구현된) class
	Cat(String name, int age) {
		super.name = name;
		super.age = age;
	}
	
	@Override
	void cry() {		// 추상 method를 구현한 method
		System.out.println("cry : 야옹");
	}
	
	@Override
	void run() {
		System.out.println("run : 살푸작");
	}
	
}

class Tiger extends Animal {
	Tiger(String name, int age) {
		super.name = name;
		super.age = age;
	}
	
	@Override
	void cry() {
		System.out.println("cry : 어흥");
	}
	
	@Override
	void run() {
		System.out.println("run : 철푸덕");
		
	}
	
}

class Eagle extends Animal {
	Eagle(String name, int age) {
		super.name = name;
		super.age = age;
	}
	
	@Override
	void cry() {
		System.out.println("cry : 끼요오오오");
	}
	
	@Override
	void run() {
		System.out.println("run : 날아다님");
	}
	
}

public class AbstractModifier04 {
	public static void main(String[] args) {
		Animal a1 = new Cat("고양이", 10);
		Animal a2 = new Tiger("호랑이", 20);
		Animal a3 = new Eagle("독수리", 30);
		
		// 1. Animal 배열 객체에 저장 후
		Animal[] arr = {a1, a2, a3};
		
		
		// 2. For 문을 사용해서 객체를 출력시 이름과 나이를 출력, cry(), run() method 출력
		System.out.println("----- << for 문 사용 >> -----\n");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
			arr[i].cry();
			arr[i].run();
			System.out.println("---------------------------");
		}
		
		System.out.println();
		
		// 3. Enhanced For 문을 사용해서 출력
		System.out.println("----- << Enhanced for 문 사용 >> -----\n");
		for (Animal k : arr) {
			System.out.println(k);
			k.cry();
			k.run();
			System.out.println("---------------------------");
		}
	}
}
