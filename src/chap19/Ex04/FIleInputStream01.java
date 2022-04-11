package chap19.Ex04;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class FIleInputStream01 {

	public static void main(String[] args) throws IOException {
		// 현재 작업 폴더 위치 확인
		System.out.println(System.getProperty("user.dir"));
		
		// 1. 입력 파일 생성
		// 절대경로 설정
		File inFile1 = new File("C:\\kosmo\\02_java\\java_01\\src\\chap19\\files\\FileInputStrea01.txt");
		
		// 상대경로 설정 : 현재 작업 폴더(C:\\kosmo\\02_java\\java_01)를 기준으로 설정
		File inFile2 = new File("src\\chap19\\files\\FileInputStrea01.txt");
		
		// InputStream 객체를 생성해야 파일의 내용을 읽어올 수 있음
		InputStream is = new FileInputStream(inFile2);		// InputStream은 추상 클래스. 직접 객체 생성할 수 없으며 타입 지정은 가능함
		
		// 파일의 내용을 출력
		
		/*
		 * UTF-8 : 영어 1byte, 한글 3byte 처리
		 * MS949 : 영어 1byte, 한글 2byte 처리
		 * EUC_KR : 영어 1byte, 한글은 2byte 처리
		 * UTF-16 : 영어, 한글 2byte, 첫번째 BOM(식별자 코드) 2byte
		 * 	- UNIX : \n
		 * 	- Windows : \r\n => \r은 생략해도 됨. 콘솔이나 메모장에서 enter : \r\n
		 * 	- MAC : \r
		 */
		
		
		// 1byte 데이터를 읽어서 char로 변환 후 출력
		System.out.print(is.read());	// read() 메소드는 1byte씩 읽어옴
		System.out.print((char)is.read());
		System.out.print((char)is.read());
		System.out.print((char)is.read());
		System.out.print((char)is.read());
		System.out.print((char)is.read());
		System.out.print((char)is.read());
		System.out.print((char)is.read());
		System.out.print((char)is.read());
		System.out.print((char)is.read());
		System.out.print((char)is.read());
		System.out.print((char)is.read());
		System.out.print((char)is.read());
		System.out.print((char)is.read());
		System.out.print((char)is.read());
		System.out.print((char)is.read());
		
		// String은 값을 읽으면 메모리에서 삭제됨. 새로 읽기 위해서는 새로운 String을 생성해야함
		
		System.out.println();
		System.out.println();
		
		// int read() : 1byte를 읽어서 값이 존재할 경우 양수를 리턴. 읽어올 데이터가 존재하지 않을 경우 음수를 -1 리턴
		InputStream is1 = new FileInputStream(inFile2);
		
		int data;
		
		while ((data = is1.read()) != -1) {		// 마지막 값까지 계속 순환 (-1 : 값이 더이상 존재하지 않으면 -1)
			System.out.print((char)data);
		}
		
		// 중요 : .read()는 1byte 씩 읽어옴
		// 
		// FileInputStream은 처음부터 index 0번부터 읽어옴. 중간의 임의의 방에서 읽어올 수 없음
			// FileRandomAccess를 사용해서 임의의 index에서 읽어옴
		
		System.out.println();
		System.out.println();
		
		// available() : String의 남은 byte 수를 출력
		
		InputStream is2 = new FileInputStream(inFile2);
		
		while ((data = is2.read()) != -1) {		// 마지막 값까지 계속 순환
			System.out.println("읽은 데이터 : " + (char)data + ", 남은 바이트 수 : " + is2.available());
		}
		
		is.close();
		is1.close();
		is2.close();
		
	}
}
