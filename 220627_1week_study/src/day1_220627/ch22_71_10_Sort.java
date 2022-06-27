package day1_220627;
import java.util.*;

public class ch22_71_10_Sort {
	public static void main(String[] args) {
		String[] sample = {"i", "walk", "the", "line" };
		List<String> list = Arrays.asList(sample);
		Collections.sort(list);
		System.out.println(list);
	}
}