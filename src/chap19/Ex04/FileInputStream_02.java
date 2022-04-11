package chap19.Ex04;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;

public class FileInputStream_02 {

	public static void main(String[] args) throws IOException {
		// 1. 입력 파일 생성
		File inFile = new File("src\\chap19\\files\\FileInputStrea01.txt");
		
		// 2-1. byte 단위 읽기 (한 byte씩 읽어서 처리)
		InputStream is1 = null;		// 객체 선언, Finally 블록에서 close
		
		try {
			is1 = new FileInputStream(inFile);
			
			int data1 = 0;
			while ((data1 = is1.read()) != -1) {	// 영문만 있으므로 read() 메소드만 사용, 한글일 경우 read(byte 배열 사용)
				System.out.print((char)data1);
			}
		} catch (IOException e) {
			System.out.println("파일을 찾을 수 없습니다.");
		} finally {
			try {
				if (is1 != null) {	// null일 때 close()를 호출하면 IOException 발생
					is1.close();
				}
			} catch (IOException e) {
				
			}
		}
		System.out.println();
		System.out.println();
		System.out.println("<< try(with resource){}로 구현하기 >>");
		
		try {
			InputStream is2 = new FileInputStream(inFile);
			// try resource : 객체 생성 => close()가 자동으로 생성 => FileInputStream clos
			int data2 = 0;
			while ((data2 = is2.read()) != -1) {	// 영문만 있으므로 read() 메소드만 사용, 한글일 경우 read(byte 배열 사용)
				System.out.print((char)data2);
			}
		} catch (IOException e) {
			System.out.println("파일을 찾을 수 없습니다.");
		}
		
		// 3-1. n-byte 단위로 읽기(byte[])의 처음 위치에서부터 읽은 데이터 저장 : 여러 바이트를 동시에 읽어서 처리 솓ㄱ\
		
		System.out.println();
		System.out.println();
		System.out.println("----------------------");
		
		InputStream is3 = new FileInputStream(inFile);
		byte[] byteArray1 = new byte[9];	// 방 크기 9
		int count1;
		while((count1 = is3.read(byteArray1)) != -1) {	// -1 : 파일의 내용 마지막까지
			// is3.read() : 1byte씩 읽음
			// is3.read(byteArray1) : 9byte씩 읽음 (= 방 크기)
			// count : 9, 9, 2 리턴 이후 -1이 되면서 while 문 종료
			for (int i = 0; i < count1; i++) {
				System.out.print((char)byteArray1[i]);
			}
			System.out.println(" : count1 = " + count1);
			
			/*
			System.out.println();
			System.out.println("----------------------");
			
			String str1 = new String(byteArray1, Charset.forName("MS949"));
			System.out.println(str1);
			*/
		}
		is3.close();
		
		System.out.println();
		System.out.println("----------------------");
		
		// 3-2. n-byte 단위로 읽어들여 한글 처리(배열 단위로 읽어서 한글 처리)
		InputStream is4 = new FileInputStream(inFile);
		
		byte[] byteArray2 = new byte[100];
		int count2;
		
		while ((count2 = is4.read(byteArray2)) != -1) {
			System.out.println(new String(byteArray2, Charset.forName("MS949")));
		}
		
		System.out.println();
		System.out.println("----------------------");
		
		// 3-3. n-byte 단위로 읽어서 저장. offset, length 사용
		InputStream is5 = new FileInputStream(inFile);
		byte[] byteArray4 = new byte[9];
		
		int offset = 3;
		int length = 6;
		int count4 = is5.read(byteArray4, offset, length);	// length만큼 앞에서 읽어와서 byteArray4에 offset 위치에 저장해라
		
		for (int i = 0; i < offset + count4; i++) {
			System.out.print((char)byteArray4[i]);
		}
		
		is5.close();
	}
}
