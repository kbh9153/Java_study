package chap17.Ex11;

/*
 * Map<K, V> : Key�� �ߺ����� ���� => Set���� ����(�ߺ��� �Ұ���)
 * HashMap vs LinkedHashMap
 * 	- HashMap<K, V> : �Է°� ����� �ٸ� �� ����. ����� �����ϰ� ���
 * 	- LinkedHashMap<K, V> : Key�� ��ũ�Ǿ� ����(���� ���� ���� ���� ������ ����)
 * 		=> �Է� ������� ����� �� 
 */

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class LinkedHashMapMethod {
	public static void main(String[] args) {
		Map<Integer, String> lhMap1 = new LinkedHashMap<Integer, String>();
		
		// 1. put(K key, V value) : ���� ���� ��
		lhMap1.put(2, "���ٶ�");
		lhMap1.put(1, "������");
		lhMap1.put(3, "�ٶ�");
		lhMap1.put(3, "������");	// Key�� �ߺ��ؼ� ����� �� ����. ���� ������ �ֽ� ���� ���� ���� �������
		
		System.out.println(lhMap1);
		
		// 2. putAll(�ٸ� �� ��ü) : �ٸ� ���� �����ؼ� ���
		Map<Integer, String> lhMap2 = new LinkedHashMap<Integer, String>();
		lhMap2.putAll(lhMap1);
		
		System.out.println(lhMap2);
		
		// 3. replace(K Key, V Value); key�� ����� ���� value�� ����
		lhMap2.replace(1, "������");
		lhMap2.replace(4, "����");	// key 4�� �������� ����. �۵��� �ȵ�
		
		// 4. replace(K key, V oldvalue, V newvalue) : oldvalue�� newvalue�� ����
		lhMap2.replace(1, "������", "������");
		lhMap2.replace(2, "���ٳ�", "����");		// ���۾ȵ�... key�� value�� ��Ȯ�� ��ġ�ؾ� ������
		
		System.out.println(lhMap2);
		
		// 5. get(Object key) : Map�� ���� ������ ��. key�� �־���� key�� �Ҵ�� value�� ���
		System.out.println(lhMap2.get(1));	// ����. 1�� index�� �ƴ�. key��
		System.out.println(lhMap2.get(1));
		System.out.println(lhMap2.get(1));
		
		// 6. containsKey(Object key) : �ʿ� �ش� Ű�� �����ϴ��� Ȯ�� => true, false
		System.out.println(lhMap2.containsKey(1));	// true
		System.out.println(lhMap2.containsKey(5));	// false
		
		// 7. containsValue(Object value) : �ʿ� �ش� ���� �����ϴ��� Ȯ�� => true, false
		System.out.println(lhMap2.containsValue("������"));	// true
		System.out.println(lhMap2.containsValue("������"));	// false
		
		// 8. Set<K> keySet() : key�� ����
		Set<Integer> keySet = lhMap2.keySet();	// lhMap2�� ����� keySet�� ����
		System.out.println(keySet);
		
		// 9. Set<Map.Entry<K, V>> entrySet() : key�� value�� Set�� ����
		Set<Map.Entry<Integer, String>> entrySet = lhMap2.entrySet();
		System.out.println(entrySet);
		
		// 10. size() : �� ����
		System.out.println(lhMap2.size());	// 3
		
		// 11. remove(Object key) :	�ش� key�� �̿��Ͽ� key�� value�� ����
		lhMap2.remove(1);		// 1�� ����
		lhMap2.remove(4);		// ���� key. �������� ����
		System.out.println(lhMap2);
		
		// 12. remove(Object key, Object value) : �ش� key�� value�� ��Ȯ�� ��ġ�� �� key, value ����
		lhMap2.remove(2, "���ٶ�");		// ����
		lhMap2.remove(3, "���ٴ�");		// ���� ����. key�� value �Ѵ� ��Ȯ�� ��ġ���� ����
		System.out.println(lhMap2);
		
		// 13. clear()
		lhMap2.clear();
		System.out.println(lhMap2);
	}
}
