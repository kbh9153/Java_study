package chap06_07.Ex05;

import chap06_07.Ex06.Bcd;		
// import chap06_07.Ex06.Abc;		// Abc class에 접근 제어자가 default : default는 외부 package에서 접근 불가

public class External_Abc extends Bcd{		// External_Abc class는 Bcd class를 상속 설정
												// => Bcd : 부모 class, External_Abc : 자식 class

	public static void main(String[] args) {
		// Abc abc2 = new Abc();		// class 접근 제어자가 default이기 때문에 접근 불가
		
		Bcd bcd1 = new Bcd();	// 상속 중 부모 class
		External_Abc ext = new External_Abc();	// 상속 중 자식 class
		
		// 다른 package에서 필드 호출
			// 1. import (public : class 접근 지정자)
			// 2. 객체 생성
			// 3. 접근 제어자 확인 후 접근 (필드, method)
		
		bcd1.a = 1000;		// public : 다른 package에서 접근 가능
		ext.b = 2000;		// protected : 다른 package에서 상속 관계에 있을 때 접근 가능
								// 자식 class에서 부모 class의 protected를 다른 package에서 접근 (상속 관계)
	}

}
