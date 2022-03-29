package chap16.Ex01;

/* 
 * << 제네릭(Generic) 사용 전 >>
 * 
 * 객체를 저장할 class를 생성해서 객체 정보를 담을 수 있음
 * 객체를 담을 class를 만들 경우, 새로운 객체를 생성 될 때마다 매번 새로운 객체를 담을 class를 만들어줘야하는 번거로움이 있음
 * 	=> 코드가 복잡해짐
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
		return "이름 : " + name + "\n가격 : " + price;
	}
}

// 1. Apple을 담을 수 있는 class 생성
class Goods1 {		// 상품 중 사과를 담은 class
	private Apple apple = new Apple("사과", 1000);

	public Apple getApple() {		// getter : 객체 필드의 정보를 출력하는 것
		return apple;
	}

	public void setApple(Apple apple) {		// setter
		this.apple = apple;
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
		return "이름 : " + name + "\n가격 : " + price;
	}
}

//1. Pencil을 담을 수 있는 class 생성
class Goods2 {		// 상품 중 연필를 담은 class
	private Pencil pencil = new Pencil("연필", 300);

	public Pencil getPencil() {		// getter : 객체 필드의 정보를 출력하는 것
		return pencil;
	}

	public void setPencil(Pencil pencil) {		// setter
		this.pencil = pencil;
	}
	
}


public class ProblemsBeforeGeneric {

	public static void main(String[] args) {
		// 1. Goods1 상품(Apple)이 저장 => Apple 객체 추가 및 가져오기
		Goods1 goods1 = new Goods1();		// 기본 생성자
		goods1.setApple(new Apple("사과2", 2000));		// setter로 값을 할당
		System.out.println(goods1.getApple());		// 필드의 내용을 출력

		// 2. Godds2 상품(Pencil)이 저장 => Pencil 객체 추가 및 가져오기
		Goods2 goods2 = new Goods2();
		goods2.setPencil(new Pencil("연필2", 600));
		System.out.println(goods2.getPencil());
	}

}

