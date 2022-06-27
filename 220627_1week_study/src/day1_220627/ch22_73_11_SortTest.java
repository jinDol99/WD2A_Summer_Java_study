package day1_220627;
import java.util.*;

class Student implements Comparable<Student> {
	int number;
	String name;
	
	public Student(int number, String name) {
		this.number = number;
		this.name = name;
	}
	
	public String toString() {
		return name;
	}
	
	public int compareTo(Student s) {
		return number - s.number;
	}
}

public class ch22_73_11_SortTest {
	public static void main(String[] args) {
		Student array[] = {
			new Student(20090001, "김철수"),
			new Student(20090002, "이철수"),
			new Student(20090003, "박철수"),
		};
		List<Student> list = Arrays.asList(array);
		Collections.sort(list);
		// 정렬하는 도중에 compareTo()를 사용함.
		// 이 때, 역순 정렬을 하려고 할 땐 아래의 코드처럼 수정하면 됨.
		// Collections.sort(list, Collections.reverseOrder());
		System.out.println(list);
	}
}
