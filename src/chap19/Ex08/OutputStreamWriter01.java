package chap19.Ex08;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

/*
 * InputStreamReader : byte => char, charset(MS949, UTF-8)를 지정하여 읽기 가능
 * OutputStreamWriter : byte => char, charset(MS949, UTF-8)를 지정하여 저장 가능
 */

public class OutputStreamWriter01 {

	public static void main(String[] args) {
		// 1. FileWriter를 통해서 데이트 쓰기 (default : "MS949")
		File osw1 = new File("src/chap19/Ex08/osw1.txt");	// MS949
		
		try (Writer writer = new FileWriter(osw1);) {
			writer.write("OutputStreamWriter1 예제 파일입니다.\n".toCharArray());	// String을 char[] 배열을 저장
			writer.write("한글과 영문이 모두 포함되어 있습니다.");	// String
			writer.write('\n');		// char 저장
			writer.write("Goodbye\n\n");
			writer.flush();
		} catch (Exception e) {}
		
		// 2. FileWriter를 사용 (Default : MS949 => UTF-8 파을 쓰기)
		File osw2 = new File("src/chap19/Ex08/osw2.txt");	// UTF-8
		
		try (OutputStream os = new FileOutputStream(osw2);
			OutputStreamWriter osw = new OutputStreamWriter(os, "UTF-8");) {
			// OutputStreamWriter : byte => char 변환 기능 포함
			
			osw.write("OutputStreamWriter1 예제 파일입니다.\n".toCharArray());	// String을 char[] 배열을 저장
			osw.write("한글과 영문이 모두 포함되어 있습니다.");	// String
			osw.write('\n');		// char 저장
			osw.write("Goodbye\n\n");
			osw.flush();
		} catch (Exception e) {}
	}
}
