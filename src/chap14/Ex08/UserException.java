package chap14.Ex08;

/*
 * 1. Exception을 상속 받는 사용자 예외 : 일반 예외
 * 	1-1. 점수가 음수인 경우 예외
 * 	1-2. 점수에 100점을 초과한 경우 예외 
 */

class MinusException extends Exception {		// 음수가 입력될 경우 강제 발생
	public MinusException() {
		super();		// 부모의 생성자 호출 (= Exception)
	}
	
	public MinusException(String msg) {			// 예외 메세지 출력, e.getMessage();
		super(msg);
	}
}

class OverException extends Exception {			// 100을 초과한 값을 입력될 경우 강제 발생
	public OverException() {
		super();
	}
	
	public OverException(String msg) {			// 예외 메세지 출력, e.getMessage();
		super(msg);
	}
}

class AAA {
	int score;
	
	void checkScore (int score) throws MinusException, OverException {
		if (score < 0) {
			throw new MinusException("예외 발생 : 음수는 입력할 수 없습니다.");
		} else if (score > 100) {
			throw new OverException("예외 발생 : 100점을 초과하여 입력할 수 없습니다.");
		} else {
			System.out.println("정상적으로 입력되었습니다.");
			this.score = score;
			System.out.println("Score : " + this.score);
		}
	}
}

public class UserException {

	public static void main(String[] args) {
		AAA a = new AAA();
		
		try {
			a.checkScore(-100);		// 음수값 입력
		} catch (MinusException | OverException e) {
			// e.printStackTrace();		// 예외 정보 출력
			System.out.println(e.getMessage());		// 예외 문구 출력
		}
		
		System.out.println("-------------------------------------");
		
		try {
			a.checkScore(200);
		} catch (MinusException | OverException e) {
			// e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
		System.out.println("-------------------------------------");
		
		try {
			a.checkScore(99);
		} catch (MinusException | OverException e) {
			// e.printStackTrace();
			System.out.println(e.getMessage());
		}

	}

}
