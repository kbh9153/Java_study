package Ex;

import java.util.Scanner;

public class Quiz {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str;		// 전체 String 값을 input 받는 변수
		String[] arr;		// 공백을 기준으로 잘라서 배열에 저장하는 변수
		int sum = 0;		// 운동 구성원 멤버의 합을 저장하는 변수
		int eventCount = 0;		// 운동 종목의 갯수를 저장하는 변수
		double avg = 0;		// 평균을 구하는 변수 : (double) 전체 구성원의 합 / 종목의 수
		int b = 0;		// 각 종목의 구성원을 담는 변수

		do {
			sum = 0;
			avg = 0;
			b = 0;
			eventCount = 0;
			
			System.out.println("운동이름 구성원수를 공백을 이용해서 입력 하세요.");
			System.out.println("<< 프로그램을 종료하려면 \"그만\"을 입력하세요. >>");
			System.out.println("예) 입력 >> 탁구 2 야구 9 축구 11 농구 4");
			
			str = sc.nextLine();		// sc.next() : 값의 공백까지만 String 담음
										// sc.nextLine() : 값의 공백 + 구분자(Enter)까지 String으로 담음
			if (str.equals("그만")) {		// str은 참조 자료형이므로 str.equls를 사용해야함 (== 은 기본 자료형)
				System.out.println("프로그램 종료");
				break;
			}
			arr = str.split(" ");		// str을 공백을 기준으로 잘라서 arr 배열에 저장 

			for (int i = 0; i < arr.length; i++) {		// arr.length : 배열의 index 0 ~ 마지막 방까지
				if (i % 2 != 0) {		// i : 배열의 방 번호(숫자)
					b = Integer.parseInt(arr[i]);		// 각 방의 String 타입을 정수로 변환
					sum += b;		// sum = sum + b => sum : 전체 구성원의 합
					eventCount++;		// 운동 종목의 갯수를 저장하는 변수
				} 
			}
			avg = (double) sum / eventCount;		// 평균
			
			System.out.println("입력하신 정보 : " + str);
			System.out.println("구성원의 총합 : " + sum );
			System.out.println("구성원의 평균 : " + avg);
			System.out.println();
			
		} while(true); 
	}

}
