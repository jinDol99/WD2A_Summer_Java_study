package day1_220627;
import java.util.*;

public class ch22_75_12_Shuffle {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 1; i <= 10; i++)
			list.add(i);
		Collections.shuffle(list);	// 순서를 무작위로 만듦
		System.out.println(list);
	}
}