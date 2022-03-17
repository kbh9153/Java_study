package chap10.Ex07.Ex04;

class AA {
	String name;
	AA (String name) {
		this.name = name;
	}
}

class BB {
	String name;
	BB (String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return name;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this.name == ((BB)obj).name) {
			return true;
		} else {
			return false;
		}
	}
}

public class String_Ex02 {

	public static void main(String[] args) {
		String s1 = new String("안녕");
		String s2 = "안녕";
		
		System.out.println(s1);		// String은 기본적으로 toString() 재정의 되어있음
		System.out.println(s1.equals(s2));		// true. String class는 equals()도 재정의 기본적으로 진행됨 => 값을 비교하도록 재정의
		
		AA aa1 = new AA("안녕");			// AA class는 toString() 재정의가 되어있지 않아 주소값이 출력
		AA aa2 = new AA("안녕");
		System.out.println(aa1); 
		System.out.println(aa1.equals(aa2));	// false. equals => 객체 주소를 비교하기 떄문
		
		BB bb1 = new BB("안녕");
		BB bb2 = new BB("안녕");
		System.out.println(bb1);
		System.out.println(bb1.equals(bb2));
		
	}

}
