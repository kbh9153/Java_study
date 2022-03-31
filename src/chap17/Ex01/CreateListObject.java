package chap17.Ex01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class CreateListObject {

	public static void main(String[] args) {
		// 1. List ���� class�� �����ڸ� ����Ͽ� ��ü ����
		// List�� interface�̹Ƿ� new Ű �ڿ� �� �� ����. ArrayList, Vector, LinkedLIst
		// capacity : �޸� �� ũ�⸦ �Ҵ�, �⺻���� 10
		// *** size() : �濡 ����� ���� ���� ***
		
		List<Integer> aList1 = new ArrayList<Integer>();		// capacity = 0
		List<Integer> aList2 = new ArrayList<Integer>(30);		// capacity = 30, �޸� ���� Ȯ��
		
		List<Integer> aList3 = new Vector();
		List<Integer> aList4 = new Vector(30);
		
		List<Integer> aList5 = new LinkedList();
		// List<Integer> aList6 = new LinkedList(30);		// LinkedList�� ���� ���� �Ҵ��� �Ұ���
		
		// 2. Arrays class�� ���� method �̿��ϴ� ��� : ������ ũ�⸦ �ٲ� �� ����
			// => ����, ����, �Ϸ� 24�ð� -> ��ó�� ������ ���� ������ �� ���
		
		List<Integer> aList7 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		List<String> aList8 = Arrays.asList("��", "ȭ", "��", "��", "��", "��", "��");
		aList7.set(1, 12);		// set() : ������ �ִ� ���� ������ ��. index 1�� ���� 12�� ����
		// aList7.add(5);		// asList()�� ������ ���̱� ������ �� �߰��� �Ұ���. add() : ���������� ���� �� �߰��� �� ���
		
		System.out.println(aList7);
		
		aList8.set(0, "�������?");
		// aList8.add("��");
		
		System.out.println(aList8);
	}

}
