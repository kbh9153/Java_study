package chap06_07.Ex04;


// 명시적 this 키워드 추가 : 반드시 this 키워드를 사용해야 되는 경우
class Aa {		
	int m;
	int n;
	
	void init (int m, int n) {		// this key를 사용하지 않는 경우 : 지역변수로 인식
		m = m;		// this 키워드가 없기 때문에 필드의 m이 아니라 지역변수 m을 인식
		n = n;		// this 키워드가 없기 때문에 필드의 n이 아니라 지역변수 n을 인식
	}
	
}

class Bb {		// this key를 사용하는 경우
	int m;
	int n;
	
	void init(int m, int n) {
		this.m = m;		// this 키워드를 명시적으로 사용하여서 필드의 m을 인식
		this.n = n;
	}
}

public class ThisKeyword_02 {

	public static void main(String[] args) {
		// 1. 필드명과 지역변수명이 같은 경우 (this 키워드를 사용 X => 지역변수에 저장)
		Aa aa = new Aa();
		aa.init(5, 6);		// this를 사용하지 않아 지역변수로 저장되어 method 종료시 메모리값이 소멸해서 0, 0 출력
		System.out.println(aa.m);
		System.out.println(aa.n);
		
		System.out.println("--------------------------");
		
		// 2. 필드명과 지역변수명이 같은 경우 (this 키워드를 사용 O => 필드변수에 저장)
		Bb bb = new Bb();
		bb.init(5, 6);		// this를 사용하여 필드변수(heap 메모리 영역 저장)에 저장되어 5, 6 출력
		System.out.println(bb.m);
		System.out.println(bb.n);
		
		// 3. 필드명과 지역변수명이 다른 경우

	}

}
