package day1_220627;
import java.util.*;

public class ch22_66_09_WordFreq {
	public static void main(String[] args) {
		Map<String, Integer> m = new HashMap<String, Integer>();
		// Map 객체 생성
		
		String[] sample = { "to", "be", "or", "not", "to", "be", "is", "a", "problem"};
		// 문자열에 포함된 단어의 빈도 계산
		for (String a : sample) {
			Integer freq = m.get(a);
			m.put(a, (freq == null) ? 1 : freq + 1);
			// 단어를 꺼내서 빈도(freq)를 증가시킴
		}
		
		System.out.println(m.size() + "단어가 있습니다.");
		System.out.println(m.containsKey("to"));
		System.out.println(m.isEmpty());
		System.out.println(m);
	}
}