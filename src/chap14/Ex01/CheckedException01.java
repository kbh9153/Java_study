package chap14.Ex01;

import java.util.Scanner;

// Error : 프로그래머가 제어할 수 없는 부분. OS, Hardware에서 발생하는 Error
// Exception(예외) : 프로그래머가 제어할 수 있는 부분
	// => 예외가 발생되면 프로그램이 종료됨
	// => 예외가 발생되도라도 프로그램이 종료되지않게 처리를 해야함. 이를 Exception 예외 처리라 함

// ArithmeticException : 어떤 수를 0으로 나누면 발생하는 예외
	// => 컴퓨터는 어떤 수를 0으로 나눌 경우 계산 불가

public class CheckedException01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("<< 정수 하나를 입력하시오 >>");
		
		int a = sc.nextInt();
		int b = 10;
		
		try {		// try 블록에서 예외(Exception)가 발생될 경우
			// try 블록
			System.out.println(b / a);
		} catch (ArithmeticException e) {
			// catch 블록 : try{} 블록에서 오류가 발생될 경우 catch 블록이 작동
			System.out.println("오류가 발생했습니다. 0으로 나눌 수 없습니다. 다른 수를 넣어주세요");
		} finally {
			
		}
		
		System.out.println("프로그램을 종료합니다.");
		
	}

}
