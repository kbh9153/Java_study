package chap10.Ex05;

class Aa {		// 부모 class
	int m = 3;		// 인스턴스 필드
	
	void print() {
		System.out.println("Aa class");
	}
}

class Bb extends Aa {
	int m = 4;		// 인스턴스 필드
	
	@Override
	void print() {
		System.out.println("Bb class");
	}
}

class Cc extends Aa {
	int m = 5;		// 인스턴스 필드
	
	@Override
	void print() {
		System.out.println("Cc class");
	}
	
}

public class OverlapInstanceField {

	public static void main(String[] args) {
		// 1. 객체 생성
		
		Aa aa = new Aa();
		Bb bb = new Bb();
		Aa ab = new Bb();
		
		Cc cc = new Cc();
		Aa ac = new Cc();
		
		// 2. 인스턴스 필드 출력
		
		System.out.println(aa.m);		// 3
		System.out.println(bb.m);		// 4
		System.out.println(ab.m);		// 3 => 인스턴스 필드는 오버라이딩되지 않음
		
		System.out.println("--------------------------");
		
		System.out.println(cc.m);		// 5
		System.out.println(ac.m);		// 3 => 인스턴스 필드는 오버라이딩되지 않음
		
		System.out.println("--------------------------");
		
		ab.print();
		ac.print();
		
		

	}

}
