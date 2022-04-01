package chap17.Ex05;

import java.util.ArrayList;

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
}

class MemberArrayList {		// MemberArrayList�� ��üȭ�ϸ� ArrayList ��ü�� ������
	private ArrayList<Member> arrayList;
	
	public MemberArrayList() {		// �⺻ ������
		arrayList = new ArrayList<Member>();
	}
	
	public void addMember(Member member) {		// Member ��ü�� �޾Ƽ� ������ �濡 ���� �߰��ϴ� method
		// �ڵ� ���
		arrayList.add(member);
	}
	
	public void addMember2(int a, Member member) {		// �Ű� ���� 2���� �޾Ƽ� Ư�� index �� ��ȣ�� ���� �߰�(����)
		// �ڵ� ���
		try {
			arrayList.add(a, member);
		} catch (IndexOutOfBoundsException e) {
			System.out.println("�� ��ȣ�� ��Ȯ�� �Է����ּ���.");
		}
		
		
		
 	}
	
	public boolean removeMember(int memberID) {
		// ArrayList�� ����� memberID�� �˻��ؼ� �ش� ��ü�� ����
		for (int i = 0; i < arrayList.size(); i++) {
			Member member = arrayList.get(i);		// �� �濡�� Member ��ü�� ����Ǿ��ִ� ���� => Member ��ü�� member ���������� �Ҵ�
			int getId = member.getMemberID();		// ��ü�� getMemberID()�� ���� ��ü ������ memberID�� ������
			String getName = member.getMemberName();
			if (memberID == getId) {
				arrayList.remove(i);
				System.out.println(getName + " ���� ID " + memberID + " �� �����Ǿ����ϴ�.");
				return true;
			}
		}
		System.out.println("�Է��Ͻ� ID " + memberID + "�� �������� �ʽ��ϴ�.");
		return false;
	}
	
	public void showAllMember() {
		// ArrayList�� ����� ��� ����� ������ ����ϴ� method
		Object[] object = arrayList.toArray();
		
		for (int i = 0; i < object.length; i++) {
			System.out.print(object[i]);
		}
		System.out.println();
	}
	
	public void showSize() {
		System.out.println("���� List ���� �� : " + arrayList.size());
	}
}

public class Ex_MemberArrayList {

	public static void main(String[] args) {
		MemberArrayList memberArrayList = new MemberArrayList();
		Member memberHong = new Member(1001, "ȫ�浿");
		Member memberLee = new Member(1002, "������");
		Member memberSon = new Member(1003, "�չα�");
		Member memberPark = new Member(1004, "�ڼ���");
		
		
		memberArrayList.addMember(memberHong);		// �� ��ü�� �����ؼ� ArrayList�� ����
		memberArrayList.addMember(memberLee);
		memberArrayList.addMember(memberSon);
		memberArrayList.addMember(memberPark);
		
		memberArrayList.addMember2(2, memberSon);
		
		// Listsize
		memberArrayList.showSize();
		
		// Ư�� id�� ���� ����� ����
		memberArrayList.removeMember(1004);
		memberArrayList.removeMember(1006);
		
		// Listsize
		memberArrayList.showSize();
		
		// ��� ����� ���� ���
		memberArrayList.showAllMember();
		
		
		
		
		
	}

}
