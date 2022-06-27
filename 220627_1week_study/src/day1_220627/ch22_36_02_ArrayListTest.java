package day1_220627;
import java.util.*;

public class ch22_36_02_ArrayListTest {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("MILK");
		list.add("BREAD");
		list.add("BUTTER");
		list.add(1, "APPLE");	// 인덱스 1에 "APPLE"을 삽입
		list.set(2, "GRAPE");	// 인덱스 2의 원소를 "GRAPE"로 대체
		list.remove(3);			// 인덱스 3의 원소를 삭제
		
		for (int i = 0; i < list.size(); i++)
			System.out.println(list.get(i));
		
		ArrayList<String> list = new ArrayList<String>();
		list.add("하나");
		list.add("둘");
		list.add("셋");
		list.add("넷");
		
		String s;		
		Iterator e = list.iterator();
		while(e.hasNext()) {		// 다음 원소가 있는 동안(e.hasNext()) 아래 코드 반복
			s = (String)e.next();	// 반복자는 Object 타입을 반환
			System.out.println(s);	// 다음 원소를 얻음.
		}
	}
}
