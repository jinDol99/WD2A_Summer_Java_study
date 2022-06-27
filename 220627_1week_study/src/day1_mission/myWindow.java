package day1_mission;
import java.awt.*;
import javax.swing.*;

class myWindow extends JFrame {
	myWindow() {
		JFrame loadingFrame = new JFrame();
		loadingFrame.setTitle("�ε� â");							// �������� ������ "�ε� â"���� ����
		loadingFrame.setBounds(250,120,700,700);					// �������� ��ġ(x = 250, y = 120)�� ũ��(w, h = 700)�� ����
//		loadingFrame.setVisible(true);
		loadingFrame.setResizable(false);							// �������� ũ�⸦ ���Ƿ� ���� �Ұ����ϵ��� ����
		loadingFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);		// ������ ������ �� X�� Ŭ������ �� â�� �������� ����	
		
		JPanel loadingPanel = new JPanel() {						// ���ο� �г��� ������
			ImageIcon i = new ImageIcon("img/cat.jpg");				// �гο� ���ο� �̹����� ������. 
			public void paintComponent(Graphics g) {
    			g.drawImage(i.getImage(), 0, 0, 700, 700, null);	// �̹����� ��ġ(x, y = 0)�� ũ��(w, h = 700)�� ����
			}
		};
		
		JLabel loadingLB = new JLabel();
		loadingLB.setOpaque(false);									// ���� ���� ����. false �Է½� ������ ������ ������.
		loadingLB.setHorizontalAlignment(SwingConstants.CENTER);	// ���� ��ġ�� ���߾����� ������.
		loadingLB.setFont(new Font("����ü", Font.BOLD, 14));		// ��Ʈ�� �Ӽ�(����ü, ����)�� ũ��(14)�� ������.
		loadingLB.setForeground(new Color(200, 200, 238));			// ��Ʈ�� ��(RGB�� = 200, 200, 238)�� ������
		loadingLB.setBounds(220, 570, 250, 15);						// ���� ��ġ(x = 220, y = 570)�� ũ��(w = 250, h = 15)�� ����
		
		loadingPanel.add(loadingLB);								// �гο� loadingLB ���� �߰���
		loadingPanel.setLayout(null);								
		
		loadingFrame.getContentPane().add(loadingPanel, BorderLayout.CENTER);
		loadingFrame.setVisible(true);
		
		for (int i = 0; i < 4; i++) {								// �Ʒ� �ڵ带 4�� �ݺ���
			loadingLB.setText("�ε� ��... ��ø� ��ٷ��ּ���.");	// loadingLB�� ���ڸ� ���ʰ� ���� ������.
			try {
				Thread.sleep(700);									// �����带 700�и���(0.7��) ���� �Ͻ� ������Ŵ.
			} catch (InterruptedException e) {						// ������ �Ͻ����� ���� �� interrupt() �޼ҵ� ȣ���
				e.printStackTrace();								// InterruptedException�� �߻��ϱ� ������, �̸� �����ϱ� ����
			}														// try catch������ printStackTrace ����ó���� ������.
			
			loadingLB.setText("");									// ���� ���� ������� loadingLB�� ���ڸ� �������� �����ϰ�
			try {													// ������ �Ͻ������� 0.7�� ���� �߻����� 0.7�ʰ� ������
				Thread.sleep(700);									// ���ڰ� ������� ȿ���� ������.
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		
	}
	

	public static void main(String[] args) {
		myWindow start = new myWindow();
//		start.setVisible(true);
	}

}
