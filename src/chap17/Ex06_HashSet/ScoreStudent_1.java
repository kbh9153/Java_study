package chap17.Ex06_HashSet;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * 1. 학생 수 : 5(명). 임의의 값을 입력했을 때 ArrayList의 Capacity 크기지정
 * 2. 점수 입력 : 입력받은 학생 수에 따라서 점수 입력. ArrayList에 각각 객체를 저장
 * 3. 점수 List : ArrayList에 저장된 Student 객체를 가져와서 score 출력
 * 4. 분석 : 최고점수 : , 평균 점수 :
 * 5. 종료
 */

class Student{
	int score;
	Student(int score) {
		this.score = score;
	}
}

public class ScoreStudent_1 {

	public static void main(String[] args) {
		
        ArrayList<Student> arr = new ArrayList<Student>();
        
        boolean run = true;
        int studentNum = 0;
        Scanner scanner = new Scanner(System.in);
        while(run) {
        	
            System.out.println("----------------------------------------------------");
            System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
            System.out.println("----------------------------------------------------");
            System.out.println("선택> ");
            int selectNo = scanner.nextInt();

            if(selectNo == 1) {
                System.out.println("학생수를 입력하세요 : ");
                	//코드 작성
                studentNum = scanner.nextInt();
                System.out.println("입력완료");
                
            } else if(selectNo == 2) {
            		//코드작성
            	for (int i = 0; i < studentNum; i++) {
            		System.out.println(i + 1 + "번 학생의 점수를 입력하세요.");
            		int scoreInput = scanner.nextInt();
            		Student student = new Student(scoreInput);
            		arr.add(student);
            	}
            	System.out.println("입력완료");
               
            } else if(selectNo == 3) {
            		//코드작성
            	for (int i = 0; i < arr.size(); i++) {
            		System.out.println((i + 1) + "번 학생 점수 : " + arr.get(i).score + "점");
            	}
            	
            } else if(selectNo == 4) {
            	//코드작성
            	int maxScore = 0;
            	int sum = 0;
            	for (int i = 0; i < arr.size(); i++) {
            		if (maxScore < arr.get(i).score) {
            			maxScore = arr.get(i).score;
            		}
                }
            	
            	for (int i = 0; i < arr.size(); i++) {
            		sum += arr.get(i).score;
            	}
              System.out.println("최고점수 : " + maxScore + "점");
              
              System.out.println("평균점수 : " + (float) sum / studentNum + "점");
         
            } else if(selectNo == 5) {
            	//코드작성
            	break;
              }
        }
        scanner.close();
        System.out.println ("프로그램 종료");
	}
}
