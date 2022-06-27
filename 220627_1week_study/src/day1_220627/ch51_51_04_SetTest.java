package day1_220627;
import java.util.*;

public class ch51_51_04_SetTest {
	public static void main(String[] args) {
		HashSet<String> set = new HashSet<String>();
		
		set.add("Milk");
		set.add("Bread");
		set.add("Butter");
		set.add("Cheese");
		set.add("Ham");
		set.add("Ham");
		
		System.out.println(set);
		// [Ham, Butter, Cheese, Milk, Bread]
		// set의 경우, 중복을 허용하지 않기 때문에 Ham 값이 하나만 출력됨.
		
		
		LinkedHashSet<String> set2 = new LinkedHashSet<String>();
		
		set2.add("Milk");
		set2.add("Bread");
		set2.add("Butter");
		set2.add("Cheese");
		set2.add("Ham");
		set2.add("Ham");
		
		System.out.println(set2);
		// [Milk, Bread, Butter, Cheese, Ham]
		// LinkedHashSet의 경우, 중복을 허용하지 않으며 원소가 삽입된
		// 순서대로 출력되는 것이 특징.
		
		
		HashSet<String> set3 = new HashSet<String>();
		
		set3.add("Milk");
		set3.add("Bread");
		set3.add("Butter");
		set3.add("Cheese");
		set3.add("Ham");
		set3.add("Ham");
		
		System.out.println(set3);
		// [Ham, Butter, Cheese, Milk, Bread]
		
	}

}
