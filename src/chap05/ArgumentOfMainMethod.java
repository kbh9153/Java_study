package chap05;							// 클래스가 위치하는 폴더주소

public class ArgumentOfMainMethod {		// 클래스 이름과 파일이름이 동일해야한다. 클래스 이름은 대문자로 시작해야한다.
	public static void main(String[] ar) {	// 메인 메소드[c에서는 함수]
		/*
		 * void main(String[] args) { 		void : 리턴값이 없음을 뜻한다.	main : 메소드명	(인춧 매개변수)
		 * 	메소드를 호출시 실행할 코드;
		 * }
		 * 
		 */
		String a = ar[0];			// "안녕하세요" : 문자열 전송
		String b = ar[1];			// 3 : 정수 정송
		String c = ar[2];			// 3.8 : 실수 전송
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		System.out.println();
		
		// main 메소드에 인자값으로 정수나 실수를 넘겨 줄때  String 으로 뱐환
		System.out.println(b + 1);		// 31
		System.out.println(c+1);		// 3.81
		
		
		
		// String 을 정수나 실수로 변환해서 사용
		
		int d = Integer.parseInt(b);		// b(string) 이 d(Integer) 타입변환 
		double e = Double.parseDouble(c);	// c(String) 이 e(double) 타입변환 
		
		System.out.println(d+1);
		System.out.println(e+1);
		
		
		
		
		
	}
	
}
