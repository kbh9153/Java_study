package chap14.Ex03;

public class MultiCatch02 {

	public static void main(String[] args) {
		// 1. Exception에서 모든 예외를 처리 가능
			// => 모든 예외는 Exception을 상속 받음
		try {
			System.out.println(10 / 0);
			int num = Integer.parseInt("10A");
		} catch(Exception e) {
			// try{} 블록에서 발생하는 모든 예외는 Exception class가 모두 처리
			System.out.println("예외 처리 (Exception)");
		}
		
		// 2. catch 블록의 순서가 잘못된 경우 : Exception은 catch의 마지막에 위치해야함
		/*
		try {
			System.out.println(10 / 0);
			int num = Integer.parseInt("10A");
		} catch (Exception e) {
			// try{} 블록에서 발생하는 모든 예외는 Exception class가 모두 처리
			System.out.println("예외 처리 (Exception)");
		} catch (ArithmeticException e) {
			
		} catch (NumberFormatException e) {
			
		}
		*/
		
		// 3. catch 블록의 올바른 순서 : 최상의 Exception은 catch 블록의 가장 마지막에 위치해야함
		try {
			System.out.println(10 / 0);
			int num = Integer.parseInt("10A");
		} catch (ArithmeticException e) {		// 최하위의 
			
		} catch (NumberFormatException e) {
			
		} catch (Exception e) {		// 최상위 부모의 Exception은 마지막에 위치해야함
			
		}
		
		// 4. 여러개의 Exception을 통합해서 적용
		try {
			System.out.println(10 / 0);
			int num = Integer.parseInt("10A");
		} catch (ArithmeticException | NumberFormatException e) {	 
			// 여러개의 Exception을 통합
			
		} catch (Exception e) {
			
		}
		
		System.out.println("프로그램 종료");
	}

}
