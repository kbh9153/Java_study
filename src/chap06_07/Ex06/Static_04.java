package chap06_07.Ex06;

class Cde {
	String name;		// 필드 (instance 필드) : static이 없음. 객체화가 필수
	int age;
	
	static String email;	// 필드 (static 필드) : 정적 필드. 객체 생성없이 사용 가능 (class 이름, 필드 이름) + 객체 생성 후 사용
	static int num;
}

public class Static_04 {

	public static void main(String[] args) {
		Cde cde1 = new Cde();		// 객체화
		
		// instance 필드 : 객체화 해야지만 사용 가능
		cde1.name = "홍길동";
		cde1.age = 30;
		
		// static(정적) 필드 : 객체화 해서도 사용 가능
		cde1.email = "abc@gmail.com";
		cde1.num = 7;
		
		// static(정적) 필드 : 객체 생성없이 사용 가능 << 사용 권장 >>
			// static 메모리 영역 : 모든 객체들이 공유하는 공간
		Cde.email = "abc123@gmail.com";
		Cde.num = 3;
		
		// instance 필드 : heap 메모리 영역제 저장된 
		
		Cde cde2 = new Cde();
		Cde cde3 = new Cde();
		Cde cde4 = new Cde();
		
		cde2.name = "김유신";
		cde2.age = 50;
		
		cde3.name = "세종대왕";
		cde3.age  = 60;
		
		cde4.name = "신사임당";
		cde4.age = 40;
		
		// instance 필드 값 출력
		System.out.println(cde2.name + ", " + cde2.age);
		System.out.println(cde3.name + ", " + cde3.age);
		System.out.println(cde4.name + ", " + cde4.age);
		
		// static 핃드의 값을 변경하려면 모든 객체 전부 변경
		
		cde2.email = "abc@naver.com";
		cde2.num = 55;
		
		System.out.println(cde2.email + ", " + cde2.num);
		System.out.println(cde3.email + ", " + cde2.num);
		System.out.println(cde4.email + ", " + cde2.num);
	}
		

}
