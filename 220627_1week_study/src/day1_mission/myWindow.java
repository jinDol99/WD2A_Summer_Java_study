// 2022�� 6�� 27�� ������ �̼�: ��Ÿũ����Ʈ ���� �� ������ �ε�â �����ϱ�
// ��: �����ϸ� ������ ������ �Բ� �ε����̶�� ������ �����ϰ�,
// 		 �ð��� ������ ���� �������� �ڵ������� ��ȯ�Ǵ� ���α׷� �ۼ�
// Ư�̻���: �ڷ�ǿ� �ִ� ��Ÿũ����Ʈ ���� ������ �����Ͽ� �ۼ��� ��.
package day1_mission;
import java.awt.*;													// GUI ������ �ʿ��� awt�� swing ��Ű���� ������
import javax.swing.*;

class myWindow extends JFrame {										// JFrame Ŭ������ ��ӹ��� myWindow Ŭ������ �ۼ���.
	myWindow() {													// �ε�â�� �����ϴ� myWindow �޼ҵ带 �Ʒ��� ���� �ۼ� 
		
		JFrame loadingFrame = new JFrame();							// ���ο� JFrame ��ü�� loadingFrame �̸����� ������. 
		loadingFrame.setTitle("�ε� â");							// ������(â)�� ������ "�ε� â"���� ����
		loadingFrame.setBounds(250,120,700,700);					// �������� ��ġ(x = 250, y = 120)�� ũ��(w, h = 700)�� ����
		loadingFrame.setResizable(false);							// �������� ũ�⸦ ���Ƿ� ���� �Ұ����ϵ��� ����
		loadingFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);		// ������ ������ �� X�� Ŭ������ �� â�� �������� ����	
		
		JPanel loadingPanel = new JPanel() {						// ���ο� �г��� ������
			ImageIcon i = new ImageIcon("img/cat.jpg");				// �гο� ���ο� �̹����� ������. 
			public void paintComponent(Graphics g) {				// �� ��, ImageIcon ��ü�� �̹����� �����ϴ� ����� ���� ������
    			g.drawImage(i.getImage(), 0, 0, 700, 700, null);	// Graphics Ŭ������ drawImage �޼��带 ����� �̹����� ũ�⸦
			}														// �������� ũ��(700*700)�� �°� ��������.
		};
		
		JLabel loadingLB = new JLabel();							// ���ο� JLabel ��ü�� loadingLB�� �̸����� ������.
		loadingLB.setOpaque(false);									// ���� ���� ����. false �Է½� ������ ������ ������.
		loadingLB.setHorizontalAlignment(SwingConstants.CENTER);	// ���� ��ġ�� ���߾����� ������.
		loadingLB.setFont(new Font("����ü", Font.BOLD, 14));		// ��Ʈ�� �Ӽ�(����ü, ����)�� ũ��(14)�� ������.
		loadingLB.setForeground(new Color(200, 200, 238));			// ��Ʈ�� ��(RGB�� = 200, 200, 238)�� ������
		loadingLB.setBounds(220, 570, 250, 15);						// ���� ���� ��ġ(x = 220, y = 570)�� ũ��(w = 250, h = 15)�� ����
		
		loadingPanel.add(loadingLB);								// loadingPanel �гο� loadingLB �� ��Ҹ� �߰���
		loadingPanel.setLayout(null);								// loadingPanel�� ��ġ�����ڸ� ���Ž��� ��ҵ���
																	// ����ڰ� ���ϴ� ���� ��ġ�� ��ġ(setBounds()) �����ϰԲ� ����.
		
		loadingFrame.getContentPane().add(loadingPanel, BorderLayout.CENTER);
																	// loadingPanel ��Ҹ� laodingFrame�� ContentPane �κп� �߰���.
																	// �� ��, �������� �ش� ���(�г�)�� ���߾ӿ� ��ġ��.
																	// ���⼭ ContentPane�� ������Ʈ�� ���� �� �ִ� �����̶�� �����ϸ�
																	// �Ǹ�, �̷��� ContentPane�� �ҷ����� �޼ҵ尡 getContentPane()��.
		
		loadingFrame.setVisible(true);								// loadingFrame �������� ȭ�鿡 ��Ÿ���� ������.
		
		
		
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
		loadingFrame.setVisible(false);								// ���� ��� �����Ȳ�� ������ â�� ����
		
		
		
		setTitle("myWindowTEST");									// ����(13 ~ 16 ����)�� ���� ������� �������� ����, ��ġ�� ũ��, 
		setBounds(300, 300, 400, 400);								// â ���� ��ư Ŭ���� ����, ũ������ ���θ� ������.
		this.setResizable(false);									// �� ��, ������(â)�� ������ ����ϴ�(����� ������) ���� ��Ȱ����
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		JPanel loadedPanel = new JPanel() {							// ����(18 ~ 23 ����)�� ���� ������� ���ο� �ǳ��� �����ϰ�
			ImageIcon i = new ImageIcon("img/dog.jpg");				// �ǳڿ� �̹����� ������ �� ����� â ũ�⿡ �°� ������.
			public void paintComponent(Graphics g) {
    			g.drawImage(i.getImage(), 0, 0, 400, 400, null);
			}
		};
			
		loadedPanel.setLayout(null);								// loadedPanel�� ��ġ�����ڸ� ���Ž��� setBounds()�� ��� ������ ����
		getContentPane().add(loadedPanel, BorderLayout.CENTER);		// ContentPane�� loadedPanel�� ���߾ӿ� ��ġ�ϴ� �������� �߰���.
		
		this.setVisible(true);										// ���� ��ü(loadingFrame)�� ���� ���θ� �� �� ����(true)���� ����
	}

	public static void main(String[] args) {						// ���� �޼ҵ�
		myWindow start = new myWindow();							// �ε�â�� �����ϴ� myWindow ��ü�� start ��� �̸����� ���� ������.
	}

}
