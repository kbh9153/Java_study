package chap10.Ex01;

class Dog_sub extends Dog {
	int dog_sub;
	void dog_sub() {
		System.out.println("Dog의 자식 class입니다.");
	}
}

class Tiger extends Animal {
	int tiger;
	
	void tigerEat() {
		System.out.println("호랑이는 육식성입니다.");
	}
}

class Dog extends Animal {
	int dog;
	
	void dogEat() {
		System.out.println("개는 잡식성입니다.");
	}
}

class Eagle extends Animal {
	int eagle;
	
	void eagleFly() {
		System.out.println("독수리는 맹금류이며 육싱성입니다.");
	}
}

public class Animal {
	String name;		// 동믈의 이름
	int age;			// 동물의 나이
	String color;		// 동물의 색깔
	
	void eat() {
		System.out.println("모든 동물은 음식을 먹습니다.");
	}
	
	void sleep() {
		System.out.println("모든 동물은 잠을 잡니다.");
	}

	public static void main(String[] args) {
		// 업캐스팅은 다형성으로 처리하기 때문에 아주아주 효율적인 프로그래밍 처리가 가능
			// 다형성 : 오버라이딩(상속)을 이용한 상속에서 하나의 method로 여러 정보를 처리 가능
		
		// 1. Animal class 객체화
		Animal a1 = new Animal();		// Animal class 객체화 => 자신의 필드와 method 접근 가능
		
		// 2. Dog class를 Dog 타입으로 객체화
		Dog d1 = new Dog();		// (Dog ⊂ Animal)Animal, Dog의 필드와 method 접근 가능
		
		// 3. Dog를 Animal 타입으로 업캐스팅
		Animal a2 = new Dog();		// Dog는 Animal, Dog의 데이터를 가지고는 있음
										// => a2는 Animal의 필드와 method만 접근 가능
		
		// 4. Dog_sub를 Animal 타입으로 업캐스팅
		Animal a3 = new Dog_sub();		// Dog_sub는 Animal, Dog, Dog_sub의 데이터를 가지고는 있음
							// => a3는 Animal의 필드와 method만 접근 가능
		a3.name = "웰시코기";
		// a3.dog = 5;		// Dog class에는 접근 불가 => 오류 발생
		
		// 5. Dog_sub를 Dog 데이터 타입으로 업캐스팅
		Dog d2 = new Dog_sub();		// Dog_sub는 Animal, Dog, Dog_sub의 데이터를 가지고는 있음
										// => Animal과 Dog의 필드와 method만 접근 가능
		d2.name = "리트리버";		// Animal class의 필드
		d2.dog = 3;		// Dog
		// d2.dog_sub = 3;		// Dog_sub는 접근 불가 => 오류 발생
		
		
		// Dog_sub ⊂ Dog ⊂ Animal 
		// 6. Dog_sub를 Dog_sub 데이터 타입으로 객체화
		Dog_sub ds1 = new Dog_sub();
			// ds1은 Animal, Dog, Dog_sub 데이터 모두 다 가지고 있음 => 모든 class의 필드와 method 접근 가능
			ds1.name = "진돗개";		// Animal class의 필드
			ds1.age = 4;		// Animal
			ds1.dog = 3;		// Dog
			ds1.dogEat();
			ds1.dog_sub = 7;	// Dog_sub
			ds1.dog_sub();
			
		// 상속에서 업캐스팅, 다운 캐스팅
			
			
		// 업캐스팅 : 자식 타입의 데이터 타입이 부모 데이터 타입으로 변환
			// => 부모 타입의 필드와 method만 접근 가능
			// => 강제 타입 변환없이 자동으로 업캐스팅됨
			// ds1은 Dog_sub의 데이터 타입을 가지고 있음 (Animal, Dog, Dog_sub의 모든 필드와 method에 접근 가능)
			
			Dog ds1_c1 = ds1;		// ds1(Dog_sub 데이터 타입)을 Dog 타입으로 업캐스팅
										// => Animal, Dog, Dog_sub 데이터를 가지고 있지만 Dog 데이터에만 접근 가능
			
			Dog ds2_c1 = (Dog) ds1;		// 강제 타입 변환 
				
			Animal ds1_c2 = ds1;	// ds1(Dog 데이터 타입)을 Animal 타입으로 업캐스팅
										// => Animal, Dog 데이터를 가지고 있지만 Animal 데이터에만 접근 가능
			
			// ds1 : Dog_sub (Animal, Dog, Dog_sub)
			// ds1_c1 : Dog	(Animal, Dog)
			// ds1_c2 : Animal (Animal)
			
		// 다운캐스팅 : 부모 데이터 타입을 다시 자식 데이터 타입으로 변환
			// => 강제로 타입 변환이 필요
			// a3는 Animal, Dog, Dog_sub 중 Animal 타입만 사용하도록 업캐스팅되어 있음
			
			Dog a3_down1 = (Dog) a3;		// a3[Animal] -> a3_down1[Dog] => 다운 캐스팅
			Dog_sub a3_down2 = (Dog_sub) a3;		// a3[Animal] -> a3_down2[Dog_sub] => 다운 캐스팅
	}
	
	
	
	

}
