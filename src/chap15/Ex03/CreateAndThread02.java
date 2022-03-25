package chap15.Ex03;

// 2번째 스레드 (index 번호 : 0)
class SMIFileThrad extends Thread {		// 자막 파일 처리하는 스레드
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

// 3번째 스레드 (index 번호 : 1)
class VideoFileThread extends Thread {		// 비디오 파일 처리하는 스레드
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

public class CreateAndThread02 {

	// 첫번째 스레드
	public static void main(String[] args) {
		// SMIFileThread 객체 시작
		Thread smi = new SMIFileThrad();
		smi.start();
		
		// VideoFileThread 객체 시작
		Thread video = new VideoFileThread();
		video.start();

	}

}
