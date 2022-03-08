package chap06_07.Ex05;

public class Bb {		// class 이름 : public (같은 package에서 접근 가능, 다른 package의 class에서도 접근 가능)
	
	private int a = 1;		// private : 같은 class에서만 접근 가능(같은 package의 다른 class에서는 접근 불가)
	int b = 2;				// default : 같은 package 안에서 다른 class에서도 접근 가능
	protected int c = 3;	// protected : default 포함 + 다른 package에서도 접근 가능(단, 상속된 경우만 가능)
	public int d = 4;		// public : protected 포함 + 다른 package에서 전부 접근 가능
	
	// 접근 권한 범위 : private < default < protected < public
	
	private void print1() {		// 같은 calss에 존재하는 method
		a = 10;
		b = 20;
		c = 30;
		d = 40;
	}
	
	void print2() {		// 같은 calss에 존재하는 method
		a = 10;
		b = 20;
		c = 30;
		d = 40;
	}
	
	protected void print3() {		// 같은 calss에 존재하는 method
		a = 10;
		b = 20;
		c = 30;
		d = 40;
	}
	
	public void print4() {		// 같은 calss에 존재하는 method
		a = 10;
		b = 20;
		c = 30;
		d = 40;
}

class C {		// 같은 class의 존재하는 
	
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
