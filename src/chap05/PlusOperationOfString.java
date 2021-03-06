package chap05;

public class PlusOperationOfString {
	public static void main(String[] args) {
		// 1. 문자열 + 문자열
		String str1 = "안녕" + "하세요" + "!";
		System.out.println(str1);

		String str2 = "반갑";
		str2 += "습니다";
		str2 += "!";
		System.out.println(str2);

		System.out.println("===============");

		// 2. 문자열 + 기본자료형 // 기본자료형이 문자열로 변환
		String str3 = "안녕" + 1;
		System.out.println(str3);

		String str4 = "안녕" + String.valueOf(1);
		System.out.println(str4);

		String str5 = "안녕" + "1";
		System.out.println(str5);

		System.out.println("===============");

		// 3. 문자열과 기본 자료형을 혼용해서 사용하는 경우
		System.out.println(1 + "안녕");
		System.out.println(1 + "안녕" + 2);
		System.out.println("안녕" + 1 + 2);
		System.out.println("안녕" + (1 + 2));
		System.out.println(1 + 2 + "안녕");

	}
}
