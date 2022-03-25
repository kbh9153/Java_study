package chap15.Ex05;

// 객체 생성없이 익명 객체를 사용하여 스레드 생성 => 제일 많이 사용하는 방식

public class CreateAndStartThread04 {
	public static void main(String[] args) {
		// 자막 번호 출력 - 스레드
		Thread thread1 = new Thread(
			new Runnable() {
				public void run() {
					String[] strArray = {"하나", "둘", "셋", "넷", "다섯"};
					
					try {Thread.sleep(10);} catch (InterruptedException e1) {}
					
					for (int i = 0; i < strArray.length; i++) {
						System.out.println(" - (자막번호) " + strArray[i]);
						try {
							Thread.sleep(200);
						} catch (InterruptedException e) {

						}
					}
				};
			}
		);
		
		
		// 비디오 프레임 출력 - 스레드
		Thread thread2 = new Thread(
			new Runnable() {
				public void run() {
					int[] intArray = {1, 2, 3, 4, 5};
					
					for (int i = 0; i < intArray.length; i++) {
						System.out.println(" - (비디오 프레임) " + intArray[i]);
						try {
							Thread.sleep(200);
						} catch (InterruptedException e) {
							
						}
					}
				};
			}
		);
		
		// 3. 스레드 시작
		thread1.start();
		thread2.start();
	}
}
