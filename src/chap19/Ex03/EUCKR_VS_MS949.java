package chap19.Ex03;

import java.io.UnsupportedEncodingException;

/*
 * EUCKR - 한국 표준, 한글 표현 가능 전체중 표기 가능한것만 구성되어 있음. 약 11,000 중 2,200자 표기 가능 => 8,000자는 표기 안됨
 * 	- 영문 : 1byte
 * 	- 한글 : 2byte
 * MS949(=ANSI) - 마이크로소프트에서 개발한 한글 표기 방식. 약 11,000자 모두 표기 가능. Windows OS는 MS949가 기본
 * 	- 영문 : 1byte
 *  - 한글 : 2byte
 *  
 * UTF-8 : 모든 서버(Web, FTP, Mail ...), git, macOS
 * 	- 영문 : 1byte
 * 	- 한글 : 3byte
 * 
 * UTF-16 < 고정길이 >
 * 	- 영문, 한글 모두 2byte로 처리
 * 	- BOM : 모든 나라 언어의 식별코드. 2byte로 처리
 *		=> 모든 나라의 언어를 처리
 * 
 * 문자를 해당 인코딩 타입의 바이트 스트림으로 생선한 경우, 해당 인코딩 타입으로 조합을 해야 문자가 깨지지 않음
 * 
 * 이클립스에서 인코딩 타입 설정 3가지 (우선순위 : 3 > 2 > 1)
 * 	1. 전역 설정 :
 * 	2. 프로젝트에서 설정 :
 * 	3. 파일에서 설정 :
 */


public class EUCKR_VS_MS949 {

	public static void main(String[] args) throws UnsupportedEncodingException {	// 오타가 발생할 경우 인코딩할 수 없는 예외가 발생
		// EUCKR vs MS949
		
		// 1. 영문자를 byte로 내보내고 String으로 변환
		byte[] b1 = "a".getBytes("EUC_KR");		// getBytes 처리시 예외가 발생. 문자를 byte로 변환
		// 문자를 네트워크로 전달할 떄 byte 스트림으로 변환해서 전송
		
		byte[] b2 = "a".getBytes("MS949");	// 문자열 => byte[]
		
		System.out.println(b1.length);		// 1
		System.out.println(b2.length);		// 1
		
		System.out.println(new String(b1, "EUC-KR"));	// byte[] => 문자열로 바꿈
		System.out.println(new String(b1, "MS949"));
		
		System.out.println();
		
		// 2. 한글을 byte로 내보내고 String으로 가져오기
		byte[] b3 = "가".getBytes("EUC_KR");
		byte[] b4 = "가".getBytes("MS949");
		
		System.out.println(b3.length);		// 2
		System.out.println(b4.length);		// 2
		System.out.println(new String(b3, "EUC_KR"));
		System.out.println(new String(b4, "MS949"));
		
		// 3. EUC_KR은 현재 사용 가능한 것만 표기. 약 2,000자
		// MS949는 11,000자 모두 표기 가능
		byte[] b5 = "뷁".getBytes("EUC_KR");
		byte[] b6 = "뷁".getBytes("MS949");
		
		System.out.println(b5.length);
		System.out.println(b6.length);
		
		System.out.println(new String(b5, "EUC_KR"));
		System.out.println(new String(b6, "MS949"));
		
	}
}
