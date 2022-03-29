package chap16.Ex07;

/*
 * Generic method 내부에서 사용 가능한 method : Object class의 method만 사용 가능
 */

class A {
	public<T> void method(T t) {
		// System.out.println(t.length());		// t.length() : String class에서 글자수를 return 해줌 => 사용 불가
		System.out.println(t.equals("안녕"));		// t.equals는 Object class의 method는 사용 가능
	}
}

public class AvailableMethodInGenericMethod {

	public static void main(String[] args) {
		A a = new A();
		a.<String>method("안녕");

	}

}
