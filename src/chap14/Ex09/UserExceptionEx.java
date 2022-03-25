package chap14.Ex09;

class AllException extends Exception {
	public AllException() {
		super();
	}
	
	public AllException(String value) {
		super(value);
	}
	
}

class A {
	private String season;		// 봄, 여름, 가을, 겨울 외 값이 입력될 경우 예외 발생
	private String week;		// 월, 화, 수, 목, 금, 토, 일 외 값이 입력될 경우 예외 발생
	private int scoreKor;		// 0 ~ 100 범위 외 값이 입력될 경우 예외 발생
	private int scoreEng;		// 0 ~ 100 범위 외 값이 입력될 경우 예외 발생
	private String userID;		// 12 ~ 20자 범위 외 문자값이 입력될 경우 예외 발생
	
	void info (String season, String week, int scoreKor, int scoreEng, String userID) throws AllException {
		
		if (!season.equals("봄") && !season.equals("여름") && !season.equals("가을") && !season.equals("겨울")) {
			throw new AllException("예외 발생 : 봄, 여름, 가을, 겨울 중에서 입력하여야만 합니다.");
		} else if (!week.equals("월") && !week.equals("화") && !week.equals("수") && !week.equals("목") && !week.equals("금") && !week.equals("토") && !week.equals("일")) {
			throw new AllException("예외 발생 : 월 ~ 일요일 중에서 입력하여야만 합니다.");
		} else if (scoreKor < 0 || scoreKor > 100) {
			throw new AllException("예외 발생 : 0 ~ 100점 범위에서 입력하여야만 합니다.");
		} else if (scoreEng < 0 || scoreEng > 100) {
			throw new AllException("예외 발생 : 월 ~ 일요일 중에서 입력하여야만 합니다.");
		} else if (userID == null || userID.length() < 12 || userID.length() > 20 ) {
			throw new AllException("예외 발생 : 12 ~ 20자 범위에서 입력하여야 합니다.");
		} else {
			this.season = season;
			this.week = week;
			this.scoreKor = scoreKor;
			this.scoreEng = scoreEng;
			System.out.println("정상적으로 입력되었습니다.\n");
		}
		System.out.printf("계절 : " + season + "\n요일 : " + week + "요일\n국어점수 : " + scoreKor + "점\n영어점수 : " + scoreEng + "점");
	}
}

public class UserExceptionEx {

	public static void main(String[] args) {
		A a = new A();
		
		try {
			a.info("가을", "화", 100, 80, "123456789101112");
		} catch (AllException e) {
			System.out.println(e.getMessage());
		}
		
	}

}
