package chap14.Ex02;

// ½ÇÇà ¿¹¿Ü (unChecked Exception, RunTime Exception) : ÄÄÆÄÀÏ ´Ü°è¿¡¼­´Â ¿¹¿Ü°¡ ¹ß»ıµÇÁö ¾Ê°í, ½ÇÇà½Ã¿¡ ¿¹¿Ü°¡ ¹ß»ı 

class AA {
	
}

class BB extends AA {
	
}

public class unCheckedException {

	public static void main(String[] args) {
		// ½ÇÇà ¿¹¿Ü
		
		// ArithmeticException : 0À¸·Î ¾î¶² ¼ö¸¦ ³ª´°¼ÀÇÒ ½Ã ¿À·ù ¹ß»ı 
		// System.out.println(10 / 0);
		
		// ClassCastException : classÀÇ Å¸ÀÔÀ» º¯È¯ÇÒ ¶§ º¯È¯µÇÁö ¾Ê´Â ¿¹¿Ü ¹ß»ı
		AA aa = new AA();
		// BB bb = (BB) aa;		// ÄÄÆÄÀÏ ´Ü°è¿¡¼­´Â ¿À·ù¹ß»ı ÇÏÁö ¾ÊÀ½
		
		// ArrayIndexOutOfBoundsException : ¹è¿­¿¡¼­ Á¸ÀçÇÏÁö ¾Ê´Â ¹æ¹øÈ£¸¦ Ãâ·ÂÇÒ °æ¿ì ¿¹¿Ü ¹ß»ı 
		int[] array = {1, 2, 3};
		// System.out.println(array[3]);
		
		// NumberFormatException : ¹®ÀÚÇü ¼ıÀÚ¸¦ Á¤¼öÅ¸ÀÔÀ¸·Î º¯È¯ÇÒ ¼ö ¾ø´Â ¿¹¿Ü ¹ß»ı
		// int num = Integer.parseInt("10!");		// ¹®ÀÚ¿© ¤© 10À» Á¤¼ö·Î º¯È¯
		// System.out.println(num);
		
		// NullPointerException : °´Ã¼°ªÀÌ nullÀÎµ¥ method¸¦ È£­„¶ó´Â °æ¿ì ¿¹¿Ü ¹ß»ı
		String str = null;
		System.out.println(str.charAt(3));

	}

}
