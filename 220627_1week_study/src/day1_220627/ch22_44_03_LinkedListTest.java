package day1_220627;

import java.util.LinkedList;

public class ch22_44_03_LinkedListTest {
	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>();
		
		list.add("�̾�");
		list.add("�ꎥ");
		list.add("����");
		list.add(1, "�־ƻ���");
		list.set(2, "�׷���");
		list.remove(3);
		
		for(int i = 0; i < list.size(); i++)
			System.out.println(list.get(i));
	}
}
