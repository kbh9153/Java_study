package chap17.Ex06_HashSet;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

// Member class�� memberID �÷��� eqauls(), hashCode()

class Member {		// DTO, VO : �� �������� �����͸� �޾Ƽ� �������ִ� class
	private int memberID;
	private String memberName;
	
	public Member(int memberID, String memberName) {		// �����ڸ� ���ؼ� �ʵ尪 �Ҵ�
		this.memberID = memberID;
		this.memberName = memberName;
	}

	public int getMemberID() {
		return memberID;
	}

	public void setMemberID(int memberID) {
		this.memberID = memberID;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	
	@Override
		public String toString() {
			return "�Է��Ͻ� �̸��� " + memberName + " �Դϴ�." + " ȸ������ ID�� " + memberID + " �Դϴ�. \n";
		}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Member) {
			if (this.memberID == ((Member)obj).memberID)
			return true;
		}
		return false;
	}
	
	@Override
		public int hashCode() {
			return Objects.hashCode(memberID);
		}
}

class MemberHashSet {		// MemberArrayList�� ��üȭ�ϸ� ArrayList ��ü�� ������
	private Set<Member> hashSet;
	
	public MemberHashSet() {		// �⺻ ������
		hashSet = new HashSet<Member>();
	}
	
	public void addMember(Member member) {		// Member ��ü�� �޾Ƽ� ������ �濡 ���� �߰��ϴ� method
		// �ڵ� ���
		hashSet.add(member);
	}
	
	public boolean removeMember(int memberID) {
		// ArrayList�� ����� memberID�� �˻��ؼ� �ش� ��ü�� ����
		Iterator<Member> iterator = hashSet.iterator();
		while (iterator.hasNext()) {
			Member member = hashSet.iterator().next();
			int getMemberID = member.getMemberID();
			if (memberID == getMemberID) {
				iterator.remove();
			}
			return true;
		}
		
		System.out.println("�Է��Ͻ� ID " + memberID + "�� �������� �ʽ��ϴ�.");
		return false;
	}
	
	public void showAllMember() {
		// ArrayList�� ����� ��� ����� ������ ����ϴ� method
		Object[] object = hashSet.toArray();
		for (Object k : object) {
			System.out.print(k);
		}
		
	}
	
	public void showSize() {
		System.out.println("���� List ���� �� : " + hashSet.size());
	}
}

public class Ex_MemberHashSet {

	public static void main(String[] args) {
		MemberHashSet memberHashSet = new MemberHashSet();
		Member memberHong = new Member(1001, "ȫ�浿");
		Member memberLee = new Member(1002, "������");
		Member memberSon = new Member(1003, "�չα�");
		Member memberPark = new Member(1004, "�ڼ���");
//		Member memberHong = new Member(1001, "ȫ�浿");
		
		
		memberHashSet.addMember(memberHong);		// �� ��ü�� �����ؼ� ArrayList�� ����
		memberHashSet.addMember(memberLee);
		memberHashSet.addMember(memberSon);
		memberHashSet.addMember(memberPark);
		
		// ��� ����� ���� ���
		memberHashSet.showAllMember();
		
		// Ư�� id�� ���� ����� ����
		memberHashSet.removeMember(1004);
		
		System.out.println("--------------------------------------------");
		
		// ��� ����� ���� ���
		memberHashSet.showAllMember();
		
		System.out.println("--------------------------------------------");
		
		memberHashSet.showSize();
		
		
		
		
		
	}

}
