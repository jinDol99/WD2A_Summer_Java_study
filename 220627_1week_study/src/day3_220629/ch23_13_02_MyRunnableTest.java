package day3_220629;

class MyRunnable implements Runnable {		// 다른 방법으로, Runnable 인터페이스를 구현(implement)함으로
	public void run() {						// 스레드를 사용할 수 있음. 
		for (int i = 10; i >= 0; i--)
			System.out.println(i + " ");
	}
}

public class ch23_13_02_MyRunnableTest {
	public static void main(String[] args) {
		Thread t = new Thread(new MyRunnable());
		t.start();
	}
}