package chap14.Ex08;

// ID의 값을 null의 경우 Exception 발생
// user ID가 8자리 이상 20자리 이하가 아닌경우 Exception 밟생

// 일반 예외
class IDFormatException extends Exception {		// 2개의 생성자만 구성
	public IDFormatException() {
		super();
	}
	
	public IDFormatException(String msg) {		// 예외 발생시 예외메세지가 출력, e.getMessage();
		super(msg);
	}
}

public class IDFormatTest {
	private String userID;		// 체크 : null, 8자리 이상 20자리 이하가 아닌 경우 Exception 바생
		// userID는 캡슐화되어있는 상태. private : 외부나 다른 class에서 접근 차단
			// 생성자. setter를 사용해서 값을 할당
		// private으로 설정된 경우 : getter and setter를 사용하여 값을 입력하거나 사용 가능
	
	public String getUserID() {		// method 호출시 메모리의 userID를 던져줌
		return "ID : " + userID;
	}
	
	
	public void setUserID(String userID) throws IDFormatException {		// setter : 메모리 값을 할당
		
		if (userID == null) {
			throw new IDFormatException("ID는 null일 수 없습니다.");
		} else if (userID.length() < 8 || userID.length() > 20) {
			throw new IDFormatException("ID는 8자 이상 20자 이하로 사용 가능합니다.");
		} else {
			System.out.println("정상적으로 잘 입력되었습니다.");
		}
		this.userID = userID;
	}

	public static void main(String[] args) {
		IDFormatTest test = new IDFormatTest();
		
		// userID가 null인 경우
		String userID = null;
		
		try {
			test.setUserID(userID);		// setter 호출시 null 값을 입력 후 호출
		} catch (IDFormatException e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("--------------------------------");
		
		userID = "1234567";
		
		try {
			test.setUserID(userID);
		} catch (IDFormatException e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("--------------------------------");
		
		// 3. null이 아니고 8자 이상 20자 미만
		
		userID = "123456789";
		
		try {
			test.setUserID(userID);
		} catch (IDFormatException e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println();
		System.out.println(test.getUserID());
	}

}
