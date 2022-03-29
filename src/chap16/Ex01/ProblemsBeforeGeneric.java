package chap16.Ex01;

/* 
 * << ���׸�(Generic) ��� �� >>
 * 
 * ��ü�� ������ class�� �����ؼ� ��ü ������ ���� �� ����
 * ��ü�� ���� class�� ���� ���, ���ο� ��ü�� ���� �� ������ �Ź� ���ο� ��ü�� ���� class�� ���������ϴ� ���ŷο��� ����
 * 	=> �ڵ尡 ��������
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
		return "�̸� : " + name + "\n���� : " + price;
	}
}

// 1. Apple�� ���� �� �ִ� class ����
class Goods1 {		// ��ǰ �� ����� ���� class
	private Apple apple = new Apple("���", 1000);

	public Apple getApple() {		// getter : ��ü �ʵ��� ������ ����ϴ� ��
		return apple;
	}

	public void setApple(Apple apple) {		// setter
		this.apple = apple;
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
		return "�̸� : " + name + "\n���� : " + price;
	}
}

//1. Pencil�� ���� �� �ִ� class ����
class Goods2 {		// ��ǰ �� ���ʸ� ���� class
	private Pencil pencil = new Pencil("����", 300);

	public Pencil getPencil() {		// getter : ��ü �ʵ��� ������ ����ϴ� ��
		return pencil;
	}

	public void setPencil(Pencil pencil) {		// setter
		this.pencil = pencil;
	}
	
}


public class ProblemsBeforeGeneric {

	public static void main(String[] args) {
		// 1. Goods1 ��ǰ(Apple)�� ���� => Apple ��ü �߰� �� ��������
		Goods1 goods1 = new Goods1();		// �⺻ ������
		goods1.setApple(new Apple("���2", 2000));		// setter�� ���� �Ҵ�
		System.out.println(goods1.getApple());		// �ʵ��� ������ ���

		// 2. Godds2 ��ǰ(Pencil)�� ���� => Pencil ��ü �߰� �� ��������
		Goods2 goods2 = new Goods2();
		goods2.setPencil(new Pencil("����2", 600));
		System.out.println(goods2.getPencil());
	}

}

