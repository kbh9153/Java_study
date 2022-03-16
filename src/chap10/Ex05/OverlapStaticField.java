package chap10.Ex05;

class AAA {
	static int m = 3;		// static 필드는 오버라이딩되지 않음
}

class BBB extends AAA {
	static int m = 4;
}

class CCC extends AAA {
	static int m = 5;
}

public class OverlapStaticField {

	public static void main(String[] args) {
		// 1. 객체 생성없이 호출 (class 이름으로 호출) => << 권장 구문 >>
		
		System.out.println(AAA.m);		// 3
		System.out.println(BBB.m);		// 4
		System.out.println(CCC.m);		// 5
		
		System.out.println("-----------------------");
		
		// 2. 객체 생성 후 호출
		
		AAA aaa = new AAA();
		BBB bbb = new BBB();
		CCC ccc = new CCC();
		AAA ab = new BBB();
		AAA ac = new CCC();
		
		System.out.println(aaa.m);		// 3
		System.out.println(bbb.m);		// 4
		System.out.println(ccc.m);		// 5
		System.out.println(ab.m);		// 3 => static 필드 : 오버라이딩 되지 않음
		System.out.println(ac.m);		// 3
		
		System.out.println("-----------------------");

	}

}
