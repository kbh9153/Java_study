package chap06_07.Ex01;

class AA {		// 멤버 : 필드, 메소드 => AA 클래스의 멤버들
	String name;		// 필드(멤버) : 객체화(=인스턴스화)가 되어야 사용 가능 => 필드는 heap 메모리에 저장
	int age;
	String email;
	
	public String getName() {		// 메소드(멤버) : 객체화 필수
		return name;				// 메소드 : heap 공간에 주소만 저장, 실질적인 값은 클래스 메모리 영역내의 메소드 영역에 저장
									// return : method를 호출하는 곳. 변수의 값을 던져줌 
	}
	public void setName(String name) {
		this.name = name;		// this.name : String name(필드)를 가리킴
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
}

public class CreateObject {

	public static void main(String[] args) {
		AA aa = new AA();		// AA class aa(객체) 생성 => 객체화
		
		// 객체의 method 호출		
		System.out.println(aa.getName());
		System.out.println(aa.getAge());
		System.out.println(aa.getEmail());

		System.out.println("============================");
		
		// 객체의 필드 호출
		System.out.println(aa.name);
		System.out.println(aa.age);
		System.out.println(aa.email);
		
		System.out.println("============================");
		
		// method 호출
		// setters : 객체의 메모리에 값을 할당할 때
		aa.setName("홍길동");		// 객체의 변수에 값을 할당
		aa.setAge(30);
		aa.setEmail("abc@gmail.com");
		
		// getters : 객체의 메모리의 값을 가지고 올 때
		System.out.println(aa.getName());
		System.out.println(aa.getAge());
		System.out.println(aa.getEmail());
		
		System.out.println("===========================");
		
		AA bb = new AA();
		bb.setName("김유신");
		bb.setAge(50);
		bb.setEmail("bb@gmail.com");
		
		System.out.println(bb.getName());
		System.out.println(bb.getAge());
		System.out.println(bb.getEmail());
		System.out.println("===========================");
		
		AA cc = new AA();
		cc.setName("신사임당");
		cc.setAge(40);
		cc.setEmail("jentleman@gmail.com");
		
		System.out.println(cc.getName());
		System.out.println(cc.getAge());
		System.out.println(cc.getEmail());
	}

}
