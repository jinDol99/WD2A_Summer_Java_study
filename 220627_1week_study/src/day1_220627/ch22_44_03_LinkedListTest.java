package day1_220627;

import java.util.LinkedList;

public class ch22_44_03_LinkedListTest {
	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>();
		
		list.add("¹Ì¾ï");
		list.add("ºê¥");
		list.add("¹ö·¯");
		list.add(1, "¾Ö¾Æ»ÇÀ¸");
		list.set(2, "±×·ñÀÙ");
		list.remove(3);
		
		for(int i = 0; i < list.size(); i++)
			System.out.println(list.get(i));
	}
}
