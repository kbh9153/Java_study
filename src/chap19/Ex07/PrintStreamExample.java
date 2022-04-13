package chap19.Ex07;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;

/*
 * PrintStream : Filter Stream (추가기능을 제공하는 Stream), 기반 스트림 필수
 * 	- 다양한 방법으로 출력에 특화된 스트림. flush()를 호출하지 않아도 자동으로 flush()
 * 	- println(), print(), printf()
 * 	- 파일 출력, 콘솔 출력 가능
 */

public class PrintStreamExample {

	public static void main(String[] args) {
		// 1. File 객체 생성
		File outFile1 = new File("src\\chap19\\Ex07\\printStream01");
		
		// 2. printStream (FileOutputStream(File)) => 파일에 출력
		try (OutputStream os1 = new FileOutputStream(outFile1);
			PrintStream ps = new PrintStream(os1);) {		// Filter 스트림(추가 기능을 제공), 기반 스트림이 필수
			
			ps.println(5.3);	// double 출력 => 출력 후 라인 개행 O
			ps.print(3 + "안녕" + 12345 + "\n");		// 출력 후 라인 개행 X
			ps.printf("%d 이 호출되었습니다. \n", 7);		// "%d" : 정수값를 호출
			ps.printf("%s %f", "안녕", 5.8);		// "%s" : 문자열, "%f" : 실수 
			
			// ps.flush() => 자동으로 호출
		} catch (Exception e) {}
		
		// 3. PrintStream (File) => 파일에 출력
		File outFile2 = new File("src\\chap19\\Ex07\\printStream02");
		
		try (PrintStream ps = new PrintStream(outFile2);) {
			
			ps.println(5.3);	// double 출력 => 출력 후 라인 개행 O
			ps.print(3 + "안녕" + 12345 + "\n");		// 출력 후 라인 개행 X
			ps.printf("%d 이 호출되었습니다. \n", 7);		// "%d" : 정수값를 호출
			ps.printf("%s %f", "안녕", 5.8);		// "%s" : 문자열, "%f" : 실수 
		} catch (FileNotFoundException e) {}
		
		// 4. OutputStream = System.out;	=> 콘솔에 출력
		
		try (OutputStream os2 = System.out;
			PrintStream ps = new PrintStream(os2);) {
			
			ps.println(5.3);	// double 출력 => 출력 후 라인 개행 O
			ps.print(3 + "안녕" + 12345 + "\n");		// 출력 후 라인 개행 X
			ps.printf("%d 이 호출되었습니다. \n", 7);		// "%d" : 정수값를 호출
			ps.printf("%s %f", "안녕", 5.8);		// "%s" : 문자열, "%f" : 실수 
		} catch (Exception e) {}
		
		
		System.out.println("------------------------------");
		
		// 5. PrintStream ps = System.out;
		try (PrintStream ps = System.out;) {
			
			ps.println(5.3);	// double 출력 => 출력 후 라인 개행 O
			ps.print(3 + "안녕" + 12345 + "\n");		// 출력 후 라인 개행 X
			ps.printf("%d 이 호출되었습니다. \n", 7);		// "%d" : 정수값를 호출
			ps.printf("%s %f", "안녕", 5.8);		// "%s" : 문자열, "%f" : 실수 
			} catch (Exception e) {}
		
		
	}
}
