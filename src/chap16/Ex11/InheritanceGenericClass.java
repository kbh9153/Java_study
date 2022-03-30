package chap16.Ex11;

// Generic class의 상속 : 자식 class는 부모 class의 Generic 변수(K, V, T, E)값의 개수가 같거나 더 많아야 함

class Parent<T> {
	T t;		// default

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}
}

class Child1<T> extends Parent<T> {		// Generic class를 상속받는 자식 class는
	
}

class Child2<T, V> extends Parent<T> {
	V v;

	public V getV() {
		return v;
	}

	public void setV(V v) {
		this.v = v;
	}
}

public class InheritanceGenericClass {

	public static void main(String[] args) {
		// 1. 부모 Generic class 생성
		
		// Parent<String> p = new Parent<String>();	// 전체 완성된 구문
		// Parent<String> p1 = new Parent();		// 뒤에 생성자 호출할 때는 생략 가능
		Parent<String> p = new Parent<>();
		
		p.setT("부모 Generic class");
		System.out.println(p.getT());
		
		System.out.println("-------------------");
		
		Parent<Integer> li = new Parent();
		
		li.setT(74);
		System.out.println(li.getT());
		
		System.out.println("-------------------");
		
		// 2. 자식 class 1
		Child1<String> c1 = new Child1();
		
		c1.setT("자식1 Generic Class");		 // 부모에서 상속된 method
		System.out.println(c1.getT());
		
		System.out.println("-------------------");
		
		// 3. 자식 class 2
		Child2<String, Integer> c2 = new Child2();
		
		c2.setT("자식2 Generic Class");		// 부모에서 상속된 method
		c2.setV(69);						// 부모에서 상속된 method
		
		System.out.println(c2.getT());		// 부모의 method
		System.out.println(c2.getV());		// 자식의 method
	}

}
