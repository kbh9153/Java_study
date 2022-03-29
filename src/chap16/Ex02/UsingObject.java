package chap16.Ex02;

/*
 * << 제네릭(Generic) 사용 전 >>
 * 
 * Object는 모든 객체를 저장할 수 있음
 * 상품을 저장하는 class에 Object 타입으로 저장하면 모든 객체를 담을 수 있음 
 * 
 * Object 장단점
 * 	- 장점 : 모든 객체를 담을 수 있음 (casting)
 * 	- 단점 : 매번 다운 캐스팅을 해서 출력해야함, 약한 타입 체크(컴파일시에는 오류 X, 실행시 오류 발생(ClassCastException)
 * 		=> 객체의 수가 많을 경우 빈번한 오류 발생 가능
 */

class Apple {		// 사과 class. 사과의 정보를 담은 객체
	String name;
	int price;
	
	Apple(String name, int price) {		// 생성자를 통해서 필드의 값 할당
		this.name = name;
		this.price = price;
	};
	
	@Override
	public String toString() {		// 객체 자체를 출력시 필드의 정보를 출력
		return "이름 : " + name + "\n가격 : " + price + "\n";
	}
}

class Pencil {		// 연필 class. 연필의 정보를 담은 객체
	String name;
	int price;
	
	Pencil(String name, int price) {	// 생성자를 통해서 필드의 값 할당
		this.name = name;
		this.price = price;
	}
	
	@Override
	public String toString() {		// 객체 자체를 출력시 필드의 정보를 출력
		return "이름 : " + name + "\n가격 : " + price + "\n";
	}
}

//1. Pencil을 담을 수 있는 class 생성
class Goods {		// Object를 사용해서 모든 상품을 저장 가능
	private Object object = new Object();		// Object : 모든 class는 Object 타입으로 변환 가능

	public Object getObject() {
		return object;
	}

	public void setObject(Object object) {		// Object 타입으로 업캐스팅
		this.object = object;
	}
	
}

public class UsingObject {

	public static void main(String[] args) {
		
		// 1. Apple을 저장 후 출력. Object
		Goods goods1 = new Goods();
		goods1.setObject(new Apple("사과3", 3000));		// setter로 값을 할당
		System.out.println((Apple)goods1.getObject());			// getter로 값을 출력 : Object 타입을 Apple 타입으로 다운캐스팅
		
		
		// 2. Pencil을 저장 후 출력. Object
		Goods goods2 = new Goods();
		goods2.setObject(new Pencil("연필3", 900));
		System.out.println((Pencil)goods2.getObject());
		
		// 3. 잘못된 캐스팅을 할 수 있음 (약한 타입 체크) : Object의 문제점
		Goods goods3 = new Goods();
		goods3.setObject(new Apple("사과", 5000));
		System.out.println((Pencil)goods3.getObject());		// 약한 타입 체크 : 실행시 오류 발생

	}

}
