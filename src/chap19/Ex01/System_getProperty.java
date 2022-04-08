package chap19.Ex01;

public class System_getProperty {

	public static void main(String[] args) {
		// System.getProperty() 메소드의 유용한 정보들
		
		System.out.println(System.getProperty("user.dir"));		// 현재 작업 폴더 위치를 출력
		System.out.println(System.getProperty("java.version"));		// 자바 버전 정보를 출력
		System.out.println(System.getProperty("java.vendor"));
		System.out.println(System.getProperty("java.vendor.url"));
		System.out.println(System.getProperty("java.home"));	// 자바 설치 홈 폴더
		System.out.println(System.getProperty("java.class.path"));	// 클래스 폴더 위치를 출력
		System.out.println(System.getProperty("user.name"));		// 로그온 계정 정보
		System.out.println(System.getProperty("user.home"));		// 로그온 계정의 홈폴더
		System.out.println(System.getProperty("os.name"));		// os 정보
		System.out.println(System.getProperty("os.arch"));		// os 아키텍처
		System.out.println(System.getProperty("os.version"));		// os 버전
		System.out.println(System.getProperty("file.separator"));	// 파일, 폴더 구분자(= \, /)
		System.out.println(System.getProperty("path.separator"));
		System.out.println(System.getProperty("line.separator"));
		
		
		
	}
}
