package chap16.Ex05;

class Apple {		// ��� class. ����� ������ ���� ��ü
	String name;
	int price;
	
	Apple(String name, int price) {		// �����ڸ� ���ؼ� �ʵ��� �� �Ҵ�
		this.name = name;
		this.price = price;
	};
	
	public void abc() {
		System.out.println("abc() method");
	}
	
	@Override
	public String toString() {		// ��ü ��ü�� ��½� �ʵ��� ������ ���
		return "�̸� : " + name + "\n���� : " + price + "\n";
	}
}

class Pencil {		// ���� class. ������ ������ ���� ��ü
	String name;
	int price;
	
	Pencil(String name, int price) {	// �����ڸ� ���ؼ� �ʵ��� �� �Ҵ�
		this.name = name;
		this.price = price;
	}
	
	public void bcd() {
		System.out.println("bcd() method");
	}
	
	@Override
	public String toString() {		// ��ü ��ü�� ��½� �ʵ��� ������ ���
		return "�̸� : " + name + "\n���� : " + price + "\n";
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
		goods1.setT(new Apple("���1", 3000));
		System.out.println(goods1.getT());		// ���׸������� �ٿ� ĳ������ �� �ʿ����
		
		goods1.getT().abc();		// �ٿ� ĳ���� ���� Apple ��ü�� abc() method ȣ��
		
		System.out.println("--------------------");
		
		Goods<Pencil> goods2 = new Goods();
		goods2.setT(new Pencil("����1", 1000));
		System.out.println(goods2.getT());
		
		goods2.getT().bcd();
	}

}
