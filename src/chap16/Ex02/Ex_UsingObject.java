package chap16.Ex02;

// 4���� ��ü�� ���� �� ���

class Student {
	String name;
	String id;
	int pass;
	
	Student (String name, String id, int pass) {
		this.name = name;
		this.id = id;
		this.pass = pass;
	};
	
	@Override
	public String toString() {
		return "�̸� : " + name + "\nid : " + id + "\npass : " + pass;
	}
}

class Professor {
	String name;
	int year;
	String email;
	
	Professor (String name, int year, String email) {
		this.name = name;
		this.year = year;
		this.email = email;
	};
	
	@Override
	public String toString() {
		return "name : " + name + "\nyear : " + year + "\nemail : " + email;
	}
}

class Tiger {
	String name;
	String run;
	
	Tiger(String name, String run) {
		this.name = name;
		this.run = run;
	}
	
	@Override
	public String toString() {
		return "name : " + name + "\nrun : " + run;
	}
}

class Banana {
	String name;
	String color;
	int price;
	
	Banana(String name, String color, int price) {
		this.name = name;
		this.color = color;
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "name : " + name + "\ncolor : " + color + "\nprice : " + price;
	}
}

class All {
	private Object object = new Object();

	public Object getObject() {
		return object;
	}

	public void setObject(Object object) {
		this.object = object;
	}
	
}

public class Ex_UsingObject {

	public static void main(String[] args) {
		All all1 = new All();
		all1.setObject(new Student("ö��", "20220329", 97));
		System.out.println((Student)all1.getObject());
		
		System.out.println("------------------");
		
		All all2 = new All();
		all2.setObject(new Professor("ȫ�浿", 33, "abc@gmail.com"));
		System.out.println((Professor)all2.getObject());
		
		System.out.println("------------------");
		
		All all3 = new All();
		all3.setObject(new Tiger("ȣ����", "ȣ���̴� �޸��ϴ�."));
		System.out.println((Tiger)all3.getObject());
		
		System.out.println("------------------");
		
		All all4 = new All();
		all4.setObject(new Banana("�ٳ���", "���", 3000));
		System.out.println((Banana)all4.getObject());
	}

}
