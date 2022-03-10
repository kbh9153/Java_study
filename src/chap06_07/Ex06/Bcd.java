package chap06_07.Ex06;

public class Bcd {		// 상속 중 부모 class
	public int a = 10;
	protected int b = 20;		// 상속 중 자식 class에서 접근이 가능 (다른 package에서)
	int c = 30;
	private int d = 40;
	
	// Bcd() {} => 기본 생성자 : 변수의 초기값을 부여해서 객체를 생성
	
	public void print1() {
		System.out.println("다른 package에서 접근 가능 : public");
	}
	
	protected void print2() {
		System.out.println("다른 package에서 접근 가능(상속관계가 구성되어 있을 때 : protected");
	}
	
	void print3() {
		System.out.println("같은 package에서 접근 가능 : default");
	}
	
	private void pritn4() {
		System.out.println("같은 class에서만 접근 가능 : private");
	}
}
