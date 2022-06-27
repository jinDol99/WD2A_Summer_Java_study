package day1_220627;
import java.util.*;

public class ch22_36_02_ArrayListTest {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("MILK");
		list.add("BREAD");
		list.add("BUTTER");
		list.add(1, "APPLE");	// �ε��� 1�� "APPLE"�� ����
		list.set(2, "GRAPE");	// �ε��� 2�� ���Ҹ� "GRAPE"�� ��ü
		list.remove(3);			// �ε��� 3�� ���Ҹ� ����
		
		for (int i = 0; i < list.size(); i++)
			System.out.println(list.get(i));
		
		ArrayList<String> list = new ArrayList<String>();
		list.add("�ϳ�");
		list.add("��");
		list.add("��");
		list.add("��");
		
		String s;		
		Iterator e = list.iterator();
		while(e.hasNext()) {		// ���� ���Ұ� �ִ� ����(e.hasNext()) �Ʒ� �ڵ� �ݺ�
			s = (String)e.next();	// �ݺ��ڴ� Object Ÿ���� ��ȯ
			System.out.println(s);	// ���� ���Ҹ� ����.
		}
	}
}
