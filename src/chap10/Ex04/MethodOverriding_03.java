package chap10.Ex04;

// Method Overriding과 접근 제어자와의 관계
	// 자식의 class에서 부모의 method를 재정의할 경우 제어자는 부모와 같거나 넓어야 됨

class Aaa {
	protected void abc() {
		
	}
}

class B1 extends Aaa {
	@Override
	
	public void abc() {
		
	}
}

class B2 extends Aaa {
	@Override
	
	protected void abc() {
		
	}
}

class B3 extends Aaa {
//	@Override
	
//	void abc() {		// 오류 발생 : 이 method의 접근 제어자의 범위가 overriding할 method의 접근 제어자의 범위보다 좁기 때문
//		
//}

}

class B4 extends Aaa {
	// @Override
	
//	private void abd() {		// 오류 발생 : 이 method의 접근 제어자의 범위가 overriding할 method의 접근 제어자의 범위보다 좁기 때문 
//		
//	}

}

public class MethodOverriding_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
