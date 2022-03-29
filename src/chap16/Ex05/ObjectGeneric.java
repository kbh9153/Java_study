package chap16.Ex05;

class Apple {		// 사과 class. 사과의 정보를 담은 객체
	String name;
	int price;
	
	Apple(String name, int price) {		// 생성자를 통해서 필드의 값 할당
		this.name = name;
		this.price = price;
	};
	
	public void abc() {
		System.out.println("abc() method");
	}
	
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
	
	public void bcd() {
		System.out.println("bcd() method");
	}
	
	@Override
	public String toString() {		// 객체 자체를 출력시 필드의 정보를 출력
		return "이름 : " + name + "\n가격 : " + price + "\n";
	}
}

class Goods<T> {
	private T t;

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}
	
}

public class ObjectGeneric {

	public static void main(String[] args) {
		Goods<Apple> goods1 = new Goods<Apple>();
		goods1.setT(new Apple("사과1", 3000));
		System.out.println(goods1.getT());		// 제네릭에서는 다운 캐스팅을 할 필요없음
		
		goods1.getT().abc();		// 다운 캐스팅 없이 Apple 객체의 abc() method 호출
		
		System.out.println("--------------------");
		
		Goods<Pencil> goods2 = new Goods();
		goods2.setT(new Pencil("연필1", 1000));
		System.out.println(goods2.getT());
		
		goods2.getT().bcd();
	}

}
