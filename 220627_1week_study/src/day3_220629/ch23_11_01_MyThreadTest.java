package day3_220629;

class MyThread extends Thread {				// ������� Thread Ŭ������ ��ӹ޾Ƽ� �����ų �� ����.
	public void run() {						// ��, MyThread��� �̸��� Ŭ������ java.lang ��Ű���� �ִ� 
		for (int i = 10; i >= 0; i--)		// Thread Ŭ������ ��ӹ޾� run() �޼ҵ带 ���� �� �����带
			System.out.println(i + " ");	// �����ų �� ����.
	}										// �����, �⺻ java.lang ��Ű�� �ȿ� �ֱ� ������ ����
}											// import�� ���� �ʾƵ� �ٷ� ��� ������.

public class ch23_11_01_MyThreadTest {
	public static void main(String[] args) {
		Thread t = new MyThread();
		t.start();
	}
}
