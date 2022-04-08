package chap19.Ex03;

import java.nio.charset.Charset;	// Charset 클래스

public class CreateChasetObject {

	public static void main(String[] args) {
		// 문자 인코딩 설정을 적용하는 방법
		// 1. Charset.defaultCharset()
		
		Charset cs1 = Charset.defaultCharset();		// 정적 메소드. 시스템의 기본 설정된 charset을 로드
		System.out.println(cs1);		// MS949 => X-windows-949 (MS949의 확장버전)
		
		// 2. Charset.forName("MS949") => 직접 인코딩 값을 할당해서 사용
		Charset cs2 = Charset.forName("MS949");
		System.out.println(cs2);
		
		Charset cs3 = Charset.forName("UTF-8");
		System.out.println(cs3);
		
		Charset cs4 = Charset.forName("EUC_KR");	// => 존재하지 않는 인코딩을 넣으면 예외 발생. 실행 예외 처리 필요
		System.out.println(cs4);
		
		System.out.println();
		
		System.out.println(Charset.isSupported("MS949"));	// 인코딩 지원 여부
		System.out.println(Charset.isSupported("UTF-8"));
		System.out.println(Charset.isSupported("EUC_KR"));
		System.out.println(Charset.isSupported("UTF-167"));
	}
}
