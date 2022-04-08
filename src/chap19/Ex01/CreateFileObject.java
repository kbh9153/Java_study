package chap19.Ex01;

import java.io.File;	// 파일과 폴더를 다루는 객체
import java.io.IOException;

// 주의 : 이클립스에서 파일을 생성시 C:\ 위치로 바로 생성하면 권한 문제로 인한 오류가 발생할 수 있음
	// 1. 이클립스를 << 관리자 권한 >> 으로 실행
	// 2. 폴더 내부에 파일을 생성

/*
 * File 객체 내의 폴더 식별자를 적용할 경우
 * 	1. OS가 Windows 경우 : String path = "C:\\abc\\abc.txt" => "" 내에 특수문자를 처리하기 위한 기호. \를 처리하기 위해 \\와 같이 두번 입력
 *		=> Windows 10 이상 : "C:/abc/abc.txt" macOS와 같이 / 사용 가능
 * 	2. OS가 macOS 경우 : String path = "C:/abc/abc.txt"
 * 	3. OS 호환을 위해서 공통적으로 사용할 수 있는 코드 작성
 * 		=> String path = "C:" + File.separator + "abc" + File.separator + "abc.txt" : \\와 /를 File.separator로 대체하여 입력
 * 
 */

public class CreateFileObject {

	public static void main(String[] args) throws IOException {
		// 1. File 객체를 사용해서 폴더 생성
		File tempDir = new File("C:\\kosmo\\02_java\\temp01");		// 생성자에 만들 파일이나 폴더를 위치까지 표시하여 입력
		if (!tempDir.exists()) {	// 해당 경로에 파일이나 폴더가 존재하면 true, false
			tempDir.mkdir();	// 폴더 생성 명령
		}
		
		System.out.println(tempDir.exists());	// 파일이 경로에 존재하면 true, 존재하지 않으면 false
		
		// 2. File 객체를 사용해서 파일 생성
		File newFile = new File("C:\\kosmo\\02_java\\temp01\\newfile.txt");		// C:\ 파일을 생성할 경우 권한 문제로 파일 생성 예외 => 이클립스를 관리자 권한으로 실행
		if (!newFile.exists()) {
			// newFile.createNewFile();		// 파일을 생성할 때 예외가 발생될 수 있음(권한문제 등). 예외 처리가 필요
			newFile.createNewFile();
		}
		System.out.println(newFile.exists());
		
		System.out.println();
		
		// 3. 파일 구분자
		File newFile2 = new File("C:\\kosmo\\02_java\\temp01\\newfile02.txt");
		File newFile3 = new File("C://kosmo/02_java/temp01/newfile03.txt");
		
		if (!newFile2.exists() && !newFile3.exists()) {
			newFile2.createNewFile();
			newFile3.createNewFile();
		}
		
		System.out.println(newFile2.exists());
		System.out.println(newFile3.exists());
		
		// 모든 OS에서 공통으로 식별 가능한 코드
		File newFile4 = new File("C:" + File.separator + "kosmo" + File.separator + "02_java" + File.separator + "temp01" + File.separator + "newfile04.txt");
		if (!newFile4.exists()) {newFile4.createNewFile();}

		// 4. 절대 경로로 처리 : 다른 시스템으로 인동된 경우 그 시스템 환경에 맞도곷 셋팅이 필요
		File newFile5 = new File("C://kosmo/02_java/temp01/newfile03.txt");
		System.out.println(newFile5.getAbsolutePath());		// file 객체에 저장된 파일의 절대경로를 출력
		
		// 5. 상대 경로로 처리 => 권장
		// 현재 나의 작업 폴더의 위치를 알아야 함
		System.out.println(System.getProperty("user.dir"));		// System.getProperty : 현재 작업 폴더의 위치(이클립스 실행 폴더 위치)	
		File newFile6 = new File("newFile06.txt");		// 상대 경로로 출력
		if (!newFile6.exists()) {newFile6.createNewFile();}
		System.out.println(newFile6.getAbsolutePath());
		
	}
}
