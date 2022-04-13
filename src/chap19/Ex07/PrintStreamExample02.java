package chap19.Ex07;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.nio.charset.Charset;

public class PrintStreamExample02 {

	public static void main(String[] args) {
		// 1. 파일 생성
		File outFile1 = new File("src\\chap19\\Ex07\\printStream03.txt");
		File outFile2 = new File("src\\chap19\\Ex07\\printStream04.txt");
		
		// 2. 
		try (PrintStream ps = new PrintStream(outFile1);) {
			
			ps.println(5.3);	// double 출력 => 출력 후 라인 개행 O
			ps.print(3 + "안녕" + 12345 + "\n");		// 출력 후 라인 개행 X
			ps.printf("%d 이 호출되었습니다. \n", 7);		// "%d" : 정수값를 호출
			ps.printf("%s %f", "안녕", 5.8);		// "%s" : 문자열, "%f" : 실수 
		} catch (Exception e) {}
		
		try (InputStream is = new FileInputStream(outFile1);) {
			byte[] byteArray1 = new byte[100];
			int count = is.read(byteArray1);
			
			System.out.println(new String(byteArray1, 0, count, Charset.forName("UTF-8")));
		} catch (Exception e) {
			
		}
	}
}
