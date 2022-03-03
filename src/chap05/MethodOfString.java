package chap05;

import java.util.Arrays;

public class MethodOfString {
	public static void main(String[] args) {
		
		String str1 = "Hello Java!";			// str1 : 참조변수 or 객체 or 인스턴스
		String str2 = "안녕하세요! 반갑습니다.";
		
		// 1. 문자열 길이 (length()) 를 int 타입으로 반환
		
		System.out.println(str1.length());
		System.out.println(str2.length());
		/*
		 * Java에서 length는 byte수가 아니라, 글자수를 뜻한다.
		 */
		System.out.println("========================");
		
		
		// 2. 문자열 검색 ( charAt(), indexOf(), lastIndexOf() )
		System.out.println(str1.charAt(1));					// 1번방의 문자를 출력 (0부터 시작)
		System.out.println(str2.charAt(1));					// 1번방의 문자를 출력 (0부터 시작)
		System.out.println();
		
		System.out.println(str1.indexOf('a'));				// 0번쨰 방부터 마지막 방까지 글자의 방번호(index)를 int 타입으로 반환
		System.out.println(str1.indexOf('a', 8));			// 8번방부터 오른쪽으로 검색
		System.out.println();
		
		System.out.println(str1.lastIndexOf('a'));			// 마지막 방부터 0번째 방까지 글자의 방번호(index)를 int 타입으로 반환
		System.out.println(str1.lastIndexOf('a', 8));		// 8번방부터 왼쪽으로 검색
		System.out.println();
		
		System.out.println(str1.indexOf("Java"));			// 문자열이 시작하는 방번호를 int 타입으로 반환
		System.out.println(str1.lastIndexOf("Java"));
		System.out.println(str2.indexOf("하세요"));
		System.out.println(str2.lastIndexOf("하세요"));
		System.out.println();
		
		System.out.println(str1.indexOf("bye"));			// 없을 경우, -1을 출력
		
		System.out.println("==========================");
		
		// 3. 문자열 변환 및 연결 ( String.valueOf(), concat() )
		
		// String.valueOf(기본자료형) : 기본자료형을 String 타입으로 변환
		String str3 = String.valueOf(2.3);					// 실수를 String 타입으로 변환
		String str4 = String.valueOf(false);				// boolean을 String 타입으로 변환
		
		System.out.println(str3);
		System.out.println(str4);
		System.out.println();
		
		// concat() : 문자열과 문자열을 연결 : + 연산자와 같다.
		String str5 = str3.concat(str4);
		System.out.println(str5);
		System.out.println();
		
		// concat() 메소드에서 String.valueOf 사용
		String str6 = "안녕" + 3;								// + 연산자는 자동으로 String 타입으로 변환해준다.
		String str7 = "안녕".concat(String.valueOf(3));		// concat 메소드는 문자열만 받을 수 있으므로 변환하여 사용해야한다.
		
		System.out.println(str6);
		System.out.println(str7);
		System.out.println("==========================");
		
		// 4. 문자열을 byte[] 배열 타입으로 변환, 아스키 코드가 출력, 입출력 값을 처리할 때 사용 ( getBytes() )
		
		String str8 = "Hello Java!";
		String str9 = "안녕하세요";
		
		byte[] array1 = str8.getBytes();
		byte[] array2 = str9.getBytes();
		
		System.out.println(Arrays.toString(array1));
		System.out.println(Arrays.toString(array2));
		System.out.println("==========================");
		
		// 5. 문자열을 char[] 타입으로 변환 ( toCharArray() )
		char[] array3 = str8.toCharArray();
		char[] array4 = str9.toCharArray();
		
		System.out.println(Arrays.toString(array3));
		System.out.println(Arrays.toString(array4));
		
		
		
	}
}
