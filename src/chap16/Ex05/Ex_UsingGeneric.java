package chap16.Ex05;

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

class All<T> {
	private T t;

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}
	
}

public class Ex_UsingGeneric {

	public static void main(String[] args) {
		All<Student> all1 = new All<Student>();
		
		all1.setT(new Student("ȫ�浿", "20220329", 93));
		System.out.println(all1.getT());
		
		System.out.println("----------------------------");
		
		All<Professor> all2 = new All<Professor>();
		
		all2.setT(new Professor("������", 35, "abc@gmail.com"));
		System.out.println(all2.getT());
		
		System.out.println("----------------------------");
		
		All<Tiger> all3 = new All<Tiger>();
		
		all3.setT(new Tiger("ȣ����", "ȣ���̰� �޸��ϴ�."));
		System.out.println(all3.getT());
		
		System.out.println("----------------------------");
		
		All<Banana> all4 = new All<Banana>();
		
		all4.setT(new Banana("�ٳ���", "���", 3000));
		System.out.println(all4.getT());
	}

}
