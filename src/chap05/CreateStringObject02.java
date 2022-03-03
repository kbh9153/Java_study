package chap05;

import java.util.Arrays;

public class CreateStringObject02 {
	public static void main(String[] args) {
		
		// 객체의 값을 복사한후, 값을 변경하면 새로운 메모리 공간을 갖는다.
		
		// 1. 문자열 수정 (객체내의 내용 수정이 불가 ---> 새로운 객체가 생성)
		String str1 = new String("안녕");
		String str2 = str1;
		/*
		 * 참조 자료형일때, Stack의 주소값을 복사
		 * 기본 자료형일때, 값을 복사 (기본자료형은 stack 영역에 변수와 값이 모두 저장된다.)
		 */
		
		str1 = "안녕하세요";
		/*
		 * 별도의 메모리 공간에 "안녕하세요"가 생성.
		 * str1의 메모리 주소또한 다시 갖게 된다.
		 */
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println("=====================");
		
		// 배열인 경우, 값을 변경하면 수정된다.
		int[] array1 = new int[] {3, 4, 5};
		int[] array2 = array1;
		
		array1[0] = 6;
		array1[1] = 7;
		array1[2] = 8;
		
		System.out.println(Arrays.toString(array1));
		System.out.println(Arrays.toString(array2));
		
		
	}
}
