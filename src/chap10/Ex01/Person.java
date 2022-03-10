package chap10.Ex01;

class Student_sub extends Student {
	// Student_sub�� Student�� ��ӹް� ����. Stdent�� �ʵ�� menthod�� ��� ����
	// Student�� Person�� ��ӹް� ����. Student�� Person�� �ʵ�� method�� ��� ����
	
	// Student_sub�� Person class�� Student class�� �ʵ�, method�� ��� ��� ����
	
	String sub1;
	
	void sub1() {
		System.out.println("Student_sub1 class�Դϴ�. �θ��� �ʵ�� method�� ��� �޾ҽ��ϴ�.");
	}
}

class Student extends Person {		// ���л� class, Person : �θ� class, Student : �ڽ� class
	// �ڽ� class�� �θ� class�� �ʵ�, method, �̳�Ŭ������ �״�� ��ӹ���
	
	int studentID;
	
	void goToSchool() {
		System.out.println("�ڽ� class Student�� method goToSchool ȣ��");
	}
}

class Worker extends Person {		// ������ class
	int workerID;		// ���
	
	void goToWork() {
		System.out.println("������ class worker�� method goToWork ȣ��");
	}
}

public class Person {	// ��� : �θ� class�� (�ʵ�, method, ���� Ŭ����)�� �ڽ� class���� ���
	String name;		/*
						 ����� ����
						 	1. �ߺ��� �ڵ��� ���� (�ڵ��� ����)
						 	2. �ڵ尡 ��������
						 	3. ������ (method overriding) : �ϳ��� method �̸����� ���� ���� ��� ����
	 					*/
	int age;
	
	void eat() {
		System.out.println("eat() method => �θ� class");
	}
	
	void sleep() {
		System.out.println("sleep() method => �θ� class");
	}
	
