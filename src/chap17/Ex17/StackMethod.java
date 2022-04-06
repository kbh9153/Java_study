package chap17.Ex17;

import java.util.Stack;

/*
 * Stack �ڷᱸ�� : LIFO(Last In First Out) : ���� �������� ������ ���� ���� ó�� ����
 */

public class StackMethod {
	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<Integer>();
		
		// 1. E push(E element) : Stack�� ���� ���� �� ���
		stack.push(10);		// ���� ���� ù��°. ���� �ؿ� ��ġ
		stack.push(20);
		stack.push(30);
		stack.push(40);		// ���� ���� ������. ���� ���� ��ġ
		
		// 2. E peek() : ������ ���� ���� ������ Ȯ��
		System.out.println(stack.peek());		// 40 ���
		System.out.println(stack.size());		// 4 ���. ���� ����
		System.out.println();
		
		// 3. search(Object o) : �˻� (���� �־��� �� index ��ȣ�� ���. ���� : ���� �� ���� ������ index 1�� ~... ���ʶ��� �ο�)
		System.out.println(stack.search(40));		// index ��ȣ 1
		System.out.println(stack.search(10));		// index ��ȣ 4
		System.out.println(stack.search(50));		// ���� �������� ���� ��� : -1 ���
		System.out.println();
		
		// 4. E pop() : Stack�� �ִ� �� �������� => ���� ���� �� ���� ������. ������ ���� Stack�� �������� ���� 
		System.out.println(stack.pop());		// 40
		System.out.println(stack.pop());		// 30
		System.out.println(stack.pop());		// 20
		System.out.println(stack.pop());		// 10
		System.out.println(stack.size());		// 0�� ��������
		System.out.println();
		
		//5. boolean empty() : ������ ��������� true �� ����  
		System.out.println(stack.empty()); 		 //true

		
	}
}
