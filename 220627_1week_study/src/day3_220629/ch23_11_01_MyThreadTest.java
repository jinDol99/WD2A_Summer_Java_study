package day3_220629;

class MyThread extends Thread {				// 스레드는 Thread 클래스를 상속받아서 실행시킬 수 있음.
	public void run() {						// 즉, MyThread라는 이름의 클래스에 java.lang 패키지에 있는 
		for (int i = 10; i >= 0; i--)		// Thread 클래스를 상속받아 run() 메소드를 통해 새 스레드를
			System.out.println(i + " ");	// 실행시킬 수 있음.
	}										// 참고로, 기본 java.lang 패키지 안에 있기 때문에 따로
}											// import를 하지 않아도 바로 사용 가능함.

public class ch23_11_01_MyThreadTest {
	public static void main(String[] args) {
		Thread t = new MyThread();
		t.start();
	}
}
