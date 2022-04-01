package chap17.Ex06_HashSet;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/*
 * Set : �ߺ��� ���� ���� �� ����
 * 	- equals() method, hashCode() method�� ���ǵǾ� �־�� ��
 * 	- String, Integer, Double class���� equals()�� hashCode()�� �����ǵǾ� ����
 * 	- Ư�� ��ü�� set�� ������ ��� �ߺ� ������ ���� ���ϵ��� �ϱ� ���ؼ��� equals()�� hashCode() method�� �������ؾ� ��
 * 	- Object class�� equals()�� hashCode()
 * 		=> Object class�� equals() method�� == �� ����
 * 			* ==�� stack �޸��� ���� ��
 */

// equals(), hashCode()�� ���ǵǾ� ���� ����
class A {
	int data;
	public A(int data) {
		this.data = data;
	}
}

// equals()�� �������ϰ� hashCode()�� ������ �������� ����
class B {		// �ΰ��� ��ü�� Data �ʵ��� ���� ���� �� �����ϴٶ�� �ĺ��ڸ� �־���� �� => equals(), hashCode()
	int data;
	public B(int data) {
		this.data = data;
	}
	
	@Override
	public boolean equals(Object obj) {		// ��ü �ּҸ� ���ϴ� ���� �ƴ϶� ��ü ������ Ư�� �ʵ��� ���� ���ϵ��� ����
		if (obj instanceof B) {		// obj(Object)�� BŸ���� �����ϰ� �ִ��� üũ. �����ϰ� ���� ���� �ٿ� ĳ����
			if (this.data == ((B)obj).data)		// ���� : �߸� �ٿ�ĳ������ ���(������ BŸ������ �ٿ�ĳ����)
			return true;
		}
		return false;
	}
}

// equals(), hashCode() ��������
class C {		// �ΰ��� ��ü�� Data �ʵ��� ���� ���� �� �����ϴٶ�� �ĺ��ڸ� �־���� �� => equals(), hashCode()
	int data;
	public C(int data) {
		this.data = data;
	}
	
	@Override
	public boolean equals(Object obj) {		// ��ü �ּҸ� ���ϴ� ���� �ƴ϶� ��ü ������ Ư�� �ʵ��� ���� ���ϵ��� ����
		if (obj instanceof C) {		// obj(Object)�� BŸ���� �����ϰ� �ִ��� üũ. �����ϰ� ���� ���� �ٿ� ĳ����
			if (this.data == ((C)obj).data)		// ���� : �߸� �ٿ�ĳ������ ���(������ BŸ������ �ٿ�ĳ����)
			return true;
		}
		return false;
	}
	
	@Override
		public int hashCode() {
			return Objects.hashCode(data);		// Objects.hash(�ʵ��, �ʵ��, �ʵ��) => �������� �ʵ��� hashCode()�� �����ϰ� ���� ����
			// return data;		// data �ʵ��� ���� ������ hashCode()�� �����ϰ� ����
		}
}

public class HashSetMechanism {

	public static void main(String[] args) {
		// 1. equals(), hashCode()�� ���ǵǾ� ���� ����
		Set<A> hashSet1 = new HashSet<A>();
		A a1 = new A(3);
		A a2 = new A(3);
		
		System.out.println(a1 == a2);		// false
		// == : stack �޸��� �ּҰ��� ��(a1�� a2�� ���� ������ ��ü�� �ּҰ��� �ٸ�)
		
		System.out.println(a1);
		System.out.println(a2);		// ��ü���� ����ϸ� �ּҰ�(��Ű����.Ŭ������@heap�޸��ּ��� hashCode(16����))�� ���. a1�� ���� ������ �ּҰ��� �ٸ�
		
		System.out.println(a1.equals(a2));		// false ���. Object equals()�� == �� ����
		
		System.out.println(a1.hashCode() + " vs " + a2.hashCode());		// hashCode(10����) ���
		
		hashSet1.add(a1);
		hashSet1.add(a2);		// Set�� �ߺ��� ���� ���� ����
		
		System.out.println(hashSet1.size());		// 2 => equals()�� hashCode() method�� �����ǵǾ� ���� ����
		
		System.out.println("--------------------------");
		
		// 2. equals() ������ (��ü�� Data �ʵ��� ���� ��), hashCode()�� ���ǵǾ� ���� ����
		Set<B> hashSet2 = new HashSet<B>();
		B b1 = new B(5);
		B b2 = new B(5);
		
		System.out.println(b1 == b2);		// false. stack �޸��� ���� ��
		System.out.println(b1.equals(b2));
		
		hashSet2.add(b1);
		hashSet2.add(b2);
		
		System.out.println(hashSet2.size());		// 2 ���. equals()�� ������, hashCode() ������ �ȵǾ��ִ� ����
		
		System.out.println(b1.hashCode() + " vs " + b2.hashCode());
		
		System.out.println("--------------------------");
		
		
		// 3. equals() ������ (��ü�� Data �ʵ��� ���� ��), hashCode() ������
		Set<C> hashSet3 = new HashSet<C>();
		
		C c1 = new C(182);
		C c2 = new C(182);
		
		System.out.println(c1 == c2);		// false. stack�� �ּҸ� ��
		System.out.println(c1.equals(c2));		// true. ��ü�� data �ʵ��� ���� ���ϵ��� �����ǵǾ� ����
		
		System.out.println(c1.hashCode() + " vs " + c2.hashCode());
		
		hashSet3.add(c1);
		hashSet3.add(c2);
		System.out.println(hashSet3.size());
		
		
		
	}

}
