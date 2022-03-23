package chap14.Ex05;

// 자동 리소스(객체 and 메모리) 제거

// 필드의 값 할당. 생성자 호출시 필드의 값을 부여

class Abc implements AutoCloseable {
	String name;
	int studentID;
	int kor;
	int eng;
	int math;
	double avg;		// 평균 계산
	
	Abc (String name, int studentID, int kor, int eng, int math) {
		this.name = name;
		this.studentID = studentID;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
//		this.avg = (double)(kor + eng + math) / 3;
	}
	
	@Override
	public void close() throws Exception {
		System.out.println("이름 : " + name);
		System.out.println("학번 : " + studentID);
		System.out.println("국어점수 : " + kor);
		System.out.println("영어점수 : " + eng);
		System.out.println("수학점수 : " + math);
		System.out.println("평균점수 : " + (double)(kor + eng + math) / 3);
		
		if (name != null || kor != 0 || eng != 0 || math != 0 || avg != 0) {
			name = null;
			kor = 0;
			eng = 0;
			math = 0;
			avg = 0;
			System.out.println();
			System.out.println("리소스가 해제되었습니다.");
		
		}
	
	}

}	

public class Ex_TryWithResource03 {

	public static void main(String[] args) {
		// 1. 객체의 모든 필드를 초기화하고 자동 close();
		try (Abc aa = new Abc("홍길동", 20220323, 95, 98, 97);) {
			
		} catch (Exception e) {
			System.out.println("예외 발생");
			e.printStackTrace();
		}
		
		System.out.println("----------------------------");
		
		// 2. 수동 close(), finally 블록에서 close() 호출
		Abc aaa = null;
		
		try {
			aaa = new Abc("신사임당", 20220321, 91, 93, 95);
		} catch (Exception e) {
			System.out.println("예외 발생");
		} finally {
			if (aaa.name != null) {
				try {
					aaa.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
	}
}
