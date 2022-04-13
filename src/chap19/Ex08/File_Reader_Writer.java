package chap19.Ex08;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.io.Writer;

/*
 * Reader / Writer : char 단위 입출력. 문자만 처리하도록 특화된 추상 클래스
 * 	- 인코딩의 신경을 덜 써도 된다는 장점
 * 	- byte : 1byte
 * 	- char : 2byte (UTF-16(한글, 영문 모두 2byte)로 처리)
 * 
 * FileReader : charset지정 옵션이 없음. default charset 사용
 * FileWriter : charset지정 옵션이 없음. default charset 사용
 */

public class File_Reader_Writer {

	public static void main(String[] args) {
		// 1. 파일개게 생성
		File rwFile = new File("src\\chap19\\Ex08\\rwFile.txt");
		
		try (Writer writer = new FileWriter(rwFile);) {		// Wirter : 추상 클래스, FileWriter : Writer를 구현한 자식 클래스
			// OutputStream : byte 단위 출력, 추상클래스, FileOutputStream
			// Writer : char 단위 출력, 추상클래스, FileWriter
			
			writer.write("안녕하세요\n".toCharArray());		// String => Char 배열에 저장
			writer.write("Hello");		// String
			writer.write('A');
			writer.write('\r');
			writer.write('\n');
			writer.write("반갑습니다", 2, 3);
			writer.flush();
		} catch (Exception e) {}
		
		// 2. FileReader를 이용한 파일 읽기 (Default MS949) => Charactorset 지정 옵션이 없음
		try (Reader reader = new FileReader(rwFile);) {
			int data;
			while ((data = reader.read()) != -1) {
				System.out.println((char)data);
			}
		} catch (Exception e) {}
		
	}
}
