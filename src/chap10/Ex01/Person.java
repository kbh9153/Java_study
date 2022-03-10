package chap10.Ex01;

class Student_sub extends Student {
	// Student_sub는 Student를 상속받고 있음. Stdent의 필드와 menthod를 상속 받음
	// Student는 Person을 상속받고 있음. Student는 Person의 필드와 method를 상속 받음
	
	// Student_sub는 Person class와 Student class의 필드, method를 모두 상속 받음
	
	String sub1;
	
	void sub1() {
		System.out.println("Student_sub1 class입니다. 부모의 필드와 method를 상속 받았습니다.");
	}
}

class Student extends Person {		// 대학생 class, Person : 부모 class, Student : 자식 class
	// 자식 class는 부모 class의 필드, method, 이너클래스를 그대로 상속받음
	
	int studentID;
	
	void goToSchool() {
		System.out.println("자식 class Student의 method goToSchool 호출");
	}
}

class Worker extends Person {		// 직장인 class
	int workerID;		// 사번
	
	void goToWork() {
		System.out.println("직장인 class worker의 method goToWork 호출");
	}
}

public class Person {	// 상속 : 부모 class의 (필드, method, 내부 클래스)를 자식 class에게 상속
	String name;		/*
						 상속의 이점
						 	1. 중복된 코드의 제거 (코드의 재사용)
						 	2. 코드가 간결해짐
						 	3. 다형성 (method overriding) : 하나의 method 이름으로 여러 형식 출력 가능
	 					*/
	int age;
	
	void eat() {
		System.out.println("eat() method => 부모 class");
	}
	
	void sleep() {
		System.out.println("sleep() method => 부모 class");
	}
	
