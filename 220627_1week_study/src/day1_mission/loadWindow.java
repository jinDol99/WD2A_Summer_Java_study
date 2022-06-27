// 2022년 6월 27일 월요일 미션: 스타크래프트 실행 시 나오는 로딩창 구현하기
// 상세: 실행하면 임의의 사진과 함께 로딩중이라는 문구가 점멸하고,
// 		 시간이 지나면 다음 사진으로 자동적으로 전환되는 프로그램 작성
// 특이사항: 자료실에 있는 스타크래프트 게임 파일을 참고하여 작성할 것.

/*package day1_mission;
import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


class loadWindow extends JFrame
{
	JFrame LoadingFrame;
	JPanel LoadingPanel;
	JPanel panel;
	JLabel LoadingLB;

	loadWindow()
	{
		UIManager.put("swing.boldMetal", Boolean.FALSE);
		LoadingFrame = new JFrame();
		LoadingFrame.setTitle("로딩창 테스트...");
		LoadingFrame.setBounds(250,120,700,700);
		LoadingFrame.setResizable(false);
		LoadingPanel = new JPanel(){ImageIcon i = new ImageIcon("/cat.jpg");	
    		public void paintComponent(Graphics g) {
    			g.drawImage(i.getImage(), 0, 0, 700, 700, null);
    		}
		};
		LoadingLB = new JLabel();
		LoadingLB.setOpaque(false);
		LoadingLB.setFont(new Font("Dialog.plain", 0, 14));
		LoadingLB.setHorizontalAlignment(SwingConstants.CENTER);
		LoadingLB.setForeground(new Color(200,200,238));
		LoadingLB.setBounds(310,570,60,15);
		LoadingPanel.add(LoadingLB);
		
		
		
		LoadingPanel.setLayout(null);
		LoadingFrame.getContentPane().add(LoadingPanel, BorderLayout.CENTER);
		LoadingFrame.setVisible(true);
		for(int i = 0; i < 4; i++){
			LoadingLB.setText("Loading");
			try {
				Thread.sleep(700);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			LoadingLB.setText("");
			try {
				Thread.sleep(700);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		LoadingFrame.setVisible(false);
		setTitle("loadWindow");
		setBounds(314, 202, 389, 382);
		this.setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		panel = new JPanel(){ImageIcon i = new ImageIcon("dog.jpg");
			public void paintComponent(Graphics g) {
				g.drawImage(i.getImage(), 0, 0, 389, 382, null);
			}
		};
		panel.setLayout(null);

		getContentPane().add(panel, BorderLayout.CENTER);
		
	}

public static void main(String[] args)
	{
		loadWindow start = new loadWindow();
		start.setVisible(true);
	}
} */

package day1_mission;
import java.util.*;
import java.awt.*;
import javax.swing.*;

class loadWindow extends JFrame {
	JFrame LoadingFrame;
	JPanel LoadingPanel;
	JPanel panel;
	JLabel LoadingLB;
	
	loadWindow() {
		LoadingFrame = new JFrame();
		LoadingFrame.setTitle("로딩창");
		LoadingFrame.setBounds(250,120,700,700);
		LoadingFrame.setResizable(false);
		LoadingPanel = new JPanel(){ImageIcon i = new ImageIcon("img/cat.jpg");	
    		public void paintComponent(Graphics g) {
    			g.drawImage(i.getImage(), 0, 0, 700, 700, null);
    		}
		};
		LoadingLB = new JLabel();
		LoadingLB.setOpaque(false);
		LoadingLB.setFont(new Font("Dialog.plain", 0, 14));
		LoadingLB.setHorizontalAlignment(SwingConstants.CENTER);
		LoadingLB.setForeground(new Color(0, 0, 0));
		LoadingLB.setBounds(310,570,60,15);
		LoadingPanel.add(LoadingLB);
		
		LoadingPanel.setLayout(null);
		LoadingFrame.getContentPane().add(LoadingPanel, BorderLayout.CENTER);
		LoadingFrame.setVisible(true);
		for(int i = 0; i < 4; i++){
			LoadingLB.setText("Loading");
			try {
				Thread.sleep(700);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			LoadingLB.setText("");
			try {
				Thread.sleep(700);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		LoadingFrame.setVisible(false);
		setTitle("loadWindow");
		setBounds(314, 202, 389, 382);
		this.setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		panel = new JPanel(){ImageIcon i = new ImageIcon("img/dog.jpg");
			public void paintComponent(Graphics g) {
				g.drawImage(i.getImage(), 0, 0, 389, 382, null);
			}
		};
		panel.setLayout(null);
		getContentPane().add(panel, BorderLayout.CENTER);
		
	}
	
	public static void main(String[] args)
	{
		loadWindow start = new loadWindow();
		start.setVisible(true);
	}
}

