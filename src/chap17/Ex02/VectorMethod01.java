package chap17.Ex02;

import java.util.Arrays;
import java.util.List;
import java.util.Vector;

/*
 * Vector : ArrayList와 모든 method를 동일하게 사용 가능
 * 	- 차이점 : Vector는 모든 method가 동기화 처리되어 있음 => 멀티스레드 환경에 사용되도록 되어있음
 * 
 * 싱글 스레드 환경 : ArrayList
 * 멀티 스레드 환경 : Vector
 */

public class VectorMethod01 {

	public static void main(String[] args) {
		List<Integer> vector1 = new Vector<Integer>();
		
		// 1. add(E element) : 마지막 index 이후에 값 추가하기
		vector1.add(3);
		vector1.add(6);
		vector1.add(9);
		
		System.out.println(vector1);		// 값출력
		System.out.println(vector1.size());		// 값의 개수
		
		System.out.println("---------------");
		
		// 2. add(int index, E element)
		vector1.add(1, 6);		// index 번호 1번에 6을 추가하고 기존 값들은 다음 index로 밀려남
		System.out.println(vector1);
		
		System.out.println("---------------");

		// 3. addAll : 또 다른 list의 객체를 복사해서 추가
		List<Integer> vector2 = new Vector<Integer>();
		vector2.add(1);
		vector2.add(2);
		
		vector2.addAll(vector1);		// vector1에 저장된 값을 복사해서 vector2에 추가
		
		System.out.println(vector2);		// 기존 있던 값들 다음으로 복사한 vector1 값을 추가
		
		System.out.println("---------------");
		
		// 4. addAll(int index, 또 다른 객체)
		List<Integer> vector3 = new Vector<Integer>();
		vector3.add(1);
		vector3.add(2);
		
		vector3.addAll(1, vector3);		// 자신의 값에 다른 객체를 추가(각각의 기존 index 다음에 복사한 객체의 값들을 순차적으로 추가) 
		System.out.println(vector3);
		
		System.out.println("---------------");
		
		// 5. set(int Index, E element) : 특정 방 번호의 값을 수정
		vector3.set(1, 5);
		vector3.set(3, 6);
		// vector3.set(4, 7);		// 오류 발생, IndexOutOfBoundsException
		
		System.out.println(vector3);
		
		System.out.println("---------------");
		
		// 6. remove(int index) : 특정 방번호의 값을 삭제
		vector3.remove(1);		// 방번호 1번 방에 있는 값을 삭제
		System.out.println(vector3);
		
		System.out.println("---------------");
		
		// 7. remove(Object o) : 값을 삭제
		vector3.remove(new Integer(6));		// 값으로 삭제할 수 있음. Integer에 표시된 선은 오류표시가 아니라 추후 이 구문이 삭제되거나 변경될 수 있음을 알림
		System.out.println(vector3);
		
		System.out.println("---------------");
		
		// 8. clear() : 모두 삭제
		vector3.clear();
		System.out.println(vector3);
		
		System.out.println("---------------");
		
		// 9. isEmpty() : 값이 비어 있으면 True, 비어있지 않으면 False
		System.out.println(vector3.isEmpty());
		
		System.out.println("---------------");
		
		// 10. size() : 방의 개수, 값의 개수
		System.out.println(vector3.size());
		vector3.add(1);
		vector3.add(2);
		vector3.add(3);
		System.out.println(vector3);
		System.out.println(vector3.size());
		
		System.out.println("---------------");
		
		// 11. get(int index) : 방 번호의 값을 출력
		System.out.println(vector3.get(0));
		System.out.println(vector3.get(1));
		System.out.println(vector3.get(2));
		
		System.out.println(vector3);		// List일 때 객체를 출력하면 객체의 값을 출력
		
		System.out.println("---------------");
		
		// 12. toArray() : List -> Array. List를 배열로 변환
		Object[] object = vector3.toArray();		// 기본적으로 toArray() method는 Object 타입으로 return이 됨 => 다운 캐스팅이 필요
		System.out.println(Arrays.toString(object));		// 배열로 변환된 상태. 배열일 때는 Arrays.toString() 사용
		
		System.out.println("---------------");
		
		// 13-1 toArray(T[] t) => t[] : Integer로 바로 캐스팅
		Integer[] integer1 = vector3.toArray(new Integer[0]);	
		// (new Integerp[0] => [0] : 방의 크기. * 0 -> 실제 값의 개수(현재 3)보다 방의 크기를 작게 설정하면 실제 값의 개수(현재 3)만큼 출력
		System.out.println(Arrays.toString(integer1));
		
		// 13-2 toArray(T[] t) => t[] : Integer로 바로 캐스팅
		Integer[] integer2 = vector3.toArray(new Integer[5]);
		System.out.println(Arrays.toString(integer2));
		
	}

}
