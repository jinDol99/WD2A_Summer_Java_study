package day1_220627;
import java.util.*;

public class ch22_77_13_Search {
	public static void main(String[] args) {
		int key = 50;
		List<Integer> list = new ArrayList<Integer>();
		for(int i = 0; i < 100; i++)
			list.add(i);
		int index = Collections.binarySearch(list, key);
		// ���� Ž���Ͽ� list���� key�� ��ġ�� ��ȯ.
		
		System.out.println("Ž���� ��ȯ�� = " + index);
	}
}