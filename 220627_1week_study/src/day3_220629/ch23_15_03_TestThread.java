package day3_220629;

class MyRunnable2 implements Runnable {					// Runnable 인터페이스를 구현하여 스레드 설정
	String myName;
	public MyRunnable2(String name) { myName = name; }	// 스레드를 구분하기 위해 각각의 이름을 지정
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
// 실행 결과로 B10, A10, B9, A9... A0, B0 까지 나열되는데,
// 출력 형태는 실행할 때 마다 달라지는 것을 알 수 있음.
// 2개 이상의 스레드는 한개 끝나면 다른 한개의 스레드가 실행되는
// 순차적인 구조가 아니라, 타 스레드에 영향을 끼치지 않고
// 빨리 끝나는 스레드 먼저 출력되기 때문에 A스레드, B스레드가 무작위로 출력됨.

// 즉, 잡 스케쥴러에 의해 CPU에 할당되는 스레드가 빨리 처리되면 그만큼 빨리
// 출력이 되고, 늦게 출력이 되면 인터럽트를 당해 다른 스레드가 우선 연산되는
// 이유로 무작위의 스레드가 출력되게 됨.

// 한 마디로, 스레드를 t1, t2, t3 순서대로 작성했다고 하더라도 스레드의 출력 순서와는
// 전혀 무관하다는 것이고, 이를 "스레드 프로그래밍"이라고 함.
// 그리고 스레드 프로그래밍을 할때는 순차적으로 실행된다고 생각하