	public static void main(String[] args) {
		// 1. person ��ü ����
		Person p = new Person();
		p.name = "ȫ�浿";
		p.age = 12;
		System.out.println(p.name);
		System.out.println(p.age);
		p.eat();
		p.sleep();
		
		System.out.println("-------<< Student class >>--------");
		
		// 2. student ��ü ����
		Student s = new Student();		// Person class�� ���, Person class�� �ʵ�� method�� ���
			// �ڽ� class�� �θ� class�� ����� �ʵ�� method�� ���
		// Person class�� �ʵ�
		s.name = "�̼���";
		s.age = 50;
		System.out.println(s.name);
		System.out.println(s.age);
		
		// student class�� �ʵ�
		s.studentID = 20220310;
		
		// Person class�� method
		s.eat();
		s.sleep();
		
		// student class�� method
		s.goToSchool();			// �й�
		
		System.out.println("-------<< Worker class >>--------");
		
		// 3. worker ��ü ����
		Worker w = new Worker();		// Person class�� �����. Person class�� �ʵ�� method ���
		
		// �θ� class�� �ʵ� : Pedson
		w.name = "�������";
		w.age = 60;
		System.out.println(w.name);
		System.out.println(w.age);
		
		// �ڽ� class�� �ʵ� : Worker
		w.workerID = 20220310;		// ���
		
		// �θ� class�� method : Person
		w.eat();
		w.sleep();
		
		// �ڽ� class�� method : Worker
		w.goToWork();
		
		// ��ü ������ Ÿ�� ��ȣ��
		Person p1 = new Person();		// Person()�� Person �̴�.
		Person ps = new Student();		// ��ĳ���� => Student()�� Person�̴�. (�ڽ� �� �θ�, ���� ����)
		// Student sp = new Person();		// Person�� Student�̴�. (�θ� �� �ڽ�, ���� �Ұ���)
		Person pw = new Worker();		// ��ĳ���� => Worker()�� Person�̴�. (�ڽ� �� �θ�, ���� ����)
		// Worker wp = new Person();		// Person�� Worker�̴�. (�θ� �� �ڽ�, ���� �Ұ���)
		
		System.out.println("--------<< Student_sub �� Student �� Person  >>---------");
		
		Student_sub sub1 = new Student_sub();		// ����
	 // class Type  ��ü�̸�      �ڽ� Class
		
		// Person class�� �ʵ�� method ��� ����
		sub1.name = "�����S";
		sub1.age = 30;
		System.out.println(sub1.name);
		System.out.println(sub1.age);
		sub1.eat();
		sub1.sleep();
		
		// Student class�� �ʵ�� method ��� ����
		sub1.studentID = 20210310;
		sub1.goToSchool();
		
		// Student_sub�� �ʵ�� method
		sub1.sub1 = "�ڽ��� �ڽ� class";
		System.out.println(sub1.sub1);
		sub1.sub1();
		
		
		Person ps1 = new Student_sub();		// ��ĳ����. (Student_sub �� Person. ���� ����)
												// => ��ĳ���� : Student_sub ��ü�� ������ �θ� ������ Ÿ������ �� ��ȯ�ϴ� ��
												// => Student_sub�� Person Ÿ������ ��ĳ����. Person class�� ����� ��� ����
		ps1.name = "BTS";		// Person class�� �ʵ�� method�� ���� ���� (Student class�� �ʵ�� method�� ���� �Ұ���)
		ps1.age = 30;
		ps1.eat();
		ps1.sleep();
		
		Student ss1 = new Student_sub();	// ��ĳ���� : (Student_sub�� Student Ÿ������ ��ĳ����)
			// Person�� Student�� �ʵ�� method�� ��� ����
		
		// Person class�� �ʵ�� method
		ss1.name = "Twice";
		ss1.age = 26;
		ss1.eat();
		ss1.sleep();
		
		// Student�� �ʵ�� method
		ss1.studentID = 20220310;
		ss1.goToSchool();
		
		Student_sub ss2 = new Student_sub();	// Person, Student, Student_sub�� �ʵ�� method ��� ��� ����

		// Person class�� �ʵ�� method
		ss2.name = "�����������ܿ�";
		ss2.age = 40;
		System.out.println(ss2.name);
		System.out.println(ss2.age);
		ss2.eat();
		ss2.sleep();
		
		// Student class�� �ʵ�� method
		ss2.studentID = 20220310;
		System.out.println(ss2.studentID);
		ss2.goToSchool();
		
		// Student_sub�� �ʵ�� method
		ss2.sub1 = "�ڽ��� �ڽĽ�";
		System.out.println(ss2.sub1);
		
		
		// ��� ���迡�� ��ü ������ �θ� ������ Ÿ������ ��ĳ���� ���� (��ĳ������ �ڵ����� ��ȯ)
			// => �θ� ������ Ÿ������ ��ĳ���� �� ���, �θ��� �ʵ�� method�� ��� ����
		
			// Student_sub(����) �� Student(�ڽ�) �� Person(�θ�) 
		
		Person ps4 = new Student_sub();
			// Student_sub ��ü ������ Person Ÿ������ ��ĳ����
			// Student_sub�� Person�� Student�� Student_sub�� ��� �ʵ�� method�� �����ϰ� ����
			// �� �߿��� Person class�� �ʵ�� method�� ���� ����
		
		Student ss4 = new Student_sub();
			// Student_sub ��ü ������ Student Ÿ������ ��ĳ����
			// Student_sub�� Person�� Student�� Student_sub�� ��� �ʵ�� method�� �����ϰ� ����
			// �� �߿��� Person, Student class�� �ʵ�� method ���� ����
		
		Student_sub ss5 = new Student_sub();
			// Student_sub ��ü ������ Student_sub Ÿ������ ��ĳ����
			// Student_sub�� Person�� Student�� Student_sub�� ��� �ʵ�� method�� �����ϰ� ����
			// �� �߿��� Person, Student, Student_sub class�� �ʵ�� method ���� ����
		
		// �ٿ� ĳ���� : �θ� ������ Ÿ������ ��ĳ���õ� ���� �ڽ� ������ Ÿ������ ��ȯ (�������� ��ȯ�ؾ���)
		
		Student ps5 = (Student) ps4;		// ps4�� ������ Ÿ�� : Person
												// => ps4 : Person, Student, Student_sub�� �����ʹ� heap �޸𸮿� ������� ����
			// ps5�� Person, Student�� ��� �ʵ�� method�� ���� ����
		ps5.name = "�ٿ� ĳ����";
		ps5.age = 30;
		ps5.studentID = 202220310;		// Student �ʵ�� method ��� ����
		ps5.goToSchool();		// Student�� method ���
		
		Student_sub ps6 = (Student_sub) ps4;		// sp4�� Person ������ Ÿ�Կ��� Student_sub�� �ٿ� ĳ����
			// Student_sub�� �ٿ� ĳ���õ� (Person, Student, Student_sub�� �ʵ�, method ��� ��� ����)
		ps6.name = "������";		// Person class
		ps6.studentID = 20220310;		// Student class
		ps6.sub1 = "�ڽ��� �ڽĽ�";
	}	

}
