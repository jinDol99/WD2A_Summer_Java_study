package day3_220629;
import java.awt.Font;
import javax.swing.*;

public class ch23_17_04_CountDownTest extends JFrame {
	private JLabel label;
	
	class MyThread extends Thread {					// Ŭ���� �� ����Ŭ������ ���
		public void run() {							// Thread�� ��ӹ޾� run() �޼ҵ� �ȿ� �����ų ������
			for (int i = 10; i >= 0; i--) {			// ������ ������.
				try {
					Thread.sleep(1000);				// sleep �޼ҵ�� ��� ���� ���� �߻� ���ɼ��� �����Ƿ�
				} catch (InterruptedException e) {	// try catch���� ����� �̸� �ͼ����� �����.
					e.printStackTrace();
				}
				label.setText(i + "");				// 1��(1000�и���)�� ������ ���̺��� �ؽ�Ʈ�� ����
			}
		}
	}
	public ch23_17_04_CountDownTest() {
		setTitle("ī��Ʈ�ٿ�");
		setSize(300, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		label = new JLabel("Start");
		label.setFont(new Font("Serif", Font.BOLD, 100));
		add(label);
		(new MyThread()).start();	// �� �����带 ����� ���ÿ� ������ �� �� ����.
		setVisible(true);
	}
	
	public static void main(String[] args) {
		ch23_17_04_CountDownTest t = new ch23_17_04_CountDownTest();

	}

}
