package Ex;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		/*
		 * 문항 11. 다음 코드와 같이 과목의 점수가 짝을 이루도록 2개의 배열을 작성하라. String course[] = {"kava", "C++",
		 * "HTML5", "컴퓨터구조", "안드로이드}; int score[] = {95, 88, 76, 62, 55};
		 */

		String course[] = {"Java", "C++", "HTML5", "컴퓨터구조", "안드로이드"};
		int score[] = {95, 88, 76, 62, 55};
		Scanner sc = new Scanner(System.in);
		String name;
		int i;
		int k;
		while (true) {
			k = 0;
			System.out.println("과목명을 말해주세요!");
			name = sc.next();
			
			if (name.equals("Stop")) {
				System.out.println("시스템을 종료합니다.");
				break;
			}
			
			for (i = 0; i < course.length; i++) {
				if (course[i].equals(name)) {
					System.out.println(name + "의 점수는 " + score[i]);
					k = 1;
				}
			}
			
			if (k == 0) {
				System.out.println("폐기된 과목입니다.");
			}
		}
		sc.close();
	}

}
