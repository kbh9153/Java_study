package chap06_07.Ex06;

import chap06_07.Ex05.C;

public class Ex_C {

	public static void main(String[] args) {
		// 다른 package에 존재. public만 접근. model, color 메모리로 접근 불가
		// model과 color는 setter
		
		C g80 = new C();		// 다른 package이므로 import 필요
		
		
		// company, model, color는 다른 package에서 접근 불가
		g80.maxspeed = 380;
		g80.set("G80", "Black");		// setter를 통해서 메모리의 값을 부여
//		g80.setColor("Black");
//		g80.setModel("G80");
		
		g80.print();
		
	}

}
