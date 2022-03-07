package chap06_07.Ex04;

/*
 * 묵시적 this 키워드 자동 추가
 * 
 * 1. class 내부에서 필드, method 이름 앞에 자동으로 this 키워드 추가
 * 		=> this 키는 자기자신의 객체의 필드와 객체의 method를 지칭
 */

class A {
	int m;
	int n;
	
//	 A() {};		// 기본 생성자 : 생략
	
	void init(int a, int b) {
		int c;			// (변수)a, b, c는 지역 변수 (stack 메모리 영역에 변수명과 값을 저장)
		c = 3;			// init() method 생성시 stack 메모리 영역에 생성되고 method가 끝나면 소멸
		this.m = a;		// this 키를 생략했을 때 컴파일러가 자동으로 추가
		this.n = b;		// this 키를 생략했을 때 컴파일러가 자동으로 추가
	}
	
	void work() {
		this.init(2, 3);		// this 키를 생략했을 때 컴파일러가 자동으로 추가
		System.out.println(this.m + ", " + this.n);		// this는 생략 가능. 생략시 컴파일러가 자동으로 추가
	}
}

public class ThisKeyword_01 {

	public static void main(String[] args) {
		// 2. 객체 생성
		A a = new A();
		
		// 3. method 호출
		a.work();

	}

}
