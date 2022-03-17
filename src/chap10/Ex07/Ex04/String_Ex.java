package chap10.Ex07.Ex04;

class A {
	String name;
	A (String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return name;
	}
}

public class String_Ex {

	public static void main(String[] args) {
		String string0 = new String("안녕");
		
		String string1 = "안녕";		// String은 참조 변수.
		
		System.out.println(string0);		// String은 객체를 출력시 자동적으로 toString() 재정이 됨
		System.out.println(string1);

		A a = new A("안녕");
		System.out.println(a);
	}

}
