package chap06_07.Ex06;

// static 초기화 블록 : 생성자와 같이 static 필드의 값을 호출시 초기화(초기값 설정)하는 역할
// 생성자와 static 블록
	// - 생성자 : 인스턴스 필드를 초기화, 정적 필드의 값도 초기화
	// - static 블록 : static 필드의 값을 초기화, instance 필드의 값은 초기화 불가

class E {

	int a;
	static int b;		// 객체 생성 없이도 호출
	
	static {		// 정적(static) 초기화 블록 : 객체 생성없이 class 명으로 호출할 때 초기화(초기값을 설정) 
		// a = 3;	// static 블록에서는 instance 필드는 초기화할 수 없음 => 오류 발생
		b = 5;
		System.out.println("class E가 로딩 되었습니다.");
	}
	
	E() {		// 생성자 : 객체화를 할 때 필드의 값을 초기화
		a = 3;		// instance 필드 초기화
		b = 10; 	// static 필드 초기화
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(E.b);		// 객체 생성없이 E.b 호출될 때 static 블록이 작동됨 => static 값을 초기화
	}

}
