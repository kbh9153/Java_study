package chap10.Ex07.Ex01;

// Object class의 toString method : 객체를 출력할 때 Object toString() 호출
	// => toString() : package 이름.class 이름@해쉬코드
	// => 해쉬코드 : 객체가 가르키고 있는 heap 메모리 영역의 번지를 암호화된 값. 16진수
	// => 재정의해서 사용 : 객체의 정보를 출력 (필드값, method 호출)

class A {
	int m = 3;
	int n = 4;
}

class B {		// extends Object
	int a = 3;
	int b = 4;
	
	@Override
	public String toString() {
		return "a : " + a + ", b : " + b;
	}
}

public class ObjectMethod_toString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a = new A();
		System.out.println(a);		// chap10.Ex07.Ex01.A@32d2fa64 => package 이름.class 이름@해쉬코드
		System.out.println(a.toString());
		System.out.printf("%x\n", a.hashCode());		// %x : 16진수를 의미
		System.out.println(a.hashCode());		// 10진수로 출력
		
		
		B b = new B();
		
		System.out.println(b);		// toString()을 재정의해서 객체의 필드 정보를 출력
		
	}

}
