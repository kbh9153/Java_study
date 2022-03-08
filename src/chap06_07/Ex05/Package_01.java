package chap06_07.Ex05;		// package 선언

import java.util.Scanner;		// class 파일이 자신의 package에 존재하지 않는 경우 import => class의 전체이름(ex. java.util.Scanner)

/*
 class 외부에서 선언되는 것
	1. package
	2. import
	3. outter class
*/

/*
 package는 class 외부에서 선언
 package는 class를 담는 그릇
 package를 선언하지 않고 class를 생성할 경우 : default package에 저장 => 위치는 src 폴더 밑
 같은 package 내에서는 동일한 이름의 class가 존재할 수 없음
 	=> package를 분리하는 경우 : class를 목적별로 묶을 때, 프로젝트 중 class 이름이 동일하게 적용해야할 때
*/

public class Package_01 {
	
	// class full name : package 이름 + class 이름 => ex. chap06_07.Ex05.Package_01 (Package_01의 class full name)

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);		// 같은 package에 존재하지 않는 class를 사용할 때 => import 필요 
	  // class  객체	 new  생성자  (매개변수)
	}

}
