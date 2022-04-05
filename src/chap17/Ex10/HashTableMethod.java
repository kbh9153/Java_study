package chap17.Ex10;

import java.util.Map;
import java.util.Set;
import java.util.Hashtable;

public class HashTableMethod {
	public static void main(String[] args) {
		Map<Integer, String> hTable1 = new Hashtable<Integer, String>();
		
		// 1. put(K key, V value) : ���� ���� ��
		hTable1.put(2, "���ٶ�");
		hTable1.put(1, "������");
		hTable1.put(3, "�ٶ�");
		hTable1.put(3, "������");	// Key�� �ߺ��ؼ� ����� �� ����. ���� ������ �ֽ� ���� ���� ���� �������
		
		System.out.println(hTable1);
		
		// 2. putAll(�ٸ� �� ��ü) : �ٸ� ���� �����ؼ� ���
		Map<Integer, String> hTable2 = new Hashtable<Integer, String>();
		hTable2.putAll(hTable1);
		
		System.out.println(hTable2);
		
		// 3. replace(K Key, V Value); key�� ����� ���� value�� ����
		hTable2.replace(1, "������");
		hTable2.replace(4, "����");	// key 4�� �������� ����. �۵��� �ȵ�
		
		// 4. replace(K key, V oldvalue, V newvalue) : oldvalue�� newvalue�� ����
		hTable2.replace(1, "������", "������");
		hTable2.replace(2, "���ٳ�", "����");		// ���۾ȵ�... key�� value�� ��Ȯ�� ��ġ�ؾ� ������
		
		System.out.println(hTable2);
		
		// 5. get(Object key) : Map�� ���� ������ ��. key�� �־���� key�� �Ҵ�� value�� ���
		System.out.println(hTable2.get(1));	// ����. 1�� index�� �ƴ�. key��
		System.out.println(hTable2.get(1));
		System.out.println(hTable2.get(1));
		
		// 6. containsKey(Object key) : �ʿ� �ش� Ű�� �����ϴ��� Ȯ�� => true, false
		System.out.println(hTable2.containsKey(1));	// true
		System.out.println(hTable2.containsKey(5));	// false
		
		// 7. containsValue(Object value) : �ʿ� �ش� ���� �����ϴ��� Ȯ�� => true, false
		System.out.println(hTable2.containsValue("������"));	// true
		System.out.println(hTable2.containsValue("������"));	// false
		
		// 8. Set<K> keySet() : key�� ����
		Set<Integer> keySet = hTable2.keySet();	// hTable2�� ����� keySet�� ����
		System.out.println(keySet);
		
		// 9. Set<Map.Entry<K, V>> entrySet() : key�� value�� Set�� ����
		Set<Map.Entry<Integer, String>> entrySet = hTable2.entrySet();
		System.out.println(entrySet);
		
		// 10. size() : �� ����
		System.out.println(hTable2.size());	// 3
		
		// 11. remove(Object key) :	�ش� key�� �̿��Ͽ� key�� value�� ����
		hTable2.remove(1);		// 1�� ����
		hTable2.remove(4);		// ���� key. �������� ����
		System.out.println(hTable2);
		
		// 12. remove(Object key, Object value) : �ش� key�� value�� ��Ȯ�� ��ġ�� �� key, value ����
		hTable2.remove(2, "���ٶ�");		// ����
		hTable2.remove(3, "���ٴ�");		// ���� ����. key�� value �Ѵ� ��Ȯ�� ��ġ���� ����
		System.out.println(hTable2);
		
		// 13. clear()
		hTable2.clear();
		System.out.println(hTable2);
	}
}
