package chap06_07.Ex02;

import java.util.Scanner;

public class Q2 {
	
	static void math(String...values) {
		int sum = 0;		// 들어오는 정수를 합하는 변수
		double avg;
		
		for (int i = 0; i < values.length; i++) {
			sum += Integer.parseInt(values[i]);			// Inter.parseInt(String) : String 타입을 정수로 변환
			// sum += values[i];		// values[i]번째 방의 값이 String 타입이므로 정수타입으로 변환
		}
		
		avg = (double) sum / values.length; 		// 평균은 형변환이 필수!
		System.out.println();
		
		System.out.println("임의 정수값의 합계는 : " + sum);
		System.out.println("임의 정수값의 평균은 : " + avg);
	}

	public static void main(String[] args) {
		// Scanner로 임의의 정수 값을 할당 받아서 합계와 평균값을 출력
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수 값을 공백을 넣어서 입력하세요. >>>");
		
		String num = sc.nextLine();		// 공백이 들어가므로 전체 정수값을 String으로 입력받음
		String[] array = num.split(" ");		// split는 구분자를 기준으로 글자를 잘라서 배열에 저장
		
		for (int i = 0; i < array.length; i++) {		// 입력 값을 출력
			System.out.print(array[i] + " ");
		}
		
		math(array);		// 가변 길이 method math를 호출하면서 메개변수로 array를 넣어줌

	}

}
