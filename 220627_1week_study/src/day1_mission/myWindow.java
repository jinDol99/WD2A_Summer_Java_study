package day1_mission;
import java.awt.*;
import javax.swing.*;

class myWindow extends JFrame {
	myWindow() {
		JFrame loadingFrame = new JFrame();
		loadingFrame.setTitle("로딩 창");							// 프레임의 제목을 "로딩 창"으로 지정
		loadingFrame.setBounds(250,120,700,700);					// 프레임의 위치(x = 250, y = 120)와 크기(w, h = 700)를 지정
//		loadingFrame.setVisible(true);
		loadingFrame.setResizable(false);							// 프레임의 크기를 임의로 변경 불가능하도록 설정
		loadingFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);		// 프레임 오른쪽 위 X를 클릭했을 때 창이 닫히도록 설정	
		
		JPanel loadingPanel = new JPanel() {						// 새로운 패널을 생성함
			ImageIcon i = new ImageIcon("img/cat.jpg");				// 패널에 새로운 이미지를 삽입함. 
			public void paintComponent(Graphics g) {
    			g.drawImage(i.getImage(), 0, 0, 700, 700, null);	// 이미지의 위치(x, y = 0)와 크기(w, h = 700)를 지정
			}
		};
		
		JLabel loadingLB = new JLabel();
		loadingLB.setOpaque(false);									// 라벨의 배경색 설정. false 입력시 투명한 배경색이 지정됨.
		loadingLB.setHorizontalAlignment(SwingConstants.CENTER);	// 라벨의 위치를 정중앙으로 정렬함.
		loadingLB.setFont(new Font("돋움체", Font.BOLD, 14));		// 폰트의 속성(돋움체, 굵게)과 크기(14)를 지정함.
		loadingLB.setForeground(new Color(200, 200, 238));			// 폰트의 색(RGB값 = 200, 200, 238)을 지정함
		loadingLB.setBounds(220, 570, 250, 15);						// 라벨의 위치(x = 220, y = 570)와 크기(w = 250, h = 15)를 지정
		
		loadingPanel.add(loadingLB);								// 패널에 loadingLB 라벨을 추가함
		loadingPanel.setLayout(null);								
		
		loadingFrame.getContentPane().add(loadingPanel, BorderLayout.CENTER);
		loadingFrame.setVisible(true);
		
		for (int i = 0; i < 4; i++) {								// 아래 코드를 4번 반복함
			loadingLB.setText("로딩 중... 잠시만 기다려주세요.");	// loadingLB의 글자를 왼쪽과 같이 설정함.
			try {
				Thread.sleep(700);									// 스레드를 700밀리초(0.7초) 동안 일시 정지시킴.
			} catch (InterruptedException e) {						// 스레드 일시정지 상태 중 interrupt() 메소드 호출시
				e.printStackTrace();								// InterruptedException이 발생하기 때문에, 이를 방지하기 위해
			}														// try catch문으로 printStackTrace 예외처리를 시행함.
			
			loadingLB.setText("");									// 위와 같은 방법으로 loadingLB의 글자를 공백으로 설정하고
			try {													// 스레드 일시정지를 0.7초 동안 발생시켜 0.7초가 지나면
				Thread.sleep(700);									// 글자가 사라지는 효과를 구현함.
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
