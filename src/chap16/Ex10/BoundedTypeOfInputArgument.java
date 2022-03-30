package chap16.Ex10;

// Generic method에서 매개변수에서 값의 제한

class A {}
class B extends A {}
class C extends B {}
class D extends C {}
// class E {}

class Goods<T> {		// Generic class
	private T t;

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}
}

class Test {	// 일반 method. 매개변수로 들어오는 타입이 Generic 타입
	void method1(Goods<A> g) {}		// g의 매개변수로 A class 타입만 전송
	void method2(Goods<?> g) {}		// g의 매개변수로 모든 class가 가능(A, B, C, D 외 E class도 가능)
	void method3(Goods<? extends B> g) {}		// g의 매개변수로 B, C, D class 타입만 전송
	void method4(Goods<? super B> g) {}		// g의 매개변수로 A, B class 타입만 전송
}

public class BoundedTypeOfInputArgument {

	public static void main(String[] args) {
		Test t = new Test();
		
		// 1. method1 :
		t.method1(new Goods<A>());		// 정상 작동
		// t.method1(Goods<B>());		// 오류
		// t.method1(Goods<C>());		// 오류
		// t.method1(Goods<D>());		// 오류
		
		// 2. method2 : (Goods<?> g) => A, B, C, D, E 가능
		t.method2(new Goods<A>());		// 정상 작동
		t.method2(new Goods<B>());		// 정상 작동
		t.method2(new Goods<C>());		// 정상 작동
		t.method2(new Goods<D>());		// 정상 작동
		// t.method2(new Goods<E>());		// 정상 작동
		
		// 3. method3 : (Goods<? extends B> g) => B, C, D 가능
		// t.method3(new Goods<A>());		// 오류
		t.method3(new Goods<B>());		// 정상 작동
		t.method3(new Goods<C>());		// 정상 작동
		t.method3(new Goods<D>());		// 정상 작동
		
		// 4. method4 : (Goods<? super B> g) => A, B 가능
		t.method4(new Goods<A>());
		t.method4(new Goods<B>());
		// t.method4(new Goods<C>());
		// t.method4(new Goods<D>());
	}

}
