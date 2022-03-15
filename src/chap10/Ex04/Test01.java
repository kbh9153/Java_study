package chap10.Ex04;

class Human {		// 부모 class
	String name;	// instance 필드(전역 변수) : 객체화 후 사용 가능, heap 메모리 영역에 저장
	int age;
	
	void eat() {	// instance method : 객체화 후 사용 가능, method 메모리 영역에 데이터(코드)가 저장되며 heap 메모리 영역에는 주소값(pointer)가 저장됨
		System.out.println("사람은 먹습니다.");
	}
	
	void sleep() {
		System.out.println("사람은 잠을 잡니다.");
	}
	
}

class Student extends Human {
	int studentID;
	
	void goToSchool() {
		System.out.println("학생은 학교에 갑니다.");
	}
}

class Worker extends Human {
	int workerID;
	
	void goToCompany() {
		System.out.println("회사원은 직장에 갑니다.");
	}
}

public class Test01 {

	public static void main(String[] args) {
		Human h = new Human();		// 부모 class
		h.name = "홍길동";
		h.age = 30;
		h.eat();
		h.sleep();
		
		System.out.println("--------------------------");
		
		Student s = new Student();		// 자식 class : 자식 class는 부모 class의 필드와 method를 상속받음
		s.name = "신사임당";		// 부모 class의 필드
		s.age = 19;				
		s.eat();				// 부모 class의 method
		s.sleep();
		s.studentID = 20220314;		// 자식 class의 필드
		s.goToSchool();				// 자식 class의 method

		System.out.println("--------------------------");

		Worker w = new Worker();		// 자식 class
		w.name = "BTS";		// 부모 class의 필드
		w.age = 23;				
		w.eat();				// 부모 class의 method
		w.sleep();
		w.workerID = 20220314;	// 자식 class의 필드
		w.goToCompany();		// 자식 class의 method
		
		System.out.println("--------------------------");
		
		Human h1 = new Student();		// 업캐스팅 : 자식 => 부모 타입으로 형변환
											// h1 : Human, Student 타입이 모두 저장. 그러나 Human에만 접근 가능
		h1.name = "이순신";
		h1.age = 40;
		h1.eat();
		h1.sleep();
		
		System.out.println("--------------------------");
		
		// 다운캐스팅 : 부모 => 자식 타입으로 형변환				// if 조건문을 사용해서 instanceof를 사용하여 다운캐스팅 처리를 적극 권장 => 런타임 오류 방지
		System.out.println(h1 instanceof Student);		// true
		System.out.println(h1 instanceof Human);		// true
		
		if (h1 instanceof Student) {		// 다운캐스팅시 런타임 오류를 방지하기 위해 객체의 데이터 타입이 존재할 때 실행
			Student s1 = (Student) h1;
			s1.studentID = 20220314;
			s1.goToSchool();
		}
		
		System.out.println(h1 instanceof Worker);		// false
		Worker w4 = (Worker) h1;		// 오류가 발생하지 않음 (컴파일 오류는 발생되지 않음) => 그러나 런타임 오류 발생
		
		
		
	}

}
