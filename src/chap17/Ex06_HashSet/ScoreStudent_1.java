package chap17.Ex06_HashSet;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * 1. �л� �� : 5(��). ������ ���� �Է����� �� ArrayList�� Capacity ũ������
 * 2. ���� �Է� : �Է¹��� �л� ���� ���� ���� �Է�. ArrayList�� ���� ��ü�� ����
 * 3. ���� List : ArrayList�� ����� Student ��ü�� �����ͼ� score ���
 * 4. �м� : �ְ����� : , ��� ���� :
 * 5. ����
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
            System.out.println("1.�л��� | 2.�����Է� | 3.��������Ʈ | 4.�м� | 5.����");
            System.out.println("----------------------------------------------------");
            System.out.println("����> ");
            int selectNo = scanner.nextInt();

            if(selectNo == 1) {
                System.out.println("�л����� �Է��ϼ��� : ");
                	//�ڵ� �ۼ�
                studentNum = scanner.nextInt();
                System.out.println("�Է¿Ϸ�");
                
            } else if(selectNo == 2) {
            		//�ڵ��ۼ�
            	for (int i = 0; i < studentNum; i++) {
            		System.out.println(i + 1 + "�� �л��� ������ �Է��ϼ���.");
            		int scoreInput = scanner.nextInt();
            		Student student = new Student(scoreInput);
            		arr.add(student);
            	}
            	System.out.println("�Է¿Ϸ�");
               
            } else if(selectNo == 3) {
            		//�ڵ��ۼ�
            	for (int i = 0; i < arr.size(); i++) {
            		System.out.println((i + 1) + "�� �л� ���� : " + arr.get(i).score + "��");
            	}
            	
            } else if(selectNo == 4) {
            	//�ڵ��ۼ�
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
              System.out.println("�ְ����� : " + maxScore + "��");
              
              System.out.println("������� : " + (float) sum / studentNum + "��");
         
            } else if(selectNo == 5) {
            	//�ڵ��ۼ�
            	break;
              }
        }
        scanner.close();
        System.out.println ("���α׷� ����");
	}
}
