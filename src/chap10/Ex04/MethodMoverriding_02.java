package chap10.Ex04;

class Animal2 {
	void run() {
		System.out.println("sex");
	}
}

class Tiger extends Animal2 {		// 호랑이는 네발로 달립니다
	@Override
	
	void run() {
		System.out.println("호랑이는 네발로 달립니다.");
	}
	
	void tigerEat() {
		System.out.println("호랑이는 동물을 먹습니다.");
	}
}

class Eagle extends Animal2 {		// 독수리는 하늘을 납니다.
	@Override
	
	void run() {
		System.out.println("독수리는 하늘을 납니다.");
	}
	
	void eagleEat() {
		System.out.println("독수리는 다른 새를 잡아 먹습니다.");
	}
}

class Snake extends Animal2 {
	@Override
	
	void run() {
		System.out.println("뱀은 기어다닙니다.");
	}
	
}

public class MethodMoverriding_02 {

	public static void main(String[] args) {
		// 1. 모든 객체는 Animal2 타입으로 업캐스팅해서 생성
		Animal2 at = new Tiger();
		Animal2 ae = new Eagle();
		Animal2 as = new Snake();
		
		// 2. Animal2 배열에 각 개체를 저장
		Animal2[] array = {at, ae, as};
//		Animal2[] array = new Animal2[] {at, ae, as};
		
		// 3. for문으로 배열의 객체를 출력
		for (int i = 0; i < array.length; i++) {
			array[i].run();
		}
		
		System.out.println("--------------------------");
		
		// 4. Enhanced for 문을 사용해서 객체의 run() method 출력
		for (Animal2 k : array) {
			k.run();
		}
		
		System.out.println("--------------------------");
		
		// 5. 다운캐스팅 (instanceof 사용) 출력
		if (at instanceof Tiger) {
			Tiger tt = (Tiger) at;
			tt.tigerEat();
		} else {
			System.out.println("출력할 수 없습니다.");
		}
		
		if (ae instanceof Eagle) {
			Eagle ee = (Eagle) ae;
			ee.eagleEat();
		} else {
			System.out.println("출력할 수 없습니다.");
		}
		
	}

}
