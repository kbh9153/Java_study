package chap16.Ex08;

class A {}
class B extends A {}
class C extends B {}

// Generic Type Class : 제네릭 타입에 들어오는 객체를 제한
class D<T extends B> {		// T : Class B, class C만 올 수 있음
							// <T extends B> 의미 : T 타입에 접근을 제한
	private T t;

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}
	
}

public class BoundedTypeOfGeneric {

	public static void main(String[] args) {
		// D<A> d1 = new D<A>();		// A 객체는 불가능 : <T>의 들어갈 객체를 제한. B class, C class만 타입 지정이 가능
		D<B> d2 = new D<B>();
		D<C> d3 = new D<C>();
		
		D d4 = new D();		// D(B) D(C)도 가능 => 타입을 지정하지 않고 객체 생성시 최상위 타입으로 설정됨
							// D<B> d4 = new D<B>(); 랑 같음
	
		d2.setT(new B());		// B 객체 저장
		d2.setT(new C());		// C 객체 저장
		// d2.setT(new A());		// 오류 발생
		
		//	d3.setT(new B());		// 오류 발생
		d3.setT(new C());
		// d3.setT(new A())			// 오류 발생
		
		// d4.setT(num A());		// 오류 발생
		d4.setT(new B());
		d4.setT(new C());
	}

}
