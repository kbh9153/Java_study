package chap16.Ex02;

/*
 * << ���׸�(Generic) ��� �� >>
 * 
 * Object�� ��� ��ü�� ������ �� ����
 * ��ǰ�� �����ϴ� class�� Object Ÿ������ �����ϸ� ��� ��ü�� ���� �� ���� 
 * 
 * Object �����
 * 	- ���� : ��� ��ü�� ���� �� ���� (casting)
 * 	- ���� : �Ź� �ٿ� ĳ������ �ؼ� ����ؾ���, ���� Ÿ�� üũ(�����Ͻÿ��� ���� X, ����� ���� �߻�(ClassCastException)
 * 		=> ��ü�� ���� ���� ��� ����� ���� �߻� ����
 */

class Apple {		// ��� class. ����� ������ ���� ��ü
	String name;
	int price;
	
	Apple(String name, int price) {		// �����ڸ� ���ؼ� �ʵ��� �� �Ҵ�
		this.name = name;
		this.price = price;
	};
	
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
	
	@Override
	public String toString() {		// ��ü ��ü�� ��½� �ʵ��� ������ ���
		return "�̸� : " + name + "\n���� : " + price + "\n";
	}
}

//1. Pencil�� ���� �� �ִ� class ����
class Goods {		// Object�� ����ؼ� ��� ��ǰ�� ���� ����
	private Object object = new Object();		// Object : ��� class�� Object Ÿ������ ��ȯ ����

	public Object getObject() {
		return object;
	}

	public void setObject(Object object) {		// Object Ÿ������ ��ĳ����
		this.object = object;
	}
	
}

public class UsingObject {

	public static void main(String[] args) {
		
		// 1. Apple�� ���� �� ���. Object
		Goods goods1 = new Goods();
		goods1.setObject(new Apple("���3", 3000));		// setter�� ���� �Ҵ�
		System.out.println((Apple)goods1.getObject());			// getter�� ���� ��� : Object Ÿ���� Apple Ÿ������ �ٿ�ĳ����
		
		
		// 2. Pencil�� ���� �� ���. Object
		Goods goods2 = new Goods();
		goods2.setObject(new Pencil("����3", 900));
		System.out.println((Pencil)goods2.getObject());
		
		// 3. �߸��� ĳ������ �� �� ���� (���� Ÿ�� üũ) : Object�� ������
		Goods goods3 = new Goods();
		goods3.setObject(new Apple("���", 5000));
		System.out.println((Pencil)goods3.getObject());		// ���� Ÿ�� üũ : ����� ���� �߻�

	}

}
