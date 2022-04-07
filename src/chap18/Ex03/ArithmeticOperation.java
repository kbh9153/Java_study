package chap18.Ex03;

import java.util.Scanner;

/*
 * 1. Scanner를 사용해서 double의 두 수를 입력 받습니다.
 * 2. 방법 1. 람다식을 사용해서 입력받은 두 값을 +, -, *, / 사칙연산을 구현해서 출력
 * 3. 방법 2. 인터페이스를 구현한 자식 객체를 사용해서 입력받은 두 값을 +, -, *, / 사칙연산을 구현해서 출력
 * 4. 방법 3. 익명이너클래스를 사용해서 입력받은 두 값을 +, -, *, / 사칙연산을 구현해서 출력
 * 5. Arithmetic Exception 처리 : 0 값을 입력받으면 에러 발생 => int의 경우 예외처리가 필요하지만 double의 경우에는 이미 예외처리가 되어있어 불필요
 */


@FunctionalInterface
interface Arithmetic {
	void arithmeticOpr(double a, double b);
}

class Ari implements Arithmetic {
	@Override
	public void arithmeticOpr(double a, double b) {
		System.out.println("합 : " + (a + b) + "\n차 : " + (a - b) + "\n곱 : " + (a * b) + "\n분 : " + (a / b));
	}
}

public class ArithmeticOperation {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("연산할 숫자 2개을 입력하세요 >> (ex. 1 1)");
		double num1 = scanner.nextInt();
		double num2 = scanner.nextInt();
		
		Arithmetic ari1 = new Arithmetic() {
			@Override
			public void arithmeticOpr(double a, double b) {
				System.out.println("합 : " + (a + b) + "\n차 : " + (a - b) + "\n곱 : " + (a * b) + "\n분 : " + (a / b));
			}
		};
		
		System.out.println("---<< 익명이너클래스 >>---");
		ari1.arithmeticOpr(num1, num2);
		System.out.println();
		
		
		Arithmetic ari2 = (a, b) -> {
			System.out.println("합 : " + (a + b) + "\n차 : " + (a - b) + "\n곱 : " + (a * b) + "\n분 : " + (a / b));
		};
		
		System.out.println("---<< 람다식 >>---");
		ari2.arithmeticOpr(num1, num2);
		System.out.println();
		
		
		Arithmetic ari3 = new Ari();
		
		System.out.println("---<< 인터페이스 구현 >>---");
		ari3.arithmeticOpr(num1, num2);
	}

}
