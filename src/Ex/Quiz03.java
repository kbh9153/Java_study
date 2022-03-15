package Ex;

class Student {			// Java는 다중 상속이 불가. 부모 class는 한개만 가능. Java의 모든 class는 Object의 자식 class임
							// Object class에서 정의한 필드나 method를 재사용할 수 있음
	String name; 		// 학생이름
	int studentID; 		// 학번
	int kor; 			// 국어점수
	int eng; 			// 영어점수
	int math;			 // 수학점수
	
	int sum; 			// 점수 합계
	double avg;			 // 점수 평균

	void hobby() {
		System.out.println("각 학생의 취미는 입니다");
	}

	@Override
	public String toString() {		// Object class의 method, 객체 자체를 출력할 때 [패키지명.class이름@메모리 해쉬코드]
		return "이름 : " + name + "\n" + "학번 : " + studentID + "\n" + "국어점수 : " + kor + "\n" + "영어점수 : " + eng + "\n"
				+ "수학점수 : " + math + "\n" + "점수 합계 : " + sum + "\n" + "점수 평균 : " + avg + "\n";
	}

}

class S_철수 extends Student {
	S_철수(String name, int StudentID, int kor, int eng, int math) {			// 생성자 1. class 이름과 동일, 2. return 타입이 없어야함
		super.name = name;
		super.studentID = StudentID;
		super.kor = kor;
		super.eng = eng;
		super.math = math;
		
		// super.sum = kor + eng + math;
		// super.avg = (double) sum / 3;		// 평균을 계산할 때는 (double)로 캐스팅
	}

	@Override
	void hobby() {
		System.out.println("철수의 취미는 낚시 입니다.");
	}

}

class S_영희 extends Student {
	S_영희(String name, int StudentID, int kor, int eng, int math) {
		super.name = name;
		super.studentID = StudentID;
		super.kor = kor;
		super.eng = eng;
		super.math = math;
		
		// super.sum = kor + eng + math;
		// super.avg = (double) sum / 3;		// 평균을 계산할 때는 (double)로 캐스팅
	}

	@Override
	void hobby() {
		System.out.println("영희의 취미는 뜨개질 입니다.");
	}

}

class S_영식 extends Student {
	S_영식(String name, int StudentID, int kor, int eng, int math) {
		super.name = name;
		super.studentID = StudentID;
		super.kor = kor;
		super.eng = eng;
		super.math = math;
		
		// super.sum = kor + eng + math;
		// super.avg = (double) sum / 3;		// 평균을 계산할 때는 (double)로 캐스팅
	}

	@Override
	void hobby() {
		System.out.println("영식의 취미는 만화보기 입니다.");
	}

}

public class Quiz03 {

	public static void main(String[] args) {
		   Student 철수 = new S_철수("철수", 20220314, 100, 95, 80);
		   Student 영희 = new S_영희("영희", 20220314, 98, 95, 90);
		   Student 영식 = new S_영식("영식", 20220314, 85, 91, 93);
		   
		   Student[] array = {철수, 영희, 영식};
		   
		   for (int i = 0; i < array.length; i++) {
			   int count = array.length;
			   array[i].sum = array[i].kor + array[i].eng + array[i].math;
			   array[i].avg = (double) array[i].sum / count;
			   array[i].hobby();
			   System.out.println(array[i]);
		   }
		   
		   for (Student k : array) {
			   int count = array.length;
			   k.sum = k.kor + k.eng + k.math;
			   k.avg = (double) k.sum / count;
			   k.hobby();
			   System.out.println(k);
		   }
		   
	   }

}
