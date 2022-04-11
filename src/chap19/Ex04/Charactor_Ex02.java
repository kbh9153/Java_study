package chap19.Ex04;

/*
 * A ~ Z까지의 아스키 코드값 출력
 * 
 * ex)
 * A, 65
 * B, 66
 * ...
 * Z, 90
 */

public class Charactor_Ex02 {
	
	public static void main(String[] args) {
		  char[] Al_L = new char[26];
	      int As1;
	      
	      char[] Al_S = new char[26];
	      int As2;
	      
	      for(int i = 0; i < Al_L.length; i++) {
	         Al_L[i] = (char)('A' + i);
	         As1 = (int)Al_L[i];
	         System.out.println(Al_L[i] + ", " + As1);
	      }
	      
	      for(int i = 0; i < Al_L.length; i++) {
	         Al_S[i] = (char)('a' + i);
	         As2 = (int)Al_S[i];
	         System.out.println(Al_S[i] + ", " + As2);
	      }
	}
}
