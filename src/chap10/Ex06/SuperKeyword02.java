package chap10.Ex06;

// super 키워드 : 부모(super) class

class AA {
	int m;
	
	void abc() {
		System.out.println("AA class의 abc()");
		System.out.println(m);
	}
}

class BB extends AA {
	void abc() {
		m = 200;
		System.out.println("BB class의 abc()");
	}
	
	void bcd() {
		super.m = 300;
		super.abc();		// 부모의 abc() 호출
	}
}

public class SuperKeyword02 {

	public static void main(String[] args) {
		BB bb = new BB();
		bb.bcd();

	}

}
