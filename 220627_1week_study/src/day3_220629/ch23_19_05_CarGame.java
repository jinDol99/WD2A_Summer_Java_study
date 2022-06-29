package day3_220629;
import java.awt.*;
import javax.swing.*;

public class ch23_19_05_CarGame extends JFrame {
	private JLabel label1;				// ���̺�(=��) �ϳ��� �ڵ��� �� �븦 ��Ÿ��
	private JLabel label2;
	private JLabel label3;
	int x1 = 100, x2 = 100, x3 = 100;	// �ڵ����� x��ǥ

	class MyThread extends Thread {
		public void run() {
			for (int i = 0 ; i < 120; i++) {		// 0.1�ʸ��� �� ���� �ڵ����� ��ġ�� ������
				try {								// �̸� 120�� �ݺ��Ͽ� �� 12�� ���� �ڵ����� �̵���Ŵ
					Thread.sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				x1 += (int) (Math.random() * 10);	// ���⼭ ������ �߻����� �ڵ����� x��ǥ�� ����
				label1.setBounds(x1, 0, 100, 100);
				
				x2 += (int) (Math.random() * 10);
				label2.setBounds(x2, 0, 100, 100);
				
				x3 += (int) (Math.random() * 10);
				label3.setBounds(x3, 0, 100, 100);	
			}
		}
	}
	public ch23_19_05_CarGame() {
		setTitle("CarRace");
		setSize(600, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);
		
		label1 = new JLabel();
		label1.setIcon(new ImageIcon("Car1.png"));
		label2 = new JLabel();
		label2.setIcon(new ImageIcon("Car2.png"));
		label3 = new JLabel();
		label3.setIcon(new ImageIcon("Car3.jpg"));
		
		add(label1);
		add(label2);
		add(label3);
		
		label1.setBounds(100, 0, 100, 100);
		label2.setBounds(100, 50, 100, 100);
		label3.setBounds(100, 100, 100, 100);
		
		(new MyThread()).start();
		setVisible(true);
	}

	public static void main(String[] args) {
		ch23_19_05_CarGame t = new ch23_19_05_CarGame(); 
	}
}