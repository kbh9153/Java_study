package chap17.Ex04;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ListSummary {

	public static void main(String[] args) {
		// 1. ArrayList
		List<String> arrayList = new ArrayList<String>();
		arrayList.add("丑");
		arrayList.add("中");
		arrayList.add("之");
		arrayList.add("予");
		arrayList.add("仃");
		System.out.println(arrayList);
		
		// 2. Vector
		List<String> vector = new Vector<String>();
		vector.add("丑");
		vector.add("中");
		vector.add("之");
		vector.add("予");
		vector.add("仃");
		System.out.println(vector);
		
		// 3. LinkedList
		List<String> linkedList = new LinkedList<String>();
		linkedList.add("丑");
		linkedList.add("中");
		linkedList.add("之");
		linkedList.add("予");
		linkedList.add("仃");
		System.out.println(linkedList);

	}

}
