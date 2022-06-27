package day1_220627;
import java.util.*;

public class ch22_77_13_Search {
	public static void main(String[] args) {
		int key = 50;
		List<Integer> list = new ArrayList<Integer>();
		for(int i = 0; i < 100; i++)
			list.add(i);
		int index = Collections.binarySearch(list, key);
		// 이진 탐색하여 list에서 key의 위치를 반환.
		
		System.out.println("탐색의 반환값 = " + index);
	}
}