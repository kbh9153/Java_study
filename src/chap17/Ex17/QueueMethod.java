package chap17.Ex17;

import java.util.LinkedList;
import java.util.Queue;

// Queue : FIFO(First In First Out) : 처음 들어간 값이 나올 떄도 처음으로 나옴

public class QueueMethod {

	public static void main(String[] args) {
		Queue<Integer> queue1 = new LinkedList<Integer>();
		
		// 1. 예외 처리를 포함하지 않은 method (add(), element(), remove())
			// 1. add() : Queue의 값을 추가할 때
		// System.out.println(queue1.element());		// 추가된 값이 없기 떄문에. 실행시 오류 발생 => 예외처리가 안되어 있음
		queue1.add(3);
		queue1.add(4);
		queue1.add(5);
			// 2. element();
		System.out.println(queue1.element());
		System.out.println();
		
			// 3. E remove(); : Queue의 값을 가져올 때 사용
		System.out.println(queue1.remove());
		System.out.println(queue1.remove());
		System.out.println(queue1.remove());
		// System.out.println(queue1.remove());		// 모두 가져온 후 다시 가져오려고 하면 오류 발생
		System.out.println();
		
		
		// 2. 예외 처리를 포함한 method (offer(), peak(), poll()) => 권장사항
		Queue<Integer> queue2 = new LinkedList<Integer>();
		
			// 1. offer(E item) : 값을 추가
		queue2.offer(3);
		queue2.offer(4);
		queue2.offer(5);
		
			// 2. E peek() : 출력할 값을 확인(미리보기)
		System.out.println(queue2.peek());		// 가장 먼저 넣은 값을 보여줌
		
			// 3. poll() : 값을 가져오기 => 넣은 순서대로 가져옴
		System.out.println(queue2.poll());
		System.out.println(queue2.poll());
		System.out.println(queue2.poll());
		System.out.println(queue2.poll());		// 예외처리가 되어 있어 가져올 값이 없어도 오류가 발생되지 않고 null 값으로 처리
		
		System.out.println(queue2.peek());		// 예외처리가 되어 있어 확인할 값이 없어도 오류가 발생되지 않고 null 값으로 처리
	}

}
