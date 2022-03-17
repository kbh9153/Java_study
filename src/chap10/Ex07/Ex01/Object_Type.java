package chap10.Ex07.Ex01;

class AA {
	int a = 3;
	int b = 4;
	
	@Override
	public String toString() {
		return "a : " + a + ", b : " + b;
	}
}

class BB {
	int a = 5;
	int b = 6;
	
	@Override
	public String toString() {
		return "a : " + a + ", b : " + b;
	}
}

class CC {
	int a = 7;
	int b = 8;
	
	@Override
	public String toString() {
		return "a : " + a + ", b : " + b;
	}
}

public class Object_Type {

	public static void main(String[] args) {
		// Java의 모든 객체는 Object type으로 형 변환이 가능
		
		Object aa = new AA();
		Object bb = new BB();
		Object cc = new CC();
		
		// Object 배열에 객체 저장
		
		Object[] arr = {aa, bb, cc};
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i].toString());		// Object의 toString을 호출할 경우 overriding에 의해 자식 객체의 toString이 호출됨
		}
		
		System.out.println("----------------------------");
		
		for (Object k : arr) {
			System.out.println(k);		// 객체를 출력할 경우 toString()이 출력
		}

	}

}
