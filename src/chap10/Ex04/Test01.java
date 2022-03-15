package chap10.Ex04;

class Human {		// �θ� class
	String name;	// instance �ʵ�(���� ����) : ��üȭ �� ��� ����, heap �޸� ������ ����
	int age;
	
	void eat() {	// instance method : ��üȭ �� ��� ����, method �޸� ������ ������(�ڵ�)�� ����Ǹ� heap �޸� �������� �ּҰ�(pointer)�� �����
		System.out.println("����� �Խ��ϴ�.");
	}
	
	void sleep() {
		System.out.println("����� ���� ��ϴ�.");
	}
	
}

class Student extends Human {
	int studentID;
	
	void goToSchool() {
		System.out.println("�л��� �б��� ���ϴ�.");
	}
}

class Worker extends Human {
	int workerID;
	
	void goToCompany() {
		System.out.println("ȸ����� ���忡 ���ϴ�.");
	}
}

public class Test01 {

	public static void main(String[] args) {
		Human h = new Human();		// �θ� class
		h.name = "ȫ�浿";
		h.age = 30;
		h.eat();
		h.sleep();
		
		System.out.println("--------------------------");
		
		Student s = new Student();		// �ڽ� class : �ڽ� class�� �θ� class�� �ʵ�� method�� ��ӹ���
		s.name = "�Ż��Ӵ�";		// �θ� class�� �ʵ�
		s.age = 19;				
		s.eat();				// �θ� class�� method
		s.sleep();
		s.studentID = 20220314;		// �ڽ� class�� �ʵ�
		s.goToSchool();				// �ڽ� class�� method

		System.out.println("--------------------------");

		Worker w = new Worker();		// �ڽ� class
		w.name = "BTS";		// �θ� class�� �ʵ�
		w.age = 23;				
		w.eat();				// �θ� class�� method
		w.sleep();
		w.workerID = 20220314;	// �ڽ� class�� �ʵ�
		w.goToCompany();		// �ڽ� class�� method
		
		System.out.println("--------------------------");
		
		Human h1 = new Student();		// ��ĳ���� : �ڽ� => �θ� Ÿ������ ����ȯ
											// h1 : Human, Student Ÿ���� ��� ����. �׷��� Human���� ���� ����
		h1.name = "�̼���";
		h1.age = 40;
		h1.eat();
		h1.sleep();
		
		System.out.println("--------------------------");
		
		// �ٿ�ĳ���� : �θ� => �ڽ� Ÿ������ ����ȯ				// if ���ǹ��� ����ؼ� instanceof�� ����Ͽ� �ٿ�ĳ���� ó���� ���� ���� => ��Ÿ�� ���� ����
		System.out.println(h1 instanceof Student);		// true
		System.out.println(h1 instanceof Human);		// true
		
		if (h1 instanceof Student) {		// �ٿ�ĳ���ý� ��Ÿ�� ������ �����ϱ� ���� ��ü�� ������ Ÿ���� ������ �� ����
			Student s1 = (Student) h1;
			s1.studentID = 20220314;
			s1.goToSchool();
		}
		
		System.out.println(h1 instanceof Worker);		// false
		Worker w4 = (Worker) h1;		// ������ �߻����� ���� (������ ������ �߻����� ����) => �׷��� ��Ÿ�� ���� �߻�
		
		
		
	}

}
