package day3_220629;

class MyRunnable2 implements Runnable {					// Runnable �������̽��� �����Ͽ� ������ ����
	String myName;
	public MyRunnable2(String name) { myName = name; }	// �����带 �����ϱ� ���� ������ �̸��� ����
	public void run() {
		for (int i = 10; i >= 0; i--)
			System.out.print(myName + i + " ");
	}
}

public class ch23_15_03_TestThread {
	public static void main(String[] args) {
		Thread t1 = new Thread(new MyRunnable2("A"));
		Thread t2 = new Thread(new MyRunnable2("B"));
		Thread t3 = new Thread(new MyRunnable2("C"));
		t1.start();
		t2.start();
		t3.start();
	}
}
// ���� ����� B10, A10, B9, A9... A0, B0 ���� �����Ǵµ�,
// ��� ���´� ������ �� ���� �޶����� ���� �� �� ����.
// 2�� �̻��� ������� �Ѱ� ������ �ٸ� �Ѱ��� �����尡 ����Ǵ�
// �������� ������ �ƴ϶�, Ÿ �����忡 ������ ��ġ�� �ʰ�
// ���� ������ ������ ���� ��µǱ� ������ A������, B�����尡 �������� ��µ�.

// ��, �� �����췯�� ���� CPU�� �Ҵ�Ǵ� �����尡 ���� ó���Ǹ� �׸�ŭ ����
// ����� �ǰ�, �ʰ� ����� �Ǹ� ���ͷ�Ʈ�� ���� �ٸ� �����尡 �켱 ����Ǵ�
// ������ �������� �����尡 ��µǰ� ��.

// �� �����, �����带 t1, t2, t3 ������� �ۼ��ߴٰ� �ϴ��� �������� ��� �����ʹ�
// ���� �����ϴٴ� ���̰�, �̸� "������ ���α׷���"�̶�� ��.
// �׸��� ������ ���α׷����� �Ҷ��� ���������� ����ȴٰ� ������