package chap06_07.Ex03;

class Car {
	String company;		// 필드의 company를 알려주는 this, heap 메모리에 저장
	String model;		// 인스턴스(= 객체) : 객체화를 했을 때 사용 가능한 필드
	String color;		// 필드명 : 필드의 값 => heap 영역에 저장
	double maxSpeed;
	
	Car() {};		// 기본 생성자
	
	Car(String company, String model, String color, double max) {
		this.company = company;		// this 키는 객체의 필드의 변수를 뜻한다
		this.model = model;			// 3개 변수(인자 : 인풋되는 변수)가 모두 동일할 경우 객체의 필드의 변수를 알려주는 역할
		this.color = color;
		maxSpeed = max;		// this 키워드가 생략된 상태
	}
	
	void work() {		// method(인스턴스 method) : heap 메모리 영역의 method 명과 포인터를 저장
		System.out.println("company : " + company + "\n" + "model : " + model + "\n" + "color: " + color + "\n" + "maxSpeed : " + maxSpeed);
		// method 전체 구문은 class 영역의 method 메모리 영역에 저장
	}
	
}

public class Q1 {

	public static void main(String[] args) {
		// 생성자를 통해서 기본 값을 할당 후 메모리의 내용을 work() method를 사용해서 출력
		
		Car g80 = new Car("GENESIS", "g80", "black", 380);
		g80.work();
		
		System.out.println();
		
		Car taycan = new Car("Porsche", "Taycan", "Blue", 500);
		taycan.work();
		
	}

}
