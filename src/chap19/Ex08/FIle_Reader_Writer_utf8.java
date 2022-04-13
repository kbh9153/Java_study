package chap19.Ex08;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.io.Writer;

public class FIle_Reader_Writer_utf8 {

	public static void main(String[] args) {
		// 1. 파일개게 생성
		File rwFile = new File("src\\chap19\\Ex08\\rwFile_utf8.txt");

		try (Writer writer = new FileWriter(rwFile);) { // Wirter : 추상 클래스, FileWriter : Writer를 구현한 자식 클래스
			// OutputStream : byte 단위 출력, 추상클래스, FileOutputStream
			// Writer : char 단위 출력, 추상클래스, FileWriter

			writer.write("안녕하세요\n".toCharArray()); // String => Char 배열에 저장
			writer.write("Hello"); // String
			writer.write('A');
			writer.write('\r');
			writer.write('\n');
			writer.write("반갑습니다", 2, 3);
			writer.flush();
		} catch (Exception e) {
		}

		// 2. FileReader를 이용한 파일 읽기 (Default UTF-8) => Charactorset 지정 옵션이 없음
		try (Reader reader = new FileReader(rwFile);) {
			int data;
			while ((data = reader.read()) != -1) {
				System.out.println((char) data);
			}
		} catch (Exception e) {
		}

	}
}
