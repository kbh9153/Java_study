package chap14.Ex02;

import java.io.FileInputStream;
import java.io.InputStreamReader;

/*
 * Checked Exception (일반 예외) : 컴파일 단계에서 예외가 발생
 * 	=> 컴파일(*.java -> *.class)하기(빌드) 전에 예외 처리
 * 
 * unChecked Exception (실행 예외), Runtime Exception : 실행시에 예외가 발생될 수 있음
 * 	=> 예외 필수는 아니지만 예외 처리
 */

class A {
	B b;		// b = null
	A () {}		// 기본 생성자
	
	A (B b) {
		this.b = b;
	}
	
	interface B {		// interface 선언
		void cry();
	}
	
	void abc() {
		System.out.println(b);
		b.cry();
	}
}

public class CheckedException {

	public static void main(String[] args) {
		// 1. 일반 예외 (Checked Exception) : 컴파일 단계에서 예외 처리가 필요
		
		// InterruptedException : thread 중간에 끼어들기가 발생하면 예외가 발생
		// Thread.sleep(1000);
		
		// ClassNotFoundException : class를 찾지 못하는 예외가 발생
		// Class cls = Class.forName("java.lang.Object");
		
		// IOException : 네트워크에서 값(정보)을 읽지 못하는 예외가 발생
		// System.in : Console을 의미
		InputStreamReader in = new InputStreamReader(System.in);
		// in.read();
		
		// FileNotFoundException : 파일을 찾지 못하는 예외가 발생 
		// FileInputStream fis = new FileInputStream("text.txt");
		
		// 2. 실행 예외 (unChecked Exception) : 실행시 발생되는 예외
		
		// NullPointerException : 객체가 null 상태에서 객체의 필드나 method 호출
		A a1 = new A();
		
		// a1.abc();		// 컴파일 단계에서는 예외가 발생되지 않음
	}

}
