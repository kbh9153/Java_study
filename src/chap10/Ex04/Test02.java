package chap10.Ex04;

class Animal3 extends Object {			// 부모 class
										// extends Object => 모든 class는 Object class를 상속함 (기본적으로 생략되어 있음)
	String name;
	int age;
	
	void cry() {
		System.out.println("동물은 웁니다.");
	}

	@Override		// Object class의 toString method는 객체 자체를 출력할 때 
	public String toString() {			// 객체의 주소를 출력함 [ 패캐지명.클래스명@객체 메모리의 해쉬코드 ]
		return "이름 : " + name + ", 나이 : " + age + "입니다.";
	}
	
}

class Tiger3 extends Animal3 {
	
	Tiger3() {};		// 기본 생성자 : 변수의 초기값을 할당하지 않고 초기화
						// 다른 생성자가 객체 내에 존재할 경우 기본 생성자를 외부에서 호출시 생략되어 있으면 안됨
	
	Tiger3(String a, int b) {		// 생성자 : 객체 생성시 메모리에 초기값을 할당할 때 사용
		super.name = a;				// 부모(super) class의 메모리, this : 자지자신의 객체
		super.age = b;
	}

	@Override
	void cry() {
		// super.cry();		// super : 부모 class를 의미 => 상속관계일 때만 사용
							// this : 자기자신의 객체 의미
		System.out.println("호랑이는 어흥");
	}
	
}

class Cat3 extends Animal3 {		
	Cat3() {};		// 기본 생성자
	
	Cat3(String a, int b) {		// 생성자
		super.name = a;
		super.age = b;
	}

	@Override
	void cry() {
		//super.cry();
		System.out.println("고양이는 냐옹");
	}
	
	
}

class Dog3 extends Animal3 {
	Dog3() {};		// 기본 생성자
	
	Dog3 (String a, int b) {	// 생성자
		super.name = a;
		super.age = b;
	}

	@Override
	void cry() {
		super.cry();
		System.out.println("개는 멍멍");
	}
	
}

public class Test02 {

	public static void main(String[] args) {
		
		Animal3 a3 = new Animal3();		// a3 객체 생성
		
		System.out.println(a3);		// 객체 자체를 출력할 경우, Object class의 toString method 호출
									// Object.toString() : 객체 메모리 주소의 해쉬코드를 출력 => chap10.Ex04.Animal3@32d2fa64 [ 패캐지명.객체명@객체 메모리의 해쉬코드 ]
		
		System.out.println(a3.toString());

		// 객체 자체를 출력하면 Object class의 toString method를 호출
		
		Animal3 t3 = new Tiger3();		// Tiger3를 Animal3로 업캐스팅
		Animal3 c3 = new Cat3();		// Cat3를 Animal3로 업캐스팅
		Animal3 d3 = new Dog3(); 
		
		t3.cry();		// 부모의 cry()를 호출할 경우 오버라이딩된 Tiger3의 cry() 호출
		c3.cry();
		d3.cry();
		
		System.out.println("---------------------------------");
		
		Animal3[] arr = {t3, c3, d3};
//		Animal3[] arr = new Animal3[] {t3, c3, d3};
		
		for (int i = 0; i < arr.length; i++) {
			arr[i].cry();
		}
		
		System.out.println("---------------------------------");
		
		for (Animal3 k : arr) {
			k.cry();
		}
		
		System.out.println("---------------------------------");
		
		
		Animal3 aa3 = new Tiger3("호랑이", 5);
		Animal3 cc3 = new Cat3("고양이", 3);
		Animal3 dd3 = new Dog3("개", 10);
		
		System.out.println(aa3);		// 객체 자체를 출력시 기본적으로는 객체의 메모리 해쉬코드를 출력함
										// Object의 toString() method를 재정의
		System.out.println(cc3);
		System.out.println(dd3);
		
		System.out.println("---------------------------------");
		
		Animal3[] arr2 = {aa3, cc3, dd3};
		
		for (int j = 0; j < arr2.length; j++) {
			System.out.println(arr2[j]);
		}
		
		System.out.println("---------------------------------");
		
		for (Animal3 a : arr2) {
			System.out.println(a);
		}
	}

}
