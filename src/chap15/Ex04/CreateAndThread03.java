package chap15.Ex04;

// Runnable interface의 run()을 구현해서 스레드 생성
class SMIFileRunnable implements Runnable {
	@Override
	public void run() {
		// 1. 자막 번호 기능
		String[] strArray = {"하나", "둘", "셋", "넷", "다섯"};
		
		try {Thread.sleep(10);} catch (InterruptedException e1) {}
		
		for (int i = 0; i < strArray.length; i++) {
			System.out.println(" - (자막번호) " + strArray[i]);
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {

			}
		}
	}
}

class VideoFileRunnable implements Runnable {
	@Override
	public void run() {
		// 2. 비디오 프레임 출력
		int[] intArray = {1, 2, 3, 4, 5};
		
		for (int i = 0; i < intArray.length; i++) {
			System.out.println(" - (비디오 프레임) " + intArray[i]);
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				
			}
		}
	}
}

public class CreateAndThread03 {

	public static void main(String[] args) {
		// 첫번째 객체 생성 후 시작
		Runnable smi = new SMIFileRunnable();
		// smi.start();		// start() method는 interface 내부에 존재하지 않음
		Thread thread = new Thread(smi);		// Runnable 객체를 Thread 생성자 내부에 넣어야 함
		thread.start();
		
		// 두번째 객체 생성 후 시작
		Runnable video = new VideoFileRunnable();
		Thread thread2 = new Thread(video);
		thread2.start();
	}

}
