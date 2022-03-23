package chap14.Ex01;

// Exception이 예외의 최상위 class
// ArrayIndexOutOfBoundsException도 Exception을 상속

public class ArrayIndexOutOfBoundsException02 {

	public static void main(String[] args) {
		int[] arr = new int[5];		// arr 배열에 배열방 5개를 생성. index : 0, 1, 2, 3, 4
				
			try {
				for (int i = 0; i <= 5; i++) {
					arr[i] = i;
					System.out.println(arr[i]);
				}
			} catch(Exception e) {		// 하위에 모든 예외(Exception)을 처리 가능
				e.printStackTrace();		// 예외에 대한 정보 출력
				System.out.println("배열의 인덱스 방번호를 초과하였습니다.");
			} finally {
				System.out.println("출력 (finally)");
			}

	}

}
