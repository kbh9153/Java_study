package chap15.Ex01;



public class TheNeedForThread {

	public static void main(String[] args) {
		// 1. 비디오 프레임 : 1 ~ 5
		int[] intArray = {1, 2, 3, 4, 5};
		
		// 2. 자막 프레임 : 하나 둘 셋 넷 다섯
		String[] strArray = {"하나", "둘", "셋", "넷", "다섯"};

		// 3. 비디오 프레임 출력
		System.out.print("(비디오 프레임) ");
		
		for (int i = 0; i < intArray.length; i++) {
			System.out.print(intArray[i] + " ");
			try {
				Thread.sleep(200);		// 0.2초동안 일시정지. Thread.sleep 단위 : 1000ms
			} catch (InterruptedException e) {
				
			}
		}
		System.out.println();
		System.out.println("-----------------------");
		
		// 4. 자막 프레임 출력
		System.out.print("(자막번호) ");
		
		for (int i = 0; i < strArray.length; i++) {
			System.out.print(strArray[i] + " ");
			try {
				Thread.sleep(200);		// 0.2초동안 일시정지. Thread.sleep 단위 : 1000ms
			} catch (InterruptedException e) {
				
			}
		}
	}

}
