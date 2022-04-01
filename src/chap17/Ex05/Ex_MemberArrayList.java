package chap17.Ex05;

import java.util.ArrayList;

class Member {		// DTO, VO : 각 계층간의 데이터를 받아서 전달해주는 class
	private int memberID;
	private String memberName;
	
	public Member(int memberID, String memberName) {		// 생성자를 통해서 필드값 할당
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
			return "입력하신 이름은 " + memberName + " 입니다." + " 회원님의 ID는 " + memberID + " 입니다. \n";
		}
}

class MemberArrayList {		// MemberArrayList를 객체화하면 ArrayList 객체가 생성됨
	private ArrayList<Member> arrayList;
	
	public MemberArrayList() {		// 기본 생성자
		arrayList = new ArrayList<Member>();
	}
	
	public void addMember(Member member) {		// Member 객체를 받아서 마지막 방에 값을 추가하는 method
		// 코드 블록
		arrayList.add(member);
	}
	
	public void addMember2(int a, Member member) {		// 매개 변수 2개를 받아서 특정 index 방 번호에 값을 추가(삽입)
		// 코드 블록
		try {
			arrayList.add(a, member);
		} catch (IndexOutOfBoundsException e) {
			System.out.println("방 번호를 정확히 입력해주세요.");
		}
		
		
		
 	}
	
	public boolean removeMember(int memberID) {
		// ArrayList에 저장된 memberID를 검색해서 해당 객체를 삭제
		for (int i = 0; i < arrayList.size(); i++) {
			Member member = arrayList.get(i);		// 각 방에는 Member 객체가 저장되어있는 상태 => Member 객체를 member 참조변수에 할당
			int getId = member.getMemberID();		// 객체의 getMemberID()을 통해 객체 내부의 memberID를 가져옴
			String getName = member.getMemberName();
			if (memberID == getId) {
				arrayList.remove(i);
				System.out.println(getName + " 님의 ID " + memberID + " 는 삭제되었습니다.");
				return true;
			}
		}
		System.out.println("입력하신 ID " + memberID + "는 존재하지 않습니다.");
		return false;
	}
	
	public void showAllMember() {
		// ArrayList에 저장된 모든 사용자 정보를 출력하는 method
		Object[] object = arrayList.toArray();
		
		for (int i = 0; i < object.length; i++) {
			System.out.print(object[i]);
		}
		System.out.println();
	}
	
	public void showSize() {
		System.out.println("현재 List 방의 수 : " + arrayList.size());
	}
}

public class Ex_MemberArrayList {

	public static void main(String[] args) {
		MemberArrayList memberArrayList = new MemberArrayList();
		Member memberHong = new Member(1001, "홍길동");
		Member memberLee = new Member(1002, "이지원");
		Member memberSon = new Member(1003, "손민국");
		Member memberPark = new Member(1004, "박서원");
		
		
		memberArrayList.addMember(memberHong);		// 각 객체를 생성해서 ArrayList에 저장
		memberArrayList.addMember(memberLee);
		memberArrayList.addMember(memberSon);
		memberArrayList.addMember(memberPark);
		
		memberArrayList.addMember2(2, memberSon);
		
		// Listsize
		memberArrayList.showSize();
		
		// 특정 id를 가진 사용자 제거
		memberArrayList.removeMember(1004);
		memberArrayList.removeMember(1006);
		
		// Listsize
		memberArrayList.showSize();
		
		// 모든 사용자 정보 출력
		memberArrayList.showAllMember();
		
		
		
		
		
	}

}
