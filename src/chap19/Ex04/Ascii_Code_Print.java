package chap19.Ex04;

/*
 * ASCII 코드 값 출력 : 1byte(= 8bit), 제일 처음 비트는 부호 비트, 실제 사용 bit는 7bit
 * 	- 1 ~ 32bit까지는 출력을 할 수 없는 특수한 코드 (ex. null, 헤더의 시작, 경고음(7), 개형 10, (LF)..)
 * 	- 127 : delete
 * 
 * 실제 출력 가능은 33번 bit ~ 126 bit
 * 영문, 숫자, 특수문자
 * 
 * 출력
 * ========================================
 * 아스키코드	문자		아스키코드		문자
 * ========================================
 * 33		!		34			&
 * 35		#		36
 * 
 * ......
 * 126		~
 */

public class Ascii_Code_Print {

	public static void main(String[] args) {
		System.out.println("=====================================");
		System.out.println("ASCII\t문자\tASCII\t문자");
		System.out.println("=====================================");
		
		char[] a = new char[94];
		int b;
		char[] c = new char[94];
		int d;
		
		for (int i = 0; i < a.length; i+=2) {
			a[i] = (char)('!' + i);
			b = (int)a[i];
			
			c[i] = (char)('!' + (i + 1));
			d = (int)c[i];
			System.out.println(b + "\t" + a[i] + "\t" + d + "\t" + c[i]);
		}
		
//		for (int i = 33; i < 127; i+=2) {
//			System.out.println(i + "\t" + (char)i + "\t\t" + (i + 1) + "\t" + (char)(i + 1));
//		}

	}

}
