package chap16.Ex07;

/*
 * Generic method 내부에서 사용 가능한 method : Object class의 method만 사용 가능
 */

class A {
	public<T> void method(T t) {
		// System.out.println(t.length());		// t.length() : String class에서 글자수를 return 해줌 => 사용 불가
		System.out.println(t.equals("안녕"));		// t.equals는 Object class의 method는 사용 가능
	}
	
	public<T extends Object> void method2(T t) {		// <T extends Object>중 extends Object가 기본적으로 생략됨
		System.out.println(t.equals("반갑습니다."));	// Object class의 method만 사용 가능함
	}
	
	public<T extends String> void method3(T t) {		// 
		System.out.println(t.length());
		// System.out.println(t.);
	}
}

public class AvailableMethodInGenericMethod {

	public static void main(String[] args) {
		A a = new A();
		a.<String>method("안녕");

	}

}
