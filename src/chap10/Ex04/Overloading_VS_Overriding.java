package chap10.Ex04;

// Method Overloading vs method Overriding

/*
 * 1. Method Overloading : 동일한 method 이름으로 (매개변수 타입, 매개변수 수 등 Signature)에 따라 해당 method가 호출
 * 		=> 상속과는 관련이 없음. 생성자에 많이 사용..
 * 
 * 2. Method Overriding : 반드시 상속 관계에서만 사용 가능
 * 		=> 부모의 method를 자식 method에서 (값을)새롭게 정의해서 사용
 * 		* 사용조건
 * 			1) 상속관계
 * 			2) method의 signature(method 이름, 매개변수 갯수, 매개변수 타입)이 같아야 함
 * 			3) 자식 method에서 부모 method의 접근 제어자가 같거나 접근 제어자의 범위가 더 넓은 범위여야 함
 */

class Ab {
	void print1() {		// overriding
		System.out.println("Ab class의 print1()");
	}
	
	void print2() {		// overloading
		System.out.println("Ab class의 pring2()");
	}
}

class Bc extends Ab {
	@Override
	
	void print1() {
		System.out.println("Bc class의 print1");
	}
	
	void print2(int a) {	// overloading
		System.out.println("Bc class의 print2");
	}
}

public class Overloading_VS_Overriding {

	public static void main(String[] args) {
		// 1. Ab 타입 선언
		
		Ab aa = new Ab();		
		aa.print1();		// Ab class의 print1 호출
		aa.print2();		// Ab class의 print2 호출
		
		System.out.println("-----------------------------");

		// 2. Bc 타입 선언 + 생성자 Bb 호출
		
		Bc bb = new Bc();
		bb.print1();		// Bc class의 print1 호출
		bb.print2();		// Ab class의 print2() 호출 : 부모 class의 method 호출
		bb.print2(3);		// Bc class의 print2(3) 호출 : 자식 class의 method 호출
		
		System.out.println("-----------------------------");
		
		// 3. Ab 타입으로 선언 + 생성자 Bc 호출
		
		Ab cc = new Bc();
		cc.print1();		// method overloading에 의해서 되어있으므로 동적 바인딩에 의해서 Bc의 print1()를 호출
		cc.print2();		// Ab class의 method만 호출이 가능
	}

}
