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
			new Student(20090001, "��ö��"),
			new Student(20090002, "��ö��"),
			new Student(20090003, "��ö��"),
		};
		List<Student> list = Arrays.asList(array);
		Collections.sort(list);
		// �����ϴ� ���߿� compareTo()�� �����.
		// �� ��, ���� ������ �Ϸ��� �� �� �Ʒ��� �ڵ�ó�� �����ϸ� ��.
		// Collections.sort(list, Collections.reverseOrder());
		System.out.println(list);
	}
}
