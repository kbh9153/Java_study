package chap16.Ex08;

// ���׸� Ŭ������ �����ؼ� Ÿ�� ����(Apple, Strawberry, Banana). Pencil�� Ÿ������ ������ �� ������ ����

class GenericFruit<T extends Fruit> {
	private T Fruit;

	public T getFruit() {
		return Fruit;
	}

	public void setFruit(T fruit) {
		this.Fruit = fruit;
	}
	
	@Override
	public String toString() {
		return Fruit.toString();
	}
}

abstract class Fruit {		// �߻� class
	public abstract void print();	// �߻� method
}

class Apple extends Fruit {
	String name;
	int price;
	
	Apple(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	
	@Override
	public String toString() {
		return "name : " + name + "\nprice : " + price;
	}

	@Override
	public void print() {
		System.out.println("����Դϴ�.");
	}

}

class Strawberry extends Fruit{
	String name;
	int price;
	
	Strawberry(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "name : " + name + "\nprice : " + price;
	}
	
	@Override
	public void print() {
		System.out.println("�����Դϴ�.");
	}
}

class Banana extends Fruit {
	String name;
	int price;
	
	Banana(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "name : " + name + "\nprice : " + price;
	}
	
	@Override
	public void print() {
		System.out.println("�ٳ����Դϴ�.");
	}
}

class Pencil {
	String name;
	int price;
	
	Pencil(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "name : " + name + "\nprice : " + price;
	}
}

public class Ex_RestricGenericType {
	public static void main(String[] args) {
		GenericFruit<Apple> gf = new GenericFruit<Apple>();
		gf.setFruit(new Apple("���", 2000));
		System.out.println(gf.getFruit());
		Apple apple = gf.getFruit();
		apple.print();
		
		System.out.println("-----------------");
		
		GenericFruit<Strawberry> gf1 = new GenericFruit<Strawberry>();
		gf1.setFruit(new Strawberry("����", 5000));
		System.out.println(gf1.getFruit());
		
		Strawberry strawberry = gf1.getFruit();
		strawberry.print();
		
		System.out.println("-----------------");
		
		GenericFruit<Banana> gf2 = new GenericFruit<Banana>();
		gf2.setFruit(new Banana("�ٳ���", 7000));
		System.out.println(gf2.getFruit());
		
		Banana banana = gf2.getFruit();
		banana.print();
		
		// GenericFruit<Pencil> gf2 = new GenericFruit<Pencil>();		// ���� �Ұ�. ���� �߻�
	}
}
