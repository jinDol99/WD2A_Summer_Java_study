package day3_220629;

class MyRunnable implements Runnable {		// �ٸ� �������, Runnable �������̽��� ����(implement)������
	public void run() {						// �����带 ����� �� ����. 
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