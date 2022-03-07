package chap06_07.Ex03;

// 생성자 overloading : 하나의 생성자 명에 데이터타입, 갯수에 따라 다른 생성자가 호출
	// => 주의) 데이터타입도 같고 갯수도 같은 경우가 2개 이상 있으면 오류 발생

class Abc {
	int a, b, c;
	String d;
	
	Abc() {		// 기본 생성자
		System.out.println("기본 생성자입니다.");
		System.out.println(a + ", " + b);
		System.out.println("--------------------------------------");
	}
	
	Abc(String d) {
		this.d = d;
		System.out.println(d);
		System.out.println("--------------------------------------");
	}
	
	Abc(int a) {		// 매개변수 1개인 생성자
		this.a = a;
		System.out.println(a);
		System.out.println("--------------------------------------");
	}
	
	Abc(int a, int b) {		//매개 변수가 2개인 생성자
		this.a = a;
		this.b = b;
		System.out.println(a + ", " + b);
		System.out.println("--------------------------------------");
	}
	
	Abc(int a, int b, int c) {		//매개 변수가 3개인 생성자
		this.a = a;
		this.b = b;
		this.c = c;
		System.out.println(a + ", " + b + ", " + c);
		System.out.println("--------------------------------------");
	}
}

public class ConstructorOverloading {

	public static void main(String[] args) {
		
		Abc abc = new Abc();		// 기본 생성자
		Abc abc1 = new Abc(37);		// 매개 변수 하나인 생성자 호출
		Abc abc2 = new Abc("HYUNDAI");		// 매개변수 갑싱 같더라도 타입이 다르면 해당 method를 호출
		Abc abc3 = new Abc(10, 20);
		Abc abc4 = new Abc(10, 20, 30);
	}

}
