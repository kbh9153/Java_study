package chap06_07.Ex05;

// 접근 제어자(캡슐화 역할 => 캡슐화 : 데이터를 외부로부터 보호) : public, protected, default(생략해서 사용), private
	// => class 이름, 필드명, method 이름, 생성자명 앞에는 접근 제어자가 반드시 할당되어 있음
	// class 이름 : public, default 사용 가능

	// default : 같은 package의 다른 class에서도 접근 가능. 다른 package의 class에서는 접근 불가
	// private : 외부 class에서 접근 불가
	// public : 다른 package에서 접근 가능

public class A {
	
	int m = 3;		// 필드의 기본 접근 제어자는 default => 생략됨
	int n = 4;
	
	public int k = 10;
	
	void print() {		// 접근 제어자 default가 생략된 상태 => 같은 package의 class에서만 사용 가능
		System.out.println("import 성공 " + m + ", " + n);
	}
	
	public void print2() {
		System.out.println("외부 package의 다른 class에서 접근 가능 " + k);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
