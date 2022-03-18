package chap12.Ex04;

// Interface 상속시 자식 class 접근 지정자 오류 *** 중요 ***
	// Interface의 method를 구현할 때 반드시 public을 사용해야 함
interface A {
	public abstract void abc();
}

class F implements A {		// F class는 완성된 method가 구현되어 있어야 함
	@Override
	public void abc() {
		
	}
	
}

interface B {
	void abc();
}

class C implements A {
	public void abc() {		// A interface의 abc()를 overriding해서 구현한 method
						// 자식은 부모보다 접근지정자의 범위가 같거나 더 넓어야 함 => 좁을 경우 오류 발생
		
	}
}

class D implements B {
	public void abc() {		// Interface의 method를 구현할 때는 반드시 접근 제어자 중 public 작성
		
	}
}

class E implements B {
	@Override
	public void abc() {
		// TODO Auto-generated method stub
		
	}
}

public class Interface04 {

	public static void main(String[] args) {
		
	}

}
