package chap06_07.Ex06;

/*
객체의 필드에 값을 할당하는 방식 : 3가지
	1. 필드에 직접 값을 부여하는 방식	=> 객체를 생성 후 
	2. setter를 통해서 객체의 필드에 값을 부여 (컨트롤 가능) => 객체를 생성 후 
	3. 생성자를 통해서 객체의 필드 값을 부여 (컨트롤 가능)	=> 객체를 생성할 때 초긱밧으로 필드에 값을 할당
*/

class Aa {		// 1. 객체 생성 후 직접 필드에 값 할당
	String name;		// 이름
	int age;			// 나이
	String mail;		// 메일 주소
			
	
	void print() {
		System.out.println("name : " + name + ", age : " + age + ", mail : " + mail);
	}
}

class Bb {		// 2. setter를 통해서 객체의 필드에 값을 할당
	String name;		// 이름
	int age;			// 나이
	String mail;		// 메일 주소
	
	void set(String name, int age, String mail) {
		this.name = name;
		this.age = age;
		this.mail = mail;
	}
		
		void print() {
			System.out.println("name : " + name + ", age : " + age + ", mail : " + mail);
	}
}

class Cc {		// 3. 생성자를 통해서 객체의 필드에 값을 할당
	String name;		// 이름
	int age;			// 나이
	String mail;		// 메일 주소
			
	Cc(String name, int age, String mail) {
		this.name = name;
		this.age = age;
		this.mail = mail;
	}
	
	void print() {
		System.out.println("name : " + name + ", age : " + age + ", mail : " + mail);
	}
}

public class FieldOfValue_01 {

	public static void main(String[] args) {
		// 1. 객체의 필드에 직접 값을 할당
		Aa aa = new Aa();
		
		aa.name = "홍길동";
		aa.age = 30;
		aa.mail = "abc@gmail.com";
		
		aa.print();
		
		// 2. 객체의 setter를 사용해서 필드의 값을 부여
		Bb bb = new Bb();
		
		bb.set("홍길동", 30, "abc@gmail.com");
		bb.print();
		
		// 3. 생성자를 사용해서 필드의 값을 부여
		Cc cc = new Cc("홍길동", 30, "abc@gmail.com");
		
		cc.print();

		
	}

}