	public static void main(String[] args) {
		// 1. person 객체 생성
		Person p = new Person();
		p.name = "홍길동";
		p.age = 12;
		System.out.println(p.name);
		System.out.println(p.age);
		p.eat();
		p.sleep();
		
		System.out.println("-------<< Student class >>--------");
		
		// 2. student 객체 생성
		Student s = new Student();		// Person class를 상속, Person class의 필드와 method를 사용
			// 자식 class의 부모 class의 선언된 필드와 method를 사용
		// Person class의 필드
		s.name = "이순신";
		s.age = 50;
		System.out.println(s.name);
		System.out.println(s.age);
		
		// student class의 필드
		s.studentID = 20220310;
		
		// Person class의 method
		s.eat();
		s.sleep();
		
		// student class의 method
		s.goToSchool();			// 학번
		
		System.out.println("-------<< Worker class >>--------");
		
		// 3. worker 객체 생성
		Worker w = new Worker();		// Person class를 상속함. Person class의 필드와 method 사용
		
		// 부모 class의 필드 : Pedson
		w.name = "세종대왕";
		w.age = 60;
		System.out.println(w.name);
		System.out.println(w.age);
		
		// 자식 class의 필드 : Worker
		w.workerID = 20220310;		// 사번
		
		// 부모 class의 method : Person
		w.eat();
		w.sleep();
		
		// 자식 class의 method : Worker
		w.goToWork();
		
		// 객체 생성시 타입 변호나
		Person p1 = new Person();		// Person()은 Person 이다.
		Person ps = new Student();		// 업캐스팅 => Student()는 Person이다. (자식 ⊂ 부모, 성립 가능)
		// Student sp = new Person();		// Person은 Student이다. (부모 ⊂ 자식, 성립 불가능)
		Person pw = new Worker();		// 업캐스팅 => Worker()는 Person이다. (자식 ⊂ 부모, 성립 가능)
		// Worker wp = new Person();		// Person은 Worker이다. (부모 ⊂ 자식, 성립 불가능)
		
		System.out.println("--------<< Student_sub ⊂ Student ⊂ Person  >>---------");
		
		Student_sub sub1 = new Student_sub();		// 가능
	 // class Type  객체이름      자식 Class
		
		// Person class의 필드와 method 사용 가능
		sub1.name = "허허헣";
		sub1.age = 30;
		System.out.println(sub1.name);
		System.out.println(sub1.age);
		sub1.eat();
		sub1.sleep();
		
		// Student class의 필드와 method 사용 가능
		sub1.studentID = 20210310;
		sub1.goToSchool();
		
		// Student_sub의 필드와 method
		sub1.sub1 = "자식의 자식 class";
		System.out.println(sub1.sub1);
		sub1.sub1();
		
		
		Person ps1 = new Student_sub();		// 업캐스팅. (Student_sub ⊂ Person. 성립 가능)
												// => 업캐스팅 : Student_sub 객체를 생성시 부모 데이터 타입으로 형 변환하는 것
												// => Student_sub는 Person 타입으로 업캐스팅. Person class의 멤버만 사용 가능
		ps1.name = "BTS";		// Person class의 필드와 method만 접근 가능 (Student class의 필드와 method는 접근 불가능)
		ps1.age = 30;
		ps1.eat();
		ps1.sleep();
		
		Student ss1 = new Student_sub();	// 업캐스팅 : (Student_sub를 Student 타입으로 업캐스팅)
			// Person과 Student의 필드와 method를 사용 가능
		
		// Person class의 필드와 method
		ss1.name = "Twice";
		ss1.age = 26;
		ss1.eat();
		ss1.sleep();
		
		// Student의 필드와 method
		ss1.studentID = 20220310;
		ss1.goToSchool();
		
		Student_sub ss2 = new Student_sub();	// Person, Student, Student_sub의 필드와 method 모두 사용 가능

		// Person class의 필드와 method
		ss2.name = "봄여름가을겨울";
		ss2.age = 40;
		System.out.println(ss2.name);
		System.out.println(ss2.age);
		ss2.eat();
		ss2.sleep();
		
		// Student class의 필드와 method
		ss2.studentID = 20220310;
		System.out.println(ss2.studentID);
		ss2.goToSchool();
		
		// Student_sub의 필드와 method
		ss2.sub1 = "자식의 자식쉑";
		System.out.println(ss2.sub1);
		
		
		// 상속 관계에서 객체 생성시 부모 데이터 타입으로 업캐스팅 가능 (업캐스팅은 자동으로 변환)
			// => 부모 데이터 타입으로 업캐스팅 된 경우, 부모의 필드와 method만 사용 가능
		
			// Student_sub(손자) ⊂ Student(자식) ⊂ Person(부모) 
		
		Person ps4 = new Student_sub();
			// Student_sub 객체 생성시 Person 타입으로 업캐스팅
			// Student_sub는 Person과 Student와 Student_sub의 모든 필드와 method를 포함하고 있음
			// 그 중에서 Person class의 필드와 method만 접근 가능
		
		Student ss4 = new Student_sub();
			// Student_sub 객체 생성시 Student 타입으로 업캐스팅
			// Student_sub는 Person과 Student와 Student_sub의 모든 필드와 method를 포함하고 있음
			// 그 중에서 Person, Student class의 필드와 method 접근 가능
		
		Student_sub ss5 = new Student_sub();
			// Student_sub 객체 생성시 Student_sub 타입으로 업캐스팅
			// Student_sub는 Person과 Student와 Student_sub의 모든 필드와 method를 포함하고 있음
			// 그 중에서 Person, Student, Student_sub class의 필드와 method 접근 가능
		
		// 다운 캐스팅 : 부모 데이터 타입으로 업캐스팅된 것을 자식 데이터 타입으로 변환 (수동으로 변환해야함)
		
		Student ps5 = (Student) ps4;		// ps4의 데이터 타입 : Person
												// => ps4 : Person, Student, Student_sub의 데이터는 heap 메모리에 가지고는 있음
			// ps5는 Person, Student의 모든 필드와 method에 접근 가능
		ps5.name = "다운 캐스팅";
		ps5.age = 30;
		ps5.studentID = 202220310;		// Student 필드와 method 사용 가능
		ps5.goToSchool();		// Student의 method 사용
		
		Student_sub ps6 = (Student_sub) ps4;		// sp4는 Person 데이터 타입에서 Student_sub로 다운 캐스팅
			// Student_sub로 다운 캐스팅됨 (Person, Student, Student_sub의 필드, method 모두 사용 가능)
		ps6.name = "가나다";		// Person class
		ps6.studentID = 20220310;		// Student class
		ps6.sub1 = "자식의 자식쉑";
	}	

}
