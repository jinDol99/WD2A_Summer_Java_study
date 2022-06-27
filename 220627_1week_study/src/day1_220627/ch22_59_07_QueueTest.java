package day1_220627;
import java.util.*;

public class ch22_59_07_QueueTest {
	public static void main(String[] args) throws InterruptedException {
		int time = 10;
		Queue<Integer> queue = new LinkedList<Integer>();
		for(int i = time; i>= 0; i--)
			queue.add(i);
		while(!queue.isEmpty()) {
			System.out.print(queue.remove()+ " ");
			Thread.sleep(1000); // 현재의 스레드를 1초간 재움.
		}
	}
}