package chap14.Ex02;

// 실행 예외 (unChecked Exception, RunTime Exception) : 컴파일 단계에서는 예외가 발생되지 않고, 실행시에 예외가 발생 

class AA {
	
}

class BB extends AA {
	
}

public class unCheckedException {

	public static void main(String[] args) {
		// 실행 예외
		
		// ArithmeticException : 0으로 어떤 수를 나눗셈할 시 오류 발생 
		// System.out.println(10 / 0);
		
		// ClassCastException : class의 타입을 변환할 때 변환되지 않는 예외 발생
		AA aa = new AA();
		// BB bb = (BB) aa;		// 컴파일 단계에서는 오류발생 하지 않음
		
		// ArrayIndexOutOfBoundsException : 배열에서 존재하지 않는 방번호를 출력할 경우 예외 발생 
		int[] array = {1, 2, 3};
		// System.out.println(array[3]);
		
		// NumberFormatException : 문자형 숫자를 정수타입으로 변환할 수 없는 예외 발생
		// int num = Integer.parseInt("10!");		// 문자여 ㄹ 10을 정수로 변환
		// System.out.println(num);
		
		// NullPointerException : 객체값이 null인데 method를 호춣라는 경우 예외 발생
		String str = null;
		System.out.println(str.charAt(3));

	}

}
