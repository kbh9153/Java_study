package chap17.Ex17;

import java.util.LinkedList;
import java.util.Queue;

// Queue : FIFO(First In First Out) : ó�� �� ���� ���� ���� ó������ ����

public class QueueMethod {

	public static void main(String[] args) {
		Queue<Integer> queue1 = new LinkedList<Integer>();
		
		// 1. ���� ó���� �������� ���� method (add(), element(), remove())
			// 1. add() : Queue�� ���� �߰��� ��
		// System.out.println(queue1.element());		// �߰��� ���� ���� ������. ����� ���� �߻� => ����ó���� �ȵǾ� ����
		queue1.add(3);
		queue1.add(4);
		queue1.add(5);
			// 2. element();
		System.out.println(queue1.element());
		System.out.println();
		
			// 3. E remove(); : Queue�� ���� ������ �� ���
		System.out.println(queue1.remove());
		System.out.println(queue1.remove());
		System.out.println(queue1.remove());
		// System.out.println(queue1.remove());		// ��� ������ �� �ٽ� ���������� �ϸ� ���� �߻�
		System.out.println();
		
		
		// 2. ���� ó���� ������ method (offer(), peak(), poll()) => �������
		Queue<Integer> queue2 = new LinkedList<Integer>();
		
			// 1. offer(E item) : ���� �߰�
		queue2.offer(3);
		queue2.offer(4);
		queue2.offer(5);
		
			// 2. E peek() : ����� ���� Ȯ��(�̸�����)
		System.out.println(queue2.peek());		// ���� ���� ���� ���� ������
		
			// 3. poll() : ���� �������� => ���� ������� ������
		System.out.println(queue2.poll());
		System.out.println(queue2.poll());
		System.out.println(queue2.poll());
		System.out.println(queue2.poll());		// ����ó���� �Ǿ� �־� ������ ���� ��� ������ �߻����� �ʰ� null ������ ó��
		
		System.out.println(queue2.peek());		// ����ó���� �Ǿ� �־� Ȯ���� ���� ��� ������ �߻����� �ʰ� null ������ ó��
	}

}
