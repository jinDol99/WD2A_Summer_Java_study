package day1_220627;
import java.util.Vector;

public class ch22_25_01_VectorTest {
	public static void main(String[] args) {
		
		Vector vc = new Vector();
		// ���� ��ü�� ������ ��, ũ�⸦ �������� �ʾƵ� ��.
		// ���� ũ�⸦ �� ���� ����.
		
		vc.add("Hello World");
		vc.add(new Integer(10));
		vc.add(20);
		// � Ÿ���� ��ü�� �߰��� ������.		
		
		System.out.println("Vector size : " + vc.size());
		
		for(int i = 0; i < vc.size(); i++) {
			System.out.println("vector element " + i + " : " + vc.get(i));
		}
		String s = (String)vc.get(0);
		// get()�� Object Ÿ������ ��ȯ�ϹǷ�, �ຯȯ�Ͽ��� �����.
	}
}
