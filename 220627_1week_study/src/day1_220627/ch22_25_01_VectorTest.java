package day1_220627;
import java.util.Vector;

public class ch22_25_01_VectorTest {
	public static void main(String[] args) {
		
		Vector vc = new Vector();
		// 벡터 객체를 생성할 때, 크기를 지정하지 않아도 됨.
		// 물론 크기를 줄 수도 있음.
		
		vc.add("Hello World");
		vc.add(new Integer(10));
		vc.add(20);
		// 어떤 타입의 객체도 추가가 가능함.		
		
		System.out.println("Vector size : " + vc.size());
		
		for(int i = 0; i < vc.size(); i++) {
			System.out.println("vector element " + i + " : " + vc.get(i));
		}
		String s = (String)vc.get(0);
		// get()은 Object 타입으로 반환하므로, 행변환하여서 사용함.
	}
}
