package chap17.Ex17;

import java.util.Stack;

/*
 * Stack 자료구조 : LIFO(Last In First Out) : 제일 마지막에 저장한 값이 제일 처음 나옴
 */

public class StackMethod {
	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<Integer>();
		
		// 1. E push(E element) : Stack에 값을 넣을 때 사용
		stack.push(10);		// 넣을 때는 첫번째. 가장 밑에 위치
		stack.push(20);
		stack.push(30);
		stack.push(40);		// 넣을 떄는 마지막. 가장 위에 위치
		
		// 2. E peek() : 가져올 값을 가장 위에서 확인
		System.out.println(stack.peek());		// 40 출력
		System.out.println(stack.size());		// 4 출력. 값을 개수
		System.out.println();
		
		// 3. search(Object o) : 검색 (값을 넣었을 때 index 번호를 출력. 주의 : 가장 맨 위의 값부터 index 1번 ~... 차례때로 부여)
		System.out.println(stack.search(40));		// index 번호 1
		System.out.println(stack.search(10));		// index 번호 4
		System.out.println(stack.search(50));		// 값이 존재하지 않을 경우 : -1 출력
		System.out.println();
		
		// 4. E pop() : Stack에 있는 값 가져오기 => 가장 위의 값 부터 가져옴. 가져온 값은 Stack에 남아있지 않음 
		System.out.println(stack.pop());		// 40
		System.out.println(stack.pop());		// 30
		System.out.println(stack.pop());		// 20
		System.out.println(stack.pop());		// 10
		System.out.println(stack.size());		// 0개 남아있음
		System.out.println();
		
		//5. boolean empty() : 스택이 비어있을때 true 를 리턴  
		System.out.println(stack.empty()); 		 //true

		
	}
}
