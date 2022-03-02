package Ex;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		// 문항 12. 가위바위보 게임

		Scanner sc = new Scanner(System.in);
		String str[] = { "가위", "바위", "보" };
		System.out.println("컴퓨터와 가위바위보 게임을 합니다.");
		while (true) {
			int k = (int) (Math.random() * 3);
			System.out.print("가위 바위 보");
			String play = sc.next();
			if (play.equals("Stop")) {
				System.out.println("게임종료");
				break;
			}
			System.out.print("사용자는 " + play + ", 컴퓨터 = " + str[k] + ", ");
			
			if (play.equals("가위")) {
				if (str[k].equals("가위")) {
					System.out.println("무승부");
				} else if (str[k].equals("바위")) {
					System.out.println("컴퓨터 win");
				} else if (str[k].equals("보")) {
					System.out.println("사용자 win");
				}
			} else if (play.equals("바위")) {
				if (str[k].equals("가위")) {
					System.out.println("사용자 win");
				} else if (str[k].equals("바위")) {
					System.out.println("무승부");
				} else if (str[k].equals("보")) {
					System.out.println("컴퓨터 win");
				}
			} else if (play.equals("보")) {
				if (str[k].equals("가위")) {
					System.out.println("컴퓨터 win");
				} else if (str[k].equals("바위")) {
					System.out.println("사용자 win");
				} else if (str[k].equals("보")) {
					System.out.println("무승부");
				}
			} else {
				System.out.println("Error");
			}

		}
		sc.close();
	}

}
