// 2022년 6월 27일 월요일 미션: 스타크래프트 실행 시 나오는 로딩창 구현하기
// 상세: 실행하면 임의의 사진과 함께 로딩중이라는 문구가 점멸하고,
// 		 시간이 지나면 다음 사진으로 자동적으로 전환되는 프로그램 작성
// 특이사항: 자료실에 있는 스타크래프트 게임 파일을 참고하여 작성할 것.
package day1_mission;
import java.awt.*;													// GUI 구현에 필요한 awt와 swing 패키지를 가져옴
import javax.swing.*;

class myWindow extends JFrame {										// JFrame 클래스를 상속받은 myWindow 클래스를 작성함.
	myWindow() {													// 로딩창을 구현하는 myWindow 메소드를 아래와 같이 작성 
		
		JFrame loadingFrame = new JFrame();							// 새로운 JFrame 객체를 loadingFrame 이름으로 생성함. 
		loadingFrame.setTitle("로딩 창");							// 프레임(창)의 제목을 "로딩 창"으로 지정
		loadingFrame.setBounds(250,120,700,700);					// 프레임의 위치(x = 250, y = 120)와 크기(w, h = 700)를 지정
		loadingFrame.setResizable(false);							// 프레임의 크기를 임의로 변경 불가능하도록 설정
		loadingFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);		// 프레임 오른쪽 위 X를 클릭했을 때 창이 닫히도록 설정	
		
		JPanel loadingPanel = new JPanel() {						// 새로운 패널을 생성함
			ImageIcon i = new ImageIcon("img/cat.jpg");				// 패널에 새로운 이미지를 삽입함. 
			public void paintComponent(Graphics g) {				// 이 때, ImageIcon 객체는 이미지를 조정하는 기능이 없기 때문에
    			g.drawImage(i.getImage(), 0, 0, 700, 700, null);	// Graphics 클래스의 drawImage 메서드를 사용해 이미지의 크기를
			}														// 프레임의 크기(700*700)에 맞게 재조정함.
		};
		
		JLabel loadingLB = new JLabel();							// 새로운 JLabel 객체를 loadingLB의 이름으로 생성함.
		loadingLB.setOpaque(false);									// 라벨의 배경색 설정. false 입력시 투명한 배경색이 지정됨.
		loadingLB.setHorizontalAlignment(SwingConstants.CENTER);	// 라벨의 위치를 정중앙으로 정렬함.
		loadingLB.setFont(new Font("돋움체", Font.BOLD, 14));		// 폰트의 속성(돋움체, 굵게)과 크기(14)를 지정함.
		loadingLB.setForeground(new Color(200, 200, 238));			// 폰트의 색(RGB값 = 200, 200, 238)을 지정함
		loadingLB.setBounds(220, 570, 250, 15);						// 라벨의 절대 위치(x = 220, y = 570)와 크기(w = 250, h = 15)를 지정
		
		loadingPanel.add(loadingLB);								// loadingPanel 패널에 loadingLB 라벨 요소를 추가함
		loadingPanel.setLayout(null);								// loadingPanel의 배치관리자를 제거시켜 요소들을
																	// 사용자가 원하는 절대 위치로 배치(setBounds()) 가능하게끔 만듬.
		
		loadingFrame.getContentPane().add(loadingPanel, BorderLayout.CENTER);
																	// loadingPanel 요소를 laodingFrame의 ContentPane 부분에 추가함.
																	// 이 때, 조건으로 해당 요소(패널)를 정중앙에 배치함.
																	// 여기서 ContentPane은 컴포넌트를 붙일 수 있는 공간이라고 생각하면
																	// 되며, 이러한 ContentPane을 불러오는 메소드가 getContentPane()임.
		
		loadingFrame.setVisible(true);								// loadingFrame 프레임을 화면에 나타나게 설정함.
		
		
		
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
		loadingFrame.setVisible(false);								// 위의 모든 진행상황이 끝나면 창을 숨김
		
		
		
		setTitle("myWindowTEST");									// 이전(13 ~ 16 라인)과 같은 방식으로 프레임의 제목, 위치와 크기, 
		setBounds(300, 300, 400, 400);								// 창 닫힘 버튼 클릭시 반응, 크기조절 여부를 설정함.
		this.setResizable(false);									// 이 때, 프레임(창)은 기존에 사용하던(현재는 숨겨진) 것을 재활용함
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		JPanel loadedPanel = new JPanel() {							// 이전(18 ~ 23 라인)과 같은 방식으로 새로운 판넬을 생성하고
			ImageIcon i = new ImageIcon("img/dog.jpg");				// 판넬에 이미지를 지정한 후 사이즈를 창 크기에 맞게 조절함.
			public void paintComponent(Graphics g) {
    			g.drawImage(i.getImage(), 0, 0, 400, 400, null);
			}
		};
			
		loadedPanel.setLayout(null);								// loadedPanel의 배치관리자를 제거시켜 setBounds()를 사용 가능케 만듬
		getContentPane().add(loadedPanel, BorderLayout.CENTER);		// ContentPane에 loadedPanel을 정중앙에 재치하는 조건으로 추가함.
		
		this.setVisible(true);										// 상위 객체(loadingFrame)의 가시 여부를 볼 수 있음(true)으로 설정
	}

	public static void main(String[] args) {						// 메인 메소드
		myWindow start = new myWindow();							// 로딩창을 구현하는 myWindow 객체를 start 라는 이름으로 새로 생성함.
	}

}
