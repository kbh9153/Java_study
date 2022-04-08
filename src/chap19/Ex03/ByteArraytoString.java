package chap19.Ex03;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

public class ByteArraytoString {
	
	public static void main(String[] args) throws UnsupportedEncodingException {
		// 1. String getBytes() : 인코딩. String => Byte[] (문자 => byte 변환 후 배열에 저장)
		
		byte[] array1 = "안녕".getBytes();	// Charset 지정 안함. 기본으로 설정된 인코딩 타입을 적용
		byte[] array2 = "땡큐".getBytes(Charset.defaultCharset());	// 땡큐 => byte로 변환하여 배열에 저장
		byte[] array3 = "베리".getBytes(Charset.forName("MS949"));	// 예외발생할 수 있음(실행예외)
		byte[] array4 = "머취".getBytes("UTF-8");		// 바로 인코딩 값을 넣을 경우 예외처리 필요(일반예외)
		
		// 2. 각 인코딩의 byte 수 출력
		System.out.println(array1.length);	// MS949(기본설정). 한글 한자당 2byte
		System.out.println(array2.length);	// MS949(기본설정). 한글 한자당 2byte
		System.out.println(array3.length);	// MS949. 한글 한자당 2byte
		System.out.println(array4.length);	// UTF-8. 한글 한자당 3byte
		System.out.println();
		
		// 3. new String() : 디코딩. byte[] => String으로 변환
		String str1 = new String(array1);
		String str2 = new String(array2, Charset.defaultCharset());
		// String str3 = new String(array3, Charset.forName("UTF-8"));		// 디코딩시 인코딩시(MS949)의 타입과 다르면 문자가 깨짐
		String str3 = new String(array3, Charset.forName("MS949"));		// 디코딩시 인코딩시의 타입과 다르면 문자가 깨짐
		String str4 = new String(array4, Charset.forName("UTF-8"));
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		System.out.println(str4);
		System.out.println();
		
		// 4. 한글이 꺠지는 경우 : 인코딩 타입과 디코딩 타입이 다를 경우
		String str5 = new String(array1, Charset.forName("UTF-8"));
		String str6 = new String(array1, Charset.forName("MS949"));
		String str7 = new String(array3, Charset.forName("UTF-8"));
		
		System.out.println(str5);
		System.out.println(str6);
		System.out.println(str7);	// array3 인코딩 타입은 MS949. 디코딩시 UTF-8이기 때문에 문자 깨짐
	}
}
