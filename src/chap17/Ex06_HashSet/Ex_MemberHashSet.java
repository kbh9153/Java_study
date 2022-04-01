package chap17.Ex06_HashSet;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

// Member class의 memberID 컬럼을 eqauls(), hashCode()

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

class MemberHashSet {		// MemberArrayList를 객체화하면 ArrayList 객체가 생성됨
	private Set<Member> hashSet;
	
	public MemberHashSet() {		// 기본 생성자
		hashSet = new HashSet<Member>();
	}
	
	public void addMember(Member member) {		// Member 객체를 받아서 마지막 방에 값을 추가하는 method
		// 코드 블록
		hashSet.add(member);
	}
	
	public boolean removeMember(int memberID) {
		// ArrayList에 저장된 memberID를 검색해서 해당 객체를 삭제
		Iterator<Member> iterator = hashSet.iterator();
		while (iterator.hasNext()) {
			Member member = hashSet.iterator().next();
			int getMemberID = member.getMemberID();
			if (memberID == getMemberID) {
				iterator.remove();
			}
			return true;
		}
		
		System.out.println("입력하신 ID " + memberID + "는 존재하지 않습니다.");
		return false;
	}
	
	public void showAllMember() {
		// ArrayList에 저장된 모든 사용자 정보를 출력하는 method
		Object[] object = hashSet.toArray();
		for (Object k : object) {
			System.out.print(k);
		}
		
	}
	
	public void showSize() {
		System.out.println("현재 List 방의 수 : " + hashSet.size());
	}
}

public class Ex_MemberHashSet {

	public static void main(String[] args) {
		MemberHashSet memberHashSet = new MemberHashSet();
		Member memberHong = new Member(1001, "홍길동");
		Member memberLee = new Member(1002, "이지원");
		Member memberSon = new Member(1003, "손민국");
		Member memberPark = new Member(1004, "박서원");
//		Member memberHong = new Member(1001, "홍길동");
		
		
		memberHashSet.addMember(memberHong);		// 각 객체를 생성해서 ArrayList에 저장
		memberHashSet.addMember(memberLee);
		memberHashSet.addMember(memberSon);
		memberHashSet.addMember(memberPark);
		
		// 모든 사용자 정보 출력
		memberHashSet.showAllMember();
		
		// 특정 id를 가진 사용자 제거
		memberHashSet.removeMember(1004);
		
		System.out.println("--------------------------------------------");
		
		// 모든 사용자 정보 출력
		memberHashSet.showAllMember();
		
		System.out.println("--------------------------------------------");
		
		memberHashSet.showSize();
		
		
		
		
		
	}

}
