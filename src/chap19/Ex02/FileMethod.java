package chap19.Ex02;

import java.io.File;

public class FileMethod {

	public static void main(String[] args) {
		// 1. C:\에 작업 폴더 생성
		File tempDir = new File("C:\\kosmo\\02_java\\temp01");
		if (!tempDir.exists()) {tempDir.mkdir();}
		
		// 2. 파일 객체 생성 (C:/Windows)
		File file = new File("C:/Windows");
		
		// 3. 파일 객체의 여러 메소드 사용
		System.out.println("절대 경로 출력 : " + file.getAbsolutePath());
		System.out.println("폴더형식인지 확인 : " + file.isDirectory());
		System.out.println("파일형식인지 확인 : " + file.isFile());
		System.out.println("파일/폴더 이름 출력 : " + file.getName());	// 파일, 폴더 이름 출력
		System.out.println("부모 폴더를 출력 : " + file.getParent());	// 부모 폴더를 출력
		
		File newFile1 = new File("C:\\kosmo\\02_java\\temp01\\abc");
		System.out.println(newFile1.mkdir());	// 폴더를 생성 후 폴더가 생성됐으면 true, 생성하지 못한 경우 false
		System.out.println(newFile1.exists());
		
		File newFile2 = new File("C:\\kosmo\\02_java\\temp01\\abc\\bcd\\cde");
		System.out.println(newFile2.mkdir());		// false. 하위 폴더까지 한번에 생성 안됨
		System.out.println(newFile2.mkdirs());		// true. 하위 폴더까지 한번에 생성
		
		File newFile3 = new File("C:\\kosmo\\02_java\\temp01\\def\\hij\\kim");
		System.out.println(newFile3.mkdirs());
		
		// 4. File 객체를 사용해서 하위 폴더의 정보 추출
		File[] fname = file.listFiles();	// file : "C:\Windows" 하위의 모든 폴더나 파일의 이름을 File 배열에 저장
		
		for (File k : fname) {
			System.out.println((k.isDirectory() ? "폴더 : " : "파일 : ") + k.getName());
		}
	}
}
